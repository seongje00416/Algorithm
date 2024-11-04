package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1399 {
    public static void main( String[] args ){
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        try{
            int persons = Integer.parseInt( br.readLine() );
            StringTokenizer tokenizer = new StringTokenizer( br.readLine(), " " );
            List<Integer> times = new ArrayList<Integer>();
            while( tokenizer.hasMoreTokens() ) times.add( Integer.parseInt( tokenizer.nextToken() ) );
            Collections.sort( times );
            int result = 0;
            for( int i = 0; i < times.size(); i++ ) for( int j = 0; j <= i; j++ ) result += times.get( j );
            System.out.println( result );
        } catch ( IOException e ){ System.out.println( "IO ERROR" ); }
    }
}
