class Student{
    String name;
    String age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(String name, int age){
        System.out.println(name +" "+ age);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "asha";
        s1.printInfo(s1.name);
    }
}
