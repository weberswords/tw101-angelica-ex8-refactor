package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name) {
        this.name = name;
        leftChild = null;
        rightChild = null;
    }

    public void add(String nameOfNewNode) {
        // if name of new node is lexicographically greater than this node's name
        // or is the same string
        if (this.name.compareToIgnoreCase(nameOfNewNode) >= 0) {
            // if new node must be leaf node
            if (leftChild == null) {
                leftChild = new Node(nameOfNewNode);
            } else { // else recurse
                leftChild.add(nameOfNewNode);
            }
        } else { // if name of new node is lexicographically less than this node's name
            // if new node must be leaf node
            if (rightChild == null) {
                rightChild = new Node(nameOfNewNode);
            } else { // else recurse
                rightChild.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> names;
        if (leftChild != null) {
            names = leftChild.names();
        } else {
            names = new ArrayList<String>();
        }
        names.add(this.name);
        if (rightChild != null) {
            names.addAll(rightChild.names());
        }
        return names;
    }

    public String getName() { return name; }

    public Node getLeftChild() { return leftChild; }

    public Node getRightChild() { return rightChild; }


}
