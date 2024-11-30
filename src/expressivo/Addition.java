package expressivo;


public class Addition implements Expression {
    private final Expression left;
    private final Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Converts the addition to a string representation, formatting as "left + right".
    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }

    // Checks if this addition is equal to another object.
    @Override
    public boolean equals(Object obj) {
        // If the two objects are the same instance, they're equal.
        if (this == obj) return true;
        // If the object is null or not an instance of Addition, they're not equal.
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // Cast the object to an Addition and compare the left and right expressions.
        Addition addition = (Addition) obj;
        return left.equals(addition.left) && right.equals(addition.right);
    }

    // Generates a hash code based on the left and right expressions.
    @Override
    public int hashCode() {
        // Combine the hash codes of left and right expressions using a prime multiplier (31).
        return 31 * left.hashCode() + right.hashCode();
    }
}
