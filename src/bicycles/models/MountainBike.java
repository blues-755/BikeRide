package bicycles.models;

public class MountainBike extends BicycleBase {

    @Override
    public void accelerate() {
        changeSpeed(5);
    }

    @Override
    public void brake() {
        changeSpeed(-3);

    }

    @Override
    public BicycleType bicycles() {
        return BicycleType.MountainBike;
    }
}
