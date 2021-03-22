import kr.or.bit.Car;
import kr.or.bit.Mouse;
import kr.or.bit.NoteBook;

public class Ex04_MethodCall {
public static void main(String[] args) {
    
    NoteBook notebook = new NoteBook();
    notebook.setColor("red");
    notebook.setYear(-2000);
    
    System.out.println(notebook.getColor());
    System.out.println(notebook.getYear());
    
    Mouse mouse = new Mouse();
    notebook.handle(mouse);
    System.out.println(mouse.x);
    System.out.println(mouse.y);
    
    
    // notebook 3대 생성하고
    // 2000년 , red
    // 2010년 , blue
    // 2020년, white
    // 명시하고 정보를 출력하기
    // Array 사용
    
    // TODAY POINT
    // 객체배열은 [방의 생성]과 [객체의 생성] 2번 작업한다.
    
    NoteBook[] notebooks = new NoteBook[3];
    // ㄴ이 배열은 notebook 객체의 주소를 담을수 있는 방
   
    notebooks[0] = new NoteBook();
    notebooks[1] = new NoteBook();
    notebooks[2] = new NoteBook();
    
    notebooks[0].setYear(2000);
    notebooks[0].setColor("red");
    notebooks[0].noteBookInfo();
    
    notebooks[1].setYear(2010);
    notebooks[1].setColor("blue");
    notebooks[1].noteBookInfo();
    
    
    notebooks[2].setYear(2020);
    notebooks[2].setColor("white");
    notebooks[2].noteBookInfo();
    
    for(int i=0; i<notebooks.length; i++) {
        notebooks[i].noteBookInfo();
    }
    // 개선된 for문
    for(NoteBook no : notebooks) {
       no.noteBookInfo();
    }
    
    // 2번. int[] arr = new int[] {1,2,3}
    NoteBook[] notebooks2 = new NoteBook[] {new NoteBook(), new NoteBook(),
            new NoteBook()};
    
    
    // 3번. 사용빈도 (int[] arr = {1,2,3})  -> 제일 많이 씀
    NoteBook[] notebooks3 = {new NoteBook(), new NoteBook(),
            new NoteBook()};
    
    Car car = new Car();
    car.speed_Up();
    car.speed_Up();
    System.out.println(car.getSpeed());
    
    car.speed_Down();
    car.speed_Down();
    car.speed_Down();
    car.speed_Down();
    car.speed_Down();
    System.out.println(car.getSpeed());
}
}

