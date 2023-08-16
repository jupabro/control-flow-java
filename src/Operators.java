public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));        // Addition: 15
        System.out.println("Subtraction: " + (a - b));     // Subtraction: 5
        System.out.println("Multiplication: " + (a * b));  // Multiplication: 50
        System.out.println("Division: " + (a / b));        // Division: 2
        System.out.println("Modulus: " + (a % b));         // Modulus: 0
        int x = 10, y = 15;
        System.out.println("Equal: " + (x == y));          // Equal: true
        System.out.println("Not Equal: " + (x != y));      // Not Equal: true
        System.out.println("Greater Than: " + (x > y));    // Greater Than: false
        System.out.println("Less Than: " + (x < y));       // Less Than: true
        System.out.println("Greater Than or Equal: " + (x >= y)); // Greater Than or Equal: false
        System.out.println("Less Than or Equal: " + (x <= y));    // Less Than or Equal: true
        boolean p = true, q = false;
        System.out.println("Logical AND: " + (p && q));   // Logical AND: false
        System.out.println("Logical OR: " + (p || q));    // Logical OR: true
        System.out.println("Logical NOT (p): " + !p);     // Logical NOT (p): false
        System.out.println("Logical NOT (q): " + !q);     // Logical NOT (q): true
        int num = 5;
        num += 3; // Equivalent to: num = num + 3
        System.out.println("Value after +=: " + num);    // Value after +=: 8
        int count = 10;
        System.out.println("Initial count: " + count);   // Initial count: 10
        System.out.println("Post-increment: " + (count++)); // Post-increment: 10
        System.out.println("Value after post-increment: " + count); // Value after post-increment: 11
        System.out.println("Pre-increment: " + (++count));  // Pre-increment: 12
        System.out.println("Value after pre-increment: " + count); // Value after pre-increment: 12
    }
}
