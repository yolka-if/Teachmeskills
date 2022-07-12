public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(4,6,76,"Легковой", 4,45,"Test", 4);
        System.out.println( passenger.toString());
        passenger.method1(3);
        Freight freight = new Freight(34, 100,54,"Грузовик",5,90,100);
        freight.cargoСapacity(90);
        Military military = new Military(5,80,75,"Военный самолёт", 45,55,false,5);
        military.shot();
        military.isHasEjectionSystem();
        Civil civil = new Civil(3,4,4,"Пассажирский самолёт",7,5,50, true);
        civil.passengerСapacity(50);
        System.out.println(civil.toString());

    }
}
