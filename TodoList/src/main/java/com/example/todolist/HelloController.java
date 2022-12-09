package com.example.todolist;

import com.example.todolist.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HelloController {

    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th bithday card for John", LocalDate.of(2016, Month.APRIL, 25));
        TodoItem item2 = new TodoItem("Doctors Appointment", "See Dr.Smith at 123 Main street. Bring paperwork", LocalDate.of(2016, Month.MAY, 23));
        TodoItem item3 = new TodoItem("Finish Design proposal", "Send mockups to Mike by Friday", LocalDate.of(2016, Month.APRIL, 22));
        TodoItem item4 = new TodoItem("Pickup Doug at train station", "Doug's arriving on March 23 on the 5:00 train", LocalDate.of(2016, Month.MARCH, 23));
        TodoItem item5 = new TodoItem("Pickup dry cleaning", "The clothes should be ready", LocalDate.of(2016, Month.APRIL, 20));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem newValue) {
                if(newValue!=null){
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM dd yyyy");
//                    DateTimeFormatter df = DateTimeFormatter.ofPattern("d M yy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        todoListView.getItems().setAll(todoItems);

        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
//        System.out.println("the selected item is "+item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadline().toString());
//        itemDetailsTextArea.setText(sb.toString());


    }


}