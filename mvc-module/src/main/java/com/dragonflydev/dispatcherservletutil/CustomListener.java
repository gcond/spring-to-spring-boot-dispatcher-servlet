package com.dragonflydev.dispatcherservletutil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by dragonfly on 2023-09-03
 */
public class CustomListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LOGGER.info("{} is initialized", this.getClass().getName());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        LOGGER.info("{} is destroyed", this.getClass().getName());
    }
}
