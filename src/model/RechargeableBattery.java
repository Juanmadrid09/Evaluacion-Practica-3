package model;

public class RechargeableBattery extends Battery implements Rechargeable{
	
	
	private int chargerNumber;
	private Type typeBattery;
	
	
	public RechargeableBattery( String name, double voltage, double cost, double capacity, int chargernumber, Type typeBattery){
		
		
		super(name,voltage,cost,capacity);
		
		chargerNumber=chargernumber;
		this.typeBattery=typeBattery;
	}
	
	
	
	
	
@Override

public double calculateUseFulLifeCost(){
	double typeB=0;
	
	if(typeBattery==Type.NIQUEL_CADMIO){
		typeB=0.8;
	} else
		typeB=0.92;
	
	
	
	double answer=0;
	
	
answer=	(super.getCost()*super.getVoltage())/(1000*chargerNumber*typeB);

return answer;
}
	
	
	
	
	
	
	
	
}