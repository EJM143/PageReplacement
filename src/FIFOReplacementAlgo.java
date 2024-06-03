import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FIFOReplacementAlgo extends ReplacementAlgorithm {
    Queue<Integer> pageInsertSequence;


   /* 7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1
      8,1,0,7,3,0,3,4,5,3,5,2,0,6,8,4,8,1,5,3
      4,6,4,8,6,3,6,0,5,9,2,1,0,4,6,3,0,6,8,4*/
    /**
     * @param pageFrameCount - the number of physical page frames
     */
    public FIFOReplacementAlgo(int pageFrameCount) {
        super(pageFrameCount);
        pageInsertSequence = new LinkedList<Integer>();
    }

    @Override
    public void insert(int pageNumber) {
        if(pageInsertSequence.contains( pageNumber))
            return;
        if(pageFrameCount <= pageInsertSequence.size()){
            pageInsertSequence.poll();
            pageFaultCount++;
        }
        pageInsertSequence.offer(pageNumber);
    }
}
