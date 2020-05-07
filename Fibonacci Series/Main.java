#include<iostream>
using namespace std;
int fibo(int);
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fibo(n);
}
int fibo(int n)
{
  if(n==1)
    return 0;
  else if(n==2 && n==3)
    return 1;
  else
  { 
      int t1=0;
      int t2=1;
      int x=0;
      
      
      
      while(n-2)
      {
          x=t1+t2;
          t1=t2;
          t2=x;
          n--;
      }
      return x;
  
  
  }
}


  