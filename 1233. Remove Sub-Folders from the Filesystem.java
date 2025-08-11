import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();
        String parentFolder = null;
        for (String f : folder) {
            if (parentFolder == null || !f.startsWith(parentFolder + "/")) {
                result.add(f);
                parentFolder = f;
            }
        }
        return result;
    }
}
