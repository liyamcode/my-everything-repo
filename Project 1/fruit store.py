import time

money = float(input("How much money do you have?: "))
total = 0
print("Hello and welcome to the fruit store")
time.sleep(1)
print("""
apple = $1
orange = $2
banana = $3
grapes = $4
melon = $5
""")
time.sleep(1)
print("what would you like to buy? say no if you don't want anything")
answer = input()
if answer == "no":
  print("okay, have a nice day")
while answer != "no":
  
  if answer == "apple":
    print("that will be $1")
    total = total + 1
    print("anything else?")
    answer = input()
  if answer == "orange":
    print("that will be $2")
    total = total + 2
    print("anything else?")
    answer = input()
  if answer == "banana":
    print("that will be $3")
    total = total + 3
    print("anything else?")
    answer = input()
  if answer == "grapes":
    print("that will be $4")
    total = total + 4
    print("anything else?")
    answer = input()
  if answer == "melon":
    print("that will be $5")
    total = total + 5
    print("anything else?")
    answer = input()
  if answer == "no":
    print("your total is $" + str(total))
if money < total:
  print("you don't have enough money")
if money > total:
  print("and your change is $" + str(money - total))