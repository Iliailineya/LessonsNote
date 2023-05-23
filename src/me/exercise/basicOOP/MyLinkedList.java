package me.exercise.basicOOP;


public class MyLinkedList<E> {

    private int size = 0;

    private Node<E> first;
    private Node<E> last;

    public void add(E item) {
        Node<E> node = new Node<>();
        if (first == null) {
            node.setNext(null);
            node.setItem(item);
            node.setPrev(null);
            first = node; // Первое добавленное пусто, поэтому first = node

        } else {// Добавляем новый узел непосредственно за последним узлом
            node.setPrev(last);
            node.setNext(null);
            node.setItem(item);
            last.setNext(node);
        }
        last = node;
        size++;

    }

    public int size() {
        return size;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Object get(int index) {
        rangeCheck(index);

        Node temp = node(index);
        if (temp != null) {
            return temp.item;
        }
        return null;


    }

    public Node node(int index) {
        Node temp = null;
        if (first != null) {
            if (index < (size >> 1)) {
                temp = first;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
            } else {
                temp = last;
                for (int i = size - 1; i > index; i--) {
                    temp = temp.prev;
                }
            }
        }
        return temp;
    }

    public void remove(int index) {
        Node temp = node(index);
        if (temp != null) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }
    }
}



