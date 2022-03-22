package de.milli.plugin.program;

public class Boot {

    public static void main(String[] args) {
       /*
       System.out.println("ich bin so gut in Programmieren");

        hello("Kaan", 14);
        hello("Sergeij", 27);
        hello("fyler", 22);
        hello(true);
        test();
        System.out.println(compareNumbers(2, 1));

        */
        try {
            String test = "31wr2";
            int number = Integer.parseInt(test);
            System.out.println(number);
        }catch (NumberFormatException exception){
            System.out.println("Test");
        }
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

    public static int add(int a, int b) {
        int c = a + b;

        return c;
    }

    public static void hello(boolean greet) {
        if (greet == true) {
            System.out.println("Mein Wunsch ist dein Befehl.");
        } else {
            System.out.println("Du wehrst dich ja.");
        }

    }

    public static String compareNumbers(int a, int b) {
        if (a < b)
            return a + " ist gleich kleiner als " + b + ".";
        else if (a > b)
            return a + " ist gleich größer als " + b + ".";
        else
            return a + " ist gleich groß wie " + b + ".";
    }

    public static void test() {
        int switchtest2 = 10;
        switch (switchtest2) {
            case 1:
                System.out.println("Der wert enpricht 1");
                break;
            case 2:
                System.out.println("Der wert enpricht 2");
                break;
            case 10:
                System.out.println("Der wert entpricht 90");
                break;
            default:
                System.out.println("Der wert enpricht eine andere Zahl...");
        }

    }
}

