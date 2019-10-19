package com.example.ksb2hwk6aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import javax.mail.MessagingException;
@Aspect
@RestController
public class MailApi {

MailUser mailUser;
    private MailService mailService;

    @Autowired
    public MailApi(MailService mailService) {
        this.mailService = mailService;
    }

@After("@annotation(SendMailAspect)")
//@EventListener(ApplicationReadyEvent.class)//todo do celów twstowych, można odchaczyc @EventListener'a w celu sprawdzenia
//todo czy poniższa metoda działa, a na Twój email została wysłana wiadomośc

//todo pamiętaj o zmniejszeniu poziomu bezpieczeństwa konta Google:
//todo w prawym gornym rogu konta Google w przegladarce
// wejdz w ustawienia
// zakladka bezpieczenstwo
// Dostep mniej bezpiecznych aplikacji ustaw na ON



    public String getSendMail() throws MessagingException {

     System.out.println("getSendMail metoda");
        mailService.sendMail("twojemail@gmail.com", //todo wpisz swoj email i przejdz do application.properties, tam ponownie wpisz swoj aders email i haslo do konta

                "Wygrałeś",
                "<b>1 000 000 zł</b><br>:P", true);
        return "Email send.";

    }
    //todo w klasie MailUser rowniez podaj adres konta email
    //todo i na koniec,  w Postmanie mozesz  dodawac nowe filmy, zakladka POST http://localhost:8080/movies/ {
    //"id": 5,
    //"name": "nazwa filmu",
    //"year": 2019,
    //"producer": "producent"
    //}
}

