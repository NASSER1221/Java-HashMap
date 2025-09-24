import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    /**
     * TO-DO: Invert the given map.
     * The keys of the original map should become the values of the new map,
     * and the values should become the keys.
     \*
     * @param studentIdToName A map from student ID (Integer) to student name (String).
     * @return A new map from student name (String) to student ID (Integer).
     */
    public Map<String, Integer> invertMap(Map<Integer, String> studentIdToName) {
        Map<String, Integer> nameToStudentId = new HashMap<>();

        for ( Map.Entry<Integer, String> students:studentIdToName.entrySet()){

            nameToStudentId.put(students.getValue(),students.getKey());
        }

        return nameToStudentId; // Placeholder


    }


}
