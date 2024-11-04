package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11047 {
    // https://www.acmicpc.net/problem/11047
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            StringTokenizer tokenizer = new StringTokenizer( br.readLine(), " ");
            int coinTypeCount = Integer.parseInt( tokenizer.nextToken() );
            int goalPrice = Integer.parseInt( tokenizer.nextToken() );
            int[] coinTypes = new int[coinTypeCount];
            for( int i = 0; i < coinTypeCount; i++ ) coinTypes[i] = Integer.parseInt( br.readLine() );
            int maxUseIndex = 0;
            for( int i = 0; i < coinTypeCount; i++ ){
                if( coinTypes[i] > goalPrice ) {
                    maxUseIndex = i;
                    break;
                }
            }
            int coinCount = 0;
            for( int coin = maxUseIndex; coin >= 0; coin-- ){
                coinCount = coinCount + ( goalPrice / coinTypes[coin] );
                goalPrice = goalPrice % coinTypes[coin];

                if( goalPrice == 0 ) break;
            }
            System.out.println( coinCount );
        } catch( IOException e ){System.out.println( "ERROR" );}
    }
}
