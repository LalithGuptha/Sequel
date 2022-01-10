package project;



public interface sendEmail {
    final String username = "prrelationsequel@gmail.com";
    final String password = "Sequel123";
    public void sendMail();

}
/*

public class SendEmailTLS {


    public static void main(String[] args) throws IOException {

        final String username = "prrelationsequel@gmail.com";
        final String password = "Sequel123";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("prrelationsequel@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("renga01042002@gmail.com, lalithg95@gmail.com")
            );
            message.setSubject("OOPS Project Group-19 Problem Statement");
            BodyPart bp = new MimeBodyPart();
            BodyPart bp1 = new MimeBodyPart();
            bp1.setText("Ma'am,\n\t We have attached our problem statement in this email\n. We have sent this email with our java code where we used external JAR files. Please do check this and suggest if there are any changes regarding the problem statement.\n Thank you ma'am");
            String filename = "C:/Users/Rengaraj/Desktop/trialcheck.pdf";
            DataSource src = new FileDataSource(filename);
            bp.setDataHandler(new DataHandler(src));
            bp.setFileName(filename);
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(bp);
            mp.addBodyPart(bp1);
            message.setContent(mp);
            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}*/