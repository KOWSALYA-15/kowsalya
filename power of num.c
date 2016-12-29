#include<stdio.h>
#include<conio.h>
void main()
{
 int m,n,i=1,sum=1;
 printf("\n enter the number:");
 scanf("%d",&n);
 printf("\n enter the power:");
 scanf("%d",&m);
 while(i<=m)
 {
  sum=sum*n;
  i++;
 }
 printf("\n the power is:%d",sum);
 getch();
}
