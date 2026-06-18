a="Hello World"
c=list(a)
l=0
r=len(c)-1
while l < r:
    c[l],c[r]=c[r],c[l]
    l+=1
    r-=1
o="".join(c)
print(o)
