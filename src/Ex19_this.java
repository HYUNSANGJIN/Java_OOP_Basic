/*
 * this
 *  ㄴ 객체 자신을 가르치는 this(앞으로 생성될 객체의주소를 담을 곳이라고 가정)
 *  ㄴ this 객체 자신(생성자를 호출 할 수 있음) -> 원칙 : 생성자는 객체를 만들떄 [한번만] 호출가능
 *                                         ㄴ this를 사용하면 [여러개] 생성자 호출 가능
 *                                         
 */
class Test5{
    int i;
    int j;
    
    Test5(){
        
    }
//    Test5(int i, int j){
//        i = i;
//        j = j;
//    }
    
    
//    Test5(int k, int z){
//        // 개발자는 예측 가능한것을 좋아함(pararmeter 까지도 의미를 부여)
//        i = k;
//        j = z;
//    }
    
    Test5(int i, int j){
        this.i = i;
        this.j = j;
    }
}
  // this 는 클래스 book2를 가르키고 뒤에 bookname은 파라메타

class Book2{
    String bookname;
    
    Book2(String bookname){
        this.bookname = bookname;
    }
}

//Today Point
class Socar{
    String color;
    String geartype;
    int door;
    
    public Socar() {
        this.color = "red";
        this.geartype = "auto";
        this.door = 2;
    }
    public Socar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;
    }
    
    void print() {
        System.out.println(this.color);
        System.out.println(this.geartype);
        System.out.println(this.door);
    }
}
public class Ex19_this {

    public static void main(String[] args) {
        Test5 test5 = new Test5(10,10);
        System.out.println(test5.i);
        System.out.println(test5.j);
        
        
        Socar socar = new Socar("red", "auto", 6);
        socar.print();
        
        
        

    }

}
