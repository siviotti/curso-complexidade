package br.com.artesoftware.cursocomplexidade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Sorveteria2Test {

	@Test
	public void testAllCircuits() {
		Sorveteria2 sorveteria = new Sorveteria2();
		// Fluxo Principal
		assertEquals(17, sorveteria.precoSorvete(false, false, 1)); // Comum-Copinho-1Cob
		assertEquals(24, sorveteria.precoSorvete(true, true, 2)); // Comum-Copinho-2Cob
	}

}
