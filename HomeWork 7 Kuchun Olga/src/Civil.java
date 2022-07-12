public class Civil extends AirTransport{
    private int passengers;
    public boolean businessClass;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public Civil(int power, int speed, int weight, String model, int wingspan, int minRunwayLenght, int passengers, boolean businessClass) {
        super(power, speed, weight, model, wingspan, minRunwayLenght);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", passengers=" + getPassengers() +
                ", businessClass=" +isBusinessClass()+
                '}';
    }

    public void passengerСapacity( int numOfPassengers){
        if (numOfPassengers>getPassengers()){
            System.out.println("Вам нужен самолёт побольше");
        }else {
            System.out.println("Самолёт загружен");
        }
    }
}
