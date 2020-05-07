#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int i=11;
  
  while(n)
  {
    cout<<pow(i,2)<<" ";
    i=i+4;
  	 n--;
  }
  


}