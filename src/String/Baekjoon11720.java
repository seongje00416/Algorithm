package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11720 {
    // https://www.acmicpc.net/problem/1152
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        try{
            String input = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(input, " " );
            System.out.println( tokenizer.countTokens() );
        } catch ( IOException e ){
            System.out.println( "ERROR" );
        }
    }
}
