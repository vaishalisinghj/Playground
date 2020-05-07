#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int n;
  cin>>n;
  int s=0;
  int i=0;
  int x=0;

   while(s<n)
   {
    cin>>x;
    s=s+x;
    i++;  
  }
  
 
  //if(i==2)
  //  i=i-1;
  
  cout<<"The number of turns is "<<i<<endl;
    
  
}