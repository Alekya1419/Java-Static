package Static;

public class CallMethodsInMain {
    
    // ✅ Static method
    static void staticMethod() {
        System.out.println("Static Method Called");
    }

    // ✅ Instance method
    void instanceMethod() {
        System.out.println("Instance Method Called");
    }

    // ✅ Main method
    public static void main(String[] args) {
        // Creating an object to call instance methods
        CallMethodsInMain obj = new CallMethodsInMain();
        
        // Calling static method
        staticMethod();
        
        // Calling instance method using object
        obj.instanceMethod();
    }
}
