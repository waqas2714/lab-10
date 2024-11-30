package expressivo;

public class Multiplication implements Expression {
    private final Expression left;
    private final Expression right;

    // Constructor to initialize the multiplication with the left and right expressions.
    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Converts the multiplication to a string representation, formatting as "left * right".
    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }

    // Checks if this multiplication is equal to another object.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        // If the object is null or not an instance of Multiplication, they're not equal.
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // Cast the object to a Multiplication and compare the left and right expressions.
        Multiplication multiplication = (Multiplication) obj;
        return left.equals(multiplication.left) && right.equals(multiplication.right);
    }

    // Generates a hash code based on the left and right expressions.
    @Override
    public int hashCode() {
        // Combine the hash codes of left and right expressions using a prime multiplier (31).
        return 31 * left.hashCode() + right.hashCode();
    }
}
