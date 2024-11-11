package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baekjoon1920 {
    //https://www.acmicpc.net/problem/1920
    public static void main( String[] args ){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int nCount = Integer.parseInt( br.readLine() );
            String nInput = br.readLine();
            String[] nSplit = nInput.split(" " );
            int[] nArray = new int[nCount];
            for( int i = 0; i < nCount; i++ ) nArray[i] = Integer.parseInt( nSplit[i] );
            Arrays.sort( nArray );

            int mCount = Integer.parseInt( br.readLine() );
            String mInput = br.readLine();
            String[] mSplit = mInput.split(" ");
            int[] mArray = new int[mCount];
            for( int i = 0; i < mCount; i++ ) mArray[i] = Integer.parseInt( mSplit[i] );

            List<Integer> result = new ArrayList<Integer>();
            for( Integer m : mArray ){
                int start = 0;
                int end = nCount - 1;
                while( true ){
                    int mid = ( start + end ) / 2;
                    if( nArray[mid] < m ){

                    }
                }
            }
        } catch( IOException e ){
            System.out.println( "ERROR" );
        }
    }
}
