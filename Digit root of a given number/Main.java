#include<iostream>
using namespace std;
int sod(int);
int main()
{
    int n;
    cin>>n;
    sod(n);
    cout<<sod(n);
    
    
}
int sod(int n)
{
   int sum=0;
    /*if(n<=9 || n>=0)
    {
        return n;
    }
    else
    {*/
        
    while(n>0)
    {
       //3 //2
        sum=sum+n%10; //3 //5
        n=n/10;         //
   
    
    
    if(n==0 && sum>9)
    {
       n=sum;
        sum=0;
    }
    
    }
    return sum;
    
}