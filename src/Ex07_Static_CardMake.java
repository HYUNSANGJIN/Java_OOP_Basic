import kr.or.bit.Card;

public class Ex07_Static_CardMake {

    public static void main(String[] args) {
        // Card 53장 만들기
        // heap메모리에 만듬(객체니깐!!)
        Card c = new Card();
        c.number = 1;
        c.kind = "heart";
       // c.h = 80;  -> 이 작업을 각각 53번이나 해야한다..(방법1로 했을경우)
       // c.w = 50;  -> 이 작업을 각각 53번이나 해야한다..        
        c.h = 80;    // Card class에서 static 변경 후 main함수 안에 써주기   -> 다 바뀜
        c.w = 50;   // Card class에서 static 변경 후 main함수 안에 써주기
        c.cardInfo();
        
        Card c2 = new Card();
        c2.number = 2;
        c2.kind = "heart";
         // c2.h = 80;  -> 이 작업을 각각 53번이나 해야한다..(방법1로 했을경우)
        // c2.w = 50;  -> 이 작업을 각각 53번이나 해야한다..
        c2.cardInfo();
        
        // 고객의 마음이 변심했을때(카드가 작아요,..)
        // 현실이라면 53장을 다시 인쇄하면 되지만...
        
        //프로그램에서는..
        // (h=80 , w=50으로 늘려주세요!)
        // 방법 1. 53장 카드의 h, w를 하나하나 변경한다.
        // 방법2. 설계도를 아예 바꾸기(설계도 변경) -> 다시 인쇄


    }

}
