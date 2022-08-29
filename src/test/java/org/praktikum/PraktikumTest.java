package org.praktikum;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Parameterized.class)
public class PraktikumTest {
    private final String firstAndLastNames;
    private final Boolean result;

    public PraktikumTest(String firstAndLastNames, Boolean result) {
        this.firstAndLastNames = firstAndLastNames;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}: FIO = {0}, result = {1}")
    public static Object[][] getData() {
        return new Object[][] {
                {"Тимоти Шаламе", Boolean.TRUE},
                {"ТимотейШевроле", Boolean.FALSE},
                {"Тимоти  Шаламе", Boolean.FALSE},
                {"ТимотейШевроле ", Boolean.FALSE},
                {" ТимотейШевроле", Boolean.FALSE},
                {" ТимотейШевроле ", Boolean.FALSE},
                {"ТимотейШевролеТимоти Шаламе", Boolean.FALSE},
                {"ТШ", Boolean.FALSE}
        };
    }

    @Test
    @DisplayName("Параметризованный тест. Тестирование функции проверки имени и фамилии владельца банковской карты")
    public void correctFIOCheck() {
        assertThat(new Account(firstAndLastNames).checkNameToEmboss(), equalTo(result));
    }
}
