/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ALUNO
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody
    String greeting() {
        return "Hello, World!";
    }

    @RequestMapping("/clarice")
    public @ResponseBody
    String greetingClarice() {
        return "Hello, Clarice esse é o seu clone !";
    }

    @RequestMapping("/clarice1")
    public @ResponseBody
    String greetingClarice1() {
        return "Oi, Clarice! Teste adicionado. Hello, Clarice teste!";

    }

    @RequestMapping("/hotfix")
    public @ResponseBody
    String greetingHotfix() {
        
        return "Hello from MAIN hotfix version! Hello, Hotfix!";
    }

}