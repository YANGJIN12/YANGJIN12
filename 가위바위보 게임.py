#가위바위보 게임

import random as r

print( "가위바위보 게임~~")
su = r.randint(0,2)

if su == 0:
    npc = "가위"
elif su == 1:
    npc = "주먹"
else:
    npc = "보"

