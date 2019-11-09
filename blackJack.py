import  random

def addCard():
    card3 = random.randint(1,13)
    return card3

def cardSum(list):
    sum = 0
    for i in range(len(list)):
        sum = sum + list[i]
    return sum

def bet():
    cash = input('enter the bet you wish to place: ')
    return cash

def betSum(bet, newBet):
    bet = int(bet) + int(newBet)
    return bet

while True:
    print('enter the initial bet you would like to place: ')
    bet = input()
    card1 = random.randint(1, 13)
    card2 = random.randint(1, 13)
    cardList = [card1, card2]

    while True:
        string = ''
        for x in cardList:
            string = string + str(x) + " "
        print('your cards are: ', string, 'and their sum is: ', cardSum(cardList))

        print('what actions would you like to do? ')
        print('1: request another card ')
        print('2: place an extra bet ')
        print('3: fold ')
        call = int(input())

        if (call == 1):
            card3 = addCard()
            cardList.append(card3)
            for x in cardList[2:]:
                string = string + str(x) + " "
            print('your cards are: ', string, 'and their sum is: ', cardSum(cardList))
        if (call == 2):
            print('the total sum is: ', betSum(bet, input('how mcuh would you like to place? ')))
        if (call == 3):
            print('you folded')
            break
    break