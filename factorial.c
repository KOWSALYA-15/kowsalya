#include<stdio.h>
#include<conio.h>
void main()
{
 int fact=1,i,n;
 printf("\n enter the number:");
 scanf("%d",&n);
 for(i=1;i<=n;i++)
{
 fact=fact*i;
}
printf("factorial of %d",fact);
getch();
}
