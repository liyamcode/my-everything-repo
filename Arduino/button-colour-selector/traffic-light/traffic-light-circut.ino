int LEDR = 10;
int LEDY = 8;
int LEDG = 2;

int buttonPin = 12;
int buttonVal;
int oldVal = 1;

int tracker = 1;



void setup(){
  pinMode(LEDR, OUTPUT);
  pinMode(LEDY, OUTPUT);
  pinMode(LEDG, OUTPUT);
  pinMode(buttonPin, INPUT_PULLUP);
}

void loop(){
  buttonVal = digitalRead(buttonPin);
  if (buttonVal == 1 && oldVal == 0){
    if (tracker == 1){
      digitalWrite(LEDR, LOW);
      digitalWrite(LEDG, HIGH);
      tracker = 3;
    } else if (tracker == 3){
      digitalWrite(LEDG, LOW);
      digitalWrite(LEDY, HIGH);
      tracker = 2;  
    } else if (tracker == 2){
      digitalWrite(LEDY, LOW);
      digitalWrite(LEDR, HIGH);
      tracker = 1;
    }
  }
  oldVal = buttonVal;
}