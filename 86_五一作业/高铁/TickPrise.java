package 五一作业;

public class TickPrise {
       public static void main(String[] args) {
		PassengerInfo pInfo=new PassengerInfo("G202","苏州","一等座");
		String pSite=pInfo.getPassengerSite();
		String[]site={"上海","河南","永存","河北","上锡","北京","南京"};
		String[]seat={"一等座","二等座"};
		if(pInfo.getPassengerSet()==seat[0]){
			double ticketPrise1=firstClassSeat(site,pSite);
			System.out.println("车票信息");
			System.out.println("高铁车次"+pInfo.getHighSpeedRailNum());
			System.out.println("目的地"+pInfo.getPassengerSite());
			System.out.println("座位"+pInfo.getPassengerSet()+"价格"+ticketPrise1);
		}
		else if(pInfo.getPassengerSet()==seat[1]){
			double ticketPrise2=firstClassSeat(site,pSite);
			System.out.println("车票信息");
			System.out.println("高铁车次"+pInfo.getHighSpeedRailNum());
			System.out.println("目的地"+pInfo.getPassengerSite());
			System.out.println("座位"+pInfo.getPassengerSet()+"价格"+ticketPrise2);
		
	}
}
   public static double firstClassSeat(String[] site,String pSite){
	   double ticketPrise=33;
	   double[]firstClassSeatPrise={0,22,443,2,422,23,43,2,45};
	   for(int j=0;j<firstClassSeatPrise.length-1;j++){
		   if (pSite.equals(site[j])){
			   ticketPrise=firstClassSeatPrise[j];
		   }
	   }
	   return ticketPrise;
   }
   public static double secondClassSeat(String[] site,String pSite){
	   double ticketPrise=0;
	   double[]secondClassSeatPrise={0,22,443,2,422,23,43,2,45};
	   for(int j=0;j<secondClassSeatPrise.length-1;j++){
		   if (pSite.equals(site[j])){
			   ticketPrise=secondClassSeatPrise[j];
		   }
	   }return ticketPrise;
   }
}