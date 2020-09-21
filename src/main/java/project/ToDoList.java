package project;

import java.util.ArrayList;
import java.util.Collection;

public class ToDoList {

    private Collection<ToDoItem> items = new ArrayList<>();

    public void addItem(ToDoItem toDoItem) {
        items.add(toDoItem);
    }

    public Collection<ToDoItem> getItems() {
        return items;
    }
}
