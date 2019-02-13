package com.algaworks.brewer.controller;

import com.algaworks.brewer.model.Estilo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class EstiloController {

    @RequestMapping("/cervejas/estilo")
    public ModelAndView novo(Estilo estilo) {
    	ModelAndView mv = new ModelAndView("estilo/CadastroEstilo");
    	return mv;
    }

    @RequestMapping(value = "/cervejas/estilo", method = RequestMethod.POST)
    public ModelAndView cadastrar(@Valid Estilo estilo, BindingResult result, Model model, RedirectAttributes attributes) {
        if (result.hasErrors()) {//AQUI O FOWARD RETORNA O QUE EU PRECISO
            return novo(estilo);
        }

        // Salvar no banco de dados...
        attributes.addFlashAttribute("mensagem", "Usuario salva com sucesso!");
        return new ModelAndView("redirect:/cervejas/estilo");//NO REDIRECT RETORNA PRA OND EEU QUISER
    }
}
