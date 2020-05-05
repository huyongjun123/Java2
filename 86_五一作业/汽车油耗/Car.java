package 五一作业;

public class Car {
            private String brand;
            private String type;
            private String prise;
            private String fuel;
            private String kMeter;
            private String tankPacity;
            private String reOil;
			public String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public String getPrise() {
				return prise;
			}
			public void setPrise(String prise) {
				this.prise = prise;
			}
			public String getFuel() {
				return fuel;
			}
			public void setFuel(String fuel) {
				this.fuel = fuel;
			}
			public String getkMeter() {
				return kMeter;
			}
			public void setkMeter(String kMeter) {
				this.kMeter = kMeter;
			}
			public String getTankPacity() {
				return tankPacity;
			}
			public void setTankPacity(String tankPacity) {
				this.tankPacity = tankPacity;
			}
			public String getReOil() {
				return reOil;
			}
			public void setReOil(String reOil) {
				this.reOil = reOil;
			}
			public Car() {
			}
			public Car(String brand, String type, String prise, String fuel, String kMeter, String tankPacity,
					String reOil) {
				super();
				this.brand = brand;
				this.type = type;
				this.prise = prise;
				this.fuel = fuel;
				this.kMeter = kMeter;
				this.tankPacity = tankPacity;
				this.reOil = reOil;
			}
}
