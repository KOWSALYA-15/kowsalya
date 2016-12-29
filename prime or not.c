#include<stdio.h>
#include<conio.h>
int main(){
 int num,i,count=0;
 printf("\nEnter a number:");
 scanf("%d",&num);
 for(i=2;i<=num/2;i++)
 {
   if(num%i==0)
       {
         count++;
         break;
        }
      }
   if(count==0&&num!= 1)
     printf("\n %d is a prime number",num);
   else
     printf("\n%d is not a prime number",num);
     getch();
     return 0;
}
