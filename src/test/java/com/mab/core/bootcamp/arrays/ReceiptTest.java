package com.mab.core.bootcamp.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ReceiptTest {

    private Receipt receipt;

    @BeforeEach
    void setUp() {
        receipt = new Receipt();
    }

    @Test
    void printReceipt() {

        //when
        receipt.printReceipt();

        //then TODO: Verify if possible to fix it
        //verify(receipt, times(1)).printReceipt();
    }
}