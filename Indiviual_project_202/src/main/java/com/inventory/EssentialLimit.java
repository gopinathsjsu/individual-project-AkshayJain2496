package com.inventory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EssentialLimit {
    private static EssentialLimit essentialLimit = null;
     static int totalAmount;
     static int totalEssential=5;
     static int totalLuxury=3;
     static int totalMisc=6;

    public static int getTotalAmount() {
        return totalAmount;
    }

    public static int getTotalEssential() {
        return totalEssential;
    }

    public static int getTotalLuxury() {
        return totalLuxury;
    }

    public static int getTotalMisc() {
        return totalMisc;
    }

    public static void setTotalAmount(int totalAmount) {
        EssentialLimit.totalAmount -= totalAmount;
    }

    public static void setTotalEssential(int totalEssential) {
        EssentialLimit.totalEssential -= totalEssential;
    }

    public static void setTotalLuxury(int totalLuxury) {
        EssentialLimit.totalLuxury -= totalLuxury;
    }

    public static void setTotalMisc(int totalMisc) {
        EssentialLimit.totalMisc -= totalMisc;
    }

    // Static method
    // Static method to create instance of Singleton class
    public static EssentialLimit getInstance()
    {
        if (essentialLimit == null)
            essentialLimit = new EssentialLimit();

        return essentialLimit;
    }
}
