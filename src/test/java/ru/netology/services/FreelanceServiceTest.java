package ru.netology.services;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class freelanceServiceTest {
    @Test
    public void freeLance() {

        FreelanceService service = new FreelanceService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int restMonth = service.calculate(income, expenses, threshold);

        System.out.println(restMonth);

    }


}