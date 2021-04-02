package test.java.ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.Tracker;

import java.util.Scanner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        StartUI forTest = new StartUI();
        forTest.init(scanner, tracker);

        Assert.assertThat(tracker.findAll()[0].getName(), Matchers.is("Item name"));
    }

//    @Test
//    public void whenReplaceItem() {
//        Tracker tracker = new Tracker();
//        /* Добавим в tracker новую заявку */
//        Item item = tracker.add(new Item("Replaced item"));
//        /* Входные данные должны содержать ID добавленной заявки item.getId() */
//        String replacedName = "New item name";
//        Input in = new StubInput(
//                new String[] {"0" /* входные параметры для ReplaceAction */, "1"}
//        );
//        UserAction[] actions = {
//                new ReplaceAction(),
//                new Exit()
//        };
//        new StartUI().init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
//    }
//
//    @Test
//    public void whenDeleteItem() {
//        Tracker tracker = new Tracker();
//        /* Добавим в tracker новую заявку */
//        Item item = tracker.add(new Item("Deleted item"));
//        /* Входные данные должны содержать ID добавленной заявки item.getId() */
//        Input in = new StubInput(
//                new String[] {"0" /* входные параметры для DeleteAction */, "1"}
//        );
//        UserAction[] actions = {
//                new DeleteAction(),
//                new Exit()
//        };
//        new StartUI().init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()), is(nullValue()));
//    }
}
