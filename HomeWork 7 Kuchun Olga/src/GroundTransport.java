public class GroundTransport extends Transport{
    private int wheels;
    private int fluelConsumption;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getFluelConsumption() {
        return fluelConsumption;
    }

    public void setFluelConsumption(int fluelConsumption) {
        this.fluelConsumption = fluelConsumption;
    }

    public GroundTransport(int power, int speed, int weight, String model, int wheels, int fluelConsumption) {
        super(power, speed, weight, model);
        this.wheels = wheels;
        this.fluelConsumption = fluelConsumption;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", wheels=" + getWheels() +
                ", fluelConsumption=" +getFluelConsumption()+
                  '\'' ;

    }
}
