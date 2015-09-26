/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//http://www.guj.com.br/java/87637-api-java-mail---usando-o-gmaill

package testeemail;

/**
 *
 * @author Edgard Lopes <edgard-rodrigo@hotmail.com>
 */
public class TesteEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SendMail mail = new SendMail();        
        
        String emailOrigem = "";
        String emailDestino = "";
        String assunto = "";
        String mensagem = "";
        
        mail.sendMail(emailOrigem, emailDestino, assunto, mensagem);
    }
    
}
