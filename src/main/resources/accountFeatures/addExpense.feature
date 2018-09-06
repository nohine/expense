Feature: transfer
    As a customer
    I want to add Expense to my account

Background:
    Given an account balance is 200

Scenario: Add expense amount less than balance
    When I add expense 100 from ATM
    Then my account balance is 100

Scenario: Add expense amount more than balance
    When I add expense 300 from ATM
    Then my account balance is 200
