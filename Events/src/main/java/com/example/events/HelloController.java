package com.example.events;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;


    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent event) {
        if (event.getSource().equals(helloButton)) {
            System.out.println("Hello, " + nameField.getText());
        } else if (event.getSource().equals(byeButton)) {
            System.out.println("Bye, " + nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    String s = Platform.isFxApplicationThread()?"UI Thread":"Background Thread";
                    System.out.println("I am going to sleep on the: "+s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {

                            String s = Platform.isFxApplicationThread()?"UI Thread":"Background Thread";
                            System.out.println("I am updating the label on the : "+s);

                            ourLabel.setText("We did something!");
                        }
                    });

                }catch (InterruptedException e){
                    // we don't care about this
                }
            }
        };

        new Thread(task).start();


        if(ourCheckBox.isSelected()){
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButton = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButton);
        byeButton.setDisable(disableButton);
    }

    @FXML
    public void handleChange(){
        System.out.println("The checkbox is " + (ourCheckBox.isSelected()?"checked":"not checked"));
    }
}