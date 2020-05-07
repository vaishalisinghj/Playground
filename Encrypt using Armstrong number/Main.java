#include<iostream>
#include<math.h>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int d=0;
  int temp=n;
  int temp1=n;
  
  while(n)
  {
    d++;
    n=n/10;
  }
  
  int sum=0;
  for(int i=1;i<=d;i++)
  {
    int x=temp%10;
    sum=sum+pow(x,d);
    temp=temp/10; 	
  }
  
  if(temp1==sum)
    return 1;
  else 
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}