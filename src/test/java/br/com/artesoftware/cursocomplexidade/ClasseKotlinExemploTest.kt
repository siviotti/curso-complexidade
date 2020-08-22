package br.com.artesoftware.cursocomplexidade

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

open class ClasseKotlinExemploTest {

    @Test
    fun testSoma() { // aparentemente precisa começar com "test" para o maven rodar
        val exemplo = ClasseKotlinExemplo()
        assertEquals(5, exemplo.soma(2, 3))
    }
}