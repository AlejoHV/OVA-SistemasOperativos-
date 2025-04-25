package com.example.sistemas.ovasistemasoperativos.service;

import com.example.sistemas.ovasistemasoperativos.model.ProcesoSJF;
import com.example.sistemas.ovasistemasoperativos.model.ResultadoProcesoSJF;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class SJFservice {
    public List<ResultadoProcesoSJF> simular(List<ProcesoSJF> procesos){
        procesos.sort(Comparator.comparingInt(ProcesoSJF::getRafaga));

        List<ResultadoProcesoSJF> resultados = new ArrayList<>();
        int tiempoActual = 0;

        for (ProcesoSJF p : procesos) {
            int inicio = tiempoActual;
            int fin = inicio + p.getRafaga();
            int espera = inicio;

            resultados.add(new ResultadoProcesoSJF(p.getNombre(), inicio, fin, espera));
            tiempoActual = fin;
        }

        return resultados;
    }
}
