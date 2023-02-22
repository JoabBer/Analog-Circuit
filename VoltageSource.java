/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Jberhane
 */


public class VoltageSource {
 
    private static int voltNext =1;
    private int voltageID;
    private double voltage;
    private Node[] n = new Node[2];
    private int count;
    
    /**
     * Returns a new Voltage Source that is
     * created in the respective instance
     *
     * @param voltage, node1, node2
     */
    public VoltageSource(double voltage, Node node1, Node node2){
       if (node1.getNodeID() == node2.getNodeID()){
            throw new IllegalArgumentException("Voltage source can not be in between identical nodes");
        }
        this.voltage = voltage;
        this.n[0] = node1;
        this.n[1] = node2;
        this.voltageID = voltNext;
        voltNext++;
        Circuit.getInstance().add(this);
        
    }

    
    public Node[] getNodes(){
       return this.n; 
    }
    
    public double getVoltageSource(){
        return (this.voltage);
    }
    
      /**
     * Returns the circuit component message
     * @return the message displaying Voltage Component of Circuit.
     */
    @Override
    public String toString(){
        return "V" + voltageID + " " + this.n[0].getNodeID() + " " + this.n[1].getNodeID()+ " DC " + getVoltageSource();
    }
    
}
