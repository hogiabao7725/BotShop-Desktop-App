package OtherFunction;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailOTP {

    private static String stored_OTP;

    public static void sendToEmail(String toEmail) {
        // Cấu hình thông tin email
        String fromEmail = "hogiabao772005@gmail.com";
        String password = "wgno pcov aucf lmgu";

        // Tạo mã xác nhận ngẫu nhiên
        String OTP = generateOTP();
        stored_OTP = OTP;
        
        // Cấu hình thông tin máy chủ email
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Tạo phiên làm việc
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Tạo đối tượng Message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("Confirm OTP");

            // Nội dung email
            String emailContent =
                      "<html lang=\"en\">" +
                      "<head>" +
                      "    <meta charset=\"UTF-8\">" +
                      "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                      "    <title>Welcome to BotShop</title>" +
                      "    <style>" +
                      "        body {" +
                      "            font-family: Arial, sans-serif;" +
                      "            line-height: 1.6;" +
                      "            color: #333;" +
                      "            margin: 0;" +
                      "            padding: 20px;" +
                      "            background-color: #f4f4f4;" +
                      "        }" +
                      "        .email-container {" +
                      "            max-width: 600px;" +
                      "            margin: 0 auto;" +
                      "            padding: 20px;" +
                      "            background-color: #fff;" +
                      "            border: 1px solid #ddd;" +
                      "            border-radius: 8px;" +
                      "            position: relative;" +
                      "        }" +
                      "        h1 {" +
                      "            color: #5b9bd5;" +
                      "        }" +
                      "        p {" +
                      "            margin-bottom: 20px;" +
                      "        }" +
                      "        .otp {" +
                      "            font-size: 20px;" +
                      "            color: #d9534f;" +
                      "            font-weight: bold;" +
                      "            display: inline-block;" +
                      "            vertical-align: middle;" +
                      "            margin-left: 5px;" +
                      "        }" +
                      "        .icon {" +
                      "            position: absolute;" +
                      "            bottom: 10px;" +
                      "            right: 10px;" +
                      "            width: 100px; /* Width of the image */" +
                      "            height: auto; /* Height will adjust to maintain aspect ratio */" +
                      "        }" +
                      "        .signature {" +
                      "            margin-top: 30px;" +
                      "        }" +
                      "    </style>" +
                      "</head>" +
                      "<body>" +
                      "    <div class=\"email-container\">" +
                      "        <h1>Welcome to BotShop!</h1>" +
                      "        <p>I'm <strong>Hồ Gia Bảo</strong>, the Admin of the Shop.</p>" +
                      "        <p>Here is your OTP:<span class=\"otp\">" + OTP + "</span></p>" +
                      "        <p>Please do not share this OTP with anyone to ensure the security of your account.</p>" +
                      "        <p>Thank you for using our service.</p>" +
                      "        <p class=\"signature\">Regards,<br/><strong>Hồ Gia Bảo</strong></p>" +
                      "        <img src=\"https://cdn-icons-png.flaticon.com/128/1533/1533105.png\" alt=\"Icon\" class=\"icon\">" +
                      "    </div>" +
                      "</body>" +
                      "</html>";
            message.setContent(emailContent, "text/html; charset=utf-8");

            // Gửi email
            Transport.send(message);

            System.out.println("Confirmation OTP sent " + toEmail);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static String getCode() {
        return stored_OTP;
    }

    private static String generateOTP() {
        // Tạo mã xác nhận ngẫu nhiên 4 chữ số
        Random random = new Random();
        int code = 100000 + random.nextInt(900000);
        return String.valueOf(code);
    }
}
