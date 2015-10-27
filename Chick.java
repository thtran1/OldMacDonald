class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound, String sound1)     {         
         myType = type;
         if(((int)(Math.random()*2)+1) % 2 == 0) {       
            mySound = sound;   
         }
         else {
            mySound = sound1;
         }
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}