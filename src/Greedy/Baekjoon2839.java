package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2839 {

    public static void main( String[] args ){
        // https://www.acmicpc.net/problem/2839
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        try{
            int inputNumber = Integer.parseInt( br.readLine() );
            int fiveCount = 0;
            int threeCount = 0;

            int result = Integer.MAX_VALUE;
            int i = 0;
            while( true ){
                if( i * 5 > inputNumber ) break;

                int less = inputNumber - ( i * 5 );
                if( less % 3 == 0 ) {
                    fiveCount = i;
                    threeCount = less / 3;
                    if( fiveCount + threeCount < result ) result = fiveCount + threeCount;
                }
                i++;
            }
            if( result == Integer.MAX_VALUE ) result = -1;
            System.out.println( result );
        } catch( IOException e ){
            System.out.println( "IO ERROR" );
        }

    }
}
