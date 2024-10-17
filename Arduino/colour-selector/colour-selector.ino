int LEDR = 12;
int LEDY = 11;
int LEDG = 6;
int LEDB = 2;


String userAnswer;

void setup() {
  pinMode(LEDR, OUTPUT);
  pinMode(LEDB, OUTPUT);
  pinMode(LEDY, OUTPUT);
  pinMode(LEDG, OUTPUT);
 
  Serial.begin(9600);
}

void loop() {
  Serial.println("what LED do you want to turn on ");
  while(Serial.available() == 0) {
  }
  userAnswer = Serial.readString();
 
  if (userAnswer == "red") {
    digitalWrite(LEDR, HIGH);
    digitalWrite(LEDB, LOW);
    digitalWrite(LEDY, LOW);
    digitalWrite(LEDG, LOW);
  }
   
  if (userAnswer == "blue") {
    digitalWrite(LEDB, HIGH);
    digitalWrite(LEDR, LOW);
    digitalWrite(LEDY, LOW);
    digitalWrite(LEDG, LOW);
  }
 
  if (userAnswer == "yellow") {
    digitalWrite(LEDY, HIGH);
    digitalWrite(LEDB, LOW);
    digitalWrite(LEDR, LOW);
    digitalWrite(LEDG, LOW);
  }
 
  if (userAnswer == "green") {
    digitalWrite(LEDG, HIGH);
    digitalWrite(LEDY, LOW);
    digitalWrite(LEDB, LOW);
    digitalWrite(LEDR, LOW);
  }
   
  }