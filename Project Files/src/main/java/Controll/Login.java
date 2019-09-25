package Controll;

public interface Login {

    boolean validatePassword(String passwd);

    String hasher(String passwd);

    String deCoder(String passwd);
}
