public class Military extends AirTransport{
    private  boolean ejectionSystem;
    private  int missiles;


    public Military(int power, int speed, int weight, String model, int wingspan, int minRunwayLenght, boolean ejectionSystem, int missiles) {
        super(power, speed, weight, model, wingspan, minRunwayLenght);
        this.ejectionSystem = ejectionSystem;
        this.missiles = missiles;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getMissiles() {
        return missiles;
    }

    public void setMissiles(int missiles) {
        this.missiles = missiles;
    }



    @Override
    public String toString() {
        return super.toString() +
                ", ejectionSystem=" + isEjectionSystem() +
                ", missiles=" +getMissiles()+
                +'}';
    }
    public void shot(){
        while (getMissiles()!=0){
                System.out.println("Ракета пошла");
                missiles--;
        }
        System.out.println("Боеприпасы отсутствуют");
    }
     public  void isHasEjectionSystem(){
        if (isEjectionSystem()){
            System.out.println("Катапультирование прошло успешно");
        }else {
            System.out.println("У вас нет такой системы");
        }
     }
}
