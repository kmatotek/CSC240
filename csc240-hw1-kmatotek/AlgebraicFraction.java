import java.util.ArrayList;
public class AlgebraicFraction {
    public ArrayList<Object> numerator;
    public ArrayList<Object> denominator;

    public static void main(String[] args){
        
    }
    public AlgebraicFraction(Object[] num, Object[] denom){
        numerator = new ArrayList<>();
        denominator = new ArrayList<>();
        
        for(Object item : num){
            numerator.add(item);
        }

        for(Object item : denom){
            denominator.add(item);
        }

        for(Object item: numerator){
            if(denominator.contains(item)){
                numerator.remove(item);
                denominator.remove(item);
            }
        }

    }
        
    public AlgebraicFraction multiply(AlgebraicFraction other){
        ArrayList<Object> combinedNumerator  = new ArrayList<Object>();
        ArrayList<Object> combinedDenominator = new ArrayList<Object>();

        combinedNumerator.addAll(this.numerator);
        combinedNumerator.addAll(other.numerator);

        combinedDenominator.addAll(this.denominator);
        combinedDenominator.addAll(other.denominator);

        for(Object item: combinedNumerator){
            if(combinedDenominator.contains(item)){
                combinedNumerator.remove(item);
                combinedDenominator.remove(item);
            }
        }

        return new AlgebraicFraction(combinedNumerator.toArray(),combinedDenominator.toArray());

    }
    public String toString(){
        StringBuilder fraction = new StringBuilder();
        fraction.append("( ");

        for(Object item : numerator){
            fraction.append(item);
            if(numerator.indexOf(item) < numerator.size() - 1)
            fraction.append(" ");
        }

        fraction.append(") / (");

        for(Object item : denominator){
            fraction.append(item);
            if(denominator.indexOf(item) < denominator.size() - 1)
            fraction.append(" ");
        }
        fraction.append(" )");
        return fraction.toString();
    }
}
