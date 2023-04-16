class Student{
    int a;
    int b;

    int sum(int a,int b){
        
        int result = a+b;
        System.out.println(result);
        return result;
    }

    Student(){
        System.out.println("this is a student");
    }
    public static void main(String[] args) {
        Student h1 = new Student();
        h1.sum(5,3);
        
    }
}

