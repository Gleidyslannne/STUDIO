
package com.studio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class clienteController {
    
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
  @GetMapping("/inserir cliente")
    public String cadastroForm(){
        return "cadastro";
    }
     @GetMapping("/confere produto")
    public String estoqueForm(){
        return "estoque";
}
}

