public class Main {
    public static void main(String[] args) {
        //count from 0, by 1
        Counter counter = new Counter();
        System.out.println(counter);
        for (int i = 0; i < 5; i++) {
            counter.increase();
            System.out.println(counter);
        }
        System.out.println("--------------------");
        for (int i = 5; i > 0; i--) {
            counter.decrease();
            System.out.println(counter);
        }
        System.out.println("--------------------");

        //count from 0 by amounts
        counter.increase(10);
        System.out.println(counter);
        counter.decrease(4);
        System.out.println(counter);
        System.out.println("--------------------");

        //repeat but with a starting value
        Counter counter2 = new Counter(10);
        System.out.println(counter2);
        for (int i = 0; i < 5; i++) {
            counter2.increase();
            System.out.println(counter2);
        }
        System.out.println("--------------------");

        for (int i = 5; i > 0; i--) {
            counter2.decrease();
            System.out.println(counter2);
        }
        System.out.println("--------------------");

        //count from 0 by amounts
        counter2.increase(10);
        System.out.println(counter2);
        counter2.decrease(4);
        System.out.println(counter2);

    }
}
