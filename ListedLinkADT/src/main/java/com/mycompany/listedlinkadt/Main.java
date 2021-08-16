package com.mycompany.listedlinkadt;



import com.mycompany.classes.SimpleLinkedList;
import com.mycompany.classes.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author vasqu
 */
public class Main {
    public static void main(String[] args) {
        //crear una nueva lista
        SimpleLinkedList list =new SimpleLinkedList();
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(5);
        list.print();
    }
    
}
