import java.util.ArrayList;

public class LRUReplacementAlgo extends ReplacementAlgorithm{

    ArrayList<Integer> pageInsertSequence;

    /**
     * @param pageFrameCount - the number of physical page frames
     */
    public LRUReplacementAlgo(int pageFrameCount) {
        super(pageFrameCount);
        pageInsertSequence = new ArrayList<>();
    }

    @Override
    public void insert(int pageNumber) {
        if(pageInsertSequence.contains( pageNumber)) {
            pageInsertSequence.remove(Integer.valueOf(pageNumber));
        }
        else if(pageFrameCount <= pageInsertSequence.size()){
            pageInsertSequence.remove(0);
            pageFaultCount++;
        }
        pageInsertSequence.add(pageNumber);
    }
}
