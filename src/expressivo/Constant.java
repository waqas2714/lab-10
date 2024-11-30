package expressivo;

public class Constant implements Expression {
    private final double value;

    public Constant(double value) {
        this.value = value;
    }

    // Converts the constant to a string representation (the numeric value as a string).
    @Override
    public String toString() {
        return Double.toString(value);
    }

    // Checks if this constant is equal to another object.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        // If the object is null or not an instance of Constant, they're not equal.
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // Cast the object to a Constant and compare the values for equality.
        Constant constant = (Constant) obj;
        return Double.compare(constant.value, value) == 0;
    }

    // Generates a hash code based on the constant's value.
    @Override
    public int hashCode() {
        // Return the hash code for the value using Double's hashCode method.
        return Double.hashCode(value);
    }
}
