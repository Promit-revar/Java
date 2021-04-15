

/**
Adding Two numbers...
* @author  Promit Revar
* @version 1.0
* @since   2014-03-31
*/
public class Doc{
   /**
   Method that performs addition...
   * @param numA This is the first paramter
   * @param numB  This is the second parameter 
   * @return int This returns sum .
   */
   public int sum(int numA, int numB) {
      return numA + numB;
   }

   /**
   * This is the main method ...
   * @param args not required
   * 

   */

   public static void main(String args[]) {
      Doc obj = new Doc();
      int sum = obj.sum(19, 17);

      System.out.println("Sum :" + sum);
   }
}