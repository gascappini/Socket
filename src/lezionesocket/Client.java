/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lezionesocket;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OutputStream os = null;
        InputStreamWriter osw =null;
        Socket socket = null;
        
        try {
            // TODO code application logic here
            //punto 1, richiesta di connessione al server
            os = new FileOutputStream("out.txt");
            osw = new OutputStreamWriter(os);
            osw.write("Writing...");
        }catch(FileNotFoundException ex){
            Logger.getLogger(name);
        }
             socket = new Socket("127.0.0.1",2000);
            
            
            System.out.println("client connesso con il server");
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        finally{
            
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
        
        
        
    }
    
}
