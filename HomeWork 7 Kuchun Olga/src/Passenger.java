public class Passenger extends GroundTransport{
    private String carcass;
    private int numOfPassenger;
    public Passenger(int power, int speed, int weight, String model, int wheels, int fluelConsumption, String carcass, int numOfPassenger) {
        super(power, speed, weight, model, wheels, fluelConsumption);
        this.carcass = carcass;
        this.numOfPassenger = numOfPassenger;
    }

    public String getCarcass() {
        return carcass;
    }

    public void setCarcass(String carcass) {
        this.carcass = carcass;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", carcass=" + getCarcass() +
                ", numOfPassenger=" + getNumOfPassenger() +
                 + '\'' +
                '}';
    }
    private double countfluel(double time){
        return (time * this.getSpeed())/100.0;
    }
    public void method1(double time){
        System.out.println("За время " + time+" ч, автомобиль "+ getModel()+"\n" +
                "двигаясь с максимальной скоростью "+ getSpeed()+ " км/ч\n" +
                "проедет " +time * this.getSpeed()+" км и израсходует "+countfluel(time)+" литров топлива.");

    }
}
