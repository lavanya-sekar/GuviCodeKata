#include<stdio.h>
int main()
{
int pal,num,i,sum=0;
scanf("%d",&num);
pal=num;
while(num>0)
{
i=num%10;
sum=(sum*10)+i;
num=num/10;
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
