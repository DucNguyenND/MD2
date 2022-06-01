package RacingCar;

import Main.Main;

public class Car implements Runnable{
    int number;
    public Car(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            i+= Math.random()*100;
            if (i>=100){
                System.out.println("Xe "+number+" Win ");
                System.exit(1);
            }

        }

    }
}
