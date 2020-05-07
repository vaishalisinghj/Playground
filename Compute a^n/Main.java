#include<iostream>
#include<math.h>
using namespace std;
int hehe(int,int);
int main()
{
  int a,n;
  cin>>n>>a;
  cout<<"Enter the value of a \nEnter the value of n"<<endl;
  cout<<"The value of "<<n<<" power "<<a<<" is "<<hehe(n,a);
}

int hehe(int a,int b)
{
  return pow(a,b);

}
  
