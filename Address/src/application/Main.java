package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane grid = new GridPane();

			grid.setAlignment(Pos.CENTER);
			grid.setVgap(5);
			grid.setHgap(5);
			grid.setPadding(new Insets(10, 10, 10, 10));
			// grid.setGridLinesVisible(true);
			Label lblName = new Label("Name");
			TextField txtName = new TextField();
			FlowPane flowName = new FlowPane(Orientation.VERTICAL, lblName, txtName);
			flowName.setVgap(5);
			flowName.setAlignment(Pos.CENTER);
			grid.add(flowName, 0, 0, 2, 1);

			Label lblStreet = new Label("Street");
			TextField txtStreet = new TextField();
			FlowPane flowStreet = new FlowPane(Orientation.VERTICAL, lblStreet, txtStreet);
			flowStreet.setAlignment(Pos.CENTER);
			flowStreet.setVgap(5);
			grid.add(flowStreet, 2, 0, 2, 1);

			Label lblCity = new Label("City");
			TextField txtCity = new TextField();
			FlowPane flowCity = new FlowPane(Orientation.VERTICAL, lblCity, txtCity);
			flowCity.setAlignment(Pos.CENTER);
			flowCity.setVgap(5);
			grid.add(flowCity, 4, 0, 2, 1);

			Label lblState = new Label("State");
			TextField txtState = new TextField();
			FlowPane flowState = new FlowPane(Orientation.VERTICAL, lblState, txtState);
			flowState.setAlignment(Pos.CENTER);
			flowState.setVgap(5);
			grid.add(flowState, 1, 1, 2, 1);

			Label lblZip = new Label("Zip");
			TextField txtZip = new TextField();
			FlowPane flowZip = new FlowPane(Orientation.VERTICAL, lblZip, txtZip);
			flowZip.setAlignment(Pos.CENTER);
			flowZip.setVgap(5);
			grid.add(flowZip, 3, 1, 2, 1);

			Button btnSubmit = new Button("Submit");
			HBox bxSubmit = new HBox(10);
			bxSubmit.setAlignment(Pos.BASELINE_CENTER);
			bxSubmit.getChildren().add(btnSubmit);
			grid.add(bxSubmit, 2, 4, 2, 1);

			btnSubmit.setOnAction(e -> {
				System.out.println(txtName.getText());
				System.out.println(txtStreet.getText());
				System.out.println(txtCity.getText() + " " + txtState.getText() + " " + txtZip.getText());
			});

			Scene scene = new Scene(grid, 600, 250);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
