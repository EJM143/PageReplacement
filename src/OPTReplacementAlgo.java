import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * Represents the Optimal page replacement algorithm
 * Inherits from the ReplacementAlgorithm class
 */
public class OPTReplacementAlgo extends ReplacementAlgorithm{
    ArrayList<Integer> pageRequestsequence;
    /**
     * Constructs a OPTReplacementAlgo object with the specified
     *      * number of page frames.
     * @param pageFrameCount  the number of physical page frames
     */
    public OPTReplacementAlgo(int pageFrameCount) {
        super(pageFrameCount);
        pageRequestsequence = new ArrayList<>();
    }

    /**
     * Calculates and returns the total number of page faults using
     * the OPT algorithm.
     * @return  the total number of page faults.
     */
    @Override
    public int getPageFaultCount() {
        pageFaultCount = 0;
        ArrayList<Integer> inMemPages = new ArrayList<>();

        for(int i = 0; i < pageRequestsequence.size();i++){
            if( !inMemPages.contains(pageRequestsequence.get(i))){
                pageFaultCount++;
                if(inMemPages.size() >= pageFrameCount){

                    //Evict one page and replace with current page
                    ArrayList<Integer> temp = new ArrayList<>(inMemPages);
                    for(int j = i+1; j < pageRequestsequence.size() && temp.size() > 1 ; j++){
                        if(temp.contains(pageRequestsequence.get(j)))
                        {
                            temp.remove(Integer.valueOf(pageRequestsequence.get(j)));
                        }
                    }
                    inMemPages.remove(Integer.valueOf(temp.get(0)));
                    inMemPages.add(pageRequestsequence.get(i));

                }else  {
                    inMemPages.add(pageRequestsequence.get(i));
                }
            }


        }

        return pageFaultCount;

    }

    /**
     * Inserts a page into the request sequence.
     * @param pageNumber    the number of the pages to be inserted.
     */
    @Override
    public void insert(int pageNumber) {
        pageRequestsequence.add(pageNumber);
    }
}
