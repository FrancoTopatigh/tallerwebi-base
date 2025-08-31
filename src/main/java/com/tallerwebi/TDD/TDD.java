package com.tallerwebi.TDD;

public class TDD {

    public static String validarFortaleza(String contrasenia){
        if(contrasenia.length() < 8){
            if(contrasenia.contains("@")){
                return "MEDIANA";
            } else{
                return "INVALIDA";
            }   
        }
        else {
            Integer largo = contrasenia.length();
            Integer cantidadNumeros = contarNumeros(contrasenia);
            Integer cantidadCaracteresEspeciales = contarCaracteresEspeciales(contrasenia);

            if(largo >= 8 && cantidadCaracteresEspeciales >= 1 &&  cantidadNumeros >= 4){
                return "FUERTE";
            } else{
                return "DEBIL";
            }

        }   
    }
}
