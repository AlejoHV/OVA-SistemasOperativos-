package com.example.sistemas.ovasistemasoperativos.controller;

import com.example.sistemas.ovasistemasoperativos.model.ProcesoSJF;
import com.example.sistemas.ovasistemasoperativos.model.ResultadoProcesoSJF;
import com.example.sistemas.ovasistemasoperativos.service.SJFservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/sjf")
public class SJFcontroller {

    @Autowired
    private SJFservice sjfService;

    @PostMapping("/simular")
    public List<ResultadoProcesoSJF> simular(@RequestBody List<ProcesoSJF> procesos) {
        return sjfService.simular(procesos);
    }

}
