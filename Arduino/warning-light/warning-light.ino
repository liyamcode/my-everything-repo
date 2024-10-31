int LEDR = 12;
int LEDY = 10;
int LEDG = 11;

int readPin = A0;
int readVal;

void setup(){
  pinMode(LEDR, OUTPUT);
  pinMode(LEDY, OUTPUT);
  pinMode(LEDG, OUTPUT);
  pinMode(readPin, INPUT);//optional
}

void loop(){
  readVal = analogRead(readPin);
 
  //checks if the potentiometer value is 500 or less
  if (readVal <= 500){
    //if true turns off all LED's other than Green whch gets turned on
    digitalWrite(LEDR, LOW);
    digitalWrite(LEDY, LOW);
    digitalWrite(LEDG, HIGH);    
   //checks if the potentiometer value is 800 or less
  } else if(readVal <= 800){
    //if true turns off all LED's other than Yellow whch gets turned on
    digitalWrite(LEDR, LOW);
    digitalWrite(LEDY, HIGH);
    digitalWrite(LEDG, LOW);
  //checks if the potentiometer value is 800 or less
  } else if (readVal <= 1023){
    //if true turns off all LED's other than Red whch gets turned on
    digitalWrite(LEDR, HIGH);
    digitalWrite(LEDY, LOW);
    digitalWrite(LEDG, LOW);
  }
}