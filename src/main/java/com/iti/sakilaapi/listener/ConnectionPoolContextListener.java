package com.iti.sakilaapi.listener;

import com.iti.sakilaapi.util.JPAUtil;
import com.zaxxer.hikari.HikariDataSource;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ConnectionPoolContextListener implements ServletContextListener {

    private HikariDataSource dataSource;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
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
        sce.getServletContext().setAttribute("dataSource", dataSource);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // close the data source when the servlet context is destroyed
        dataSource.close();
        JPAUtil.closeEntityManagerFactory();
    }
}