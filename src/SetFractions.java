import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SetFractions {
    List<Fraction> set = new ArrayList<>();

    public void addFraction(Fraction F){
        set.add(F);
    }

    public Fraction getMax() {
        return Collections.max(set);
    }

    public Fraction getMin() {
        return Collections.min(set);
    }

    public int countMoreThan(Fraction F) {
        int count_more = 0;
        for (int i = 0; i < set.size(); i++) {
            if (set.get(i).compareTo(F) > 0) {
                count_more++;
            }
        }
        return count_more;
    }

    /*public int countLessThan(Fraction F){
        int count_less = 0;
        for (int i = 0; i < set.size(); i++){
            if (set.get(i).compareTo(F) < 0){
                count_less++;
            }
        }
        return count_less;
    }*/

    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i < set.size(); i++){
            str += set.get(i).toString();
        }
        return str;
    }
}