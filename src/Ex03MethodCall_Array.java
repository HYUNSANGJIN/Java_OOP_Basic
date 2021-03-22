
class Human{
	String name;
}

class Practice{
	int add(int i, int j) {
		return i + j;
		
	}
	
	// 배열은 객체다(배열은 주소값을 가지고 있다 : 배열은 heap메모리에 생성된다.) 
	int[] add2(int[] param) {   // 이 함수는 int[] 에 주소값을 리턴값을 리턴, parameter int[]에 주소값을 받겠다.
 		// return null;  -> 배열도 객체니까 사용 가능
		// return new int[5];   = return new Tv();;
		int[] arr = new int[param.length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = param[i]+1;
			
		}
		return arr;
	}  
	
	// 함수안에 코드를 마음대로 작성하고
	// main안에서 가지고 놀기
	int[] add3(int[] so, int[]so2) {
	    //return null;
	    int[]arr2 = new int[so.length];
	    for(int i=0; i<arr2.length; i++) {
	        arr2[i] = so[i] + so2[i];
	    }
	    return arr2;
	}
	
	

		
	
	
	
}

public class Ex03MethodCall_Array {
public static void main(String[] args) {
	Practice t = new Practice();
	int result = t.add(10, 10);
	System.out.println("result : " + result);
	
	int[] array = {10,20,30};
	int[] resultarray = t.add2(array);
	for(int i : resultarray) {
		System.out.println("i : " + i);
	}
	
	
			
}
}
