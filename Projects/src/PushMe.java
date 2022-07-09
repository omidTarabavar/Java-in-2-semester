import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class PushMe extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField pushMeTextField = new TextField();
        pushMeTextField.setMaxWidth(250);

        Label pushMeLabel = new Label();
        pushMeLabel.setTextFill(Color.RED);
        pushMeLabel.setFont(Font.font("Arial",20));

        Button pushMeButton = new Button();
        pushMeButton.setText("Type something in the box then push me");
        pushMeButton.setOnAction(event -> pushMeLabel.setText("You entered: "+pushMeTextField.getText()));

        VBox root = new VBox();
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(pushMeTextField,pushMeButton,pushMeLabel);

        Scene scene = new Scene(root,350,150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Push Me");
        primaryStage.show();


    }
}
