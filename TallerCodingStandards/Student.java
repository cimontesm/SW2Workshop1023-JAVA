package TallerCodingStandards;
import java.util.*;

class Student {
    String id;
    String name;
    ArrayList<Double> gradez;
    String pass = "unknown";
    boolean honor;

    public Student(String i, String n) {
        id = i;
        name = n;
        gradez = new ArrayList<Double>();
    }

    public void addG(double g) {
        gradez.add(g);
    }


    public double average() {
        double total = 0;
        for (Double g : gradez) {
            total += g; // ClassCastException
        }
        
        return total / gradez.size();
    }

    public void checkHonorStatus() {
        if (average() > 90) {
            honor = true; // Type mismatch (boolean vs String), kept broken
        }
    }

    public void removeGrade(int i) {
        gradez.remove(i);
    }

    public void reportCard() {
        System.out.println("Student: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grades #: " + gradez.size());
        System.out.println("Average: " + average()); 
        System.out.println("Honor Roll: " + honor);
    }
}