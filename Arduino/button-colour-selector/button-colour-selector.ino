int buttonPinr = 11; //digital pin connected to button
int buttonPiny = 9; //digital pin connected to button
int buttonPing = 7; //digital pin connected to button
int buttonPinb = 4; //digital pin connected to button

int buttonValr; //will store button's status
int buttonValy; //will store button's status
int buttonValg; //will store button's status
int buttonValb; //will store button's status

int valOldr = 1;
int valOldy = 1;
int valOldg = 1;
int valOldb = 1;

int LEDPinr = 12; //digital pin connected to LED
int LEDPiny = 10; //digital pin connected to LED
int LEDPing = 6; //digital pin connected to LED
int LEDPinb = 5; //digital pin connected to LED

bool LEDOnr = false; //LED status (false = off, true = on)
bool LEDOny = false; //LED status (false = off, true = on)
bool LEDOng = false; //LED status (false = off, true = on)
bool LEDOnb = false; //LED status (false = off, true = on)

void setup(){
  pinMode(LEDPinr, OUTPUT);
  pinMode(buttonPinr, INPUT_PULLUP); //pin mode to use button
  pinMode(LEDPiny, OUTPUT);
  pinMode(buttonPiny, INPUT_PULLUP); //pin mode to use button
  pinMode(LEDPing, OUTPUT);
  pinMode(buttonPing, INPUT_PULLUP); //pin mode to use button
  pinMode(LEDPinb, OUTPUT);
  pinMode(buttonPinb, INPUT_PULLUP); //pin mode to use button
  Serial.begin(9600);
}

void loop(){
  buttonValr = digitalRead(buttonPinr); //gets signal from buttonPin
  Serial.println(buttonValr);
  
  //is button has been released
  if (buttonValr == 1 && valOldr == 0){
    if (LEDOnr == false){ //
   	  digitalWrite(LEDPinr, HIGH); //turn on light
      LEDOnr = true; //sets status to on/true
  } else {
    digitalWrite(LEDPinr, LOW); //turn off light
    LEDOnr = false; //sets status to off/fakse
    }
  }
  valOldr = buttonValr;
  
  buttonValy = digitalRead(buttonPiny); //gets signal from buttonPin
  Serial.println(buttonValy);
  
  //is button has been released
  if (buttonValy == 1 && valOldy == 0){
    if (LEDOny == false){ //
   	  digitalWrite(LEDPiny, HIGH); //turn on light
      LEDOny = true; //sets status to on/true
  } else {
    digitalWrite(LEDPiny, LOW); //turn off light
    LEDOny = false; //sets status to off/fakse
    }
  }
  valOldy = buttonValy;
  
  buttonValg = digitalRead(buttonPing); //gets signal from buttonPin
  Serial.println(buttonValg);
  
  //is button has been released
  if (buttonValg == 1 && valOldg == 0){
    if (LEDOng == false){ //
   	  digitalWrite(LEDPing, HIGH); //turn on light
      LEDOng = true; //sets status to on/true
  } else {
    digitalWrite(LEDPing, LOW); //turn off light
    LEDOng = false; //sets status to off/fakse
    }
  }
  valOldg = buttonValg;
  
  buttonValb = digitalRead(buttonPinb); //gets signal from buttonPin
  Serial.println(buttonValb);
  
  //is button has been released
  if (buttonValb == 1 && valOldb == 0){
    if (LEDOnb == false){ //
   	  digitalWrite(LEDPinb, HIGH); //turn on light
      LEDOnb = true; //sets status to on/true
  } else {
    digitalWrite(LEDPinb, LOW); //turn off light
    LEDOnb = false; //sets status to off/fakse
    }
  }
  valOldb = buttonValb;
}