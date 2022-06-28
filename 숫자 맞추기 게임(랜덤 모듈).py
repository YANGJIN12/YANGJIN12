#게임 만들기(숫자 맞추기)

import random as r

n = r.randint(1,10)

while True:
    guess = int(input("추측하는 값은 무엇입니까?"))

    if guess == n:
        print("찾았군요 대단합니다~")
        break
    elif guess > n:
        print("추측값이 더 크네요")
    else:
        print("추측값이 더 작네요")
