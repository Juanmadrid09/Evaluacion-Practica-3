package model;

public class Company{
	
    public static final int MAX_BATTERIES = 10;
	private Battery[] batteries;

	public Company() {
        this.batteries = new Battery[MAX_BATTERIES];
	}

    public Company(Battery[] batteries){
        this.batteries = batteries;
    }
	

    public void registerBattery(String name, double voltage, double cost, double capacity){
        int emtyPos = getEmtyPosition();
        batteries[emtyPos] = new Battery(name, voltage, cost, capacity);

    }

    public void registerRechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber,int type) {
        int emtyPos = getEmtyPosition();
		Type typee=null;
		
		if (type==1){
			typee=Type.NIQUEL_CADMIO;
		} else
			typee=Type.ION_LITIO;
			
        batteries[emtyPos] = new RechargeableBattery(name, voltage, cost, capacity, chargerNumber ,typee);
        
    }
    
    private int getEmtyPosition() {
        int pos = -1;
        for (int i = 0; i < MAX_BATTERIES && pos == -1; i++) {
            if (batteries[i] == null) {
                pos = i;
            }
        }
        return pos;
    }

    public String showTotalBatteries() {
		
		int battery=0;
		int rechargeable=0;
		
		if(batteries != null){
			for(int i=0;i< MAX_BATTERIES; i++){
				if(batteries[i] instanceof Battery){
					battery++;
				}
				else if(batteries[i] instanceof RechargeableBattery){
					rechargeable++;
				}
			}
		}
    	return " el numero de baterias tradicionales que hay registradas es de "+ battery+ " y de baterias recargables "+ rechargeable;
    
	}
    
    public String showBatteriesInfo() {
    	String str = "";
    	return str;
    }
    

	public double calculateUsefulPromLifeCost(){
		return 0.0;
	}

}
