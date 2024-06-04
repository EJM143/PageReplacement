import java.util.ArrayList;

/**
 * Represents the LRU page replacement algorithm
 * Inherits from the ReplacementAlgorithm class
 */
public class LRUReplacementAlgo extends ReplacementAlgorithm{

    ArrayList<Integer> pageInsertSequence;

    /**
     * Constructs a LRUReplacementAlgo object with the specified
     * number of page frames.
     *
     * @param pageFrameCount  the number of physical page frames.
     */
    public LRUReplacementAlgo(int pageFrameCount) {
        super(pageFrameCount);
        pageInsertSequence = new ArrayList<>();
    }
    /**
     * Inserts a page into memory using the LRU replacement algorithm.
     * If the page is already in memory, it moves it to the most recently used.
     * If the page frames are full, it evicts the least recently used page.
     * @param pageNumber    the number of the page to be inserted.
     */
    @Override
    public void insert(int pageNumber) {
        if(pageInsertSequence.contains( pageNumber)) {
            pageInsertSequence.remove(Integer.valueOf(pageNumber));
        }
        else{
            pageFaultCount++;
            if(pageFrameCount <= pageInsertSequence.size()){
                pageInsertSequence.remove(0);
            }
        }
        pageInsertSequence.add(pageNumber);
    }
}

