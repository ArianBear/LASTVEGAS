import socket
import select
import errno
import sys

HEADER = 10
IP = "192.168.2.100"
PORT = 3584
username = input("What Is My Name: ")

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect((IP, PORT))
client.setblocking(0)
Username = username.encode('utf-8')
usernameHeader = f"{len(Username):<{HEADER}}".encode('utf-8')
client.send(usernameHeader + Username)

while 1:
    message = input(f'{Username} > ')
    if (message):
        message = message.encode('utf-8')
        messageHeader = f"{len(message):<{HEADER}}".encode('utf-8')
        client.send(messageHeader + message)
    try:
        while 1:
            usernameHeader = client.recv(HEADER)
            if (not len(usernameHeader)):
                print(
                    'Connection denied, It could be either you or the server, probably you, egoist :(')
                sys.exit()
            usernameLength = int(usernameHeader.decode('utf-8').strip())
            Username = client.recv(usernameLength).decode('utf-8')
            messageHeader = client.recv(HEADER)
            messageLength = int(messageHeader.decode('utf-8'))
            print(f'{Username} > {message}')
    except IOError as e:
        if (e.errno != errno.EAGAIN and e.errno != errno.EWOULDBLOCK):
            print('REading Error: {}'.format(str(e)))
            sys.exit()
            continue
    except Exception as e:
        print('Reading Error: '.format(str(e)))
        sys.exit()
