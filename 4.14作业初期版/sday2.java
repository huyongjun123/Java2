import java.security.Timestamp;

public class sday2 {
    public static void main(String []args) {
    	runIf1();
}
    public static void runIf1(){
    	int ti=2;//定义ti为次数，定义time为时间。
    	int time=50;
    	if(ti<4&&time>30){
    		System.out.println("你可以开始挂号。。。。。");
    	}else{
    		System.out.println("你不可以挂号");
    	}
    }
}