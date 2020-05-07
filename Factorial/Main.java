#include<iostream>
using namespace std;
int fact(int);
int main()
{
  //Type your code here.
  int n;
  cin>>n;
 
  
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}


int fact(int n)
{
    
     if(n<=1)
     {
         return 1;
     }
     else
     return n*fact(n-1);
}
