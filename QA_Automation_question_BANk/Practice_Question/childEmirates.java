public class childEmirates extends ParentAirCraft {

    public static void main(String[] args) {
        System.out.println("Testing");

        childEmirates c = new childEmirates();
        c.bodyColor();
        c.engine();

        // ParentAirCraft obj = new ParentAirCraft() -> will not work because we cannot
        // create
        // obj of abstract class
    }

    @Override
    public void bodyColor() {
        // TODO Auto-generated method stub
        System.out.println("Red color on body");
    }

}
