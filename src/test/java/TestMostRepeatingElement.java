import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMostRepeatingElement {

   @Test
   public void testNoData() {
      int[] data=new int[] {};
      int expected=0;
      int actual=MyIntArrayProject.getMostRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
   }

   @Test
   public void testNoRepetingElement() {
      int[] data=new int[] {1,2,3,4,5,6,7,8,9};
      int expected=Integer.MAX_VALUE;
      int actual=MyIntArrayProject.getMostRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
   }

   @Test
   public void testMostRepetingElementBegin() {
      int[] data=new int[] {1,1,3,4,5,6,7,8,9};
      int expected=2;
      int actual=MyIntArrayProject.getMostRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
   }

   @Test
   public void testMostRepetingElementEnd() {
      int[] data=new int[] {1,2,3,4,5,6,7,8,9,9};
      int expected=2;
      int actual=MyIntArrayProject.getMostRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
   }

   @Test
   public void testMostRepetingElement03() {
      int[] data=new int[] {1,5,3,4,5,6,7,8,5,9};
      int expected=3;
      int actual=MyIntArrayProject.getMostRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
   }

   @Test
   public void testMostRepetingElement0302() {
      int[] data=new int[] {2,5,3,4,5,6,7,8,5,2};
      int expected=3;
      int actual=MyIntArrayProject.getMostRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
   }

   @Test
   public void testMostRepetingElement040302() {
      int[] data=new int[] {2,5,11,3,2,5,20,6,2,8,10,5,2};
      int expected=4;
      int actual=MyIntArrayProject.getMostRepeatingElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
   }




}
