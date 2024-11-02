int buzzPin = 8; //piezo's connection
int toneDelay = 250; //delay in Microseconds

void setup(){
  pinMode(buzzPin, OUTPUT);
}

void loop(){
  
  tone(buzzPin, 10000, toneDelay);
  
  delay(1000);
}