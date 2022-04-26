# JavaTCP
Simple TCP server and client written in Java.

## Usage notes
To run, compile both of them. Then first run the server application and then run the Client application.
```
$ javac TCPServer.java TCPClient.java
$ java TCPServer
Server started
Waiting for a client...
```
Open a separate terminal:
```
$ java TCPClient
```
Once connection is established, you can send a message.
To end connection type ```Over```
Example:
```
Hello world!
Goodnight moon!
Over
```
You'll then get:
```Closing Connection```
