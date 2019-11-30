package chapter6;

public class FreezingAndBoilingPoints {
	private int temperature;
	
	public FreezingAndBoilingPoints() {
		temperature = 0;
	}
	
	public FreezingAndBoilingPoints(int t) {
		temperature = t;
	}
	
	public void setTemperature(int t) {
		temperature = t;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public boolean isEthylFreezing() {
		boolean isFreezing = false;
		if (temperature <= -173)
			isFreezing = true;
		
		return isFreezing;
	}
	
	public boolean isEthylBoiling() {
		boolean isBoiling = false;
		if (temperature >= 172)
			isBoiling = true;
		
		return isBoiling;
	}
	
	public boolean isOxygenFreezing() {
		boolean isFreezing = false;
		if (temperature <= -362)
			isFreezing = true;
		
		return isFreezing;
	}
	
	public boolean isOxygenBoiling() {
		boolean isBoiling = false;
		if (temperature >= -306)
			isBoiling = true;
		
		return isBoiling;
	}
	
	public boolean isWaterFreezing() {
		boolean isFreezing = false;
		if (temperature <= 32)
			isFreezing = true;
		
		return isFreezing;
	}
	
	public boolean isWaterBoiling() {
		boolean isBoiling = false;
		if (temperature >= 212)
			isBoiling = true;
		
		return isBoiling;
	}
	
}
