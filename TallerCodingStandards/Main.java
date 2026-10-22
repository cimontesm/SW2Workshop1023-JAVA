package TallerCodingStandards;

public class Main {
 public static void main(String[] args){
 Student s = new Student("abc", null);
 s.addG(100);
 s.addG(90);
 s.average();
 s.checkHonorStatus();
 s.removeGrade(9);
 s.reportCard();
 }
}
