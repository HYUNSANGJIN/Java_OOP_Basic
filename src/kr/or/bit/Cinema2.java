package kr.or.bit;

import java.util.Scanner;

public class Cinema2 {
    private Scanner scanner;
    private int[][] seatnumber;
    static String reservationnum;
    
    //생성자
        public Cinema2() {
            scanner = new Scanner(System.in);
            seatnumber = new int[4][5];
        }

    //메뉴판
    public void display() {
        int userChoice=0;
        while(true) {
            System.out.println("============================");
            System.out.println("===========영화 예매==========");
            System.out.println("============================");
            System.out.println("1.예매하기  2.예매조회  3.예매취소");
            System.out.print("> ");
            userChoice = scanner.nextInt();
            switch(userChoice) {
            case 1: this.reservation(); break;
            case 2: this.ckecking(); break;
            case 3: this.cancel(); break;
            default: System.out.println("잘못 입력!");
            }
        }
    }
    
    //예매하기
    public void reservation() {
        int userChoice=0;
        String seatnum=null;
        System.out.println("=========좌석 현황=========");
        for(int i=1; i<seatnumber.length; i++) {//좌석 현황(예약 안 된)
            for(int j=1; j<seatnumber[i].length+1; j++) {
                System.out.print("["+i+"-"+j+"]");
            }
            System.out.println();
        }
        System.out.println("=========================");
        System.out.println();
        System.out.println("이미 예약된 좌석은 '예매'라고 표시");
        System.out.print("좌석 선택(ex)1-1)> ");
        scanner.nextLine();
        seatnum = scanner.nextLine();
        System.out.println();
        if(seatnumber[4][5]==seatnumber[4][5]) {
            System.out.println("예매가 가능합니다. 예매하시겠습니까?");
            System.out.print("네(1), 아니오(2), 초기화면(0)> ");
            userChoice = scanner.nextInt();
            System.out.println();
            if(userChoice==1) {
                System.out.println("예매가 완료되었습니다.");
                System.out.printf("예매한 좌석번호> [%s], 예매번호> [%d]",seatnum, reservationnum);
                System.out.println("감사합니다.");
            }else if(userChoice==2) {
                
            }else if(userChoice==0) {
                this.display();
            }
        }else {
            System.out.println("이미 예약된 좌석입니다.");
        }
        
    }
    
    //예매조회
    public void ckecking() {
        String seatnum=null;//좌석번호//배열값?
        System.out.print("예매번호 입력> ");
        scanner.nextLine();
        reservationnum = scanner.nextLine();
        System.out.println();
        if(reservationnum.equals("seatnum(좌석번호)")) {
            System.out.printf("고객님이 예약하신 좌석은 [%s]입니다.\n",seatnum);
        }else {
            System.out.println("잘못 입력!, 예매번호를 다시 입력해주세요.");
            //?위에 while문?
        }
        //return값을 주고싶은데.. display()로..
    }
    
    //예매취소
    public void cancel() {
        int userChoice=0;
        String seatnum=null;//좌석번호//배열값?
        System.out.println("예매번호 입력> ");
        scanner.nextLine();
        reservationnum = scanner.nextLine();
        if(reservationnum.equals("seatnum(좌석번호)")){
            System.out.printf("고객님이 예약하신 좌석은 [%s]입니다.\n",seatnum);
            System.out.print("예매를 취소할까요? 네(1),아니오(2)> ");
            userChoice = scanner.nextInt();
            System.out.println();
            if(userChoice==1) {
                //좌석이 원래대로 돌아와야함
                System.out.println("예매가 취소되었습니다.");
                this.display();
            }
        }
    }
    
    
}