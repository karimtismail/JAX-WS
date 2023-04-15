package com.iti.sakilaapi.listener;

import com.iti.sakilaapi.util.JPAUtil;
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
        // create and configure the HikariCP data source
        dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("sakilaApi_user");
        dataSource.setPassword("1234");
        dataSource.setIdleTimeout(60000);
        dataSource.setMinimumIdle(10);
        dataSource.setMaxLifetime(18000000);
        dataSource.setMaximumPoolSize(010);

        // store the data source in the servlet context
        event.getServletContext().setAttribute("dataSource", dataSource);
    }

    /**
     * The contextDestroyed method is called when the servlet context is destroyed.
     * It closes the data source and EntityManagerFactory.
     *
     * @param event The ServletContextEvent object that contains information about the servlet context.
     */
    @Override
    public void contextDestroyed(ServletContextEvent event) {
        // close the data source when the servlet context is destroyed
        dataSource.close();
        JPAUtil.closeEntityManagerFactory();
    }
}