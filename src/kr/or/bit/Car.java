package kr.or.bit;

// 창문의 수를 가지고 있다.
// 자동차는 속도를 가지고 있다.

// 2가지 속성은 캡슐화
// 속도는 마이너스 값이 오면 0으로 초기화

// 속도를 10씩 올리거나 감소하는 기능을 만들어라
// 속도가 마이너스 값을 가지면 0으로 초기화

public class Car {
    private int window;
    private int speed;
    
    public int getWindow() {
        return window;
    }
    public void setWindow(int window) {
        this.window = window;
    }
    
    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
          // this -> 앞에 this가 있으면 Car에 speed를 가르킨다.
        if(speed < 0) {
            this.speed = 0;
        }else {
            this.speed = speed;
        }
    }
    
    public void speed_Up() {
        speed+=10;
    }
    public void speed_Down() {
        if(this.speed > 0) {
            this.speed -=10;
        }else {
            this.speed = 0;
        }
    }
    
    

}
