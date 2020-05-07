#include<iostream>
using namespace std;
int smallest(int,int,int);
int gcd(int,int,int);

int main()
{
  int a,b,c,ans;
  cin>>a>>b>>c>>ans;
  
  int x= gcd(a,b,c);
  
  
  if(x==ans)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}

int smallest(int a,int b,int c)
{
  
  if(c>a && b>a)
    return a;
  else if(a>b && c>b)
    return b;
  else
    return c;
}

int gcd(int a,int b,int c)
{
  int small=smallest(a,b,c);
	int flag=1;	
  	while(flag)
        {
          if(a%small==0 && b%small==0 && c%small==0)
          {
            flag=0;
            return small;
          }
          else
            small--;
         }
}