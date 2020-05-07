#include<iostream>
using namespace std;
int gcd(int,int);
int main()
{
 int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}
int gcd(int a,int b)
{
if(a%b==0)
  return b;
 return gcd(b,a%b);
}

