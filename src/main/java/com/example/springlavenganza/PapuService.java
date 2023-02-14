package com.example.springlavenganza;

import com.example.springlavenganza.model.Papu;

import java.util.List;
import java.util.Optional;

public interface PapuService {
    //C
    void creaPapu(Papu papu);
    //R
    List<Papu> localizaPapus();

    Optional<Papu> PapusPorId(Long id);

    //U
    Papu actualizaPapu(Long id,Papu papu);

    //D
    String borraPapu(Long id);
}
