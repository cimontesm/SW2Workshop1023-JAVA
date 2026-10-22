package TallerCodingStandards;
import java.util.*;

public class Main {
 public static void main(String[] args){
 student s = new student("abc", null);
 s.AddG(100);
 s.AddG("Ninety");
 s.average();
 s.checkHonorStatus();
 s.removeGrade(9);
 s.reportCard();
 }
}
