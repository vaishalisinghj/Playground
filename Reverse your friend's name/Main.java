#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  for ( std::string::reverse_iterator it=str.rbegin(); it!=str.rend(); ++it)
    std::cout << *it;
  std::cout << '\n';
}