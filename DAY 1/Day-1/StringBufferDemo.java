public class StringBufferDemo {
   public static void main(String[] args) {
       StringBuffer sb = new StringBuffer("Hello");
 
      sb.append(" World");      // Adds to end
       sb.insert(5, ",");         // Inserts at index 5
       sb.replace(0, 5, "Hi");    // Replaces "Hello" with "Hi"
       sb.delete(3, 5);           // Deletes characters
      sb.reverse();              // Reverses string
 
      System.out.println(sb);    // Output: "dlroW ,iH"
   }
}
