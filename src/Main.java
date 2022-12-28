public class Main {
    public static void main(String[] args) {
        SomeChildClass obj = new SomeChildClass("start value", 1, 2);
        System.out.println(obj.getFirstParameter());
        System.out.println(obj.getSomeValue());
        System.out.println(obj.getNewValue());
        SomeChildClass clone = obj.clone();
        System.out.println(clone.getFirstParameter());
        System.out.println(clone.getSomeValue());
        System.out.println(clone.getNewValue());
    }
}
