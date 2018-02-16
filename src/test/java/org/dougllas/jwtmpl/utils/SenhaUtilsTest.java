package org.dougllas.jwtmpl.utils;

import org.junit.Test;

import org.junit.*;

public class SenhaUtilsTest {

	String senha = "asdfasdf";

	@Test
	public void testGeraSenhaBCrypt() {
		String hash1 = SenhaUtils.gerarBCrypt(senha);
		String hash2 = SenhaUtils.gerarBCrypt(senha);		
		Assert.assertFalse(hash1.equals(hash2));
	}
	
	@Test
	public void testSenhaValida() {
		String hash1 = SenhaUtils.gerarBCrypt(senha);
		Assert.assertTrue(SenhaUtils.senhaValida(senha, hash1));
	}
	
	@Test
	public void testSenhaInvalida() {
		String hash1 = SenhaUtils.gerarBCrypt(senha);
		Assert.assertFalse(SenhaUtils.senhaValida("asdfafeee", hash1));
	}
}
