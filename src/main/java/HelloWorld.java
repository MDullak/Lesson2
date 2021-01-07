public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(greetPerson("Mariusz"));
        System.out.println(greetPerson("Kasia"));

        for (int i = 0; i < 10; i++) {
            System.out.println(i++);
        }


    }

    public static String greetPerson(String name) {
        return "Hello " + name + " !";
    }

    public static long addTwoNumbers(long first, long second) {
        return first + second;
    }

    public static int divideNumers(int first, int second) {
        if (second == 0) {
            return -1;
        } else {
            return first / second;
        }
    }


}
