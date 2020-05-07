#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int *p=(int *) malloc (4*sizeof(int));
  
  for(int i=0;i<n;i++)
  {
      cin>>*(p+i);
    }
    
    int m=0;
    int f=0;
    
     for(int i=0;i<n;i++)
  {
      if(*(p+i)%2==0)
      f++;
      else
      m++;
    }
    
    cout<<m<<endl;
    cout<<f;
  return 0;
}