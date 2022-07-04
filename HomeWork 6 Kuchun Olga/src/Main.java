public class Main {
    public static void main(String[] args) {
        Computer computer= new Computer("ее" ,12,12,5);
        //computer.turnOn(computer.resource);
        for (int i = 0; i < computer.resource; i++){
            if (computer.turnOn1()&&computer.turnOff()){
                continue;
            } else {
                break;
            }
         }
    }
}
