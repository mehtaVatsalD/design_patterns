/**
 * Imagine you have very heavy and bulky object that we need to copy.
 * <br/>
 * At time of cloning we may not be aware of concrete implementation.
 * <br/>
 * Like {@link LightWeight} in this example. We will not be sure whether {@link ConcreteLightWeightA} or {@link ConcreteLightWeightB} object will be present in this reference of {@link #lightWeight} field.
 * <br/>
 * Also, there might be cases where constructing a value of some field might be compute instensive task(not in given example)
 * <br/>
 * Hence, need some way to provide cloning mechanism.
 * <br/>
 * Hence, all class that supports cloning implements {@link Prototype} interface.
 * <br/> <strong>To sum up, if object creation is lengthy and expensive process due to any reason then this PROTOTYPE pattern can be used.</strong>
 */
public class HeavyWeight implements Prototype {

    private final LightWeight lightWeight;

    public HeavyWeight(LightWeight lightWeight) {
        this.lightWeight = lightWeight;
    }

    /**
     * This is the constructor that will be used by {@link #clone()} method.
     * If this constructor is expensive to call then {@link #clone()} method should implement cloning separately.
     * @param heavyWeight object to be cloned
     * Here reason for cloning lightWeight object is to make deep copy of heavyObject.
     */
    public HeavyWeight(HeavyWeight heavyWeight) {
        this(heavyWeight.lightWeight.clone());
    }

    @Override
    public HeavyWeight clone() {
        return new HeavyWeight(this);
    }

    public LightWeight getLightWeight() {
        return lightWeight;
    }

    @Override
    public String toString() {
        return "HeavyWeight{" +
                "lightWeight=" + lightWeight +
                '}';
    }
}
