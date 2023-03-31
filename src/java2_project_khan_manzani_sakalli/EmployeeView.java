package java2_project_khan_manzani_sakalli;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeView {
    @FXML
    private ListView<Employee> employeeListView;

    @FXML
    private Label numEmployeesLabel;

    private EmployeeController employeeController;
    private EmployeeSearch employeeSearch;

    public void updateEmployeeListView(ArrayList<Employee> employees) {
        // implementation goes here
    }

    public void updateNumEmployeesLabel(int numEmployees) {
        // implementation goes here
    }

    @FXML
    private void handleAddEmployeeButton(ActionEvent event) {
        // implementation goes here
    }

    @FXML
    private void handleRemoveEmployeeButton(ActionEvent event) {
        // implementation goes here
    }

    @FXML
    private void handleSaveToFileButton(ActionEvent event) {
        // implementation goes here
    }

    @FXML
    private void handleSearchButton(ActionEvent event) {
        // implementation goes here
    }

    public static void launch(Stage primaryStage) {
        try {
            EmployeeIO employeeIO = new EmployeeIO();
            EmployeeController employeeController = new EmployeeController(employeeIO);
            EmployeeSearch employeeSearch = new EmployeeSearch(employeeController);

            FXMLLoader loader = new FXMLLoader(EmployeeView.class.getResource("EmployeeView.fxml"));
            EmployeeView employeeView = new EmployeeView();
            employeeView.employeeController = employeeController;
            employeeView.employeeSearch = employeeSearch;
            loader.setController(employeeView);

            VBox root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
