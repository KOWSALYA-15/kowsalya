#include<stdio.h>
#include<conio.h>
int main()
{
 char ch;
 printf("enter any character \n");
 scanf("%c",&ch);
 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    printf("\n is a vowel");
 else
    printf("\n is a consonant");
 getch();
 return 0;
}
