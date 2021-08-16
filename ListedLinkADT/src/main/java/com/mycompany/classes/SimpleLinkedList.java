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
public class SimpleLinkedList implements IList {
    //atributes
    private Node first;
    
    //getter and setter
    public Node getFirst() {
        return first;
    }
    public void setFirst(Node first) {
        this.first = first;
    }

    public void print(){
    
        Node current=getFirst();
        while(current!=null){
            
            System.out.println("el valor es:"+current.getValue());
            current=current.getNext();
            
        }
    }
    //functions
    @Override
    public void add(int value) {
        
        Node newNode = new Node(value);
        if (first==null){
            
           this.first= newNode;
        }else{
            
            Node current=getFirst();
            while(current.getNext()!=null){
            
                current=current.getNext();
            }
            current.setNext(newNode);
        }
    }
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Object find(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
