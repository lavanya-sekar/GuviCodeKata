#include<stdio.h>
int main()
{
int pal,num,i,sum=0;
scanf("%d",&num);
pal=num
while(num>0)
{
i=n%10;
sum=(sum*10)+i;
n=n/10;
}
if(sum==pal)
{
printf("yes");
}
else
{
printf("no");
}
return 0;
}