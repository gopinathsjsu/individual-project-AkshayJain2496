package com.inventory;

import com.inventory.Category;
import com.inventory.Chain;
import com.inventory.EssentialLimit;
import com.inventory.Items;
import java.util.HashMap;
import java.util.Set;

public class Essentials implements Chain {

    private  Chain nextInChain;


    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }


    public double calculate(HashMap<String, Items> inventory , String item , int quantity, Set<String> error,
          Set<String> essentialsSeen,Set<String> luxurySeen,Set<String> MiscSeen) {
        Items items = inventory.get(item);

        if(items.Category == Category.ESSENTIALS){
            essentialsSeen.add(item);
            if(quantity<=items.getQuantity()){
                EssentialLimit.setTotalEssential(quantity);
                items.setQuantity(items.getQuantity()-quantity);
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