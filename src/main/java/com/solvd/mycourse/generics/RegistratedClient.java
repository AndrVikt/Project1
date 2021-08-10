package com.solvd.mycourse.generics;


public class RegistratedClient<T> {
    private int id;
    private String emeil;
    public RegistratedClient(int id, String emeil){
        this.id = id;
        this.emeil = emeil;
    }

    public int getId() {
        return id;
    }

    public void setId(T id) {
        this.id = (int) id;
    }

    public String getEmeil() {
        return emeil;
    }

    public void setEmeil(String emeil) {
        this.emeil = emeil;
    }


}
