#include<iostream>
using namespace std;
int main()
{

  int n;
  cin>>n;
  int i=6;
  int j=1;
  while(n)
  {
    cout<<i<<" ";
    i=i+(5*j);
    j++;
  
  n--;
  }

}