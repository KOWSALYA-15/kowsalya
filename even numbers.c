#include<stdio.h>
#include<conio.h>
void main()
{
 int i,n,m;
 printf("\n enter any number m and n:");
 scanf("%d %d",&n,&m);
 for(i=n;i<m;i++)
 {
 if(i%2==0)
    printf("\n even number is:%d",i);
    }
 getch();
}
