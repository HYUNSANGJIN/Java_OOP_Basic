import kr.or.bit.AirPlane;

public class Ex06_Static_AirPlane {

    public static void main(String[] args) {
//        AirPlane air = new AirPlane();
//        air.makeAirPlane(707, "대한");
//        
//        AirPlane air2 = new AirPlane();
//        air.makeAirPlane(708, "대한");
//        
//        air2.airPlaneTotalCount();
//        
//        AirPlane air3 = new AirPlane();
//        air.makeAirPlane(709, "대한");
//        
//        air3.airPlaneTotalCount();
//         air2.airPlaneTotalCount();// 바라보는 totalcount가 같아서 다 같은값이다
//        air.airPlaneTotalCount();
        
        AirPlane airplane = new AirPlane(707, "대한");
        airplane.AirPlaneInfo();
        airplane.airPlaneTotalCount();
    }

}
