package Latihan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xaddam
 */
public class aeroplane extends vehicle {
    public void walk(){
        System.out.println("aeroplane is flying");
    }
    public static void main(String []args){
    aeroplane garuda = new aeroplane();
    garuda.function();
    garuda.fuel();
    garuda.walk();
    }
}
