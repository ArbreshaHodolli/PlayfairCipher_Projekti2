package EncriptionDecription;
import java.util.Scanner;
public class Enkriptimi{
static void encrypt(String pt, String key) {
char[] pt_arr=pt.toCharArray();
char[] key_arr=key.toCharArray();
char[] 
alpha={'A','B','C','D','E','F','G','H','I','K','L',
'M',
'N','O','P','Q','R','S','T','U','V','W','X','Y'
,'Z'};
char[][] table=new char[5][5];
char[] encpt_arr = new char[100];
int encpt_arr_ctr=0;
int ctr=-1;
for(int i=0;i<key_arr.length;i++)
for(int j=0;j<25;j++)
if(key_arr[i]==alpha[j])
{
ctr++;
int round = ctr/5;
table[round][ctr%5]=alpha[j];
alpha[j]='0';
break;
}
for(int i=0;i<alpha.length;i++)
{
if(alpha[i]!='0')
{
ctr++;
int round = ctr/5;
table[round][ctr%5]=alpha[i];
}
}
char[] any=new char[100];
int c=0;
for(int i=0;i<pt_arr.length;i++)
{
if(i==0 && pt_arr[i]!=pt_arr[i+1] && i+1<pt_arr.length)
{
any[c++]=pt_arr[i];
continue;
}
if(i==1 && pt_arr[i]!=pt_arr[i+1] && i+1<pt_arr.length)
{
any[c++]=pt_arr[i];
continue;
}