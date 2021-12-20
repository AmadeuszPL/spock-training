package com.amadeusz.training.spocktests.wildcardargumenttest

class CalendarHelper {

    CalendarClient client

    void book(String message) {
        client.bookTimeSlot message
    }
}
