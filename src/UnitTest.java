import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    void TestFIFO() {
        int[] pageSequence = {5,8,3,1,9,0,3,5,0,3,4,0,1,6,4};

        FIFOReplacementAlgo fifoAlgo = new FIFOReplacementAlgo(3);
        for (int i : pageSequence) {
            fifoAlgo.insert(i);
        }
        assertEquals(13, fifoAlgo.getPageFaultCount());

        FIFOReplacementAlgo fifoAlgo1 = new FIFOReplacementAlgo(5);
        for (int i : pageSequence) {
            fifoAlgo1.insert(i);
        }
        assertEquals(9, fifoAlgo1.getPageFaultCount());
    }

    @Test
    void TestLRU() {

        int[] pageSequence = {5,8,3,1,9,0,3,5,0,3,4,0,1,6,4};

        LRUReplacementAlgo lruAlgo = new LRUReplacementAlgo(3);
        for (int i : pageSequence) {
            lruAlgo.insert(i);
        }
        assertEquals(12, lruAlgo.getPageFaultCount());

        LRUReplacementAlgo lruAlgo1 = new LRUReplacementAlgo(5);
        for (int i : pageSequence) {
            lruAlgo1.insert(i);
        }
        assertEquals(10, lruAlgo1.getPageFaultCount());
    }

    @Test
    void TestOPT() {

        int[] pageSequence = {5,8,3,1,9,0,3,5,0,3,4,0,1,6,4};

        OPTReplacementAlgo optAlgo = new OPTReplacementAlgo(3);
        for (int i : pageSequence) {
            optAlgo.insert(i);
        }
        assertEquals(9, optAlgo.getPageFaultCount());

        OPTReplacementAlgo optAlgo1 = new OPTReplacementAlgo(5);
        for (int i : pageSequence) {
            optAlgo1.insert(i);
        }
        assertEquals(8, optAlgo1.getPageFaultCount());
    }
}
