int LEDpin = 11; //make sure it is a PWM capable(~)
int val; //user input for level of brightness (0-255)

void setup(){
  pinMode(LEDpin, OUTPUT);
  Serial.begin(9600);
}

void loop(){
  Serial.println("Enter brightness level [0-255]: ");
  while(Serial.available() == 0){
  }
  val = Serial.parseInt();
  
  analogWrite(LEDpin, val);
}