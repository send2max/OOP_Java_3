import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User> {

    private List<User> users = new ArrayList<>();

    public Personal addUsers(User u) {
        users.add(u);
        return this;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }

    public List<User> getUsers() {
        return users;
    }

    public int size() {
        return users.size();
    }
}
