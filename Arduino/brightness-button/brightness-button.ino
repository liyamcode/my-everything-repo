int LEDPin = 6;
int brightness = 0;


//button variable
int buttonPinl = 12;
int buttonVall;
int oldVall = 1;

//button variable 2
int buttonPink = 10;
int buttonValk;
int oldValk = 1;

void setup(){
  pinMode(LEDPin, OUTPUT);
  pinMode(buttonPinl, INPUT_PULLUP);
  pinMode(buttonPink, INPUT_PULLUP);
}

void loop(){
  buttonVall = digitalRead(buttonPinl);
  if (buttonVall == 1 && oldVall == 0){
    if (brightness <= 245){
      brightness = brightness + 10;
    }
  }
  oldVall = buttonVall;
 
  buttonValk = digitalRead(buttonPink);
  if (buttonValk == 1 && oldValk == 0){
    if (brightness  >= 10){
      brightness = brightness - 10;
  	}
  }
  oldValk = buttonValk;
analogWrite(LEDPin, brightness);
 

}