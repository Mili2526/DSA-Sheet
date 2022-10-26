#take n as a input which will be input for number of rows and a boolean input in form of 0 and 1 and print the astrologer star form

n = int(input("Enter the number of rows:"))
a = int(input("1 for straight and 0 for inverted:"))
choice = bool(a)
if choice == True:
    for i in range(1,n+1):
        for j in range(1,i+1):
            print("*" , end="  ")
        print()

if choice == False:
    for i in range(n,0,-1):
        for j in range(1,i+1):
            print("*" , end="  ")
        print()


