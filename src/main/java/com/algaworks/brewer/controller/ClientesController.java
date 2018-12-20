package com.algaworks.brewer.controller;

import com.algaworks.brewer.model.Clientes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class ClientesController {

    @RequestMapping("/cervejas/clientes")
    public String novo(Clientes clientes) {
        return "cerveja/CadastroClientes";
    }

    @RequestMapping(value = "/cervejas/clientes", method = RequestMethod.POST)
    public String cadastrar(@Valid Clientes clientes, BindingResult result, Model model, RedirectAttributes attributes) {
        if (result.hasErrors()) {//AQUI O FOWARD RETORNA O QUE EU PRECISO
            return novo(clientes);
        }

        // Salvar no banco de dados...
        attributes.addFlashAttribute("mensagem", "Cliente salva com sucesso!");
        return "redirect:/cervejas/clientes";//NO REDIRECT RETORNA PRA OND EEU QUISER
    }
}
