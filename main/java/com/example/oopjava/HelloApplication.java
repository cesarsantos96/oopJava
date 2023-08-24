package com.example.oopjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        BankAccount conta1 = new BankAccount ("Cesar", 1234);

        BankAccount conta2 = new BankAccount ("Marcos", 4321);

        conta1.mostrarStatus();
        conta1.depositar(50.00);
        conta1.mostrarStatus();
        conta1.sacar(5.80);
        conta1.mostrarStatus();
    }
}