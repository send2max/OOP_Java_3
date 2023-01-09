public class LLcoolJ<U> implements Chained<U>{
    private class Link <U>{

        private U content;
        private Link<U> next;
        private Link<U> prev;
        public Link(U content, Link<U> prev, Link<U> next) {
            this.content = content;
            this.prev = prev;
            this.next = next;
        }

        public U getContent() { return content; }

        public Link<U> getNext() { return next; }
        public Link<U> getPrev() { return prev; }
        public void setContent(U content) { this.content = content; }

        public void setNext(Link<U> next) {  this.next = next; }
        public void setPrev(Link<U> prev) { this.prev = prev; }
    }
    private Link<U> first;

    private Link<U> last;
    private int size= 0;
    public LLcoolJ() {
        last = new Link<U>(null, first,null);
        first = new Link<U>(null, null, last);
    }

    @Override
    public void addLast(U u) {
        Link<U> element = new Link<>(u, last, null);
        last.next = element;
    }

    @Override
    public void addFirst(U u) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public U get(int counter) {
        return null;
    }



}

