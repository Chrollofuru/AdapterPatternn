package adapterPattern;

public class ApplianceApp {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger charger = new SmartphoneCharger();
        PowerOutlet chargerOutlet = new SmartphoneAdapter(charger);

        //plug in the devices
        System.out.println(laptopOutlet.plugIn());
        System.out.println(fridgeOutlet.plugIn());
        System.out.println(chargerOutlet.plugIn());
    }
}