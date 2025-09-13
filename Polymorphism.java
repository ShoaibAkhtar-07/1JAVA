interface Camera {
    void takeSnap();
    void recordVideo();

    private void notification(){
        System.out.println("HIDE NOTIFICATION");
    }
    default void recordVideoInSlowMo(){
        notification();
        System.out.println("Recording video in SLOW MOTION");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements Camera, Wifi{
    
    public void takeSnap(){
        System.out.println("Taking SNAP");
    }
    
    public void recordVideo(){
        System.out.println("Recording video in SNAP");
    }

    public String[] getNetworks(){
        System.out.println("Getting the list of networks");
        String[] networkList ={"Shoaib","Nazir","Shahid"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }

}


public class Polymorphism {
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone();
        sp.callNumber(100);
        // sp.notification(); //It will through an error because it is private and if we want to access it we should give the method path to default.
        sp.recordVideoInSlowMo();
        
        //POLYMORPHISM
        Wifi cl =new SmartPhone();
        cl.connectToNetwork("\'I will not give\'");
        String[] arr =cl.getNetworks();
        for(String s : arr){
            System.out.println(s);
        }

    }
}