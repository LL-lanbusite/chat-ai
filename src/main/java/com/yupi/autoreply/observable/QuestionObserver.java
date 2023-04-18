package com.yupi.autoreply.observable;

import java.util.Observable;
import java.util.Observer;

public class QuestionObserver implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        String question = (String) arg;
    }
}
