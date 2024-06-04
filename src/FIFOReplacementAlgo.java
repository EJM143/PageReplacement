import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Represents the FIFO page replacement algorithm
 * Inherits from the ReplacementAlgorithm class
 */
public class FIFOReplacementAlgo extends ReplacementAlgorithm {
    Queue<Integer> pageInsertSequence;


   /* 7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1
      8,1,0,7,3,0,3,4,5,3,5,2,0,6,8,4,8,1,5,3
      4,6,4,8,6,3,6,0,5,9,2,1,0,4,6,3,0,6,8,4*/
    /**
     * Constructs a FIFOReplacementAlgo object with the specified
     * number of page frames
     * @param pageFrameCount - the number of physical page frames
     */
    public FIFOReplacementAlgo(int pageFrameCount) {
        super(pageFrameCount);
        pageInsertSequence = new LinkedList<Integer>();
    }

    /**
     * Inserts a page into memory using the FIFO replacement algorithm.
     * If the page is already in memory, it does not insert it again.
     * If the page frames are full, it evicts the oldest page.
     * @param pageNumber    the number of the page to be inserted.
     */
    @Override
    public void insert(int pageNumber) {
        if(pageInsertSequence.contains( pageNumber))
            return;
        if(pageFrameCount <= pageInsertSequence.size()){
            pageInsertSequence.poll();
        }
        pageFaultCount++;
        pageInsertSequence.offer(pageNumber);
    }
}