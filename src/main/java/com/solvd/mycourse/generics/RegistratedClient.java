package com.solvd.mycourse.generics;


public class RegistratedClient<T> {
    private T id;
    private String email;
    public RegistratedClient(T id, String email){
        this.id = id;
        this.email = email;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = (T) id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
