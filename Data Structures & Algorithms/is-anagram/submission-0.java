class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> strS = new HashMap<>();
        HashMap<String, Integer> strT = new HashMap<>();

        for(String i: s.split("")){
            if(strS.get(i)!= null){
                int count = strS.get(i);
                strS.put(i,count+1);
            }
            else{
                strS.put(i,1);
            }
        }

        for(String i: t.split("")){
            if(strT.get(i)!= null){
                int count = strT.get(i);
                strT.put(i,count+1);
            }
            else{
                strT.put(i,1);
            }
        }

        return strS.equals(strT);
    }
}
