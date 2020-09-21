package project;

public class ToDoItem {
    private String thingToDo;
    private String dueDate;

    public ToDoItem(String thingToDo, String dueDate) {
        this.thingToDo = thingToDo;
        this.dueDate = dueDate;
    }

    public String getThingToDo() {
        return thingToDo;
    }

    public String getDueDate() {
        return dueDate;
    }
}
