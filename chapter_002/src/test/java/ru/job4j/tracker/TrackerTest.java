package test.java.ru.job4j.tracker;

import static org.hamcrest.core.IsNull.nullValue;
import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        Assert.assertThat(tracker.findById(id), Is.is(IsNull.nullValue()));
    }
}
