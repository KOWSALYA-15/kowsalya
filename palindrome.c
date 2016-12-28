#include<stdio.h>
#include<conio.h>
void main()
{
 int a,b,c,sum=0;
 printf("\n enter the number:");
 scanf("%d",&a);
 c=a;
 while(a)
 {
  b=a%10;
  a=a/10;
  sum=sum*10+b;
 }
 if(c==sum)
    printf("\n %d is a palindrome",c);
 else
    printf("\n %d is not a palindrome");
 getch();
}
