package com.dragonflydev.dispatcherservletutil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dragonfly on 2023-09-03
 */
public class CustomServlet extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("{} doGet() method is invoked", this.getClass().getName());
        super.doGet(req, resp);
    }
}
