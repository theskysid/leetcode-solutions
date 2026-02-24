// Problem: group-anagrams
// URL: https://leetcode.com/problems/group-anagrams/
// Language: java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String val = new String(arr);
            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
