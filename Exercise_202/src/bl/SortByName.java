package bl;

import java.util.Comparator;

public class SortByName implements Comparator<Sender>{

    @Override
    public int compare(Sender o1, Sender o2) {
        if(o1.getFrequence()<o2.getFrequence()) return -1;
        if(o1.getFrequence()>o2.getFrequence()) return 1;
        return 0;
    }
    
}
