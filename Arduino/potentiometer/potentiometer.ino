int readPin = A0; // Connects to analog input pin 0
int	readVal; // stores potentiometer input

int LEDPin = 11; // must be PWM
int LEDval; //brightness of LED
void setup(){
  pinMode(readPin, INPUT); //optional
  pinMode(LEDPin, OUTPUT);
  Serial.begin(9600);
}

void loop(){
  readVal = analogRead(readPin);
  LEDval = map(readVal, 0, 1023, 0, 255);
  analogWrite(LEDPin, readVal);
  
  Serial.println(readVal);
}