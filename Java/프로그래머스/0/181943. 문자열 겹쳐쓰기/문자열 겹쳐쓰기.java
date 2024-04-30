class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

        String result = my_string.substring(0,s)/*0번째 부터 s-1번째 인덱스까지 출력*/
                + overwrite_string/*해당 문자열을 이어붙임*/
                + my_string.substring( s + overwrite_string.length())
                /*s번째 이후 인덱스에 overwrtie문자열 길이 만큼을 더한 부분부터 my_string 문자열의 끝 부분까지 출력*/ ;

        String answer = result;
        return answer;
    }
}