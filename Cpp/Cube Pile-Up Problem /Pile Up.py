"""
Link : https://www.hackerrank.com/challenges/piling-up/problem

There is a horizontal row of  cubes. The length of each cube is given.
You need to create a new vertical pile of cubes.
The new pile should follow these directions:
length of cube on top should be less than or equal to length of cube below.

When stacking the cubes, you can only pick up either the leftmost or the rightmost cube each time.
Print "Yes" if it is possible to stack the cubes. Otherwise, print "No".
Do not print the quotation marks.

Input Format

The first line contains a single integer , the number of test cases.
For each test case, there are  lines.
The first line of each test case contains , the number of cubes.
The second line contains  space separated integers, denoting the sideLengths of each cube in that order.

Output Format

For each test case, output a single line containing either "Yes" or "No" without the quotes.
"""
import sys

cubes = []
print("Enter the number of inputs")
no_of_inputs = int(input())

for i in range(0,no_of_inputs):

    cubes.append([])
    print("Enter the number of cubes for " + str(i+1) + " input")
    no_of_cubes = int(input())

    for j in range(0,no_of_cubes):

        print("enter cube no." + str(j+1))
        my_input = int(input())
        cubes[i].append(my_input)

print("Horizontal Cubes are : ")
print(cubes)

top = sys.maxsize

for i in range(0,len(cubes)):

    flag = 0

    while (len(cubes[i]) > 0):

        front = cubes[i][0]
        end = cubes[i][len(cubes[i]) - 1]

        if(front >= end):
            if(front <= top):
                top = front
                cubes[i].remove(front)
            else:
                flag = 1
                print ("NO")
                break
        else:
            if(end <= top):
                top = end
                cubes[i].remove(end)
            else:
                flag = 1
                print ("NO")
                break

    if flag == 0 :
        print("YES")
