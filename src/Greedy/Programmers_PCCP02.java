package Greedy;

import com.sun.tools.javac.Main;

public class Programmers_PCCP02 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/340212
    
    // 로직 통과
    // 시간 복잡도 문제 해결 필요
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int level = 1;
        int time_prev = 0;
        long used_time = 0;
        boolean isResult = false;

        while( !isResult ){
            for( int i = 0; i < diffs.length; i++ ){
                int time_cur = times[i];
                int diff = diffs[i];

                if( diff <= level ){
                    used_time += time_cur;
                }
                else {
                    used_time = (long) (diff - level) * ( time_prev + time_cur ) + time_cur + used_time;
                }
                time_prev = time_cur;
            }
            if( used_time < limit ){
                isResult = true;
            }
            else if( used_time == limit ) {
                isResult = true;
            }
            else {
                used_time = 0;
                time_prev = 0;
                level++;
            }
        }
        answer = level;
        return answer;
    }

    public static void main( String[] args ){
        int[] diffs = { 1, 99999, 100000, 99995 };
        int[] times = { 9999, 9001, 9999, 9001 };
        long limit = 3456789012L;

        Programmers_PCCP02 main = new Programmers_PCCP02();
        System.out.println( main.solution( diffs, times, limit ) );
    }
}
