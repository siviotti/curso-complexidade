package br.com.artesoftware.cursocomplexidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClasseJavaExemploTest {

    @Test
    public void testSoma() { // aparentemente precisa começar com "test" para o maven rodar
        ClasseJavaExemplo exemplo = new ClasseJavaExemplo();
        assertEquals(5, exemplo.soma(2,3));
    }
}