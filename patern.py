row=input("Enter the number of row : ")
col=input("Enter the number of column : ")
row=int(row)
col=int(col)
for i in range(1,row):
    for j in range(1,col+1):
        print("*",end="")
        print()