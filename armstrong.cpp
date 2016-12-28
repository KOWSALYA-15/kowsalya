#include <iostream>
using namespace std;
int main()
{
  int originalnum,num,sum = 0,digit;
  cout<<"Enter a positive  integer: ";
  cin >> originalnum;
  num = originalnum;
  while(num != 0)
  {
      digit = num % 10;
      sum += digit * digit * digit;
      num /= 10;
  }
  if(sum == originalnum)
    cout<<originalnum<<"is an Armstrong number";
  else
    cout<<originalnum<<"is not an Armstrong number";
  return 0;
}
