package br.com.hcgv.frasesaleatorias.controller;

import br.com.hcgv.frasesaleatorias.dto.CorpoDTO;
import br.com.hcgv.frasesaleatorias.service.CorpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class Controller {


    @Autowired
    private CorpoService service;


    @GetMapping("/frases")
    public CorpoDTO obterFraseDTO() {
        return service.obterFrase();
    }

}
