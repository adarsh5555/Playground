#include <stdio.h>
int main() 
{
  int n,sum=0,digit;
  scanf("%d",&n);
    int temp=n;
  while(n>0)
  {
   digit=n%10;
    sum=sum+digit;
    n=n/10;
  }
  printf("%d",sum);
//Type your code
	return 0;
}