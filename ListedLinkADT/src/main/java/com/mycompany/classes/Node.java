/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

/**
 *
 * @author vasqu
 */
public class Node {
    //atributos
    private int value;
    private Node next;
    //contructor
    public Node(int value){
        
        this.value=value;
        
    }
//getter and setter
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    
}
