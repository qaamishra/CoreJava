package basics.runtime;

class MemoryDemo {
    public static void main(String args[]) {
        Runtime r = Runtime.getRuntime();

        long m1, m2;

        Integer in[] = new Integer[1000];

        System.out.println("Total memory is : " + r.totalMemory());

        m1 = r.freeMemory();

        System.out.println("Initial free memory is : " + m1);

        r.gc();

        m1 = r.freeMemory();

        System.out.println("Free memory after Garbage Collected : " + m1);

        for (int i = 0; i < 1000; i++)
            in[i] = new Integer(i); // allocate integers

        m2 = r.freeMemory();

        System.out.println("Free memory after allocation : " + m2);

        System.out.println("Memory used by allocation : " + (m1 - m2));

        // Discard Integers
        for (int i = 0; i < 1000; i++)
            in[i] = null;

        m2 = r.freeMemory();

        System.out.println("Free memory after allocating discarded Integers : " + m2);
    }
}