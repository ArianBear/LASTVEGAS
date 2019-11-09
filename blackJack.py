import random


def add_card():
    card = random.randint(1, 13)
    return card


def card_sum(card_list):
    cardsum = 0
    for i in range(len(card_list)):
        cardsum = int(cardsum)+ int(card_list[i])
    return cardsum


def bet():
    cash = input('enter the bet you wish to place: ')
    return cash


def bet_sum(placed_bet, new_bet):
    placed_bet = int(placed_bet) + int(new_bet)
    return bet


def exit_cases(sum_of_cards, bet_that_placed):
    if int(sum_of_cards) == 21:
        print('you won and your prize is: ', int(bet_that_placed))
        exit()
    elif int(sum_of_cards) > 21:
        print('the sum of cards is bigger than 21, you loose :( .\nyour sum was: ', sum_of_cards)
        exit()


while True:
    print('enter the initial bet you would like to place: ')
    fresh_bet = input()
    card1 = random.randint(1, 13)
    card2 = random.randint(1, 13)
    cardList = [card1, card2]

    while True:
        string = ''
        for x in cardList:
            string = string + str(x) + " "
        print('your cards are: ', string, 'and their sum is: ', card_sum(cardList))
        exit_cases(card_sum(cardList), fresh_bet)
        print('what actions would you like to do? ')
        print('1: request another card ')
        print('2: place an extra bet ')
        print('3: fold ')
        call = int(input())

        if call == 1:
            card3 = add_card()
            cardList.append(card3)
            for x in cardList[2:]:
                string = string + str(x) + " "
            print('your cards are: ', string, 'and their sum is: ', card_sum(cardList))
            exit_cases(card_sum(cardList), fresh_bet)
        if call == 2:
            print('the total sum is: ', bet_sum(fresh_bet, input('how much would you like to place? ')))
        if call == 3:
            print('you folded')
            break
    break
