/*
 * 1. static member field -> 객체간 공유자원
 * 
 * 2. static method -> 자주 쓰이니까 -> 편하게 사용하게 -> 객체를 생성 없이도 생성 -> static
 *    ㄴ why??? : Math.random(); -> Math m = new Math(); , m.random()이렇게 하지 않았을까?
 */
// import java.lang.*; -> default로 생략(static과 상관x)

class StaticClass{
    int iv;
    
    static int cv;    // static 변수
    
    void m() {
        // 일반함수에서 
        // cv값(static 변수)을 가지고 놀수 있다!
        // 순서가 들어가야한다.
        // static 자원은 일반자원보다 항상 memory에 먼저 올라간다.
        cv = 1000;
        //StaticClass.cv = 1000; -> 잘 안씀        
    }
    
    static void sm() {
        // static 함수에서 
        // 일반자원인 위에있는 iv를 가지고 놀수 없다
        // iv = 100; -> 에러남 -> 생성시점에 대한 문제때문에 ...
        // error가 없게 하려면(static 은 static끼리 놀아야한다.)
        cv = 2222;
    }
}
public class Ex09_Static_Method {

    public static void main(String[] args) {
        
        System.out.println(StaticClass.cv);  // default값이라서 0이나옴
        StaticClass.sm();
        System.out.println(StaticClass.cv);  // 함수발동 후 결과 값 2222
        
        
      // 일반자원은 객체를 생성해야한다.
        StaticClass sc = new StaticClass();
        sc.m();
        sc.sm();
        System.out.println(sc.iv);
        System.out.println(sc.cv);

    }

}
