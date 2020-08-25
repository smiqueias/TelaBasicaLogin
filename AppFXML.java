package br.com.imagine.projectcfap.view;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {
	
	private Stage palco;
	private Scene cena2;
	@Override
	public void start(Stage primaryStage) throws Exception {
		palco = primaryStage;
		
		
		String arquivoCSS = getClass().getResource("Login.css").toExternalForm();
		
		
		URL arquivoFXML = getClass().getResource("Login.fxml");
		 GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 350,400);
		cena.getStylesheets().add(arquivoCSS);
		
		
		
		
		
		
		
		palco.setResizable(false);
		palco.setTitle("Tela de login");
		palco.setScene(cena);
		palco.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
