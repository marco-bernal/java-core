package com.mab.core.solid.open_closed.good;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClaimApprovalManagerTest {

    private HealthInsuranceSurveyor healthInsuranceSurveyor;
    private VehicleInsuranceSurveyor vehicleInsuranceSurveyor;
    private ClaimApprovalManager claimApprovalManager;

    @BeforeEach
    void setUp() {
        claimApprovalManager = new ClaimApprovalManager();
    }

    @Test
    void shouldProcessHealthInsuranceClaim() {
        //given
        healthInsuranceSurveyor = new HealthInsuranceSurveyor();

        //when
        boolean result = claimApprovalManager.processClaim(healthInsuranceSurveyor);

        //then
        assertThat(result).isTrue();
    }


    @Test
    void shouldProcessVehicleInsuranceClaim() {
        //given
        vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();

        //when
        boolean result = claimApprovalManager.processClaim(vehicleInsuranceSurveyor);

        //then
        assertThat(result).isTrue();
    }
}