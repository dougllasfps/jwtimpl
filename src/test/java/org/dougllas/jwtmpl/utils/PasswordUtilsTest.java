package org.dougllas.jwtmpl.utils;

import org.junit.Test;

import org.junit.*;

public class PasswordUtilsTest {

	String senha = "asdfasdf";

	@Test
	public void testGeraSenhaBCrypt() {
		String hash1 = PasswordUtils.gerarBCrypt(senha);
		String hash2 = PasswordUtils.gerarBCrypt(senha);		
		Assert.assertFalse(hash1.equals(hash2));
	}
	
	@Test
	public void testSenhaValida() {
		String hash1 = PasswordUtils.gerarBCrypt(senha);
		Assert.assertTrue(PasswordUtils.senhaValida(senha, hash1));
	}
	
	@Test
	public void testSenhaInvalida() {
		String hash1 = PasswordUtils.gerarBCrypt(senha);
		Assert.assertFalse(PasswordUtils.senhaValida("asdfafeee", hash1));
	}
}
