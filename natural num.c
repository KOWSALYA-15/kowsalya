#include<stdio.h>
#include<conio.h>
void main()
{
 int i=0,sum=0,n;
 printf("\n enter the value:");
 scanf("%d",&n);
 for(i=0;i<=n;i++)
 {
  sum=sum+i;
 }
  printf("\n sum:%d",sum);
  getch();
}
