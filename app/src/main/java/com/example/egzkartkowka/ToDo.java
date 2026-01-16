package com.example.egzkartkowka;

public class ToDo {
    private String nazwa;
    private boolean czyZrobione;
    private int priorytet;

    public ToDo(String nazwa, boolean czyZrobione, int priorytet) {
        this.nazwa = nazwa;
        this.priorytet = priorytet;
        czyZrobione = false;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isCzyZrobione() {
        return czyZrobione;
    }

    public void setCzyZrobione(boolean czyZrobione) {
        this.czyZrobione = czyZrobione;
    }

    public int getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(int priorytet) {
        this.priorytet = priorytet;
    }
}
