package br.com.imagine.projectcfap.controller;
import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
		
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	
	
	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("albertnasc");
		boolean senhaValida = campoSenha.getText().equals("1234");
		
		if(emailValido && senhaValida) {
			Notifications.create()
			.title("Login")
			.text("Login efetuado com sucesso")
			.showInformation();
		}
		else {
			Notifications.create()
			.title("Login")
			.text("Usuário ou senha inválido")
			.showInformation();
		}
		
		
	}
}
