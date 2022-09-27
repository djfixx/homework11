import java.lang.reflect.Constructor;

public class Test {

    private Test tester;

    public void errNull() {
        try {
            tester.errNull();
        } catch (NullPointerException e) {
            System.err.println(e);
        }

    }

    public void errIndexOfBounds() {
        try {
            int[] arr = new int[]{1, 2, 3};
            arr[5] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
    }

    public void errClassCast() {
        try {
            Object o = "Object";
            System.out.println((Integer) o);
        } catch (ClassCastException e){
            System.err.println(e);
        }
    }

    public String restoreClassMetainf(Class clazz){
        var restore = new StringBuilder();
        restore.append("Class Name:").append(clazz.getClass());
        restore.append("Fields:").append(clazz.getDeclaredFields());
        restore.append("Constructors: ").append(clazz.getDeclaredConstructors());
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor connstructor: constructors){

        }
        restore.append("Methods: ").append(clazz.getDeclaredMethods());
        return restore.toString();
    }
}