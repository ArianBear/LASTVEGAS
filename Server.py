import socket
import select

HEADER = 10

IP = "192.168.2.100"
PORT = 3584

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
server.bind((IP, PORT))
server.listen()
socketList = [server]
clients = {}
print(f'Waiting for Players')


def recieveMessage(clientSocket):
    try:
        message_header = clientSocket.recv(HEADER)
        if (not len(message_header)):
            return False
        messageLength = int(message_header.decode('utf-8').strip())
        return {'header': message_header, 'data': clientSocket.recv(messageLength)}

    except:
        return False


while 1:
    readSockets, _, exceptionSockets, = select.select(
        socketList, [], socketList)
    for notifiedSocket in readSockets:
        if (notifiedSocket == server):
            clientSocket, clientAddress = server.accept()
            user = recieveMessage(clientSocket)
            if (user is False):
                continue
            socketList.append(clientSocket)
            clients[clientSocket] = user
            print('{}:{} has joined the session'.format(
                *clientAddress, user['data'].decode('utf-8')))
        else:
            message = recieveMessage(notifiedSocket)
            if (message == 0):
                print('{} has disconnected'.format(
                    clients[notifiedSocket]['data'].decode('utf-8')))
                socketList.remove(notifiedSocket)
                del clients[notifiedSocket]
                continue
            user = clients[notifiedSocket]
            print(
                f'Recieved message from {user["data"].decode("utf-8")}:{message["data"].decode("utf-8")}')
            for clientSocket in clients:
                if (clientSocket != notifiedSocket):
                    clientSocket.send(
                        user['header'] + user['data'] + message['header'] + message['data'])
    for notifiedSocket in exceptionSockets:
        socketList.remove(notifiedSocket)
        del clients[notifiedSocket]
