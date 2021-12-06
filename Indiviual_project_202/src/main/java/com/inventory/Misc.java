package com.inventory;

import java.util.HashMap;
import java.util.Set;

public class Misc implements Chain{

    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public double calculate(HashMap<String, Items> inventory , String item , int quantity, Set<String> error,
                            Set<String> essentialsSeen,Set<String> luxurySeen,Set<String> MiscSeen)  {
        Items items = inventory.get(item);
        if(items.Category == Category.MISCELLENEOUS){
            MiscSeen.add(item);
            if(quantity<=items.getQuantity()){
                EssentialLimit.setTotalMisc(quantity);
                items.setQuantity(quantity);
                return quantity* items.getPrice();
            }


            else{
                error.add(item);
                return 0;
            }
        }
        else {
            return nextInChain.calculate(inventory,item , quantity,error,essentialsSeen,luxurySeen,MiscSeen);
        }
    }
}
