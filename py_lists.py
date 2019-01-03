"""
HACKERRANK - PYTHON - LISTS

https://www.hackerrank.com/challenges/python-lists/problem

"""
if __name__ == '__main__':
    N = int(input())
    #print (N)

    my_list = []

    for i in range (0,N):
        my_input = str(input())
        my_input = my_input.split(" ")
        
        if (len(my_input) == 1):
            
            if (my_input[0] == "print"):
                print(my_list)

            if (my_input[0] == "sort"):
                my_list.sort()

            if(my_input[0] == "pop"):
                my_list.pop()

            if(my_input[0] == "reverse"):
                my_list.reverse() 

        elif(len(my_input) == 2):

            if (my_input[0] == "remove"):
                my_list.remove(int(my_input[1]))

            if (my_input[0] == "append"):
                my_list.append(int(my_input[1]))

        elif (len(my_input) == 3):

            if (my_input[0] == "insert"):
                my_list.insert(int(my_input[1]), int(my_input[2]))                     
