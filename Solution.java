class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        Map<String,Integer> inp = new HashMap<>();
        for(int i=0; i<str1.length; i++){
            inp.put(str1[i], inp.getOrDefault(str1[i],0)+1);
        }

        for(int i=0; i<str2.length; i++){
            inp.put(str2[i], inp.getOrDefault(str2[i],0)+1);
        }

        List<String> temp = new ArrayList<>();

        for(String key : inp.keySet()){
            if(inp.get(key) == 1){
                temp.add(key);
            }
        }

        String[] list = new String[temp.size()];
        for(int i=0; i<list.length; i++){
            list[i] = temp.get(i);
        }
        return list;
        
    }
}
