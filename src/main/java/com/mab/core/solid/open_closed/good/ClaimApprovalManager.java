package com.mab.core.solid.open_closed.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ClaimApprovalManager {

    boolean processClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            log.info("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }

        return true;
    }
}
