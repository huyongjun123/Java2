import java.security.Timestamp;

public class sday3 {
    public static void main(String []args) {
    	runIf1();
}
    public static void runIf1(){
    	int ti=1;//定义ti为次数，定义time为时间。
    	int time=20;
    	switch (ti){
    	case 1:
    	case 2:
    	case 3:
    		System.out.println((time>30)?"可以挂号":"不可以挂号");
    		break;
    	default:
    		System.out.println("你不可挂号");
    		break;
    	}
    }
}