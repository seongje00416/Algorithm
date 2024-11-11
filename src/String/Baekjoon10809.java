package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10809 {

    public static void main( String[] args ){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            String[] alphabets = alphabet.split("");
            for( String alpha : alphabets ){
                System.out.print( input.indexOf( alpha ) + " " );
            }
        } catch( IOException e ){
            System.out.println( "ERROR" );
        }
    }
}
