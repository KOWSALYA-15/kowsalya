#include<stdio.h>
#include<conio.h>
int main()
{
 int a;
 printf("\n enter any year:");
 scanf("%d",&a);
 if(a%4==0)
 printf("\n leap year");
 else
 printf("\n not a leap year");
 getch();
 return 0;
}
