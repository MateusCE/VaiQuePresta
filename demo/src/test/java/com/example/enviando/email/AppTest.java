package com.example.enviando.email;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

public class AppTest {
private String userName = "mateusjavatreinamento@gmail.com";
private String senha = "mateus210693++";
	@org.junit.Test
	public void TesteEmail(){
		try {
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");/*Autorização */
			properties.put("mail.smtp.starttls.enable", "true"); /* Autenticação */
			properties.put("mail.smtp.host", "smtp.gmail.com");/*Servidor g-mail*/
			properties.put("mail.smtp.port", "465"); /*Porta do servidor*/
			properties.put("mail.smtp.socketFactory.port", "465");/*Especifica a porta a ser conectada pelo socket*/
			properties.put("mail.smtp.SocketFactory.class", "javax.net.ssl.SSLSocketFactory");/*Classe socket de conexão SMTP*/

			Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return super.getPasswordAuthentication();
					new PasswordAuthentication(userName, senha);
				}
			});

			System.out.println(senha);

		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
