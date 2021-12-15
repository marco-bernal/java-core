package com.mab.core.solid.open_closed.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HealthInsuranceSurveyor extends InsuranceSurveyor {

    @Override
    public boolean isValidClaim() {
        log.info("HealthInsuranceSurveyor: Validating health insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
    }
}
