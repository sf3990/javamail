import org.simplejavamail.api.email.Email;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.MailerBuilder;
import org.simplejavamail.api.mailer.mailer;
import org.simplejavamail.api.mailer.config.Pkcs12Config;
import org.simplejavamail.api.mailer.config.TransportStrategy;
import org.simplejavamail.config.ConfigLoader;

import static org.simplejavamail.mailer.MailerBuilder.withSMTPServer;

public class SendEmails{
    public static void main(String[] args){

      Email email = EmailBuilder.startingBlank().to("Maureen", "coultonm@gmail.com")
      .from("Maureen", "mcoulton@holynames-sea.org"). withSubject("Java Email")
      .withPlainText().withHTMLText().buildEmail();

      MailerBuilder.withSMTPServer("smtp-mail.outlook.com", 587, "", "").buildMailer().sendMail(email);
    }
}
