package seedu.expense.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import seedu.expense.model.budget.Budget;
import seedu.expense.model.expense.Amount;

class JsonAdaptedBudgetTest {

    @Test
    void toModelType_validAmount_returnsBudgetWithCorrectAmount() {
        Budget expectedBudget = new Budget();
        expectedBudget.topupBudget(new Amount("1.01"));
        JsonAdaptedBudget budget = new JsonAdaptedBudget(expectedBudget);
        assertEquals(expectedBudget.toString(), budget.toModelType().toString());
    }
}