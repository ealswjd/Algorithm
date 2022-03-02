package programmers;

// Summer/Winter Coding(~2018) > 점프와 순간 이동
public class JumpAndTeleport {
	
	public static int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
        	if(n%2 == 0) n /= 2;
        	else {
        		n -= 1;
        		answer++;
        	}
        }

        return answer;
    }

}//class
