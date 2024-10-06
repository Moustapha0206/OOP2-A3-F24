package com.champlain.oop2assignment3;

import java.util.Comparator;

public class RankFirstComparator implements Comparator<Card> {

    @Override
    public int compare(Card firstCard, Card secondCard) {

        int comparison = firstCard.getRank().compareTo(secondCard.getRank());

        if (comparison == 0)
            return firstCard.getSuit().compareTo(secondCard.getSuit());

        return comparison;
    }
}
