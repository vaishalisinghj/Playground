#include<iostream>
#include<string.h>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  
  string s1;
  string s2;
  cin>>s1>>s2;
 reverse(s1.begin(),s1.end());
  if(s1==s2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
 
}