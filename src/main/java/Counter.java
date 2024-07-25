public class Counter {
    private int startValue;
    //constructor set start value to startValue
    public Counter (int startValue) {
        this.startValue = startValue;

    }
    //constructor set start value to 0
    public Counter () {
        this.startValue = 0;
    }

    //a method called "value" that returns the current value of the counter as an int.
    public int value() {
        return startValue;
    }
    //a method called 'increase' that increases the value by 1 and does not return anything.
    public void increase() {
        startValue++;
    }
    //a method called 'decrease' that decreases the value by 1 and does not return anything.
    public void decrease() {
        startValue--;
    }
    //overloading methods
    public void increase(int amount) {
        startValue += amount;
    }
    public void decrease(int amount) {
        startValue -= amount;
    }
    @Override
    public String toString() {
        return "Counter value:" + startValue;
    }
}
