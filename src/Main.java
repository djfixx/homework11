public class Main {
    public static void main(String[] args) {

        var a = new Pair<String, Integer>("abc", 13);
        var b = new Pair<Boolean, Character>(true, 'c');

        Test test = new Test();

        test.errNull();
        test.errIndexOfBounds();
        test.errClassCast();

        Human johnDoe = new Human("John_Doe", 35, true);

        Class someClass = new Class;
        test.restoreClassMetainf();
    }
}