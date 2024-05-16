package SimpleLinkedList;

import java.util.*;

class SimpleLinkedList<T> {

    private Node<T> head;
    private int size;
    
    SimpleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    SimpleLinkedList(T[] values) {
        for (T value : values) push(value);
    }

    void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() {
        if (head == null) throw new NoSuchElementException();
        T value = head.value;
        head = head.next;
        size--;
        return value;
    }

    void reverse() {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    T[] asArray(Class<T> clazz) {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
        Node<T> current = head;
        int index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    int size() {
        return size;
    }
    
    private static class Node<T> {
        T value;
        Node<T> next;
    
        Node (T value) {
            this.value = value;
            this.next = null;
        }
    }
}