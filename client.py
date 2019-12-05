import socket as sc
import json

client = sc.socket(sc.AF_INET, sc.SOCK_STREAM)
address = ('localhost' , 3584)
client.connect(address)

try:
    message = 'this is the message, it is way too long but we are using chunks of 16 to send it'
    new_message = json.dumps(message)
    print('sending {!r}'.format(new_message))
    client.sendall(new_message.encode())

    amount1 = 0
    amount2 = len(new_message)

    while amount1< amount2:
        data = client.recv(16)
        amount1 += len(data)
        print('recieved {!r}'.format(data))
finally:
    print("closing socket")
    client.close()

