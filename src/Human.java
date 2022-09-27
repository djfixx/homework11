public class Human {
    private String name;
    private int age;
    private boolean isMale;

    public Human(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void printInfo(){
        System.out.println(name + " " + age + " " + isMale);
    }
}
