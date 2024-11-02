package org.usuario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class appmain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String pathMain="C:\\Users\\Public\\Workspace\\usuario\\src\\main\\java\\org\\usuario\\view\\mainview.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(new FileInputStream(pathMain));

        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}