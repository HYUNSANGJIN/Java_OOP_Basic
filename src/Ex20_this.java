/*
 * 원칙 : 생성자는 객체 생성시 1개만 호출 가능 (Car c = new Car() or Car c = new Car(100))
 * 예외적을
 * ㄴ this 활용하면 여러개의 생성자를 호출할 수 있다.
 */

// 아래코드는 중복이 보인다.
// 값을 할당하는 부분 중복적으로.. 할당하는 부분 1개로 표현
//class Zcar{
//    String color;
//    String geartype;
//    int door;
//    
//    Zcar(){
//        this.color = "red";
//        this.geartype = "auto";
//        this.door = 2;
//    }
//    
//    Zcar(String color, String geartype, int door){
//        this.color = color;
//        this.geartype = geartype;
//        this.door = door;
//    }
//    void print() {
//        System.out.println(this.door + "/" + this.color + "/" + this.geartype);
//    }
//}

class Zcar{
    String color;
    String geartype;
    int door;
    
    Zcar(){
        // 생성자를 호출하는 this...
        this("red", "auto", 2);  // 다시 나를 호출하는 것
        // new Zcar("red", "auto",2)
        System.out.println("default constructor");
    }
    
    Zcar(String color, String geartype, int door){
        this.color = color;
        this.geartype = geartype;
        this.door = door;
        System.out.println("overloading constructor");
    }
    void print() {
        System.out.println(this.door + "/" + this.color + "/" + this.geartype);
    }
}

 class Zcar2 {
    String color;
    String geartype;
    int door;
    
    Zcar2(){
        this("red",1);
        System.out.println("default constructor");
    }
    Zcar2(String color, int door){
        this(color, door, "auto");
        System.out.println("oveerloading constructor parameter 2개");
    }
    Zcar2(String color, int door, String geartype){
        this.color = color;
        this.door = door;
        this.geartype = geartype;
        System.out.println("oveerloading constructor parameter 3개");
    }
    void print() {
        System.out.println(this.door + "/" + this.color + "/" + this.geartype);
    }
}

public class Ex20_this {

    public static void main(String[] args) {
        //Zcar zcar = new Zcar();
       // zcar.print();
        
        //Zcar zcar = new Zcar("pink", "auto", 2);
        
        //Zcar2 zcar = new Zcar2();
        //zcar.print();
        
        //Zcar2 zcar2 = new Zcar2("gold", 2);
        //zcar2.print();
        
        Zcar2 zcar3 = new Zcar2("red", 10, "auto");
        zcar3.print();

    }

}
