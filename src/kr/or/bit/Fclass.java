package kr.or.bit;
/*
 * 클래스 구성 요소(필드 + 함수)
 * 
 * - 기능(행위) 만드는 방법
 *   ㄴ 함수(function, method)
 *   ㄴ method : 행위 또는 기능을 정의(최소 단위) : 하나의 함수는 하나의 기능만 구현한다.
 *   ㄴ 예) 먹는다, 잔다, 걷는다  -> 하나의 기능만 구현
 *   ㄴ     먹으면서 잔다  -> x
 *   ㄴ **함수는 호출에 의해서만 실행이 가능하다. (누군가 함수의 이름을 불러야만 가능)
 *   
 *   
 *   java에서 함수를 만드는 문법
 *   1. void, parameter(o)        >> void print(String str) { 실행코드}
 *              ㄴ 중간에서 전달 해주는 역할    
 *      ㄴ 나는 너에게 돌려줄 것이 없어..
 *      
 *   2. void, parameter(x)         >> void print() {실행코드}
 *      ㄴ 예) 동전을 넣지 않아도 게임이 돌아간다.
 *      
 *   3. return type, parameter(o)  >>  int print(int data){return data + 10;} 
 *                                      ㄴ 정수값을 돌려주겠다.
 *                                      
 *   4. return type, parameter(x)  >> int print() {return 100;}
 *   
 *   void : 돌려주는 것이 없다. -> return value가 없다.
 *   return type : 8가지 기본 타입을 다 쓸수 있다, Array, class, ... Collection, Interface
 *   parameter type : 8가지 기본 타입을 다 쓸수 있다, Array, class, ... Collection, Interface
 *                    ㄴ byte, int, short, long, boolean, float, double , char
 *   parameter 개수는 제한이 없다.
 *   void print(int a, int b, int c, int d){}      
 *     ㄴ 실행(x) ->  print(10,20,30) ->  정수값이 다름(parameter 정수값 만큼 넣어야함)
 *     ㄴ 실행(o)  -> print(10,20,30,40)          
 *     
 *   예)
 *   boolean print(boolean b) {return b};     -> return은 true 아니면 false
 *   print(flase);
 *   
 *  - 관용적 표현(선배들이 그렇게 써보니 괜찮았던것)
 *     ㄴ 함수의 이름
 *     ㄴ void a(){}.. (x)
 *     ㄴ 의미있는 단어의 조합으로 써야한다  -> getChnnelNumber()
 *                                  -> getEmpListByEmpno()
 *   
 *   
 *                                      
 */
public class Fclass<Tv> {
	public int data;
	
	// void m() -> return 타입이 없고 parameter가 없다. 
	// 접근자 생략 -> default void m()
	
	// 4가지 기본 유형
	public void m() {
		System.out.println("일반함수 : void , parameter(x)");
	}
	
	public void m2(int i) {   // i라는 함수는 m2함수가 만들어지면 소환 없어지면 소멸
		System.out.println("일반함수 : void, parameter(o)");
		System.out.println("parameter value : " + i);
	}
	public int m3() {
		return 100;  // return type 존재하면 반드시 return 키워드를 사용...
		
	}
	public int m4(int data) {
		return 100+data;
	}
	
	
    
    // 확장
    public int sum(int i, int j, int k) {
        return i + j + k;
    }
    
    //함수(접근자: public 거의  ...)
    //함수 접근자 private
    // 만든 설계자의 의도는: 
    private int subSum(int i) {
        return i + 100;
    }
    
    
    public void callSubSum() {
        int result = subSum(100); // 내부에서 호출
        System.out.println("call result : "+ result);
    }
    
    private int operationMethod(int data) {
        return data * 200;
    }
    
    public boolean opSum(int data) {
        // 연산은 다른 함수에게 위임
        // 본인은 논리 판단
        boolean bo;
        int result = operationMethod(data);
        if(result > 0   ) {
            bo = true  ;                  
        }else {
            bo = false;
        }
        return bo;
    }
    
    /*
     * Quiz
     * a 외 b 둘 중에 큰값을 return하는 함수를 만드시오
     * ex) max(300,100)return 값은 300
     * public int max(int a, int b){}
     */
 
    public int max(int a, int b) {
    	return (a>b) ? a:b;
    	
//    	public int max(int a, int b) {
//    		if(a>b) {
//    			return a;
//    		}else {
//    			return b;
//    		}
    	}
        // 함수의 return type or parameter  -> Array, class(사용자 정의 타입)
    
//        public Tv tCall() {  // Tv 타입을 갖는 [주소값 : 같은 타입을 갖는 주소]을 리턴
        	
        	// return null;   -> 난 Tv 타입의 객체가 없어(정상적인것)
        	
//        	Tv t = new Tv();  // t 라는 변수는 Tv타입 객체가 주소를 가지고 있다
//        	t.brandname = "LG";
//        	System.out.println("t : "+ t);
//        	return t;
        	// 위 코드는 객체에 어떤 값들을 세팅해서 보낼때
        	
        	//return new Tv(); //  Tv라는 객체의 주소값을 바로 리턴
        	// 어떠한 초기화도  없이 주소만 던지는 경우
    
    public void tCall2(Tv t) {   // Tv 타입을 갖는 주소값을 parameter
    	System.out.println("t주소값 : "+t);
    }
        }
    

