public abstract class Vehicle {
    private int speed;
    public Vehicle()
    {
        this.speed=0;
    }
    public abstract void speedUp();
    protected void printSpeedIncrease(String vehicleType,int IncreaseAmount){
        System.out.println(vehicleType + "a crescut viteza cu"+ IncreaseAmount + "unitati");

    }
    public int getSpeed(){
        return speed;
    }
}

