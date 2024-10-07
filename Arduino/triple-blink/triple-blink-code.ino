/*the first LED blink 3 times with a delay of 750.
  The second LED blink 5 times with a delay of 500.
  The third LED blink 10 times with a delay of 250.
  Then wait 1 seconds before repeating.
  */

int LEDpin1 = 12;  //Where the LED is connected
int LEDpin2 = 11;  //Where the LED is connected
int LEDpin3 = 10;  //Where the LED is connected
int blinkDelay1 = 500;  //delay in milliseconds
int blinkDelay2 = 300;  //delay in milliseconds
int blinkDelay3 = 150;  //delay in milliseconds
int Delay1second = 1000;  //delay in milliseconds

void setup(){
  pinMode(LEDpin1, OUTPUT);  //sets the pin to OUTPUT
  pinMode(LEDpin2, OUTPUT);  //sets the pin to OUTPUT
  pinMode(LEDpin3, OUTPUT);  //sets the pin to OUTPUT
}

void loop(){
  
  digitalWrite(LEDpin1, HIGH);  //turns on the LED
  delay(blinkDelay1);  // wait for 500 millisecond
  digitalWrite(LEDpin1, LOW);  //turns off the LED
  delay(blinkDelay1);  // wait for 500 millisecond
  digitalWrite(LEDpin1, HIGH);  //turns on the LED
  delay(blinkDelay1);  // wait for 500 millisecond
  digitalWrite(LEDpin1, LOW);  //turns off the LED
  delay(blinkDelay1);  // wait for 500 millisecond
  digitalWrite(LEDpin1, HIGH);  //turns on the LED
  delay(blinkDelay1);  // wait for 500 millisecond
  digitalWrite(LEDpin1, LOW);  //turns off the LED
  delay(blinkDelay1);  // wait for 500 millisecond
  
  digitalWrite(LEDpin2, HIGH);  //turns on the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  digitalWrite(LEDpin2, LOW);  //turns off the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  digitalWrite(LEDpin2, HIGH);  //turns on the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  digitalWrite(LEDpin2, LOW);  //turns off the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  digitalWrite(LEDpin2, HIGH);  //turns on the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  digitalWrite(LEDpin2, LOW);  //turns off the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  digitalWrite(LEDpin2, HIGH);  //turns on the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  digitalWrite(LEDpin2, LOW);  //turns off the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  digitalWrite(LEDpin2, HIGH);  //turns on the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  digitalWrite(LEDpin2, LOW);  //turns off the LED
  delay(blinkDelay2);  // wait for 300 millisecond
  
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, HIGH);  //turns on the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  digitalWrite(LEDpin3, LOW);  //turns off the LED
  delay(blinkDelay3);  // wait for 150 millisecond
  
  delay(Delay1second);  //pause for one second before repeating
}