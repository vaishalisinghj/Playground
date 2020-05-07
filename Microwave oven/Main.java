#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,t;
  float h;
  cin>>n>>t;
  h=t*0.50;
  if(n==1)
    cout<<t;
   else if(n==2)
     cout<<t+h;
    else if(n==3)
    cout<<t*2.00;
  else
    cout<<"Number of items is more";
}