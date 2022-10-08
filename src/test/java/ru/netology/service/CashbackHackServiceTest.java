package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        int amount = 700;
        int expected = 300;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);
    }
    @Test
    public void remainnoammaunt() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);
    }
    @Test
    public void remainfull() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals (expected, actual);
    }
}