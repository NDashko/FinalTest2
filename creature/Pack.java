package creature;

public abstract class Pack extends Animal{

    private int liftingCapacity;

    public Pack(String name, String birth, int liftingCapacity, String... commands) {
        super(name, birth, commands);
        this.liftingCapacity = liftingCapacity;
    }

   public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "; lifting Capacity:" + getLiftingCapacity() + " kg";
    }
}