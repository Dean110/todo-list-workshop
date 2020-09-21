package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoListTest {

    private ToDoList underTest;
    private ToDoItem testItem1;

    @BeforeEach
    void setUp() {
        underTest = new ToDoList();
        testItem1 = new ToDoItem("Feed Bosco", "Tomorrow");
    }

    @Test
    public void shouldBeAbleToAddTodoItemToTodoList(){
        //Arrangement
        //Action
        underTest.addItem(testItem1);

        //Assertion
        Collection<ToDoItem> items = underTest.getItems();
        assertThat(items).hasSize(1)
                         .contains(testItem1);

    }
    @Test
    public void shouldBeAbleToAddTwoTodoItemsToTodoList(){
        //Arrangement
        ToDoItem testItem2 = new ToDoItem("Feed Bruce", "Today");

        //Action
        underTest.addItem(testItem1);
        underTest.addItem(testItem2);

        //Assertion
        Collection<ToDoItem> items = underTest.getItems();
        assertThat(items).hasSize(2)
                .contains(testItem2, testItem1);

    }


}
