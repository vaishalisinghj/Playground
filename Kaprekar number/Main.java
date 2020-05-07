#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int  n;
  cin>>n;
  int  sq=n*n;
  int  d=0;
  int  t=sq;
  int  t1=sq;
 
  while(sq)
  {
    d++;
    sq=sq/10;
  }
  //cout<<d;
  
  if(d%2==0)
  {
    int  n=d/2;
    int k2=pow(10,n);
    int x=t%k2;
	int  k=t/k2;
    int  s=x+k; 
    if(s==t1)
      cout<<"Not a Kaprekar Number";
    else
      cout<<"Kaprekar Number";
 
  }
  else
  {
    
    int  n1=d/2;
    int l=pow(10,n+1);
    int m=pow(10,n);
    
    int  x1=t%l;
	int  k1=t/m;
    int  s1=x1+k1; 
      if(s1==t1)
      cout<<"Not a Kaprekar Number";
    else
      cout<<"Kaprekar Number";
  
  
  }
    
  
  
}
    
  
  
