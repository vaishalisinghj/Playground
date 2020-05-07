
#include<iostream>
using namespace std;
int main()
{
  
  int n;
  cin>>n;


  
  for(int i=1;i<=n;i++)
  {
     for(int j=1;j<=1;j++)
    {
     int k=n-1;
      if(i%2!=0)
      {
          while(k)
          {
              cout<<i;
              k--;
          }
          cout<<i+1;
          
      }
      else
      {
          cout<<i+1;
          while(k)
          {
              cout<<i;
              k--;
          }
    
      }
     //cout<<endl;
  }
  cout<<endl;
}
}
