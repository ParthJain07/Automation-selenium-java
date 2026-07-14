public class AustralianTrafic implements CentralTrafic {
    
    public static void main(String[] args){
        
        CentralTrafic ob =  new AustralianTrafic();
        ob.greenGo();
        // ob.walking object ob cant access walking method because it is not defined in the interface CentralTrafic

        AustralianTrafic ob1 = new AustralianTrafic();
        ob1.walking();
    }

    @Override
    public void greenGo() {
        // TODO Auto-generated method stub
        System.out.println("Greengo implementation");
    }

    public void walking(){
        System.out.println("Walking implementation");
    }


    @Override
    public void redStop() {
        // TODO Auto-generated method stub
        System.out.println("Redstop implementation");
    }

    @Override
    public void FlashYellow() {
        // TODO Auto-generated method stub
        System.out.println("FlashYellow implementation");
    }
}
