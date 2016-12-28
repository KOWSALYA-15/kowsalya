#include<iostream>
using namespace std;
int main()
{
 int fact=1,i,n;
 cout<<"\n enter the number:";
 cin>>n;
 for(i=1;i<=n;i++)
 {
  fact=fact*i;
 }
 cout<<"\n factorial is:"<<fact;
 return 0;
}
