
import kr.or.bit.Apt;
import kr.or.bit.BodyInfo;
import kr.or.bit.Car;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01Ref_Type {
    public static void main(String[] args) {
        
        BodyInfo info = new BodyInfo(); // 
        
        Emp emp = new Emp(); // 클래스 타입을 갖는 변수 -> 참조 변수(주소값 변수)
        System.out.println(emp.toString());
        // kr.or.bit.Emp@5305068a 주소값(변형)
        // ---패키지명----@---주소--- 
//        int num = 100; // 값타입 변수
//        System.out.println(num);
        
        emp.number = -100;
        System.out.println(emp.number);
        
        emp.setNum(55);
        int result = emp.getNum();
        System.out.println("reuslt : "+result);
        
        emp.setEname("홍길동");
        String name = emp.getEname();
        System.out.println("name: "+name);
        
        
        int num = 100;  //값타입 변수
        System.out.println(num);
        
        
        // 답 : 객체를 만드는 사용자마다 다른 값을 가질 수 있게 하기 위해서
        Apt sapt = new Apt();
        sapt.door = 20;
        System.out.println(sapt.door);
        System.out.println("주소 : " + sapt);
      //  주소 : kr.or.bit.Apt@15db974210
        
        Apt lapt = new Apt();
        lapt.door = 10;
        System.out.println(lapt.door);
        System.out.println("주소 : " + lapt);
        // 주소 : kr.or.bit.Apt@6d06d69c0
        
        Apt mapt = new Apt();
        System.out.println(mapt.door);
        System.out.println("주소 : " + mapt);
         // 주소 : kr.or.bit.Apt@7852e922

        
        int i = 10;
        int j;
        j = i;
        j = 100;
        // 값할당
        
        // 주소값 할당
        Apt apt = new Apt();
        Apt kapt = apt;
        
        apt.door = 9999;
        System.out.println(kapt.door);
        
        System.out.println("apt : " + apt);
        System.out.println("kapt : " + kapt);
//        apt : kr.or.bit.Apt@4e25154f
//        kapt : kr.or.bit.Apt@4e25154f
        
        int[] arr = new int[5];
        int[] arr2 = arr;
        // 같은 주소를 참조 합니다
        
        // 값타입(8가지) -> boolean, int, char, long, short, short ..
        // 참조타입(class, Array)
        
        Apt ap; //선언(stack 영역에 공간만 확보 : default로 4byte 할당)
        ap = new Apt(); //할당(ap라는 변수가 메모리를 갖는다) (객체의 주소값을 갖는다)
        // 선언과 할당을 분리할 수 있다.
        System.out.println("ap 주소값 : " + ap);
        ap = null;
        System.out.println("ap 주소값 : " + ap);
        
        // 초기화
        Apt ap2; // main 함수안에 있는 변수 local variable(지역변수) -> 초기화를 해야된다.
        ap2 = null;
        System.out.println(ap2);
        
        // 함수안에
        Car car;
        car = null;
        System.out.println(car);
        
        Apt ap3 = new Apt();
        System.out.println(ap3.car);
        
        Apt ap4 = new Apt();
        
        Apt ap5 = ap4;
        // 주소값 비교
        // == 
        System.out.println(ap3 == ap4);  // 비교연산자(변수가 가지고 있는 값)
        System.out.println(ap4 == ap5);  // true(두개는 같은 주소를 가지고 있다)
        
        // Tv 한대를 생산하세요
        // 제조회사 : 비트
        // 채널을 5번으로 설정
        // 정보 출력
        
        Tv bittv = new Tv();
        bittv.brandname = "비트";
       // bittv.ch = 5;
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        
        bittv.tv_Info();
        
        // 사원 1명을 생성
        // 사번 : 7788, 이름 : 김유신, 부서 : IT
        // 신체정보 키는 190, 몸무게 40
        Person person = new Person();
        person.empno = 7788;
        person.ename = "김유신";
        person.job = "IT";
        person.sal = 1000;
        
        //방법 1
//        person.bodyinfo = new BodyInfo();
//        person.bodyinfo.height =190;
//        person.bodyinfo.weight =40;
       
         // 방법 2
        BodyInfo info1 = new BodyInfo();
        info1.height = 190;
        info1.weight = 40;
        
        person.bodyinfo = info1;
        System.out.println(person.bodyinfo.height);
        System.out.println(person.bodyinfo.weight);
        
        
                }
}