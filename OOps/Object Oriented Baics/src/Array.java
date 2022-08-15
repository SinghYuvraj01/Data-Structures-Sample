public class Array {

    public static void main(String[] args) {

        /*
         * First of all we will do declaration of Array, which means we will tell the
         * compiler about the type of values we will store in the array , and here arr
         * (reference
         * variable) will be creatd and stored in the stack memory , but right it will
         * not point to anything . (All of the declaration happens at the Compile time)
         */
        int[] arr;

        /*
         * Now we will initialize the arr , and after initializing reference variable ,
         * the reference variable will point to object created and stored in heap
         * memory . (All this declaration happens at the Run time)
         */
        arr = new int[5];

    }

}
