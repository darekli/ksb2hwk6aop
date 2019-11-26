package com.example.ksb2hwk6aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@Aspect
@RestController
public class MailApi {

    MailUser mailUser;
    private MailService mailService;
MoviesApi moviesApi;
MailApi mailApi;

    @Autowired
    public MailApi(MailService mailService) {
        this.mailService = mailService;
    }


//@EventListener(ApplicationReadyEvent.class)//todo do celów testowych, można odhaczyć @EventListener'a w celu sprawdzenia, klasa musi posiadac adnotacje @RestController inaczej nie zadziala
//todo czy poniższa metoda działa, a na Twój email została wysłana wiadomośc

//todo pamiętaj o zmniejszeniu poziomu bezpieczeństwa konta Google:
//todo w prawym gornym rogu konta Google w przegladarce
// wejdz w ustawienia
// zakladka bezpieczenstwo
// Dostep mniej bezpiecznych aplikacji ustaw na ON





//    TransferClass transferClass;
//    @Autowired
//    public MailApi(TransferClass transferClass) {
//        this.transferClass = transferClass;
//
//    }




    public String getSendMail() throws MessagingException {
        if (moviesApi.getHowManyMovies() > 3)
            return mailApi.getSendMail();
        System.out.println("getSendMail metod release. Check your email box");
        mailService.sendMail("darlicki@gmail.com", //todo wpisz swoj email i przejdz do application.properties, tam ponownie wpisz swoj aders email i haslo do konta

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

