import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
    private User employee;

    public Company(User user){
        this.employee = user;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            List<User> crew = deepTree(employee);
            Iterator<User> iter= crew.iterator();
            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public User next() {
                return iter.next();
            }
        };
    }
    
    private List<User> deepTree(User u){
        List<User> res = new ArrayList<>();
        res.add(u);
        if (u.getLackeys().size()==0)
            return res;
        else {
            u.getLackeys().forEach(i->res.addAll(deepTree(i)));
            return res;
        }
    }
}
