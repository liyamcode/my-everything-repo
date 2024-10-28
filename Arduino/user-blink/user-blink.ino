int LEDR = 11;
int LEDG = 9;

int num1, num2;

void setup(){
  pinMode(LEDR, OUTPUT);
  pinMode(LEDG, OUTPUT);
 
  Serial.begin(9600);
}

void loop(){
  //asks user for first number and waits for input
  Serial.println("Enter first number");
  while(Serial.available() == 0){
  } num1 = Serial.parseInt();
 
  //asks user for second number and waits for input
  Serial.println("Enter second number");
  while(Serial.available() == 0){
  } num2 = Serial.parseInt();
 
  //for loop wich will run until it is more than the number the user provided for input 1 
  for (int i = 1; i <= num1; i++){
    //turns on the LED
    digitalWrite(LEDR, HIGH);
    delay(500);
    //Turnd off the LED
    digitalWrite(LEDR, LOW);
    delay(500);
  //for loop wich will run until it is more than the number the user provided for input 2
  } for (int i = 1; i <= num2; i++){
    //turns on the LED
    digitalWrite(LEDG, HIGH);
    delay(500);
    //turns off the LED
    digitalWrite(LEDG, LOW);
    delay(500);
   
  }
   //waits for 1 second
   delay(1000);
 
}