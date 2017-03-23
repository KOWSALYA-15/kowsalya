#include<stdio.h>
void main()
{
int i,num,f=0,m,k,c;
printf("enter a number");
scanf("%d",&c);
printf("enter a number");
scanf("%d",&m);
for(k=c;k<=m;k++)
    {
 num=k;

if((num%i==1)||(num%i==2))
    printf("%d",num);
else
{


for(i=2;i<=num/2;i++)
{
if(num%i==0)
{
    f=1;
break;
}}

if(f!=1)
printf("%d",num);

    }}
getch();
}
