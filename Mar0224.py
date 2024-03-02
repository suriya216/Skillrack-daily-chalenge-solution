s=input().strip()
l=len(s)
col=(l-2)*((l+1)//2)+(l//2)
l-=2
for i in range(l, 0, -1):
    row=0
    print(s[0]*i, end='')
    row+=i
    temp=0
    ctr=l-i+1
    for j in range(1, len(s)):
        print(s[j]*ctr, end='')
        row+=ctr
        if j%2==0:
            ctr=i
            temp+=1
            if temp%2==0:
                ctr=l-i+1
    if len(s)%2!=0:
        print("*"*(col-row+1), end='')
    print()
