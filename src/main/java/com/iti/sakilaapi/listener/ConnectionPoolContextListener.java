package com.iti.sakilaapi.listener;

import java.util.logging.Logger;

import com.iti.sakilaapi.util.JPAUtil;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * The ConnectionPoolContextListener class implements the ServletContextListener interface
 * and creates a HikariCP data source for the Sakila database. This class is annotated with
 *
 * @WebListener to indicate that it is a web listener component.
 */
@WebListener
public class ConnectionPoolContextListener implements ServletContextListener {
    private static final Logger LOGGER = Logger.getLogger(ConnectionPoolContextListener.class.getName());
    private HikariDataSource dataSource;

    /**
     * The contextInitialized method is called when the servlet context is initialized.
     * It creates and configures the HikariCP data source for the Sakila database, and
     * stores it in the servlet context.
     *
     * @param event The ServletContextEvent object that contains information about the servlet context.
     */
    @Override
    public void contextInitialized(ServletContextEvent event) {
        LOGGER.info("Initializing HikariCP data source for Sakila database...");

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/sakila");
        config.setUsername("sakilaApi_user");
        config.setPassword("1234");
        config.setIdleTimeout(60000);
        config.setMinimumIdle(10);
        config.setMaxLifetime(18000000);
        config.setMaximumPoolSize(10);

        dataSource = new HikariDataSource(config);

        // store the data source in the servlet context
        event.getServletContext().setAttribute("dataSource", dataSource);

        LOGGER.info("HikariCP data source for Sakila database initialized successfully.");
    }

    /**
     * The contextDestroyed method is called when the servlet context is destroyed.
     * It closes the data source and EntityManagerFactory.
     *
     * @param event The ServletContextEvent object that contains information about the servlet context.
     */
    @Override
    public void contextDestroyed(ServletContextEvent event) {
        LOGGER.info("Shutting down HikariCP data source for Sakila database...");

        // close the data source when the servlet context is destroyed
        dataSource.close();
        JPAUtil.closeEntityManagerFactory();

        LOGGER.info("HikariCP data source for Sakila database shut down successfully.");
    }
}