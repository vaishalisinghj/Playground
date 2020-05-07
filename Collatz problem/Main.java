#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  
  if(n==1)
  {
  	cout<<"1\n0"<<endl;

  }
  else
  {
  int x=n;
  int i=1;
  cout<<x<<endl;
  do
  {
    if(n%2==0)
    {
      n=n/2;
      cout<<n<<endl;
    }
    else
    {
    	n=3*n+1;
       cout<<n<<endl;
    }
  i++;
  
  }while(n!=1);
  cout<<i-1;
  }

    
}