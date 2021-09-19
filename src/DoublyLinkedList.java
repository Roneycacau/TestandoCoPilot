class DoublyLinkedList<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
//any insertion the list must be reorganize in alphabetical order
    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);
        
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {    
            Node<T> current = this.head;
            while (current != null) {
                if (current.getData().compareTo(data) > 0) {
                    if (current == this.head) {
                        newNode.setNext(this.head);
                        this.head.setPrevious(newNode);
                        this.head = newNode;
                        break;
                    } else {
                        newNode.setNext(current);
                        newNode.setPrevious(current.getPrevious());
                        current.getPrevious().setNext(newNode);
                        current.setPrevious(newNode);
                        break;
                    }
                } else if (current.getData().compareTo(data) < 0) {
                    if (current.getNext() == null) {
                        current.setNext(newNode);
                        newNode.setPrevious(current);
                        this.tail = newNode;
                        break;
                    } else {
                        current = current.getNext();
                    }
                } else {
                    System.out.println("The element already exists");
                    break;
                }
            }
        }
        this.size++;
    }

    //any removal the list must be reorganize in alphabetical order
    public void remove(T data) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.getData().equals(data)) {
                if (current == this.head) {
                    this.head = current.getNext();
                    this.head.setPrevious(null);
                    break;
                } else if (current == this.tail) {
                    this.tail = current.getPrevious();
                    this.tail.setNext(null);
                    break;
                } else {
                    current.getPrevious().setNext(current.getNext());
                    current.getNext().setPrevious(current.getPrevious());
                    break;
                }
            } else {
                current = current.getNext();
            }
        }
        this.size--;
    }

    //method to return index of the element
    public int indexOf(T data) {
        int index = 0;
        Node<T> current = this.head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return index;
            } else {
                current = current.getNext();
                index++;
            }
        }
        return -1;
    }

    //method to search for the element
    public boolean search(T data) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            } else {
                current = current.getNext();
            }
        }
        return false;
    }

    //method to update the element
    public void update(T data, T newData) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.getData().equals(data)) {
                current.setData(newData);
                break;
            } else {
                current = current.getNext();
            }
        }
    }

    //implement print specific element
    public void print(T data) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.getData().equals(data)) {
                System.out.println(current.getData());
                break;
            } else {
                current = current.getNext();
            }
        }
    }
    
    //count the number of elements
    public int size() {
        return this.size;
    }

    // toString method
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = this.head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
            current = current.getNext();
        }
        return sb.toString();
    }
}