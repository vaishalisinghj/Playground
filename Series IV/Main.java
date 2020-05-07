#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int x=0;
    for(int i=1;i<=n;i++)
      if(i%2!=0)
      {
        x=1;
      cout<<i*i-x<<" "; 
      }
    else
    {
     x=2;
      cout<<i*i-x<<" "; 
    }
}
