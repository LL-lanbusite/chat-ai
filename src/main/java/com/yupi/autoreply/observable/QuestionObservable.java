package com.yupi.autoreply.observable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Observable;

public class QuestionObservable extends Observable {

    private String question;

    public QuestionObservable (String question) {
        this.question = question;
    }

    public void set(String str) {
        question = str;
        setChanged();
        notifyObservers(question);
    }

    public String get() {
        return question;
    }

}
