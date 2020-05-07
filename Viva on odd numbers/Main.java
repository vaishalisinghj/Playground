#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i=0;
  int n;
  float score=0;
  
 do
  {
    cin>>n;
    if(n<0)
    {
      i=-1;
      score=score-1;
    }
    else
    {
      if(n%2==0)
      {
      	score=score-0.5;
      }
      else
      {
      score=score+1;
        i++;
      } 
    }
  } while(i<3 && i!=-1);
  cout<<score;
  return 0;
}