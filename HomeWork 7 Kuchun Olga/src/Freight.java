public class Freight extends  GroundTransport {
   private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public Freight(int power, int speed, int weight, String model, int wheels, int fluelConsumption, int carrying) {
        super(power, speed, weight, model, wheels, fluelConsumption);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", carrying=" + getCarrying() +
                '}';
    }

    public void cargoСapacity(int cargoWeight){
        if (cargoWeight>getCarrying()){
            System.out.println("Вам нужен грузовик побольше");
        }else {
            System.out.println("Грузовик загружен");
        }
    }
}
