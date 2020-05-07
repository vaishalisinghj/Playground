#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s;
  cin>>s;
   int x;
  
  if(s==1 || s==2)
    cout<<"1";
  else if(s==0)
    cout<<"0";
  else
  {
  int t1=0,t2=1;
    for(int i=2;i<s;i++)
    {
    x=t1+t2;
    t1=t2;
    t2=x; 
    }
    cout<<x;
  
  }
    
}