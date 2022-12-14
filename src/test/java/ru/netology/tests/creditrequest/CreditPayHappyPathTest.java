package ru.netology.tests.creditrequest;

import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.SQL;
import ru.netology.databaseentities.CreditRequestEntity;
import ru.netology.databaseentities.OrderEntity;
import ru.netology.databaseentities.PaymentEntity;
import ru.netology.pages.MainPage;
import ru.netology.pages.PaymentPage;
import ru.netology.tests.TestBaseUI;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.data.Data.getApprovedCard;
import static ru.netology.data.Data.getDeclinedCard;
import static ru.netology.data.SQL.*;

public class CreditPayHappyPathTest extends TestBaseUI {
    MainPage mainPage = new MainPage();
    PaymentPage paymentPage = new PaymentPage();

    @BeforeEach
    void setUpForPayWithCredit() {
        mainPage.payWithCredit();
    }

    static List<CreditRequestEntity> credits = SQL.getCreditsRequest();
    static List<OrderEntity> orders = SQL.getOrders();

    @Test
    public void shouldSuccessPayIfValidApprovedCards() {
        val cardData = getApprovedCard();
        paymentPage.fillCardData(cardData);
        paymentPage.shouldSuccessNotification();

        credits = SQL.getCreditsRequest();
        orders = SQL.getOrders();

        val expectedStatus = "APPROVED";
        val actualStatus = credits.get(0).getStatus();
        assertTrue(expectedStatus.equalsIgnoreCase(actualStatus));

        val expectedPaymentId = orders.get(0).getPayment_id();
        val actualBankId = credits.get(0).getBank_id();
        assertEquals(expectedPaymentId, actualBankId);
    }
}
