package Defination;

public class Car {
    private double speed;
    public Car(double speed)
    {
        this.speed= speed;
    }
    private final double  MAXIMUM_SPEED = 200;
    public void checkSpeed(){
        if(this.speed>=MAXIMUM_SPEED)
        {
            try {
                throw new MaximumSpeedException("!!!!!Over Speed Warning !!!!! Please Slow down your Car");
                }
            catch(MaximumSpeedException mse){
                System.out.println(mse.getMessage());


                  }
        }
        else {
            System.out.println("Drive Safe :)");

        }
    }




}
