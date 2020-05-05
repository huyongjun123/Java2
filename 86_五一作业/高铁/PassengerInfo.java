package 五一作业;

public class PassengerInfo {
       private String highSpeedRailNum;
       private String passengerSet;
       private String passengerSite;
	public String getHighSpeedRailNum() {
		return highSpeedRailNum;
	}
	public void setHighSpeedRailNum(String highSpeedRailNum) {
		this.highSpeedRailNum = highSpeedRailNum;
	}
	public String getPassengerSet() {
		return passengerSet;
	}
	public void setPassengerSet(String passengerSet) {
		this.passengerSet = passengerSet;
	}
	public String getPassengerSite() {
		return passengerSite;
	}
	public void setPassengerSite(String passengerSite) {
		this.passengerSite = passengerSite;
	}
	public PassengerInfo() {
	}
	public PassengerInfo(String highSpeedRailNum, String passengerSet, String passengerSite) {
		super();
		this.highSpeedRailNum = highSpeedRailNum;
		this.passengerSet = passengerSet;
		this.passengerSite = passengerSite;
	}
}
