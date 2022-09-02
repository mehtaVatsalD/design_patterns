/**
 * All classes supporting cloning should implement this method.
 * Alternatively {@link Cloneable} can also be used.
 */
public interface Prototype {

    Prototype clone();

}
