#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int i=0;
  do
  {
    i++;
    n=n/10;
  
  }while(n);
  cout<<i;
}