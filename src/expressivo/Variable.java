package expressivo;

public class Variable implements Expression {
    private final String name;

    // Constructor to initialize the variable with its name.
    public Variable(String name) {
        this.name = name;
    }

    // Converts the variable to a string representation (just returns its name).
    @Override
    public String toString() {
        return name;
    }

    // Checks if this variable is equal to another object.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        // If the object is null or not an instance of Variable, they're not equal.
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // Cast the object to a Variable and compare the names for equality.
        Variable variable = (Variable) obj;
        return name.equals(variable.name);
    }

    // Generates a hash code based on the variable's name.
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
