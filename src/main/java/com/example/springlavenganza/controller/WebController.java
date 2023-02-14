package com.example.springlavenganza.controller;

import com.example.springlavenganza.PapuServiceImplementation;
import com.example.springlavenganza.model.Papu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WebController {
    @Autowired
    private PapuServiceImplementation psi;

    @PostMapping("/subePapu")
    private void crear(Papu papu)
    {
        psi.creaPapu(papu);
    }

    @GetMapping("/localizaPapus")
    private List<Papu> localiza()
    {
        return psi.localizaPapus();
    }

    @GetMapping("/localizaPapus/{id}")
    private Optional<Papu> localizaUno(@PathVariable Long id)
    {
        return psi.PapusPorId(id);
    }

    @PutMapping("/actualizaPapu/{id}")
    private Papu actualizaPapu(@PathVariable Long id, Papu papu)
    {
        return psi.actualizaPapu(id, papu);
    }

    @DeleteMapping("/borraPapu/{id}")
    private String borraPapu(@PathVariable Long id)
    {
        return "Se ha eliminado al Papu "+id+" :'V";
    }

}
