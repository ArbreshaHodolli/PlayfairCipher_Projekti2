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
        for (int i = 0; i < key_arr.length; i++)
            for (int j = 0; j < 25; j++)
                if (key_arr[i] == alpha[j]) {
                    ctr++;
                    int round = ctr / 5;
                    table[round][ctr % 5] = alpha[j];
                    alpha[j] = '0';
                    break;
                }
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != '0') {
                ctr++;
                int round = ctr / 5;
                table[round][ctr % 5] = alpha[i];
            }
        }
        
