package TallerCodingStandards;

public class Main {
 public static void main(String[] args){
 Student s = new Student("Student", "1");
 s.addG(100);
 s.addG(90);
 s.average();
 s.checkHonorStatus();
 s.removeGradeByValue(9);
 s.reportCard();
 }
}
