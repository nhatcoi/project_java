package com.mycompany.app.week2.Ex.CleanUp;

public class Ex10 {
    public Ex10() {
        System.out.println("Creating an object");
    }

    // Finalize method
    protected void finalize() {
        System.out.println("Finalizing an object");
    }

}