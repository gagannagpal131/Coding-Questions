"""
HACKERRANK - PYTHON - STRINGS - MERGE THE TOOLS

https://www.hackerrank.com/challenges/merge-the-tools/problem
"""





def merge_the_tools(string, k):
    my_list = []

    for i in range(0,len(string)+1):
        
        if (i % k == 0):
            if (len(my_list) > 0):
                print("".join(my_list))
                my_list.clear()

        if (i == len(string)):
            print("".join(my_list))
            break

        if string[i] not in my_list:
            my_list.append(string[i])  



if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)





