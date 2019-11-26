package com.example.ksb2hwk6aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Aspect
@Component
public class TransferClass {

   // private MailService mailService;

    MailApi mailApi;
    MoviesApi moviesApi;

//    @Autowired
//    public TransferClass(MailService mailService) {
//        this.mailService = mailService;
//    }
//
//    @Autowired
//    public TransferClass(MailApi mailApi) {
//        this.mailApi = mailApi;
//    }

    @Autowired
    public TransferClass(MoviesApi moviesApi) {
        this.moviesApi = moviesApi;
    }
    //@Around("@annotation(SendMailAspect)")

@Autowired
@Around("@annotation(SendMailAspect)")
    public String quantityMoviesController() {

        if (moviesApi.getHowManyMovies() > 3) {
            try {
                return mailApi.getSendMail();
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
