package com.example.todolist;

import com.example.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HelloController {

    private List<TodoItem> todoItems;

    public void initialize(){
        TodoItem item1 = new TodoItem("Mail birthday card","Buy a 30th bithday card for John", LocalDate.of(2016, Month.APRIL, 25));
        TodoItem item2 = new TodoItem("Doctors Appointment","See Dr.Smith at 123 Main street. Bring paperwork", LocalDate.of(2016, Month.MAY, 23));
        TodoItem item3 = new TodoItem("Finish Design proposal","Send mockups to Mike by Friday", LocalDate.of(2016, Month.APRIL, 22));
        TodoItem item4 = new TodoItem("Pickup Doug at train station","Doug's arriving on March 23 on the 5:00 train", LocalDate.of(2016, Month.MARCH, 23));
        TodoItem item5 = new TodoItem("Pickup dry cleaning","The clothes should be ready", LocalDate.of(2016, Month.APRIL, 20));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);


    }


}