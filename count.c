#include<stdio.h>
#include<conio.h>
void main()
{
 int i,n,count=0,r;
 printf("\n enter the value:");
 scanf("%d",&n);
 while(n!=0)
 {
  r=n%10;
  n=n/10;
  count++;
  }
  printf("\n count is:%d",count);
  getch();
  return 0;
  }
