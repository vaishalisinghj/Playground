#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int x=n;
  int sum=0;
  
  while(n)
  {
  int temp=n%10;
    sum=sum+temp;
    n=n/10;
  }
  
  if(x%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
}