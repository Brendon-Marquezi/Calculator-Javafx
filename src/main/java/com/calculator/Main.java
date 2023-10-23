package com.calculator;

import com.calculator.View.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        new MainView().start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}