package br.com.artesoftware.cursocomplexidade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SorveteriaTest {

	@Test
	public void testTodosOsCaminhos() {
		Sorveteria sorveteria = new Sorveteria();

		assertEquals(17, sorveteria.precoSorvete(false, false, 1)); // Comum-Copinho-1Cob
		assertEquals(18, sorveteria.precoSorvete(false, false, 2)); // Comum-Copinho-2Cob
		assertEquals(18, sorveteria.precoSorvete(false, true, 1)); // Comum-Casquinha-1Cob
		assertEquals(19, sorveteria.precoSorvete(false, true, 2)); // Comum-Casquinha-2Cob

		assertEquals(22, sorveteria.precoSorvete(true, false, 1)); // Premium-Copinho-1Cob
		assertEquals(23, sorveteria.precoSorvete(true, false, 2)); // Premium-Copinho-2Cob
		assertEquals(23, sorveteria.precoSorvete(true, true, 1)); // Premium-Casquinha-1Cob
		assertEquals(24, sorveteria.precoSorvete(true, true, 2)); // Premium-Casquinha-2Cob
	}

	@Test
	public void testCaminhosIndependentes() {
		Sorveteria sorveteria = new Sorveteria();

		assertEquals(17, sorveteria.precoSorvete(false, false, 1)); // Comum-Copinho-1Cob
		assertEquals(22, sorveteria.precoSorvete(true, false, 1)); // Premium-Copinho-1Cob
		assertEquals(18, sorveteria.precoSorvete(false, true, 1)); // Comum-Casquinha-1Cob
		assertEquals(18, sorveteria.precoSorvete(false, false, 2)); // Comum-Copinho-2Cob
	}

}
