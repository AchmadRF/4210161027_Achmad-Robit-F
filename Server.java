
package udp;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {
  
    public static void main(String[] args) throws IOException {
       DatagramSocket ds = null;
       try{
           ds = new DatagramSocket();
           byte[] receive = new byte[65535]; 
           while(true){
             DatagramPacket DpReceive = null; 
       
             DpReceive = new DatagramPacket(receive, receive.length); 
             ds.receive(DpReceive);
             
             ByteArrayInputStream Inbyte = new ByteArrayInputStream(DPReceive.getData());
             Out
           }
       }
        
        byte[] send = null;
        InetAddress ipchus = InetAddress.getByName("192.168.43.28");
        
   
               
            System.out.println("Client:-" + data(receive));
            if (data(receive).toString().equals("bye")) 
            { 
                System.out.println("Client sent bye.....EXITING"); 
                 
            } 
            receive = new byte[65535];
        
    
            send = inp.getBytes(); 
            DatagramPacket DpSend = 
                  new DatagramPacket(send, send.length,ipchus,1234); 
  
            ds.send(DpSend);
    } 
    }
