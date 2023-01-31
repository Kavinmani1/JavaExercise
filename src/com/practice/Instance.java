package com.practice;

public class Instance {
    /*package whatever //do not write package name here */

        public String geek; // Declared Instance Variable

        public Instance ()
        { // Default Constructor

            this.geek = "Shubham Jain"; // initializing Instance Variable
        }
        //Main Method
        public static void main(String[] args)
        {

            // Object Creation
            Instance  name = new Instance ();
            // Displaying O/P
            System.out.println("Geek name is: " + name.geek);
        }
    }


