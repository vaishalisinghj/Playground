#include<iostream>
using namespace std;
int main()
{
int x,y,sum;
cin>>x>>y;
  sum=x+y;
  int k=0;
  
  for(int i=1;i<sum;i++)
  {
  	if(sum%i==0)
    {
    k=k+i;
    }
  }
  
  //cout<<k<<endl;
  if(k==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  
  
}