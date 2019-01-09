"""
PYTHON - HACKERRANK - THE MINION GAME

https://www.hackerrank.com/challenges/the-minion-game/problem

"""

def minion_game(string):

    vowels = ['A','E','I','O','U']
    k_score = 0
    s_score = 0
    str_len = len(string)

    for i in range(0,str_len):

        if s[i] not in vowels:
            s_score = s_score + (str_len - i)

        elif s[i] in vowels:
            k_score = k_score + (str_len - i)

    if (k_score < s_score):
        print("Stuart"+ " " + str(s_score))
    elif (s_score < k_score):
        print("Kevin"+ " "+ str(k_score))
    elif (s_score == k_score):
        print("Draw")                
        
if __name__ == '__main__':
    s = raw_input()
    minion_game(s)

				








			







				






			


		