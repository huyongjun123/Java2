/**
 * @author 胡康
 * @date 2020年4月12日
 */
import java.net.PortUnreachableException;

public class PublicBus {

	public static void main(String []args){
		String BusName="绿皮公交";
		int UserTime=3;
		String CarNumber="苏N19983";
		String Start="李通大厦";
		String End="科技园";
		double Prise=2.5;
		
		System.out.println("公交名称："+BusName);
		System.out.println("已使用时间："+UserTime+"年");
		System.out.println("车牌号："+CarNumber);
		System.out.println("公交起点："+Start);
		System.out.println("公交终点："+End);
		System.out.println("公交价格："+Prise+"元");
		
		
	}
}
