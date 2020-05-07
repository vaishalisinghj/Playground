#include<iostream>
using namespace std;
int main()
{  int n;
  cin>>n;
  int x=n;
  for(int i=1;i<=4;i++)
  {
  	for(int j=1;j<=i;j++)
    {
    	cout<<n;
    }
    n++;
    cout<<endl;
  }
  n--;
  
  for(int i=1;i<=4;i++)
  {
  	for(int j=1;j<=(5-i);j++)
    {
    	cout<<n;
    }
    n--;
    cout<<endl;
  }
}