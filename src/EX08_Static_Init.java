/*
 * static 변수 -> 모든 객체가 [같은 값]을 가지게 할거라는 뜻!
 * instance 변수 -> 모든 객체가 [다른 값]을 가지게 할거야!!
 * 
 */

class InitTest{  
    static int cv = 10;
    static int cv2;
    int iv = 11;
    
    static { // static 초기자 블럭(static 초기자 설정 블럭)
        //static초기자는 static member field에 초기값을 주는 목적으로 한다
        cv = 10;  // member field에서 초기화 하나, 여기서 초기화하나 같은 값이지만, 변형된 값을 못쓴다
        cv2 = cv + 222; // ㄴ변형된(조작된 값) 값을 제공
        
    }
    
    {  // <- instance variable 초기화 블럭 , 조건이 있을때 필요
        //        ㄴ  new를 통해서 객체가 생성되고 memory에 int iv 변수가 메모리에 올라가고 나서 바로 호출 -> 초기자 함수{}
         System.out.println("초기화 블럭");
         if(iv > 10) iv = 100;  // 단일 if문 -> 조건이 없는 if문
    } // <- instance variable 초기화 블럭
      //  ㄴ  new가 있어야 실행 가능
    
}


public class EX08_Static_Init {

    public static void main(String[] args) {
        System.out.println(InitTest.cv);
        System.out.println(InitTest.cv2);
        
        // 일반자원
        InitTest inittest = new InitTest();
        System.out.println(inittest.iv);

    }

}
