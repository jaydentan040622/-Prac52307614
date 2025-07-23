public class Student {
    String name;
    
    int RE;
    int SDA;
    int SQAT;
    int SEAM;
    int FM;

    // Method to get the average mark (divide by 5 subjects)
    double getAverageMark() {
        return (RE + SDA + SQAT + SEAM + FM) / 5.0;
    }

    // Method to get the total marks
    int getTotal() {
        return (RE + SDA + SQAT + SEAM + FM);
    }

    // Display method for testing (optional)
    void testDisplay() {
        System.out.println("Testing...");
    }

    // Method to display a generic "Hello" message (optional)
    void testAll() {
        System.out.println("Hello");
    }

    // Method to display all marks
    void displayMarks() {
        System.out.println(RE);
        System.out.println(SDA);
        System.out.println(SQAT);
        System.out.println(SEAM);
        System.out.println(FM);
    }
}


public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student();
        
        // Set some marks for the student
        student.RE = 80;
        student.SDA = 90;
        student.SQAT = 85;
        student.SEAM = 92;
        student.FM = 88;

        // Print individual marks
        System.out.println("Marks for the student:");
        student.displayMarks();

        // Calculate and print the total marks
        int totalMarks = student.getTotal();
        System.out.println("Total Marks: " + totalMarks);

        // Calculate and print the average marks
        double averageMarks = student.getAverageMark();
        System.out.println("Average Marks: " + averageMarks);
        
        // Test the testDisplay() method
        student.testDisplay();
        
        // Test the testAll() method
        student.testAll();
    }
}
