import time
timeee = time.strftime("%H:%M:%S")  # H: Hour, M: Minute, S:Second
hour = int(time.strftime("%H"))

name = input("Enter your name : ")

print("Time :", timeee)

if(hour >= 6 and hour < 12) :
    print("Good Morning", name)
elif(hour >=12 and hour < 16) :
    print("Good AfterNoon", name)
elif(hour >= 16 and hour < 20) :
    print("Good Evening", name)
else : 
    print("Good Night", name)