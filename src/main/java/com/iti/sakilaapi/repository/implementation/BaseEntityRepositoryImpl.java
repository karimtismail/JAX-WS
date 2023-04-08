package com.iti.sakilaapi.repository.implementation;

import com.iti.sakilaapi.repository.TransactionalEntityManager;
import com.iti.sakilaapi.repository.interfaces.BaseEntityRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

/**
 * The {@code BaseEntityRepositoryImpl} class is a base implementation of the {@link BaseEntityRepository} interface
 * that provides basic CRUD operations for a specific entity type managed by this repository.
 *
 * @param <T>  the type of entity managed by this repository
 * @param <ID> the type of the identifier for the entity
 */
public class BaseEntityRepositoryImpl<T, ID> implements BaseEntityRepository<T, ID> {

    private final TransactionalEntityManager transactionalEntityManager;
    private final Class<T> entityClass;

    /**
     * Constructs a new {@code BaseEntityRepositoryImpl} instance with the given {@link TransactionalEntityManager}
     * and entity class.
     *
     * @param transactionalEntityManager the {@link TransactionalEntityManager} to use for executing database operations
     * @param entityClass                the entity class managed by this repository
     */
    public BaseEntityRepositoryImpl(TransactionalEntityManager transactionalEntityManager, Class<T> entityClass) {
        this.transactionalEntityManager = transactionalEntityManager;
        this.entityClass = entityClass;
    }

    /**
     * Finds an entity by its identifier.
     *
     * @param id the identifier of the entity to find
     * @return the entity with the given identifier, or {@code null} if not found
     */
    @Override
    public T findById(ID id) {
        return transactionalEntityManager.executeInTransaction(entityManager -> entityManager.find(entityClass, id));
    }

    /**
     * Finds all entities managed by this repository.
     *
     * @return a list of all entities managed by this repository
     */
    @Override
    public List<T> findAll() {
        return transactionalEntityManager.executeInTransaction(entityManager -> {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> query = criteriaBuilder.createQuery(entityClass);
            Root<T> root = query.from(entityClass);
            query.select(root);
            return entityManager.createQuery(query).getResultList();
        });
    }

    /**
     * Saves an entity to the database.
     *
     * @param entity the entity to save
     * @return the saved entity
     */
    @Override
    public T save(T entity) {
        transactionalEntityManager.executeInTransactionWithoutResult(entityManager -> entityManager.persist(entity));
        return entity;
    }

    /**
     * Updates an entity in the database.
     *
     * @param entity the entity to update
     * @return the updated entity
     */
    @Override
    public T update(T entity) {
        transactionalEntityManager.executeInTransactionWithoutResult(entityManager -> entityManager.merge(entity));
        return entity;
    }

    /**
     * Deletes an entity by its identifier.
     *
     * @param id the identifier of the entity to delete
     * @return {@code true} if the entity was deleted, {@code false} if no entity with the given identifier was found
     */
    @Override
    public boolean deleteById(ID id) {
        T entity = findById(id);
        if (entity != null) {
            transactionalEntityManager.executeInTransactionWithoutResult(entityManager -> entityManager.remove(entity));
            return true;
        }
        return false;
    }
}