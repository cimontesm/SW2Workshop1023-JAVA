package TallerCodingStandards;
import java.util.*;

class Student {
    String id;
    String name;
    ArrayList<Double> gradez;
    String pass = "unknown";
    boolean honor;

    public Student(String name, String id) {
        if(name == null || id == null){
            System.out.println("Nombre o Id invalidos");
            return;
        }
        this.name = name;
        this.id = id;
        gradez = new ArrayList<Double>();
    }

    public void addG(double grade) {
        if (grade < 0 || grade > 100){
            System.out.println("La nota debe estar entre 0 y 100");
            return;
        }
        gradez.add(grade);
    }


    public double average() {
        double total = 0;
        for (Double grade : gradez) {
            total += grade; // ClassCastException
        }
        
        return total / gradez.size();
    }

    public char getLetterGrade(){
        double avg = this.average();
        if(avg >= 90){
            return 'A';
        } else if (avg >= 80 || avg < 90){
            return 'B';
        } else if (avg >= 70 || avg < 80){
            return 'C';
        } else if (avg >= 60 || avg < 70){
            return 'D';
        }else{
            return 'F';
        }
    }

    public void detPass(){
        if(this.average() > 60){
            this.pass = "Passed";
        } else{
            this.pass = "Failed";
        }
    }

    public void checkHonorStatus() {
        if (average() > 90) {
            honor = true; // Type mismatch (boolean vs String), kept broken
        }
    }

    public void removeGradeByValue(int grade) {
    if (grade < 0 || grade > 100) {
        System.out.println("Grade should be between 0 and 100");
        return;
    }
    
    
    Double gradeObj = Double.valueOf(grade);
    
    if (gradez.contains(gradeObj)) {
        gradez.remove(gradeObj); 
        System.out.println("Grade removed successfully");
    } else {
        System.out.println("Grade not found");
    }
}

    public void removeGradeByIndex(int i) {
        if(i < 0){
            System.out.println("Index should be positive");
            return;
        }
        if(i > (gradez.size()-1)){
            System.out.println("Index out of bounds");
            return;
        }
        gradez.remove(i);
        System.out.println("Grade at index " + i + " successfully removed");
    }

    public void reportCard() {
        System.out.println("ID: " + id);
        System.out.println("Student: " + name);
        System.out.println("Grades #: " + gradez.size());
        System.out.println("Average: " + average());
        System.out.println("Letter grade: " + getLetterGrade());
        System.out.println("Student Pass/Fail: " + pass); 
        System.out.println("Honor Roll: " + honor);
    }
}