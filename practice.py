# name="akash"
# print(type(name))

# a=39
# b='Akash'
# print(id(a))
# print(type(b))
# print(id(b))
# a=377
# print(id(a))

# a,b,c=34,23,24
# print(a,b)
# print(c)

# def add():
#     a,b=20,40
#     c=a+b
#     print("a =",a,"b =",b,"sum =",c)
# add()

# x=50
# print(type(x))
# def mainfunction():
#     global x
#     print(x)
#     x='Akash'
#     print(x)
# mainfunction()
# print(x)

# a=4
# print(a)
# del a
# print(a)

# a=48
# b=3.4337
# c=2+3j
# print("Type of a is : ",type(a))
# print("Type of b is : ",type(b))
# print("Type of c is : ",type(c))
# print("Type of a is : ",isinstance(c,complex))
# print("Type of a is : ",isinstance(a,int))
# print("Type of a is : ",isinstance(b,int))

# a = "Hello "
# b = "Akash sahu "
# c = 'Good Morning'
# print(a[3])
# print(b[0:4])
# print(c[-5])
# print(a*3)
# print(a+b+c)

# list1 = [1,5,6,'Akash',"Alka",6]
# print(type(list1))
# print(list1[3])
# print(list1[1:4])
# print(list1*2)
# print(list1+list1)
# list1[2]='Hello'
# print(list1)
# print("\n\n")

# tup = (1,5,6,'Akash',"Alka",6)
# print(type(tup))
# print(tup[3])
# print(tup[1:4])
# print(tup*2)
# print(tup+tup)
# '''tup[2]='Hello'''

# d = {1:'Jimmy', 2:'Alex', 3:'john', 4:'mike'}  
# print(type(d))   
# print (d)  
# print("1st name is "+d[1])   
# print("2nd name is "+ d[4])    
# print (d.keys())    
# print (d.values())   

# set1 = set()  
# set2 = {'James', 2, 3,'Python'}    
# print(set2)  
# set2.add(10)  
# print(set2)    
# set2.remove(2)  
# print(set2)

# import keyword 
# print("The set of keywords in this version is: ")  
# print( keyword.kwlist )  

# help("keywords") 

# print( 4 == 4 )  
# print( 6 > 9 )  
# print( True or False )  
# print( 9 <= 28 )  
# print( 6 < 9 )  
# print( True and False ) 

# print( True == 3 )  
# print( False == 0 )  
# print( True + True + True)  

# print( None == 0 )  
# print( None == " " )  
# print( None == False )  
# A = None   
# B = None  
# print( A == B )

# def no_return_function():  
#     num1 = 10  
#     num2 = 20  
#     addition = num1 + num2  
#     '''print(addition)'''
# number = no_return_function()  
# print( number ) 

# def with_return( num ):  
#     if num % 4 == 0:  
#         return False  
  
# number = with_return( 65 )  
# print( number )  

# container = "Akash Sahu"  
# print( "A" in container )  
# print( "s" in container )  
# print("Q" in container)

# print( True is True )  
# print( False is True )  
# print( None is not None )  
# print( (9 + 5) is (7 * 2) )
# print( (9 + 7) is (7 * 2) )

# print( [] == [] )  
# print( [] is [] )  
# print( {} == {} )  
# print( {} is {} ) 

# def the_outer_function():  
#     var = 10  
#     def the_inner_function():  
#         nonlocal var  
#         var = 14  
#         print("The value inside the inner function: ", var)  
#     the_inner_function()  
#     print("The value inside the outer function: ", var)  
# the_outer_function()  


# for i in range(15):  
#     print( i , end = " ")  
#     if i == 9:  
#         break     
# print("\nExit for loop")  
# i = 0 
# while i < 15:  
#     # if i == 9:  
#     #     i += 3  
#     #     continue  
#     # else: 
#     #     print( i + 2, end = " ")  
#     #     i += 1  
#      print( i + 2, end = " ")   
#      i += 1  
    
# var1 = 4  
# var2 = 0   
# try:  
#     d = var1 // var2 
#     print( d )  
# except ZeroDivisionError:  
#      print("We cannot divide by zero")  
# finally:  
#     print("This is inside finally block")  
# print ("The value of var1 / var2 is : ")  
# assert var2 != 0, "Divide by 0 error"  
# print (var1 / var2)  

# def function_pass( arguments ):  
#  pass  

# class passed_class:  
#     pass  

# def func_with_return():  
#     var = 13  
#     return var  
  
# def func_with_no_return():  
#     var = 10  
#     # return var
  
# print( func_with_return() )  
# print( func_with_no_return() )  

# var1 = var2 = 5  
# del var1  
# print( var2 )  
# print( var1 )  

# list_ = ['A','B','C']  
# del list_[2]  
# print(list_) 
# print(list_[1])
# print(list_[2])

# a = input("Enter the value of a : ")
# a = int(a)
# if(a%2==0):
#     print("a is even number")
# else:
#     print('a is odd number')


# a = int(input('Enter the value of a : '));
# b = int(input('Enter the value of b : ' ));
# c = int(input('Enter the value of c : '));
# if(a>b and a>c):
#     print('a is greater');
# if(b>a and b>c):
#     print('b is greater');
# if(c>a and c>b):
#     print('c is greater');

# n = int(input('Enter the number : '))
# if n==10:
#     print('Number is equal to 10')
# elif n==50:
#     print('Number is equal to 50');
# elif n == 100:
#     print('Number is equal to 100');
# else:
#     print('Enter valid number');


# numbers = [4, 2, 6, 7, 3, 5, 8, 10, 6, 1, 9, 2]
# square = 0    
# squares = []  
# for value in numbers:  
#     square = value ** 2  
#     squares.append(square)  
# print("The list of squares is",squares)  

# print(range(15))  
# print(tuple(range(15)))  
# print(list(range(4, 9)))  
# print(list(range(5, 25, 4)))

# numbers = [3, 5, 23, 6, 5, 1, 2, 9, 8]    
# sum = 0 
# # for num in numbers:
# for num in range( len(numbers) ):      
#     sum = sum + num ** 2 
#     # sum = sum + numbers[num] ** 2    
#     print(num)
# print("The sum of squares is: ", sum)  

# my_list = [3, 5, 6, 8, 4]  
# for iter_var in range( len( my_list ) ):  
#     # my_list.append(my_list[iter_var] + 2)  
#     # print( my_list )  
#     # print(len(my_list))
#     print(iter_var)

# student_name_1 = 'Itika'  
# student_name_2 = 'Petar'    
# records = {'Itika': 90, 'Arshia': 92, 'Peter': 46}  
# def marks( student_name ):  
#     for a_student in records: 
#         if a_student == student_name:  
#             return records[ a_student ]  
#             break  
#     else:  
#         return f'There is no student of name {student_name} in the records'    
# print( f"Marks of {student_name_1} are: ", marks( student_name_1 ) )  
# print( f"Marks of {student_name_2} are: ", marks( student_name_2 ) )  

import random 
numbers = [ ]  
for val in range(0, 11):  
    numbers.append( random.randint( 0, 11 ) )  
for num in range( 0, 11 ):  
    for i in numbers:  
        if num == i:  
            print( num, end = " " )  