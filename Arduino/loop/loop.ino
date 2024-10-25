int LEDPin = 11;

void setup(){
  pinMode(LEDPin, OUTPUT);
}

void loop(){

  for(int i = 0; i < 7; i++){
  digitalWrite(LEDPin, HIGH);
  delay(250);
  digitalWrite(LEDPin, LOW);
  delay(250);
  }
  delay(1000);
  
  // comment out the code on the bottom or top for 2 different loops

  /*
  while(millis() <= 5000){
    digitalWrite(LEDPin, HIGH);
  	delay(250);
  	digitalWrite(LEDPin, LOW);
  	delay(250);
  }
  */
}