/*
   9/30/14  
   JDK 1.7
   Print Old MacDonald Song using a method
*/
public class OldMacDonald {
    public static void main(String[] args) {
       animalVerse("cow", "moo");
       animalVerse("dog", "woof");
       animalVerse("sheep", "baa");
    }
    public static void animalVerse(String animal, String sound){
      System.out.println("Old MacDonald had a farm, E-I-E-I-O."
               + "\nand on this farm he had a "+animal+" E-I-E-I-O,"
               + "\nWith a "+sound+" "+sound+" here and a "+sound+" "+sound+" there."
               + "\nHere a "+sound+" there a "+sound+" everywhere a "+sound+" "+sound
               + "\nOld MacDonald had a farm, E-I-E-I-O.\n");
    }
}
