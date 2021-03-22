/*
 * OOP(객체 지향 프로그래밍) -> 설계도 만들기
 * 1. 상속(재사용성)
 * 2. 캡슐화(은닉화) : private(직접할당, 간접할당) -> getter, setter
 * 3. 다형성 : 하나의 타입으로 여러개의 객체 주소를 가지는 것
 * 
 * -> ***method overloading -> parameter타입과 갯수를 같게 하면 된다 -> 앞쪽은 오버로딩 판단기준x 변수명은 의미 없고  !!!!꼭 타입만 봐라!!!
 * -> 하나의 이름으로 여러가지 기능을 하는 함수
 * System.out.println(); -> 대표적인 overloading -> println() 이름은1개인데 기능은 여러개이다.
 * 1. 성능향상(x)
 * 2. 설계자가 개발자의 편리성을 위해 제공(편하게 쓰기위해)
 * 
 * 문법) 함수의 이름은 같고 parameter[개수] 와 [타입]을 다르게 만들면...
 * 1. 함수의 이름은 같아야 한다
 * 2. parameter의 개수 또는 타입은 달라야한다.
 * 3. return 타입은 overloading의 판단기준이 아니다
 * 4. parameter의 순서가 다름을 인정한다(주의)
 * 
 * 
 * class out{
 *    public void println(){}
 *    public void println(int i){}  
 *    public void println(String s){}
 *    
 *    public void println(){}
 *    public void printlnint(int i){}          // 잘 안씀
 *    public void printlnString(String s){}
 * }
 * 
 */

class Human2{
    String name;
    int age;
}

class OverTest{
    int add(int i) {
        return 100 + i;
    }
    
    // overloading
    int add(int i, int j) { // -> overloading (o)
        return i+j;
    }
    
//    String add(int j) {    -> 오버로딩이 아님 ,충돌난다.(x)
//        return"";
//    }
    
    String add(String s) {       // 개수는 똑같지만 타입이 달라서 오버로딩(o)
        return"hello" + s;
    }
    
    String add(String s, int i) {  // add 라는 함수의 parameter가 String s, int i 뿐이다. 오버로딩(o)
        return null;
    }
    
    String add(int i , String s) {  // 순서가 다름을 인정한다. 오버로딩(o)
        return null;
    }
    
    void add(Human2 human) {  // human과 같은 타입이 없으므로 오버로딩(o)
        human.name = "현상진";
        human.age = 26;
        System.out.println(human.name + " , "+ human.age);
        
    }
    
}



public class Ex14_Method_Overlodading {
    
    public static void main(String[] args) {
        
        OverTest ot = new OverTest();
        ot.add(100);
        ot.add(100,200);
        
        ot.add(new Human2());  // 주소값을 받아서 접근뒤 '현상진'과 '26'을 넣고 print
        
        String result = ot.add("안뇽안뇽");
        System.out.println(result);
        
        
    }

}
