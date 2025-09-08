interface Camera {
    void takeSnap();
    void recordVideo();
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class Cellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class SmartPhone extends Cellphone implements Camera, Wifi{
    
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
    

    }
}