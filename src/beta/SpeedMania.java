package beta;


/**
 * Created by ronald on 23/10/16.
 */
public class SpeedMania {
    public static void main(String[] args) {

        Racer racer = Racer.BMW;
        //System.out.println(Racer.BMW);


        for (Racer bikes : Racer.values()) {
            System.out.println("Motorbike kw: " + bikes.getMaxspeed());
            // try using bikes.maxspeed. This won't compile, because maxspeed is set private
            // only way to bypass this, is via a getter -> encapsulation at it's best!!
            System.out.println("Motorbike name: " + bikes.name());
        }
    }
}
