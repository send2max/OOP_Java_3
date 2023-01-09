public class User implements Comparable<User> {

    private String firstName;
    private String lastName;
    private int age;

    private Personal lackeys = new Personal();

    public User(String firstName, String lastName, int age ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Personal getLackeys() {
        return lackeys;
    }

    public User(String firstName, String lastName, int age, Personal lackeys) {
        this(firstName, lastName, age);
        this.lackeys = lackeys;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("%s %s age:%d", firstName, lastName,age);
    }

    @Override
    public int compareTo(User o) {
        String fullName = this.firstName+this.lastName;
        String o_fullName = o.firstName+o.lastName;
        if (o_fullName.equals(fullName))
            return this.age-o.age;
        else
            return fullName.compareTo(o_fullName);
    }


}
