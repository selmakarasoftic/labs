package src.main.java.org.example.week6.HashMaps.task2;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap <String,Double> loans;
    public PromissoryNote(){
        loans=new HashMap<String,Double>();
    }

    public void setLoan(String toWhom,double value){
        loans.put(toWhom,value);
    }
    public double howMuchIsDebt(String whose){
        if (loans.containsKey(whose))
            return loans.get(whose);
        return 0;
    }
}
