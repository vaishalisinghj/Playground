#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int even=0;
  int odd=0;
  while(n)
  {
  int temp=n%10;
    if(temp%2==0)
    {
    	even=even+temp;
    }
    else
    {
    	odd=odd+temp;
    }
    n=n/10;
  }
  
  if(even==odd)
	cout<<"Yes";
  else
    cout<<"No";
}
