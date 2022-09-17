import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Box extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("TOP__LEFT");
        VBox box1 = new VBox(btn1);
        box1.setMaxSize(200,70);
        box1.setMinSize(200,70);
        box1.setAlignment(Pos.TOP_LEFT);
        box1.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box1.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));

        Button btn2 = new Button("CENTER__LEFT");
        VBox box2 = new VBox(btn2);
        box2.setMaxSize(200,70);
        box2.setMinSize(200,70);
        box2.setAlignment(Pos.CENTER_RIGHT);
        box2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box2.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));


        Button btn3 = new Button("BOTTOM__LEFT");
        VBox box3 = new VBox(btn3);
        box3.setMaxSize(200,70);
        box3.setMinSize(200,70);
        box3.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box3.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));



        Button btn4 = new Button("BASELINE__LEFT Top inset 10");
        VBox box4 = new VBox(btn4);
        box4.setMaxSize(200,70);
        box4.setMinSize(200,70);
        box4.setAlignment(Pos.BASELINE_LEFT);
        box4.setPadding(new Insets(10,0,0,0));
        box4.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box4.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));



        Button btn5 = new Button("5");
        VBox box5 = new VBox(btn5);
        box5.setMaxSize(200,70);
        box5.setMinSize(200,70);

        box5.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box5.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));


        Button btn6 = new Button("6");
        VBox box6 = new VBox(btn6);
        box6.setMaxSize(200,70);
        box6.setMinSize(200,70);

        box6.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box6.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));


        Button btn7 = new Button("7");
        VBox box7 = new VBox(btn7);
        box7.setMaxSize(200,70);
        box7.setMinSize(200,70);

        box7.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box7.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));


        Button btn8 = new Button("BASELINE__CENTER Top inset 20");
        VBox box8 = new VBox(btn8);
        box8.setMaxSize(200,70);
        box8.setMinSize(200,70);
        box8.setPadding(new Insets(20,0,0,0));
        box8.setAlignment(Pos.BASELINE_CENTER);
        box8.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box8.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));


        Button btn9 = new Button("9");
        VBox box9 = new VBox(btn9);
        box9.setMaxSize(200,70);
        box9.setMinSize(200,70);

        box9.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box9.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));


        Button btn10 = new Button("10");
        VBox box10 = new VBox(btn10);
        box10.setMaxSize(200,70);
        box10.setMinSize(200,70);

        box10.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box10.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));


        Button btn11 = new Button("11");
        VBox box11 = new VBox(btn11);
        box11.setMaxSize(200,70);
        box11.setMinSize(200,70);

        box11.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box11.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));


        Button btn12 = new Button("BASELINE__RIGHT Top inset 30");
        VBox box12 = new VBox(btn12);
        box12.setMaxSize(200,70);
        box12.setMinSize(200,70);
        box12.setPadding(new Insets(30,0,0,0));
        box12.setAlignment(Pos.BASELINE_RIGHT);
        box12.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2))));
        box12.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(0),new Insets(0))));


        HBox hbox1 = new HBox(20);
        hbox1.getChildren().addAll(box1,box2,box3,box4);

        HBox hbox2 = new HBox(20);
        hbox2.getChildren().addAll(box5,box6,box7,box8);

        HBox hbox3 = new HBox(20);
        hbox3.getChildren().addAll(box9,box10,box11,box12);


        VBox root = new VBox(10);
        root.getChildren().addAll(hbox1,hbox2,hbox3);
        root.setPadding(new Insets(20,20,20,20));
        Scene scene = new Scene(root,900,300);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
