package kr.or.bit;
/*
 * 우리는 카드를 만들어 판매하는 회사입니다
 * 고객의 요청에 따라 카드 53장을 제작하게 되었습니다. (new 작업 53하면...)
 * 요구사항
 * 카드는 카드의 번호를 가지고 있고 그리고 모양을 가지고 있다
 * 카드는 크기를 가지고 있다. 크기는 높이와 너비를 의미한다
 * 카드의 크기는 h=50, w=20
 * 
 * [모든 카드의 높이와 너비는 동일] (동일하다)
 * ??? 카드의 크기를 나중에 변경해 달라고 하면???
 * 
 * 설계도를 다시 변경하지 않고 53장 카드의 크기를 변경할 수 없을까
 */
public class Card {
    public int number;   // 카드이름 (default)
    public String kind;  // 카드 모양
    
  //  public int h = 50;  // 지정된 높이
  //  public int w = 20;  // 지정된 너비
    
    public static int h = 50;       // 방법1로 하려면 이렇게 빼버린다
    public static int w = 30;
    
    public void cardInfo() {  // 카드 정보
        System.out.printf("번호:%d, 모양:%s, h:%d, w:%d\n",number, kind, h, w);
    }

}
