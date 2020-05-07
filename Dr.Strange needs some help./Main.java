#include<iostream>
#include<math.h>
using namespace std;
int check(int,int);
int main()
{
int m,n,req;
  cin>>m>>n>>req;
  
  if(check(m,n)>=req)
    cout<<"Doctor, you can proceed with your experiment.";
    else
    cout<<"Sorry Doctor! You need more bacteria.";
}

int check(int m,int n)
{
	return pow(m,n);
}
