String userRadius;
float radius;

void setup(){
  Serial.begin(9600); //starts the serial monitor
}

void loop(){
  Serial.println("What is the radius for your circle? "); //Prompt User for Input
  while(Serial.available()==0) {} // Wait for User to Input Data
  radius = Serial.parseFloat();  //Read the data the user has input
  
  userRadius = Serial.readString();
    Serial.print("The area is: ");
    Serial.println(3.14*radius*radius);//prints the area
    Serial.print("The perimeter is: ");
    Serial.println(2*3.14*radius);//prints the perimeter
}