package com.algaworks.brewer.controller;

import com.algaworks.brewer.model.Cerveja;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CervejasController {

    @RequestMapping("/cervejas/novo")
    public String novo(Cerveja cerveja) {
        return "cerveja/CadastroCerveja";
    }

    @RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
    public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
        if (result.hasErrors()) {//AQUI O FOWARD RETORNA O QUE EU PRECISO
            return novo(cerveja);
        }

        // Salvar no banco de dados...
        attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
        System.out.println(">>> sku: " + cerveja.getSku() + "Nome: " + cerveja.getNome() + "Descrição: " + cerveja.getDescricao());
        return "redirect:/cervejas/novo";//NO REDIRECT RETORNA PRA OND EEU QUISER
    }
}