/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unae.lp3.newapp.newapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import unae.lp3.newapp.newapp.repositories.CiudadRepository;
/**
 *
 * @author ossva
 */
@Controller
@RequestMapping(value="/ciudades")

public class ciudadesController {
    @Autowired
    private CiudadRepository ciudad_repo;
    @GetMapping("/")
    public String index(Model model)
    {
    var ciudades=ciudad_repo.findAll();
    model.addAttribute("ciudades", ciudades);    
    model.addAttribute("vista","ciudades/lista");
    model.addAttribute("fragmento","ciudadeslista");
    return "index";
    }
    @GetMapping("/nuevo")
    public String nuevo(Model model)
    {
    model.addAttribute("vista","ciudades/form");
    model.addAttribute("fragmento","ciudadesform");
     
    return "index";
    }
    @GetMapping("/editar")
    public String editar(Model model)
    {
    return "index";
    }
    @GetMapping("/borrar")
    public String borrar(Model model)
    {
    return "index";
    }
}
