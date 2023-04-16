class Rectangle{
    int l;
    int b;

Rectangle(int l, int b){
    this.l = l;
    this.b = b;
}
    int findArea(){
        return l*b;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        System.out.println("Area is :" + r1.findArea() );
        
    }
}


