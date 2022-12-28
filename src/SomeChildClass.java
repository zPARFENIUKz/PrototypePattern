public class SomeChildClass extends SomeClass {

    private int newValue;

    public SomeChildClass(String firstParameter, int someValue, int newValue) {
        super(firstParameter, someValue);
        this.newValue = newValue;
    }

    public SomeChildClass(SomeChildClass target) {
        super(target.firstParameter, target.someValue);
        newValue = target.newValue;
    }

    public int getNewValue() {
        return newValue;
    }

    @Override
    public SomeChildClass clone() {
        return new SomeChildClass(this);
    }

}
