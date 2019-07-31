a=int(input())
b=int(input())
for n in range(a,b):
	if n>1: 
		for i in range(2,n):
			if(num%i)==0:
				break
			else
				print(num)
