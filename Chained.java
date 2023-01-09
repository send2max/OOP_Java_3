public interface Chained<U> {
    void addLast(U u);
    void addFirst(U u);
    int size();
    U get(int counter);
}
