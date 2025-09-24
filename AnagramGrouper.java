import java.util.*;


public class AnagramGrouper {

    /**
     * TO-DO: Group anagrams from the given array of strings.
     \*
     * @param strs An array of strings.
     * @return A List of Lists, where each inner list contains a group of anagrams.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> anagramMap = new HashMap<>();
        // Your code here:
        // Iterate through each string in 'strs'.
        // For each string, convert it to a char array, sort the array, and convert it back to a string.
        // This sorted string is your map key.
        // Use map.computeIfAbsent(key, k -> new ArrayList<>()).add(originalString) to add the original string to the list.
        List<String> sorted = new ArrayList<>();
        for(String string:strs){

            char[] iterated =string.toCharArray();
            Arrays.sort(iterated);
            StringBuilder sortedByOne= new StringBuilder();
            sortedByOne.append(iterated);
            sorted.add(Arrays.toString(iterated));

        }

        for (int i = 0; i <sorted.size() ; i++) {

            anagramMap.computeIfAbsent(sorted.get(i),k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(anagramMap.values());
    }


}
