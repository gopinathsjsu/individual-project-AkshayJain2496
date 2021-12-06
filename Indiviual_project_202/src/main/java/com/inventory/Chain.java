package com.inventory;

import java.util.HashMap;
import java.util.Set;

public interface Chain {

    public void setNextChain(Chain nextChain);

    public double calculate(HashMap<String, Items> inventry , String item , int quantity, Set<String> error,
                            Set<String> essentialsSeen,Set<String> luxurySeen,Set<String> MiscSeen);


}
