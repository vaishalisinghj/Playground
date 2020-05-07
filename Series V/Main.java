#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  //11,15,19
  int n;
  cin>>n;
  int i=11;
  
  while(n)
  {
    int sq=i*i;
    cout<<sq<<" ";
    i=i+4;
    
  
 n--;
  }
}