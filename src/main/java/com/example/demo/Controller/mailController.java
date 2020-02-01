package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.internet.MimeMessage;
import java.io.File;

@Controller
public class mailController {

    @Autowired
    JavaMailSenderImpl mailSender;
    @RequestMapping("/sendMail")
    public void sendMail()throws Exception{
        //简单邮件发送
//        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
//        simpleMailMessage.setSubject("通知.今晚开会");
//        simpleMailMessage.setText("今晚7：30开会，请准时参加");
//        simpleMailMessage.setTo("839302675@qq.com");
//        simpleMailMessage.setFrom("277142744@qq.com");
//        mailSender.send(simpleMailMessage);
//复杂邮件发送
        MimeMessage mimeMessage=mailSender.createMimeMessage();
       MimeMessageHelper helper =  new MimeMessageHelper(mimeMessage,true);//true 发送附件
            helper.setSubject("通知.今晚开会");
            helper.setText("<p style='color:red'>今晚7：30开会，请准时参加<p>",true);//true 样式生效
            helper.setTo("839302675@qq.com");
            helper.setFrom("277142744@qq.com");
            helper.addAttachment("1.jpg",new File("C:\\Users\\Lenovo\\Pictures\\个人证件照.jpg"));
        helper.addAttachment("2.jpg",new File("C:\\Users\\Lenovo\\Pictures\\u=1846912345,3744096541&fm=26&gp=0.jpg"));
        mailSender.send(mimeMessage);
    }


}
