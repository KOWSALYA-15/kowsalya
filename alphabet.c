#include<stdio.h>
#include<conio.h>
int main()
{
 char c;
 printf("\n enter the alphabet:");
 scanf("%c",&c);
 if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
 {
  printf("\n alphabet");
 }
 else
 {
  printf("\n not a alphabet");
 }
 getch();
 return 0;
}
