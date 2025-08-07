package Lab;

interface  ControllableDevice{
    void powerOn();
    void powerOff();
    void StatusReport();
} 
interface InternetEnabled{
    void connectWifi();
}

class SmartTV implements ControllableDevice,InternetEnabled{
    public void powerOn(){
        System.out.println("On");
    }
    public void powerOff(){
        System.out.println("Off");
    }
    public void StatusReport(){
        System.out.println("normal");
    }
    public void connectWifi(){
        System.out.println("connected");
    }
}

class SmartFridge implements ControllableDevice{
    public void powerOn(){
        System.out.println("On");
    }
    public void powerOff(){
        System.out.println("Off");
    }
    public void StatusReport(){
        System.out.println("default");
    }
}

class SmartAc implements ControllableDevice{
    public void powerOn(){
        System.out.println("On");
    }
    public void powerOff(){
        System.out.println("Off");
    }
    public void StatusReport(){
        System.out.println("optimal");
    }
}

public class SmartDeviceSystem {
    public static void main(String args[]){
        ControllableDevice tv = new SmartTV();
        ControllableDevice fridge = new SmartFridge();
        ControllableDevice ac = new SmartAc();

        System.out.println("------SmartTV------");
        tv.powerOn();
        tv.StatusReport();
        tv.powerOff();

        System.out.println("-------SmartFridge-----");
        fridge.powerOn();
        fridge.StatusReport();
        fridge.powerOff();

        System.out.println("-------SmartAc-------");
        ac.powerOn();
        ac.StatusReport();
        ac.powerOff();

    }
}
