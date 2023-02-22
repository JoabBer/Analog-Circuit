/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Jberhane
 */
public class Resistor {
   
    
    private static int resNext = 1;
    private int resistorID;
    private double resistance;
    private Node[] n = new Node[2];
    private int count;
    
    
    /**
     * Returns a new Resistor that is
     * created in the respective instance
     *
     * @param resistance, node1, node2
     */
    public Resistor(double resistance, Node node1, Node node2){
        if (resistance < 0 || node1.getNodeID() == node2.getNodeID()){
            throw new IllegalArgumentException("Resistance Cannot Be Negative / Resistor can not be in between the same nodes");
        }
        this.resistance = resistance;
        this.n[0] = node1;
        this.n[1] = node2;
        this.resistorID = resNext;
        resNext++;
        Circuit.getInstance().add(this);
       
    }
    
    public Node[] getNodes(){
       return this.n; 
        }
    
      public double getResistance() {
       return (this.resistance);
    }

         /**
     * Returns the circuit component message
     * @return the message displaying Resistor Component of Circuit.
     */
    @Override
    public String toString(){
        return "R" + resistorID + " " + this.n[0].getNodeID() + " " + this.n[1].getNodeID()+ " " + getResistance() ;
    }
}
