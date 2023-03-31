package java2_project_khan_manzani_sakalli;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        EmployeeView.launch(primaryStage);
        primaryStage.setTitle("Employee Management System");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

