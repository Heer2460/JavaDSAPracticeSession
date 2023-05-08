package com.binary.tree;

class FirstException extends Exception {
}

class SecondException extends Exception {
}

class Repository {
    void deleteAll() throws FirstException, SecondException {
    }
}

class Client {
    void call() {
        try {
            new Repository().deleteAll();
        } catch (FirstException | SecondException e) {
        }
    }
}
