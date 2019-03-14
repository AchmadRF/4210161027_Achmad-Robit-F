
package udp;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main (String args[]) throws IOException{
        DatagramSocket ds = null; 
        try{
            ds = new DatagramSocket();
            Player a = new Player(14032019,200,300, (float) 1.2);
            
            ByteArrayOutputStream Bit = new ByteArrayOutputStream();
            ObjectOutputStream obj = new ObjectOutputStream(Bit);
            obj.writeObject(a);
            
            // convert the String input into the byte array. 
            byte [] buf = Bit.toByteArray();
            InetAddress ip = InetAddress.getLocalHost();
            int MyPort = 1234;
            
            // Step 2 : Create the datagramPacket for sending 
            // the data. 
            DatagramPacket DpSend =  new DatagramPacket(buf, buf.length, ip, MyPort); 
  
            // Step 3 : invoke the send call to actually send 
            // the data. 
            ds.send(DpSend); 
            // break the loop if user enters "bye" 
        }
        catch(Exception e){
            System.out.println("Error unable to send" + e);
        }
    } 
} 
    
