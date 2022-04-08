/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lezionesocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServerSocket serverSocket = null;
        
        Socket socket = null;
        
        try {
        
            // TODO code application logic here
            //punto 1, server in ascolto su una porta
            serverSocket=new ServerSocket(2000);
            System.out.println("server avviato correttamente");
            //punto 2, server in attesa di connessione
            socket=serverSocket.accept();
            System.out.println("connessione con il client avvenuta");
            System.out.println("Socket: " + socket);
            
            socket.getRemoteSocketAddress();
            
            //punto 3, scambio dati
            
            //punto 4, chiusura socket
        
        
            
            
            } catch (IOException ex) {
            System.err.println("errore nella creazione del server, nell'avvio del servizio");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            finally{
                 
            if(socket != null)
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
                  }
            
        
        
        
                
        
        
    }
    
}


//se cerco 127.0.0.1 sul server comunico con il server http
//127.0.0.1 corrisponde all'URL "localhost"
//
//
//tasto destro sul progetto, propertys, build, 
//Socket è l'oggetto che serve per scambiare dati con un altro host attraverso gli stream
//ogni host deve avere il suo socket
//ServerSocket funge a conncectionsocket degidendo tempi di connessione ecc.
//
//
//
//
//

