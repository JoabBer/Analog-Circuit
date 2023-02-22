/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Jberhane
 */

/**
     * Returns a Node's Identification Number 

     */
public class Node {    
   private int nodeID;
   
    public Node (int num){
        this.nodeID = num;
    }
     public int getNodeID(){
         return this.nodeID;
     }
    
     /**
     * Returns the node identification 
     * @return the node ID.
     */
    @Override
    public String toString(){
        return "" + getNodeID();
    }        
}