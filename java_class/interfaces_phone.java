package java_class;
interface camera{
    void takesnap();
    void recordvideo();
    default void record4k()     //default method in interface
    {
        System.out.println("i am recording 4k video");
    }

}

interface wifi{
    String[] getnetworks();
    void connectToNetworks(String network);
}

class MyCellPhone{
    void callNumber(int phonenumber)
    {
        System.out.println("calling "+phonenumber);
    }
    void pickcall()
    {
        System.out.println("connecting.....");
    }
}

class SmartPhone extends MyCellPhone implements wifi,camera{
    public void takesnap()
    {
        System.out.println("i am taking snap");
    }
    public void recordvideo()
    {
        System.out.println("i am recording video");
    }
    public String[] getnetworks()
    {
        System.out.println("getting list of networks");
        String [] networkList={"harry","anmol","sheer"};
        return networkList;
    }
    public void connectToNetworks(String network)
    {
        System.out.println("connecting to.."+network);
    }

}


public class interfaces_phone {
    public static void main(String[] args) {
        SmartPhone ms=new SmartPhone();
        String[] ar=ms.getnetworks();
        for(String item: ar)
        {
            System.out.println(item);
        }
        ms.record4k();
    }
}
