def cube(num):
  return num ** 3
def by_three(num):
  if num % 3 == 0:
      return cube(num)
  else:
      return False
def shut_down(param):
  if param.lower() == "yes":
      print("Shutting down...")
  elif param.lower() == "no":
      print("Shutdown aborted!")
  else:
      print("Sorry I didn't understand you.")
# Main body of the program
while True:
  print("Choose an option:")
  print("1) Cube")
  print("2) By Three")

  option = input("Enter your choice (1 or 2): ")

  if option == "1":
      num = int(input("Enter a number: "))
      result = cube(num)
      print("Cube:", result)
  elif option == "2":
      num = int(input("Enter a number: "))
      result = by_three(num)
      if result:
          print("Result of cube for divisible by 3 number:", result)
      else:
          print("False")

  shutdown_input = input("Do you want to shut down? (Yes/No): ")
  shut_down(shutdown_input)

  if shutdown_input.lower() == "yes":
      break