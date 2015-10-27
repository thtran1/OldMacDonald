public void setup() {     
    Cow c = new NamedCow("same", "cow","moo"); 
    System.out.println(c.getType() + " goes " + c.getSound());  
    Chick ch = new Chick("chick", "cheep", "cluck"); 
    System.out.println(ch.getType() + " goes " + ch.getSound());
    Pig p = new Pig("pig","oink");
    System.out.println(p.getType() + " goes " + p.getSound()); 
    Farm f = new Farm();
    f.animalSounds();
}

