import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestThereNoRepeatingElement {

   @Test
   public void testNoData() {
      int[] data=new int[] {};
      boolean expected=false;
      boolean actual=MyIntArrayProject.isThereNoRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy nincs ismetlodo elem");
   }

   @Test
   public void testNoRepeatingData() {
      int[] data=new int[] {1,2,3,4,5};
      boolean expected=true;
      boolean actual=MyIntArrayProject.isThereNoRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy nincs ismetlodo elem");
   }

   @Test
   public void testTereAreRepetingElementBeginning() {
      int[] data=new int[] {2,1,1,1,1,1};
      boolean expected=false;
      boolean actual=MyIntArrayProject.isThereNoRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy nincs ismetlodo elem");
   }

   @Test
   public void testAreRepetingElementEnd() {
      int[] data=new int[] {1,1,1,1,5};
      boolean expected=false;
      boolean actual=MyIntArrayProject.isThereNoRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy nincs ismetlodo elem");
   }

   @Test
   public void testAreRepetingElementCloseEnd() {
      int[] data=new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1};
      boolean expected=false;
      boolean actual=MyIntArrayProject.isThereNoRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy nincs ismetlodo elem");
   }

   @Test
   public void testAreRepetingElementCloseBegin() {
      int[] data=new int[] {2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
      boolean expected=false;
      boolean actual=MyIntArrayProject.isThereNoRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy nincs ismetlodo elem");
   }

   @Test
   public void testAreMoreRepetingElementCloseBegin() {
      int[] data=new int[] {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
      boolean expected=false;
      boolean actual=MyIntArrayProject.isThereNoRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy nincs ismetlodo elem");
   }

   @Test
   public void testAreMoreRepetingElement() {
      int[] data=new int[] {1,1,1,2,3,2,2,4,2,2,5,2,2,4,2,3,2};
      boolean expected=false;
      boolean actual=MyIntArrayProject.isThereNoRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy nincs ismetlodo elem");
   }

   @Test
   public void testNoRepeatingDataLong() {
      int[] data=new int[] {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,20};
      boolean expected=true;
      boolean actual=MyIntArrayProject.isThereNoRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy nincs ismetlodo elem");
   }

}
