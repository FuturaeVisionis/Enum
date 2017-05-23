package beta;


/**
 * Created by ronald on 23/10/16.
 */
public enum Racer {
    Yamaha(120), Kawasaki(140), KTM(130), Suzuki(166), BMW(155);


    private int maxspeed;

    Racer(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    @Override
    public String toString() {
        return "This bike has a maximum speed of " + maxspeed;
    }
}
