class Solution {
    public boolean (String s) {
        StringBuilder sb=new StringBuilder();

        for(int i =0;i<s.length();i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)>='0' && s.charAt(i)<='9'))
             sb.append(s.charAt(i));
        }

        String cleaned = sb.toString().toLowerCase();

        int low=0;
        int high=cleaned.length() - 1;

        while (low < high) {
            if (cleaned.charAt(low) != cleaned.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
