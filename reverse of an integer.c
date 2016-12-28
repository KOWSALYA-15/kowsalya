#include<stdio.h>
#include<conio.h>
int main()
{
 int n,rev=0;
 printf("\n enter the number:");
 scanf("%d",&n);
 while(n!=0)
 {
  rev=rev*10;
  rev=rev+n%10;
  n=n/10;
 }
 printf("\n reverse of the number is:%d",rev);
 getch();
 return 0;
}
