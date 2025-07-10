package com.league.alertservice.controller;

import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import com.league.alertservice.service.AlertService;
import com.league.alertservice.model.Alert;

import java.util.List;

@Controller("/alerts")
public class AlertController {

    @Inject
    AlertService alertService;

    @Post
    public Alert create(@Body Alert alert) {
        return alertService.save(alert);
    }

    @Get
    public List<Alert> findAll() {
        return alertService.findAll();
    }
}
