/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unae.lp3.newapp.newapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ossva
 */
@Controller
public class indexController {
    @GetMapping("/")
    public String index(Model model)
        {
        model.addAttribute("vista","comunes/template");
        model.addAttribute("fragmento","main");

        return "index";
        }
    
    
}
