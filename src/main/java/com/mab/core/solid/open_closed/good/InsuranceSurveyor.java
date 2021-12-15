package com.mab.core.solid.open_closed.good;

//This class could be an interface. Prefer interfaces than abstract classes, since you can simulate multiple inheritance
//by doing so. Use abstract classes when you need to share fields through all the child classes.
public abstract class InsuranceSurveyor {

    public abstract boolean isValidClaim();
}
