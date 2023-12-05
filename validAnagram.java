class validAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))){
                int value = charMap.get(s.charAt(i));
                charMap.put(s.charAt(i), (value + 1));
            } else {
                charMap.put(s.charAt(i), 1);
            }
        }
        for (int j = 0 ; j < t.length(); j++) {
            if (charMap.containsKey(t.charAt(j))){
                int value = charMap.get(t.charAt(j));
                if (value > 1) {
                charMap.put(t.charAt(j), value - 1);
                } else {
                    charMap.remove(t.charAt(j));
                }
            } else {
                return false;
            }
        }
        if (charMap.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

// Time Complexity: O(n), time complexity is O(n) because accessing the counter table is a constant time operation.

// Space complexity: O(1), although we do use extra space, the space complexity is O(1) because the table's size stays constant no matter how large n is.