package Arrays;

public class RemoveDuplicateFromSorted {
   public RemoveDuplicateFromSorted() {
   }

   public static int removeDuplicate(int[] var0) {
      int var1 = 0;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] != var0[var1]) {
            ++var1;
            var0[var1] = var0[var2];
         }
      }

      return var1 + 1;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 1, 2, 2, 3};
      int var2 = removeDuplicate(var1);

      for(int var3 = 0; var3 < var2; ++var3) {
         System.out.print(var1[var3] + " ");
      }

   }
}
