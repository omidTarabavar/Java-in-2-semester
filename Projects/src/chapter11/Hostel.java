package chapter11;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.text.NumberFormat;

/** GUI for the Hostel application
 * @author omidTarabavar
 * @version 15 july 2022
 */
public class Hostel extends Application {
    private int noOfRooms;
    private TenantList list;
    private final int WIDTH = 800;
    private final int HEIGHT = 500;

    private Label headingLabel = new Label("Hostel Application");
    private Label roomLabel1 = new Label("Room");
    private TextField roomField1 = new TextField();
    private Label nameLabel = new Label("Name");
    private TextField nameField = new TextField();
    private Button addButton = new Button("Add Tenant");
    private Button displayButton = new Button("Display Tenant");
    private Button searchButton = new Button("Search Tenant");
    private Button removeButton = new Button("Remove Tenant");
    private Button saveAndQuitButton = new Button("Save and Quit");
    private TextArea displayArea1 = new TextArea();
    private Label roomLabel2 = new Label("Room");
    private TextField roomField2 = new TextField();
    private Label monthLabel = new Label("Month");
    private TextField monthField = new TextField();
    private Label amountLabel = new Label("Amount");
    private TextField amountField = new TextField();
    private Button paymentButton = new Button("Make Payment");
    private Button listButton = new Button("List Payments");
    private TextArea displayArea2 =new TextArea();

    public static void main(String[] args) {
        launch(args);
    }

    /** Initialises the screen
     * @param stage: The scene's stage
     */
    @Override
    public void start(Stage stage) {
        noOfRooms = getNumberOfRooms();
        list = new TenantList(noOfRooms);
        TenantFileHandler.readRecords(list,displayArea1);

        HBox roomDetails = new HBox(10);
        HBox tenantButtons = new HBox(10);
        HBox paymentDetails = new HBox(10);
        HBox paymentButtons = new HBox(10);
        roomDetails.getChildren().addAll(roomLabel1,roomField1,nameLabel,nameField);
        tenantButtons.getChildren().addAll(addButton,displayButton,searchButton,removeButton,saveAndQuitButton);
        paymentDetails.getChildren().addAll(roomLabel2,roomField2,monthLabel,monthField,amountLabel,amountField);
        paymentButtons.getChildren().addAll(paymentButton,listButton);
        VBox root = new VBox(10);
        root.getChildren().addAll(headingLabel,roomDetails,tenantButtons,displayArea1,paymentDetails,paymentButtons,displayArea2);
        Scene scene = new Scene(root, Color.LIGHTBLUE);

        Font font = new Font("Calibri",40);
        headingLabel.setFont(font);

        roomDetails.setAlignment(Pos.CENTER);
        tenantButtons.setAlignment(Pos.CENTER);
        paymentDetails.setAlignment(Pos.CENTER);
        paymentButtons.setAlignment(Pos.CENTER);
        root.setAlignment(Pos.CENTER);

        roomField1.setMaxWidth(50);
        roomField2.setMaxWidth(50);

        roomDetails.setMinWidth(WIDTH);
        roomDetails.setMaxWidth(WIDTH);

        tenantButtons.setMinWidth(WIDTH);
        tenantButtons.setMaxWidth(WIDTH);

        paymentDetails.setMinWidth(WIDTH);
        paymentDetails.setMaxWidth(WIDTH);

        paymentButtons.setMinWidth(WIDTH);
        paymentButtons.setMaxWidth(WIDTH);

        root.setMinSize(WIDTH,HEIGHT);
        root.setMaxSize(WIDTH,HEIGHT);

        displayArea1.setMaxSize(WIDTH - 80,HEIGHT/5.0);
        displayArea2.setMaxSize(WIDTH-80,HEIGHT/5.0);
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        BorderStroke style = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,new CornerRadii(0),new BorderWidths(2));

        root.setBorder(new Border(style));
        root.setBackground(Background.EMPTY);

        Background background = new Background(new BackgroundFill(Color.LIGHTYELLOW,new CornerRadii(10), Insets.EMPTY));

        addButton.setBackground(background);
        displayButton.setBackground(background);
        searchButton.setBackground(background);
        removeButton.setBackground(background);
        saveAndQuitButton.setBackground(background);
        paymentButton.setBackground(background);
        listButton.setBackground(background);

        addButton.setOnAction(actionEvent -> addHandler());
        displayButton.setOnAction(actionEvent -> displayHandler());
        searchButton.setOnAction(actionEvent -> searchHandler());
        removeButton.setOnAction(actionEvent -> removeHandler());
        paymentButton.setOnAction(actionEvent -> paymentHandler());
        listButton.setOnAction(actionEvent -> listHandler());
        saveAndQuitButton.setOnAction(actionEvent -> saveAndQuitHandler());

        stage.setScene(scene);
        stage.setTitle("Hostel Application");
        stage.setResizable(false);
        stage.show();
    }

    /**
     * Method to request number of hostel rooms from the user
     * @return number of rooms
     */
    private int getNumberOfRooms(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setHeaderText("How many rooms?");
        dialog.setTitle("Room information Request");

        String responce = dialog.showAndWait().get();
        return Integer.parseInt(responce);
    }

    private void addHandler(){
        try {
            String roomEntered = roomField1.getText();
            String nameEntered = nameField.getText();
            if(roomEntered.length() == 0 || nameEntered.length() == 0){
                displayArea1.setText("Room number and name must be entered");
            }else if(Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered) > noOfRooms){
                displayArea1.setText("There are only "+noOfRooms+" rooms");
            }else if(list.search(Integer.parseInt(roomEntered)).isPresent()){
                displayArea1.setText("Room number "+Integer.parseInt(roomEntered) + " is occupied");
            }else {
                Tenant t = new Tenant(nameEntered,Integer.parseInt(roomEntered));
                list.addTenant(t);
                roomField1.setText("");
                nameField.setText("");
                displayArea1.setText("New tenant in room "+roomEntered+" successfully added");
            }
        }catch (NumberFormatException e){
            displayArea1.setText("Invalid room number "+e.getMessage()+"\nEnter whole numbers only!");
        }
    }

    private void displayHandler(){
        if(list.isEmpty()){
            displayArea1.setText("All rooms are empty");
        }else {
            displayArea1.setText("Room" + "\t"+ "Name" + "\n");
            for(int i = 1 ; i <= noOfRooms ; i++){
                if(list.search(i).isPresent()) {
                    displayArea1.appendText(list.search(i).get().getRoom() + "\t\t" + list.search(i).get().getName() + "\n");
                }
            }

        }
    }
    private void searchHandler(){
        String roomEntered = roomField1.getText();
        if(roomEntered.length() == 0){
            displayArea1.setText("Room number must be entered");
        }else if(Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered) > noOfRooms) {
            displayArea1.setText("Invalid room number");
        }else if(list.search(Integer.parseInt(roomEntered)).isEmpty()){
            displayArea1.setText("Room number "+roomEntered+" is empty");
        }else {

            displayArea1.setText("Name of tenant: "+list.search(Integer.parseInt(roomEntered)).get().getName());
        }
    }
    private void removeHandler(){
        String roomEntered =roomField1.getText();
        if(roomEntered.length() == 0){
            displayArea1.setText("Room number must be entered");
        }else if(Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered) > noOfRooms){
            displayArea1.setText("Invalid room number");
        }else if(!list.search(Integer.parseInt(roomEntered)).isPresent()){
            displayArea1.setText("Room number "+roomEntered+" is empty");
        }else {
            list.removeTenant(Integer.parseInt(roomEntered));
            displayArea1.setText("Tenant removed from room "+Integer.parseInt(roomEntered));
        }
    }

    private void paymentHandler(){
        String roomEntered = roomField2.getText();
        String monthEntered = monthField.getText();
        String amountEntered = amountField.getText();

        if(roomEntered.length() == 0 || monthEntered.length() == 0 || amountEntered.length() == 0){
            displayArea2.setText("Room number, month and amount must all be entered");
        }else if (Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered) > noOfRooms){
            displayArea2.setText("Invalid room number");
        }else if (list.search(Integer.parseInt(roomEntered)).isEmpty()){
            displayArea2.setText("Room number "+roomEntered+" is empty");
        }else if(Double.parseDouble(amountEntered) <= 0){
            displayArea2.setText("Invalid payment amount");
        }else {
            Payment p = new Payment(monthEntered,Double.parseDouble(amountEntered));
            list.search(Integer.parseInt(roomEntered)).get().makePayment(p);
            displayArea2.setText("Payment recorded");
        }
    }

    private void listHandler(){
        String roomEntered = roomField2.getText();
        if(roomEntered.length() == 0){
            displayArea2.setText("Room number must be entered");
        }else if (Integer.parseInt(roomEntered) < 1 || Integer.parseInt(roomEntered) > noOfRooms){
            displayArea2.setText("Invalid room number");
        }else if (list.search(Integer.parseInt(roomEntered)).isEmpty()){
            displayArea2.setText("Room number "+Integer.parseInt(roomEntered) + " is empty");
        }else {
            Tenant t = list.search(Integer.parseInt(roomEntered)).get();
            PaymentList p = t.getPayments();
            if(p.getTotal()  == 0){
                displayArea2.setText("No payments made for this tenant");
            }else {
                NumberFormat nf = NumberFormat.getCurrencyInstance();
                displayArea2.setText("Month"+"\t\t"+"Amount"+"\n");
                for (int i = 1 ; i <= p.getTotal() ; i++){
                    String s = nf.format(p.getPayment(i).get().getAmount());
                    String spacing = makeSpacing(p.getPayment(i).get().getMonth());
                    displayArea2.appendText(""+spacing+"\t\t"+s+"\n");
                }
                displayArea2.appendText("\n"+"Total paid so far : "+nf.format(p.calculateTotalPaid()));
                monthField.setText("");
                amountField.setText("");
            }
        }
    }
    private String makeSpacing(String month){
        String res =month;
        int dif = 8 - month.length();
        for(int i = 1 ; i <= dif ; i++){
            res += ' ';
        }
        return res;
    }
    private void saveAndQuitHandler(){
        TenantFileHandler.saveRecords(noOfRooms,list,displayArea1);
        Platform.exit();
    }
}
