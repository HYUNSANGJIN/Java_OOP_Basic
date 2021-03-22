package kr.or.bit;

public class NoteBook {
    // 접근 제한자로 캡슐화 시켜놓음(private)
    private String color;
    private int year;
    
    // 직접할당을 막고 간접할당을 통해서 하겠다.
    // 간접할당의 구현은 함수이다. -> 특수한 목적을 갖고 있는 함수 -> setter, getter
    // 자동화 코드
    public void setYear(int y) {   // setter 함수 (멤머필드에 값을 쓰는 함수)
        if(y <= 0) {  // 0보다 작거나 같으면 1999년 부터 시작이야..
            year = 1999;   
            
        }else {
            year = y;
        }
    }
    
    public int getYear() {  // getter 함수
        return year;
    }
    
    // 자동화  -> 오른쪽 클릭 -> 소스 
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 노트북은 마우스를 가지고 있다.
    // 여러개의 속성과 기능을 가지고있다.
    // Mouse mouse;  -> 마우스가 조종하는거지 노트북이 갖고있는건 아님
    
   
    public void handle(Mouse m) {  // Mouse 주소값을 받아서 처리
        m.x = 100;
        m.y = 200;
        
    }
    
    public void noteBookInfo() {
        System.out.println("color : " + color + ",year : " + year);
    }

}
