
#include<iostream>
using namespace std;
int main()
{
int x,y,sum;
cin>>x>>y;
  
  int k=0;
  
  for(int j=x;j<=y;j++)
  {
      k=0;
  for(int i=1;i<j;i++)
  {
  	if(j%i==0)
    {
        k=k+i;
    }
  }
  
  //cout<<k<<endl;
  if(k==j)
    cout<<j<<" ";
  }
  
}