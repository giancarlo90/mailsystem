/**
 * A class to model a simple mail item. The item has sender and recipient
 * addresses and a message string.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MailTest
{


    public String testFuncionalidad01(){
        int numeroDeTests = 0;
        int numeroDeTestsOk = 0;
        int numeroDeTestsFail = 0;
        String proceso = "";

        MailServer server = new MailServer();
        MailClient client1 = new MailClient(server,"client1");
        MailClient client2 = new MailClient(server, "client2");

        client1.sendMailItem("client2", "Prueba", "Prueba");
        System.out.println("Enviando un E-mail");
        numeroDeTests = numeroDeTests + 1;
        System.out.println("Examinando los E-mails recibidos en el servidor");
        if (server.howManyMailItems("client2") == numeroDeTests){
            numeroDeTestsOk =numeroDeTestsOk + 1;
            System.out.println("Funciona corretamente");
        }
        else {
            numeroDeTestsFail = numeroDeTestsFail + 1;
            System.out.println("Error. Se esperaba " + numeroDeTests +" mensaje(s)");
        }
        
        client1.sendMailItem("client2", "Prueba", "Prueba");
        System.out.println("Enviando un E-mail");
        numeroDeTests = numeroDeTests + 1;
        System.out.println("Examinando los E-mails recibidos en el servidor");
        if (server.howManyMailItems("client2") == numeroDeTests){
            numeroDeTestsOk = numeroDeTestsOk + 1;
            System.out.println("Funciona corretamente");
        }
        else {
            numeroDeTestsFail = numeroDeTestsFail + 1;
            System.out.println("Error. Se esperaba " + numeroDeTests +" mensaje(s)");
        }
        
        client1.sendMailItem("client2", "Prueba", "Prueba");
        System.out.println("Enviando un E-mail");
        numeroDeTests = numeroDeTests + 1;
        System.out.println("Examinando los E-mails recibidos en el servidor");
        if (server.howManyMailItems("client2") == numeroDeTests){
            numeroDeTestsOk = numeroDeTestsOk + 1;
            System.out.println("Funciona corretamente");
        }
        else {
            numeroDeTestsFail = numeroDeTestsFail + 1;
            System.out.println("Error. Se esperaba " + numeroDeTests +" mensaje(s)");
        }
        
        client1.sendMailItem("client2", "Prueba", "Prueba");
        System.out.println("Enviando un E-mail");
        numeroDeTests = numeroDeTests + 1;
        System.out.println("Examinando los E-mails recibidos en el servidor");
        if (server.howManyMailItems("client2") == numeroDeTests){
            numeroDeTestsOk = numeroDeTestsOk + 1;
            System.out.println("Funciona corretamente");
        }
        else {
            numeroDeTestsFail = numeroDeTestsFail + 1;
            System.out.println("Error. Se esperaba " + numeroDeTests +" mensaje(s)");
        }
        
        client1.sendMailItem("client2", "Prueba", "Prueba");
        System.out.println("Enviando un E-mail");
        numeroDeTests = numeroDeTests + 1;
        System.out.println("Examinando los E-mails recibidos en el servidor");
        if (server.howManyMailItems("client2") == numeroDeTests){
            numeroDeTestsOk = numeroDeTestsOk + 1;
            System.out.println("Funciona corretamente");
        }
        else {
            numeroDeTestsFail = numeroDeTestsFail + 1;
            System.out.println("Error. Se esperaba " + numeroDeTests +" mensaje(s)");
        }
        
        client1.sendMailItem("client2", "Prueba", "Prueba");
        System.out.println("Enviando un E-mail");
        numeroDeTests = numeroDeTests + 1;
        System.out.println("Examinando los E-mails recibidos en el servidor");
        if (server.howManyMailItems("client2") == numeroDeTests){
            numeroDeTestsOk = numeroDeTestsOk + 1;
            System.out.println("Funciona corretamente");
        }
        else {
            numeroDeTestsFail = numeroDeTestsFail + 1;
            System.out.println("Error. Se esperaba " + numeroDeTests +" mensaje(s)");
        }
        
        client1.sendMailItem("client2", "Prueba", "Prueba");
        System.out.println("Enviando un E-mail");
        numeroDeTests = numeroDeTests + 1;
        System.out.println("Examinando los E-mails recibidos en el servidor");
        if (server.howManyMailItems("client2") == numeroDeTests){
            numeroDeTestsOk = numeroDeTestsOk + 1;
            System.out.println("Funciona corretamente");
        }
        else {
            numeroDeTestsFail = numeroDeTestsFail + 1;
            System.out.println("Error. Se esperaba " + numeroDeTests +" mensaje(s)");
        }
        
        System.out.println("Tests realizados: " + numeroDeTests);
        System.out.println("Test correctos: " + numeroDeTestsOk);
        System.out.println("Test fallados: " + numeroDeTestsFail);
        
        return "Tests realizado";
    }

}
