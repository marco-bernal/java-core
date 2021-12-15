package com.mab.core.solid.open_closed.bad;

public class ClaimApprovalManager {

    public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }

    //Updated method for adding support to vehicle claims
    public void processVehicleClaim(VehicleInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
