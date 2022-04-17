package Projekti_5G;
import java.util.Scanner;

public class Dekriptimi {

    static void decrypt(String encpt, String key) {
        char[] encpt_arr = encpt.toCharArray();
        char[] key_arr = key.toCharArray();
        char[]
                alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X'
                , 'Y', 'Z'};
        char[][] table = new char[5][5];
        int ctr = -1;
        
