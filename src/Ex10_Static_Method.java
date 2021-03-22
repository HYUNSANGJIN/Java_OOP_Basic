
public class Ex10_Static_Method {
    int number;  // new해야 memory에 올라감
    
    public void print() {
        System.out.println("나는 일반 함수 number : " + number);
    }
    
    public static void method() {
        System.out.println("나는 static 함수 " );
    }

    public static void main(String[] args) {
        // Ex10_Static_Method.method();
        method();
        
        Ex10_Static_Method ex10 = new Ex10_Static_Method();
        ex10.print();
       // ex10.method();

    }

}
