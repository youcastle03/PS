import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();
        
        int len = s.length();
        int rows = (int) Math.ceil((double) len / n);
        char[][] arr = new char[rows][n];
        
        for (int i = 0; i < len; i++) {
            arr[i / n][i % n] = s.charAt(i);
        }
        
        for (int i = 0; i < rows; i++) {
            if (i % 2 != 0) {
                reverseArray(arr[i]);
            }
        }
        
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < rows; i++) {
                if (arr[i][j] != '\0') {
                    res.append(arr[i][j]);
                }
            }
        }
        
        System.out.println(res.toString());
    }
    
    private static void reverseArray(char[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}