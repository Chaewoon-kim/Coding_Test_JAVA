class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0 ; i < my_string.length(); i++){
            char ret = my_string.charAt(i);
            if(Character.isUpperCase(ret)){
                answer += Character.toLowerCase(ret);
            }else{
                answer += Character.toUpperCase(ret);
            }
        }
        return answer;
    }
}