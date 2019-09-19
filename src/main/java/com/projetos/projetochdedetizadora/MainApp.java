package com.projetos.projetochdedetizadora;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/TelaPrincipal.fxml"));
        
        //INSERINDO O ICONE DA APLICAÇÃO
        Image applicationIcon = new Image(getClass().getResourceAsStream("/icons/icon_aws2.png"));
        stage.getIcons().add(applicationIcon);
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/TelaPrincipal.css");
        
        stage.setTitle("A.W.S Intelligence");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
