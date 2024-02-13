package collections.grades;

import java.util.HashMap;
import java.util.Map;

import static collections.grades.TestResults.getMakeUpGrades;
import static collections.grades.TestResults.getOriginalGrades;

public class Main {
    Map<String, Integer> originalGrades = getOriginalGrades();
    Map<String, Integer> makeupGrades = getMakeUpGrades();

}
