#include<stdio.h>
#include<conio.h>
void main()
{
 int i,sum=0,n;
 printf("\n enter the value:");
 scanf("%d",&n);
 for(i=1;i<=n;i++)
 {
  sum=sum+i;
 }
  printf("\n sum is: %d",sum);
  getch();
}
