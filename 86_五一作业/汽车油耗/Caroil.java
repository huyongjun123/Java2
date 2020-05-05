package 五一作业;

public class Caroil {
       private static double reOil1;
	public static void main(String[] args) {
		Car car=new Car();
		car.setBrand("大众");
		car.setType("中型车");
		car.setPrise("22");
		car.setTankPacity("66L");
		car.setkMeter("200km");
		car.setFuel("50L/km");
		car.setReOil("60L");
		Double reOil=new Double (car.getReOil().replaceAll("L", ""));
		Double fuel =new Double(car.getFuel().replaceAll("L/100km", ""));
		Double kMete =new Double(car.getkMeter().replaceAll("km", ""));
		String fReOil  =reCount(reOil,fuel,kMete)+"L";
		System.out.println("======汽车信息========");
		System.out.println(car.toString());
		System.out.println("=====剩余油量======");
		System.out.println("里程"+car.getkMeter()+""+"剩余油量"+fReOil);
		
	}
    public static double reCount(Double ReOil,Double fuel,Double kMete){
    	double oilConsumption;
    	double reOil=0;
    	oilConsumption=(kMete/100)*fuel;
    	if (oilConsumption>=reOil) {
    		System.out.println("油量不够");
			
		}else if(oilConsumption<reOil&&oilConsumption>=0){
			reOil1=reOil-oilConsumption;
			
		}return reOil1;
    }
}
