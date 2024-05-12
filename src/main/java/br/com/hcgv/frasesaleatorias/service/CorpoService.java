package br.com.hcgv.frasesaleatorias.service;

import br.com.hcgv.frasesaleatorias.dto.CorpoDTO;
import br.com.hcgv.frasesaleatorias.model.Corpo;
import br.com.hcgv.frasesaleatorias.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CorpoService {


    @Autowired
    private Repository repositorio;


    public CorpoDTO obterFrase() {
        Corpo corpo = repositorio.buscarFraseAleatoria();
        return new CorpoDTO(corpo.getTitulo(), corpo.getFrase(), corpo.getPersonagem(), corpo.getPoster());
    }
}
