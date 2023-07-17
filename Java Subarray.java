public class Solution {


public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int [] A = new int[n];
for (int i = 0; i < n; i++){
A[i] = scan.nextInt();
}
scan.close();
int count = 0;
for (int i=0; i < A.length; i++)
{
for (int j=i; j < A.length; j++)
{
if (A[i] < 0 || A[i] + A[j] < 0){
count++;
}
}
}
System.out.print(count);
}
}
