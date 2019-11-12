public class Polynomial {
    private SetFractions p = new SetFractions();

    private Polynomial(){}

    Polynomial(SetFractions t){
        p = t;
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i < p.set.size(); i++){
            if(i == 0){
                if((p.set.get(i).getNumerator() > 0 && p.set.get(i).getDenominator() > 0) || (p.set.get(i).getNumerator() < 0 && p.set.get(i).getDenominator() < 0)){
                    str += p.set.get(i).toStringAbs();
                }
                else{
                    str += "-" + p.set.get(i).toStringAbs();
                }
            }
            else{
                if (i == p.set.size() - 1){
                    str += p.set.get(i).toStringAbs();
                    break;
                }
                else{
                    str += p.set.get(i).toStringAbs();
                }
            }
            if(p.set.size() - i == 2){
                if((p.set.get(i + 1).getNumerator() > 0 && p.set.get(i + 1).getDenominator() > 0) || (p.set.get(i + 1).getNumerator() < 0 && p.set.get(i + 1).getDenominator() < 0)){
                    str += "x + ";
                }
                else{
                    str += "x - ";
                }

            }
            else{
                if(p.set.size()- i > 2){
                    if((p.set.get(i + 1).getNumerator() > 0 && p.set.get(i + 1).getDenominator() > 0) || (p.set.get(i + 1).getNumerator() < 0 && p.set.get(i + 1).getDenominator() < 0) ){
                        str += "x^" + (p.set.size()- i - 1) + " + ";
                    }
                    else{
                        str += "x^" + (p.set.size()- i - 1) + " - ";
                    }

                }
            }
        }
        return str;
    }

    public Polynomial sum(Polynomial Pol){
        Polynomial res = new Polynomial();
        int diff = Math.abs(Pol.p.set.size() - this.p.set.size());
        if (this.p.set.size() > Pol.p.set.size()){
            res = this;
            for (int i = 0; i < Pol.p.set.size(); i++){
                res.p.set.set(i + diff, res.p.set.get(i + diff).sumFractions(Pol.p.set.get(i)));
            }
        }
        else{
            res = Pol;
            for (int i = 0; i < this.p.set.size(); i++){
                res.p.set.set(i + diff, res.p.set.get(i + diff).sumFractions(this.p.set.get(i)));
            }
        }
        return res;
    }
}