import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    private final String[] units = {"meters", "kilometers", "feet", "yards", "miles"};
    private final double[] factors = {1.0, 0.001, 3.28084, 1.09361, 0.000621371};

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Metric Converter");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        // Add input field
        TextField inputField = new TextField();
        inputField.setPromptText("Enter value to convert");
        GridPane.setConstraints(inputField, 0, 0);
        grid.getChildren().add(inputField);

        // Add units combo box
        ComboBox<String> fromComboBox = new ComboBox<>();
        fromComboBox.getItems().addAll(units);
        fromComboBox.setValue(units[0]);
        GridPane.setConstraints(fromComboBox, 1, 0);
        grid.getChildren().add(fromComboBox);

        Label equalsLabel = new Label("=");
        GridPane.setConstraints(equalsLabel, 2, 0);
        grid.getChildren().add(equalsLabel);

        ComboBox<String> toComboBox = new ComboBox<>();
        toComboBox.getItems().addAll(units);
        toComboBox.setValue(units[1]);
        GridPane.setConstraints(toComboBox, 3, 0);
        grid.getChildren().add(toComboBox);

        // Add convert button
        Button convertButton = new Button("Convert");
        GridPane.setConstraints(convertButton, 0, 1);
        grid.getChildren().add(convertButton);

        // Add result label
        Label resultLabel = new Label();
        GridPane.setConstraints(resultLabel, 1, 1, 3, 1);
        grid.getChildren().add(resultLabel);

        // Set action on convert button click
        convertButton.setOnAction(event -> {
            try {
                double value = Double.parseDouble(inputField.getText());
                int fromIndex = fromComboBox.getSelectionModel().getSelectedIndex();
                int toIndex = toComboBox.getSelectionModel().getSelectedIndex();

                double result = convert(value, fromIndex, toIndex);

                resultLabel.setText(String.format("%.2f %s = %.2f %s",
                        value, units[fromIndex], result, units[toIndex]));
            } catch (NumberFormatException e) {
                resultLabel.setText("Invalid input: " + inputField.getText());
            }
        });

        primaryStage.setScene(new Scene(grid, 400, 100));
        primaryStage.show();
    }

    private double convert(double value, int fromIndex, int toIndex) {
        if (fromIndex == toIndex) {
            return value;
        }
        double factor = factors[fromIndex] / factors[toIndex];
        return value * factor;
    }
}
