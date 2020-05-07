#include<iostream>
using namespace std;
int main()
{
  
  int n;
  cin>>n;
  int n1=1;

  
  for(int i=0;i<n;i++)
  {
  	for(int j=1;j<=(2*i+1);j++)
    {
    	if(j%2==0)
    	{
    	cout<<"*";
    	}
    	else
    	{
    	  cout<<n1; 
    	 // n1++;
    	}
    }
    n1++;
   
    cout<<endl;
   
  
  }
  
    n1--;
  for(int i=(n-1);i>=0;i--)
  {
  	for(int j=1;j<=(2*i+1);j++)
    {
    	if(j%2==0)
    	{
    	cout<<"*";
    	}
    	else
    	{
    	  cout<<n1; 
    	 // n1++;
    	}
    }
    n1--;
   
    cout<<endl;
   
  }

}