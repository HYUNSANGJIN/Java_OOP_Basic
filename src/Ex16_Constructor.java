/*
 * 생성자 함수(constructor)
 *  ㄴ 함수(특수한 목적을 갖는)
 *             ㄴ member field 초기화가 목적
 *             
 *  ㄴ 일반함수 다른점(public void m(), public String m(String s)..)
 *      ㄴ 함수의 이름이 고정(class이름과 동일)
 *      ㄴ 실행시점 : 객체 생성(new) -> heap공간이 할당되고 -> 변수(member field)
 *        -> 생성자 함수가 자동 호출
 *      ㄴ 실행시점 : return type(x) -> 생성자 함수는 무조건 (void) -> public (void) 클래스 이름
 *                  -> public 클래스이름         
 *                  
 *  ㄴ 목적 :  생성되는 객체마다 [강제적으로] member field값을 초기화 할 수 있다.
 *  
 *  ㄴ 생성자 함수(method overloading) 
 *  
 *  ㄴ 당신이 만약 overloading 생성자 함수를 하나라도 구현했다면
 *  --default 생성자 함수는 반드시 구현을 통해서만 사용가능
 * 
 *  class Car{
 *  String color;
 *    }
 * --자동차를 만들면 무조건 색상 하나를 가져야 한다.
 * Car car = new Car();
 * --자동차는 각각 다른 색상을 가질 수 있다
 * class Car{
 * public Car(String color){
 * 
 * }
 * }
 * Car car = new Car("red");
 * 
 *   
 * 
 *  Tip) {초기자 함수}, static{초기자 함수}
 *  
 * 
 */

// 당신이 만약 자동차를 만든다면 반드시 자동차의 이름을 부여하세요.
class Car{
    String carname = "포니";
    // 보이지 않지만 default로 생성자 함수가 생략되어있다.
    //            ㄴ 컴파일러가 알아서 생성함
    //              ㄴ public Car() {}
    public Car() {
        System.out.println("나 생성자야");  // 강제구현!!!
    }
    
}
// 이쁜코드
class Car2{
    String carname;
    public Car2() {  // degault constructor
        carname = "포니";  // 초기화
    }
}

class Car3{
    String carname;
    public Car3() {
        carname = "포니";
        
    }
    public Car3(String name) {
        carname = name;
    }
}

class Car4{
    String carname;
    // default를 구현하지 않음
    //[예외으로 overloading] 생성자를 구현했다면 default는 자동으로 생성되지 않음.
    //  ㄴdefault를 구현하지 않은 설계자의의도  : 강제적 구현
    public Car4(String name) {
        carname = name;
    }
}

public class Ex16_Constructor {

    public static void main(String[] args) {
        Car car = new Car(); // () 는 생성자를 호출하는 괄호!!!
        
        Car3 car3 = new Car3(); // default constructor 자동호출
        System.out.println(car3.carname);
        
        Car3 car4 = new Car3("지네시스");  // overlodaing constructor
        System.out.println(car4.carname);
        
        Car4 car5 = new Car4("포드");
        System.out.println(car5.carname);
        
        Car4 car6 = new Car4("벤트");
        System.out.println(car6.carname);

    }

}
