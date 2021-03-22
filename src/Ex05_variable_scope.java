/*
 * class 내부에 위치하면 -> instance variable (member field) -> default값이 있다.
 * 
 * method 내부에 위치하면 -> local variable -> 반드시 초기화를 사용 -> default값이 있다.
 * 
 * ex) main(String[] args) -> 함수 -> main함수 안에 모든 변수는 사용시 초기화를 반드시 해야한다.
 * 
 * static variable(객체간 공유자원 ) -> 객체 생성 이전에 memory에 올라가는 자원 
 * 
 * (class area 또는 method area)
 * 
 * 
 * java Ex05_variable_scope.java  -> 컴파일
 * java Ex05_variable_scope  -> 실행
 * 
 * Ex05_variable_scope 정보는 -> method(class) area에 올라간다.
 * ㄴ 그때 클래스에서 static 자원이 있다면 그 자원을 바로 memory에 올린다.
 */

class Variable{
    int iv; // member field, instance variable 이라고 불린다.
    
    void method() {
        //int lv = 0; // local variable(지역변수) -> 반드시 초기화
        iv = 100;
        // for(int i=0... -> i 라는 변수는 block variable -> 범위는 for문 안쪽해서만 유효
    }
    void method2() {
        System.out.println(iv);  // 메소드를 먼저 호출하면 100이 찍힌다
    }
    
    static int cv;  // ****중요*****
    // ㄴ 객체 생성 이전에 메모리에 올라가는 작업***
    // ㄴ class variable(클래스 변수), static variable(객체간 공유자원)이라고 불림
    // ㄴ 목적 : 정보를 담는 것(생성되는 모든 객체가 공유하는 자원)
    // ㄴ heap 영역에 생성된 [객체]들의 공유자원이다.
    // ㄴ 특징 : 접근방법
    //   ㄴ class이름.static 변수명 -> Variable.cv 
    //                                 ㄴ 객체가 생성되기 전에 접근 가능하여야 한다.
    //   ㄴ Variable v = new Variable(); -> v.cv
    //   ㄴ Variable v2 = new Variable(); -> v2.cv
    //   ㄴ v.cv == v2.cv랑 같은 주소의 메모리이다.
    // ㄴ 생성시점 : Hello.java > java Hello.java > Hello.class
    //  > java.exe Hello 엔터 실행...
    //  > class loader System에 의해서
    //  클래스를 정보(metadata : 설명)class area(method area)올려요
    //  --이 클래스 언제 만들었고 어떤 자원을 import 하고 있고 변수 몇개...기술...
    //  --이 클래스 안에 static variable 또는 static method 있으면
    //  --이 녀석을 memory(class area)에 올려 놓는다
    
    
    // 클래스가 로딩될 떄 생성되고 프로그램이 종료될 때 소멸된다.
}


public class Ex05_variable_scope {
    
    public static void main(String[] args) {
       //System.out.println(Variable.cv);
        Variable v = new Variable();
        Variable v2 = new Variable();
        System.out.println(v.cv);
        System.out.println(v2.cv);  // 같은 자원을 바라봄 (객체간 공유자원)
        
        Variable.cv = 200;
        
        System.out.println(v.cv);  // 같은 자원을 바라봄 (객체간 공유자원)
        System.out.println(v2.cv);
       
    }

}
