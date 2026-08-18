package inheritance;

class Appliance {

    void powerOn() {

        System.out.println("Appliance is switched on");
    }
}

class WashingMachine extends Appliance {

    void washClothes() {

        System.out.println("Washing Machine is washing clothes");
    }
}

class AutomaticWashingMachine extends WashingMachine {

    void dryClothes() {

        System.out.println("Automatic Washing Machine is drying clothes");
    }
}

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        AutomaticWashingMachine obj = new AutomaticWashingMachine();

   
        obj.powerOn();
        obj.washClothes();
        obj.dryClothes();

	}

}
