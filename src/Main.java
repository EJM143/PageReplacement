//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] pageSequence1 = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1};
        int[] pageSequence2 = {8,1,0,7,3,0,3,4,5,3,5,2,0,6,8,4,8,1,5,3};
        int[] pageSequence3 = {4,6,4,8,6,3,6,0,5,9,2,1,0,4,6,3,0,6,8,4};

        int[] pageSequence4 = {5,3,3,2,6,8,9,8,7,0,3,2,5,6,8};
        int[] pageSequence5 = {5,3,3,2,6,8,9,8,7,0,3,2,5,6,8};
        int[] pageSequence6 = {5,3,3,2,6,8,9,8,7,0,3,2,5,6,8};

        int[] pageSequence8 = {1,2,3,4,1,5,6,2,1,2,3,7,6,3};

        FIFOReplacementAlgo fifoAlgo8 = new FIFOReplacementAlgo(4);
        runTestPrintPagefault(fifoAlgo8, "FIFO Test Case 8 ", pageSequence8);

        LRUReplacementAlgo lruAlgo8 = new LRUReplacementAlgo(4);
        runTestPrintPagefault(lruAlgo8, "LRU Test Case 8",  pageSequence8);

        OPTReplacementAlgo optAlgo8 = new OPTReplacementAlgo(4);
        runTestPrintPagefault(optAlgo8, "OPT Test Case 8",  pageSequence8);

        System.out.println("***FIFO Replacement Algorithm***");


        FIFOReplacementAlgo fifoAlgo1 = new FIFOReplacementAlgo(3);
        runTestPrintPagefault(fifoAlgo1, "FIFO Test Case 1 ", pageSequence1);

        FIFOReplacementAlgo fifoAlgo2 = new FIFOReplacementAlgo(3);
        runTestPrintPagefault(fifoAlgo2, "FIFO Test Case 2 ", pageSequence2);

        FIFOReplacementAlgo fifoAlgo3 = new FIFOReplacementAlgo(3);
        runTestPrintPagefault(fifoAlgo3, "FIFO Test Case 3 ", pageSequence3);

        FIFOReplacementAlgo fifoAlgo4 = new FIFOReplacementAlgo(3);
        runTestPrintPagefault(fifoAlgo4, "FIFO Test Case 4 [rss:15, npf:3] ", pageSequence4);

        FIFOReplacementAlgo fifoAlgo5 = new FIFOReplacementAlgo(5);
        runTestPrintPagefault(fifoAlgo5, "FIFO Test Case 5 [rss:15, npf:5] ", pageSequence5);

        FIFOReplacementAlgo fifoAlgo6 = new FIFOReplacementAlgo(7);
        runTestPrintPagefault(fifoAlgo6, "FIFO Test Case 6 [rss:15, npf:7] ", pageSequence6);
        System.out.println();


        System.out.println("***LRU Replacement Algorithm***");

        LRUReplacementAlgo lruAlgo1 = new LRUReplacementAlgo(3);
        runTestPrintPagefault(lruAlgo1, "LRU Test Case 1",  pageSequence1);

        LRUReplacementAlgo lruAlgo2 = new LRUReplacementAlgo(3);
        runTestPrintPagefault(lruAlgo2, "LRU Test Case 2",  pageSequence2);

        LRUReplacementAlgo lruAlgo3 = new LRUReplacementAlgo(3);
        runTestPrintPagefault(lruAlgo3, "LRU Test Case 3",  pageSequence3);

        LRUReplacementAlgo lruAlgo4 = new LRUReplacementAlgo(3);
        runTestPrintPagefault(lruAlgo4, "LRU Test Case 4 [rss:15, npf:3]",  pageSequence4);

        LRUReplacementAlgo lruAlgo5 = new LRUReplacementAlgo(5);
        runTestPrintPagefault(lruAlgo5, "LRU Test Case 5 [rss:15, npf:5]",  pageSequence5);

        LRUReplacementAlgo lruAlgo6 = new LRUReplacementAlgo(7);
        runTestPrintPagefault(lruAlgo6, "LRU Test Case 6 [rss:15, npf:7]",  pageSequence6);
        System.out.println();

        System.out.println("***Optimal Replacement Algorithm***");

        OPTReplacementAlgo optAlgo1 = new OPTReplacementAlgo(3);
        runTestPrintPagefault(optAlgo1, "OPT Test Case 1",  pageSequence1);

        OPTReplacementAlgo optAlgo2 = new OPTReplacementAlgo(3);
        runTestPrintPagefault(optAlgo2, "OPT Test Case 2",  pageSequence2);

        OPTReplacementAlgo optAlgo3 = new OPTReplacementAlgo(3);
        runTestPrintPagefault(optAlgo3, "OPT Test Case 3",  pageSequence3);

        OPTReplacementAlgo optAlgo4 = new OPTReplacementAlgo(3);
        runTestPrintPagefault(optAlgo4, "OPT Test Case 4 [rss:15, npf:3]",  pageSequence4);

        OPTReplacementAlgo optAlgo5 = new OPTReplacementAlgo(5);
        runTestPrintPagefault(optAlgo5, "OPT Test Case 5 [rss:15, npf:5]",  pageSequence5);

        OPTReplacementAlgo optAlgo6 = new OPTReplacementAlgo(7);
        runTestPrintPagefault(optAlgo6, "OPT Test Case 6 [rss:15, npf:7]",  pageSequence6);

    }

    private static void runTestPrintPagefault( ReplacementAlgorithm algo, String  testCase, int[] pageSeq){
        for (int i : pageSeq) {
            algo.insert(i);
        }
        System.out.printf("TestCase: %s Page Fault:%d\n", testCase, algo.getPageFaultCount());
    }
}
