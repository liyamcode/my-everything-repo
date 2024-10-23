int rPin = 11;
int bPin = 10;
int gPin = 9;

int rVal = 255; //amount of red
int bVal = 255; //amount of blue
int gVal = 255; //amount of green

void setup(){
  pinMode(rPin, OUTPUT);
  pinMode(bPin, OUTPUT);
  pinMode(gPin, OUTPUT);
}

void loop(){
  analogWrite(rPin, rVal);
  analogWrite(bPin, bVal);
  analogWrite(gPin, gVal);
}