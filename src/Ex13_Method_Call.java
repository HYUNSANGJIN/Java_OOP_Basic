/*
 * 함수의 parameter로 값을 전달할수도 있고 , 주소값을 전달할수도 있다.
 * ㄴ 값 전달
 * 
 * ㄴ 주소값 전달
 */
class Data{
    int i;
}

public class Ex13_Method_Call {

    public static void main(String[] args) {
        
        Data d = new Data();
        d.i = 100;
        System.out.println("d.i : " + d.i);
        
        scall(d);  // Data라는 타입을 갖는 주소값을 parameter로 넘겨야한다. -> 주소값을 parameter
                  // scall(d);  -> 데이터 타입이니까 들어갈수 있음
        System.out.println("after : d.i : " + d.i);
        
        vcall(d.i);
        System.out.println("d.i : " + d.i);

    }
    
    static void scall(Data sdata) { // 주소값을 받는 parameter
        System.out.println("함수 : " + sdata.i);
        sdata.i = 111;
        
    }
    static void vcall(int x) {  // 정수값을 받는 parameter
       System.out.println("before x : " + x);
       x = 8888;
       System.out.println("after x : " + x);
    }

}
