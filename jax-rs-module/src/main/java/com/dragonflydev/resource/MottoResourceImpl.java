package com.dragonflydev.resource;

import com.dragonflydev.service.MottoService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.core.Response;

/**
 * Created by dragonfly on 2023-09-03
 */
public class MottoResourceImpl implements MottoResource {

    private MottoService mottoService;

    @Override
    public Response getMotto() {
        return Response.ok(mottoService.getMotto()).build();
    }

    @Override
    public Response getAnthemName() {
        return Response.ok(mottoService.getAnthemName()).build();
    }

    @Required
    public void setMottoService(MottoService mottoService) {
        this.mottoService = mottoService;
    }
}
