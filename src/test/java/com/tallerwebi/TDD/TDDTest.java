package com.tallerwebi.TDD;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

import org.junit.jupiter.api.Test;

public class TDDTest {

    @Test
    public void debeDevolverINVALIDAD_cuandoTieneMenosde8Caracteres(){

        String contraseniaInvalida = "abc";
        String fortalezaDeLaContrasenia = TDD.validarFortaleza(contraseniaInvalida);
        
        assertThat(fortalezaDeLaContrasenia, equalToIgnoringCase("INVALIDA"));
    }

    @Test
    public void debeDevolverDEBIL_cuandoTieneMenosde8Caracteres(){

        String contraseniaDebil = "abcdefgh";
        String fortalezaDeLaContrasenia = TDD.validarFortaleza(contraseniaDebil);
        
        assertThat(fortalezaDeLaContrasenia, equalToIgnoringCase("DEBIL"));
    }

    @Test
    public void debeDevolverMEDIANA_cuandoTieneMenosAlMenos4CaracteresYUnCaracterEspecial(){

        String contraseniaMediana = "abc@";
        String fortalezaDeLaContrasenia = TDD.validarFortaleza(contraseniaMediana);
        
        assertThat(fortalezaDeLaContrasenia, equalToIgnoringCase("MEDIANA"));
    }

    @Test
    public void debeDevolverFUERTE_cuandoTieneMenos8Caracteres4NumerosYUnCaracterEspecial(){

        String contraseniaFuerte = "1234@abc";
        String fortalezaDeLaContrasenia = TDD.validarFortaleza(contraseniaFuerte);
        
        assertThat(fortalezaDeLaContrasenia, equalToIgnoringCase("FUERTE"));
    }

}