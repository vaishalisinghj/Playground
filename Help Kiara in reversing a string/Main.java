#include<iostream>
using namespace std;
int main()
{
	char s[100];
	cin.getline(s,100);
	int i,j;
	int c=0;
	for(i=0;s[i]!='\0';i++)
	{
		c++;
	}
	for(i=c-1;i>=0;i--)
	{
		cout<<s[i];
	}
}