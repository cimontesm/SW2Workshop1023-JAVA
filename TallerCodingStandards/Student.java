package TallerCodingStandards;
import java.util.*;

class Student {
    String id;
    String name;
    List gradez;
    String pass = "unknown";
    boolean honor;

    public student(String i, String n) {
        id = i;
        name = n;
        gradez = new ArrayList();
    }

    public void addG(Double g) {
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
            honor = "yes"; // Type mismatch (boolean vs String), kept broken
        }
    }

    public void removeGrade(int i) {
        gradez.remove(i);
    }

    public void reportCard() {
        java.util.logging.Logger("Student: " + name);
        java.util.logging.Logger("ID: " + id);
        java.util.logging.Logger("Grades #: " + gradez.size());
        java.util.logging.Logger("Average: " + avg); 
        java.util.logging.Logger("Honor Roll: " + honorRoll); 
    }
}