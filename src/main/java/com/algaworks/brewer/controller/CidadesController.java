package com.algaworks.brewer.controller;

import com.algaworks.brewer.model.Cidades;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CidadesController {

    @RequestMapping("/cervejas/cidades")
    public String novo(Cidades cidades) {
        return "cidades/CadastroCidades";
    }

    @RequestMapping(value = "/cervejas/cidades", method = RequestMethod.POST)
    public String cadastrar(@Valid Cidades cidades, BindingResult result, Model model, RedirectAttributes attributes) {
        if (result.hasErrors()) {//AQUI O FOWARD RETORNA O QUE EU PRECISO
            return novo(cidades);
        }

        // Salvar no banco de dados...
        attributes.addFlashAttribute("mensagem", "Usuario salva com sucesso!");
        return "redirect:/cervejas/cidades";//NO REDIRECT RETORNA PRA OND EEU QUISER
    }
}
