package de.milli.plugin.program;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Boot {

    public static void main(String[]args) {
        System.out.println("ich bin so gut in Programmieren");
        hello("Kaan", 14);
        hello("Sergeij", 27);
        hello("fyler", 22);
        hello(true);
        System.out.println(compareNumbers(2, 1));
    }
        public static void hello(String name, int age) {
            System.out.println("Guten Tag mein name ist " + name + " und ich bin " + age + " Jahre alt.");
            System.out.println(hello());
            System.out.println(add(5, 10));
        }
        public static String hello() {
            String hello = "Guten morgen";
            return hello;
        }
        public static int add(int a, int b){
            int c = a + b;

            return c;
        }
        public static void hello(boolean greet){
            if(greet == true){
                System.out.println("Mein Wunsch ist dein Befehl.");
            }else {
                System.out.println("Du wehrst dich ja.");
            }

        }
        public static String compareNumbers(int a, int b) {
            if(a < b)
                return a + " ist gleich kleiner als " + b + ".";
            else if (a > b)
                return a + " ist gleich größer als " + b + ".";
            else
                return a + " ist gleich groß wie " + b  + ".";

        }

    }

