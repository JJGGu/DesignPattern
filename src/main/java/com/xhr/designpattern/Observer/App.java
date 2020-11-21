package com.xhr.designpattern.Observer;

public class App {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.add(new Observer1());
        publisher.add(new Observer2());
        publisher.notifyObservers();
    }
}
