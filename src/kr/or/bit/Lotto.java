package kr.or.bit;

public class Lotto {
public static void main(String[] args){
while(true) {
Lotto lt = new Lotto(); //객체생성과 생성자 호출

switch (lt.menuChoice()) { //menu 선택
case 1: { //1일때 로또생성기 호출과 print
lt.setNumbers();
lt.lotto_print();
break;
}
case 2: { //2일때 프로그램 종료
System.out.println("프로그램을 종료합니다.");
System.out.println("Good Luck!!!!!");
System.exit(0);
}
default:{
System.out.println("메뉴를 다시 선택해 주세요.");
}
}
}

}

private void lotto_print() {
    // TODO Auto-generated method stub
    
}

private void setNumbers() {
    // TODO Auto-generated method stub
    
}

private int menuChoice() {
    // TODO Auto-generated method stub
    return 0;
}
}