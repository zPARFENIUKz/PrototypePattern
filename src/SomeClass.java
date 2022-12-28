public class SomeClass implements Cloneable{
    String firstParameter;
    int someValue;

    public SomeClass(String firstParameter, int someValue) {
        this.firstParameter = firstParameter;
        this.someValue = someValue;
    }

    public String getFirstParameter() {
        return firstParameter;
    }

    public int getSomeValue() {
        return someValue;
    }

    public SomeClass clone() {
        return new SomeClass(firstParameter, someValue);
    }
}
