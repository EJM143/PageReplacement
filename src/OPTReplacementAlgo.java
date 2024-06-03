import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class OPTReplacementAlgo extends ReplacementAlgorithm{
    ArrayList<Integer> pageRequestsequence;
    /**
     * @param pageFrameCount - the number of physical page frames
     */
    public OPTReplacementAlgo(int pageFrameCount) {
        super(pageFrameCount);
        pageRequestsequence = new ArrayList<>();
    }

    @Override
    public int getPageFaultCount() {
        pageFaultCount = 0;
        ArrayList<Integer> inMemPages = new ArrayList<>();

        for(int i = 0; i < pageRequestsequence.size();i++){
            if( !inMemPages.contains(pageRequestsequence.get(i))){
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
                    pageFaultCount++;
                    inMemPages.add(pageRequestsequence.get(i));

                }else  {
                    inMemPages.add(pageRequestsequence.get(i));
                }
            }


        }

        return pageFaultCount;

    }

    @Override
    public void insert(int pageNumber) {
        pageRequestsequence.add(pageNumber);
    }
}
