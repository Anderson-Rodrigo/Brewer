package com.algaworks.brewer.controller;

import com.algaworks.brewer.model.Usuarios;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UsuariosController {

    @RequestMapping("/cervejas/usuario")
    public String novo(Usuarios usuarios) {
        return "cerveja/CadastroUsuario";
    }

    @RequestMapping(value = "/cervejas/usuario", method = RequestMethod.POST)
    public String cadastrar(@Valid Usuarios usuarios, BindingResult result, Model model, RedirectAttributes attributes) {
        if (result.hasErrors()) {//AQUI O FOWARD RETORNA O QUE EU PRECISO
            return novo(usuarios);
        }

        // Salvar no banco de dados...
        attributes.addFlashAttribute("mensagem", "Usuario salva com sucesso!");
        return "redirect:/cervejas/usuario";//NO REDIRECT RETORNA PRA OND EEU QUISER
    }
}
