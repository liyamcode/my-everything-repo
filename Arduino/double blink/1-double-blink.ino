int LEDpin = 13;  //Where the LED is connected
int LEDpin2 = 7;  //Where the LED is connected
int blinkDelay = 350;  //delay in milliseconds


void setup(){
  
 	pinMode(LEDpin, OUTPUT);  //sets the pin to OUTPUT
    pinMode(LEDpin2, OUTPUT);  //sets the pin to OUTPUT
    
}

void loop(){  
  
  digitalWrite(LEDpin, HIGH); //turns on the LED
  digitalWrite(LEDpin2, LOW); //turns off the LED
  delay(blinkDelay);  //pauses the code
  digitalWrite(LEDpin, LOW);  //turns off the LED
  digitalWrite(LEDpin2, HIGH); //turns on the LED
  delay(blinkDelay);  //pauses the code
  
  
}