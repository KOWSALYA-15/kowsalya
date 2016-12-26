#include<stdio.h>
#include<conio.h>
int main()
{
 int a,b,c;
 printf("\n enter the value of a:");
 scanf("%d",&a);
 printf("\n enter the value of b:");
 scanf("%d",&b);
 printf("\n enter the value of c:");
 scanf("%d",&c);
 if((a>b)&&(a>c)){
    printf("\n a is greater");
 }
 else if(b>c){
   printf("\n b is greater");
 }
 else{
   printf("\n c is greater");
 }
 getch();
 return 0;
}
