package com.example.springlavenganza;

import com.example.springlavenganza.model.Papu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PapuServiceImplementation implements PapuService{

    @Autowired
    private PapuRepository pr;

    @Override
    public void creaPapu(Papu papu) {
        pr.save(papu);
    }

    @Override
    public List<Papu> localizaPapus() {
        return (List<Papu>)pr.findAll();
    }

    @Override
    public Optional<Papu> PapusPorId(Long id) {
        return pr.findById(id);
    }

    @Override
    public Papu actualizaPapu(Long id, Papu papu) {
        if(pr.findById(id).isPresent())
            pr.save(papu);
        return papu;
    }

    @Override
    public String borraPapu(Long id) {
        pr.deleteById(id);
        return "Se ha borrado exitosamente el Papu Nº "+id;
    }
}
