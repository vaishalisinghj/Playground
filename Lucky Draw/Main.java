#include<iostream>
using namespace std;
int main()
{
int n;
 cin>>n;
  int flag=0;
  if(n==0 || n==1)
  {
        cout<<"Not eligible";
  }
  else if(n==2)
  {
  	cout<<"Eligible";
  }
  else
  {
  int m=n/2;
  for(int i=2;i<=m;i++)
  {
  	if(n%i==0)
    {
    	flag=1;
      	break;
    }
  
  }
  
  
  if(flag==0)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
  }

}