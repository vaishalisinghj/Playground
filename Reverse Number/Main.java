#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n;
  cin>>n;
  int temp;
  while(n)
  {
    temp=n%10;
    if(temp!=0)
    {
    cout<<temp;
    }
    n=n/10;
  
  }
	return 0;
}