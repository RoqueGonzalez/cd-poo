package com.campusdual.exercisespoo.exercise11;

public class Sandbox {
    public static void main(String[] args) {

        IMachine p1 = new Plane("Boing");
        IMachine t1 = new Tractor(800);

        p1.start();
        p1.stop();
        p1.maintenance();
//        p1.takeOff();
//        p1.fly();
//        p1.land();
//
//        t1.start();
//        t1.stop();
//        t1.maintenance();
//        t1.forward();
//        t1.backward();
//
//        System.out.println(p1.getDetails());
//        System.out.println(t1.getDetails());

        ((Plane)p1).fly();
    }

}
