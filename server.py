import socket as sc

server = sc.socket(sc.AF_INET, sc.SOCK_STREAM)
address = ('127.0.0.1', 3584)
server.bind(address)

server.listen(1)

while 1:
    print("waiting for a connection...")
    connection, second_address = server.accept()
    try:
        print("connection form...", second_address)
        while 1:
            data = connection.recv(16)
            if data:
                print('sending data back to the client...')
                connection.sendall(data)
            else:
                print("no data recieved from: ", second_address, " :(")
                break
    finally:
        print("closing the connection...")




