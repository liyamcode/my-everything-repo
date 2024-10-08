String userArea;
float L;
float W;

void setup(){
  Serial.begin(9600); //starts the serial monitor
}
void loop(){  
  Serial.println("What is the length of your rectangle?  "); //Prompt User for Input
  while(Serial.available()==0) {} // Wait for User to Input Data
  L = Serial.parseFloat();  //Read the data the user has input
  
  Serial.println("What is the Width of your rectangle?"); //Prompt User for Input
  while(Serial.available()==0) {} // Wait for User to Input Data  
  W = Serial.parseFloat();  //Read the data the user has input
  
  userArea = Serial.readString();
    Serial.print("The area is: ");
    Serial.println(L*W);//prints the area
}