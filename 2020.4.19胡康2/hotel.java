package com.hk.second;import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class hotel {
   public static void Main(String []args){
	   String hotel1="格林太好苏州火车站南广场酒店";
	   String hotelType1="vip房间（代金券）";
	   String [] hotelType2={"大房","标间","豪房","高级大房"};
	   String [] hotelType3={"vip大房","vip标间","vip豪房","vip高级大房"};
	   String [] hotelType4={"大房（代金券）","标间（代金券）","豪房（代金券）","高级大房（代金券）"};
	   String [] hotelType5={"vip大房（代金券）","vip标间（代金券）","vip豪房（代金券）","vip高级大房（代金券）"};
       int []prise1={188,177,200,400,180};
       int []prise2={160,150,190,340,160};
       int []vouchar={20,10,30,20,10};
       hotel(hotel1);
       for(int i=0;i<prise1.length;i++){
    	   if (hotelType1.equals(hotelType2[i])){
    		   System.out.println(hotelType1+"价格"+prise1[i]+"元");
    	   }else  if (hotelType1.equals(hotelType3[i])){
    		   System.out.println(hotelType1+"价格"+prise2[i]+"元");  
    	   }else  if (hotelType1.equals(hotelType4[i])){
    		   System.out.println(hotelType1+"价格"+(prise1[i]-vouchar[i])+"元"); 
    	   }else  if (hotelType1.equals(hotelType5[i])){
    		   System.out.println(hotelType1+"价格"+(prise2[i]-vouchar[i])+"元");    
    	   }
       }
        System.out.println();
   }
   public static Boolean hotel(String hotel1 ){
	   String []hotel2={"格林太好苏州火车站南广场酒店","戈雅工业园东方之门酒店","格林豪泰工业园酒店"};
	   String []address={"苏州市人名路","工业园区星海街","形成区黄桂路"};
	   Boolean c =false;
	   for (int i=0;i<hotel2.length;i++){
		   if(hotel1.equals(hotel2[i])){
			   System.out.println("入住"+hotel1);
			   System.out.println("地址"+address[i]);
			   c=true;
		   }
	   }
	   return c;
   }
}
