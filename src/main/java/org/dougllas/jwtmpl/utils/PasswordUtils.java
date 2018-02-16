package org.dougllas.jwtmpl.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordUtils {
	
	private static PasswordEncoder encoder = new BCryptPasswordEncoder();

	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return null;
		}		
		return encoder.encode(senha);
	}
	
	public static boolean senhaValida(String senha, String encodedPassword) {
		return encoder.matches(senha, encodedPassword);
	}
}
