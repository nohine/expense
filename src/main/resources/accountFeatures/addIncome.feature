Feature: transfer
    As a customer
    I want to add Income to my account

Background:
    Given an account balance is 200


Scenario: Add Income amount to my balance
     When I add income 100 from ATM
     Then my account balance is 300

