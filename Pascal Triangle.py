#Program That accepts input n and will display Pascal's Triangle
n=6
arr =[["0" for x in range(n)]
     for y in range(n)]
    

for i in range(0,n):
    for j in range(0,i+1):
        if(j==0 or j==i):
            arr[i][j] = 1
            print(arr[i][j],end = " ")
        else:
            arr[i][j] = arr[i-1][j-1]+arr[i-1][j]
            print(arr[i][j],end=" ")
            
    print("\n",end="")