import java.util.Scanner;
class Main{
public static void main(String args[]){
int i,j;
Scanner scan=new Scanner(System.in);

int rows=scan.nextInt();
String s[] = new String[rows/2+1];
for(i=0; i<=rows/2; i++){
  String s1 = "";
    for(j=0; j<=rows/2-i; j++){
       System.out.print("* ");
       s1 += "* ";
    }  
    if(i!=0){
      for(j=0; j<2*i-1; j++){
        System.out.print("  ");
        s1 += "  ";
     }
    }
    if(i!=rows/2)
    for(j=0;j<(rows-i)/2;j++){
      System.out.print("* ");
      s1 += "* ";
    }
    else{
      System.out.print("* ");
      s1 += "* ";
    }
    System.out.println();
    s[i] = s1;
}
for(i=rows/2-1;i>=0;i--){
  System.out.println(s[i]);
}
    }
    }
