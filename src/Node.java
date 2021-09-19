class Node<T extends Comparable<T>> implements Comparable<T>{
    private T data; 
    private Node<T> next;
    private Node<T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
//implement a compareTo method
    public int compareTo(Node<T> other) {
        return this.data.toString().compareTo(other.data.toString());
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public Node<T> getPrevious() {
        return this.prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> prev) {
        this.prev = prev;
    }
    @Override
    public int compareTo(T o) {
        return this.data.compareTo(o);

    }
}