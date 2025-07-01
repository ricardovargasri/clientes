package com.corporation.learnspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class palindromoRest {
    @GetMapping("palindromo/{word}")
    public String palindromo(@PathVariable String word) {
        String resultado;
        if(pruebaPalindromo(word)) resultado = word + " es palindromo";
        else resultado = word + " No es Palindromo";

        return resultado;
    }
    private boolean pruebaPalindromo(String word) {
        boolean resultado;
        String palabra = new StringBuilder(word).reverse().toString().toLowerCase();
        if(palabra.equals(word)) return true;
        else return false;
    }
}
