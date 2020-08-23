package br.com.artesoftware.cursocomplexidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnoBissextoTest {

    @Test
    public void testBissextoComum(){
        BissextoComum anoBissexto = new BissextoComum();
        assertTrue(anoBissexto.isBissexto(1600));
        assertFalse(anoBissexto.isBissexto(2001));
        assertTrue(anoBissexto.isBissexto(2004));
        assertFalse(anoBissexto.isBissexto(1900));
    }

    @Test
    public void testBissextoLine(){
        BissextoInLine anoBissexto = new BissextoInLine();
        assertTrue(anoBissexto.isBissexto(1600));
        assertFalse(anoBissexto.isBissexto(2001));
        assertTrue(anoBissexto.isBissexto(2004));
        assertFalse(anoBissexto.isBissexto(1900));
    }

    @Test
    public void testBissextoSemReturn(){
        BissextoSemReturn anoBissexto = new BissextoSemReturn();
        assertTrue(anoBissexto.isBissexto(1600));
        assertFalse(anoBissexto.isBissexto(2001));
        assertTrue(anoBissexto.isBissexto(2004));
        assertFalse(anoBissexto.isBissexto(1900));
    }

    @Test
    public void testBissextoSemReturn2(){
        BissextoSemReturn2 anoBissexto = new BissextoSemReturn2();
        assertTrue(anoBissexto.isBissexto(1600));
        assertFalse(anoBissexto.isBissexto(2001));
        assertTrue(anoBissexto.isBissexto(2004));
        assertFalse(anoBissexto.isBissexto(1900));
    }
}