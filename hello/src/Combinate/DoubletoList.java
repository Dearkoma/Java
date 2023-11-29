package Combinate;

import java.util.LinkedList;

public class DoubletoList {
    public static void main(String[] args) {
        Node jack = new Node("Jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");
        jack.next = tom;
        tom.next = hsp;
        hsp.pre = tom;
        tom.pre = jack;
        Node head = new Node("head");
        Node first = jack;
        Node last = hsp;
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println();
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        Node smith = new Node("smith");
        smith.next = hsp;
        smith.pre = tom;
        tom.next = smith;
        hsp.pre = smith;
        first = jack;
        System.out.println();
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

class Node {
    public Object data;
    public Node next;
    Node pre;
    
    public Node(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }

    
}
