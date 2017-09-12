package com.example.posgrad.trabalho1;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by posgrad on 11/09/2017.
 */

public class Email {

    private String nome;
    private String email;
    private String id;
    private String date;
    private String time;
    private String laboratorio;
    private Set<String> configs;
    private String obs;
    private String usaDatashow;
    private boolean prioritario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Set<String> getConfigs() {
        return configs;
    }

    public void setConfigs(Set<String> configs) {
        this.configs = configs;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String isUsaDatashow() {
        return usaDatashow;
    }

    public void setUsaDatashow(String usaDatashow) {
        this.usaDatashow = usaDatashow;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    @Override
    public String toString() {
        return "Email{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", configs=" + configs +
                ", obs='" + obs + '\'' +
                ", usaDatashow='" + usaDatashow + '\'' +
                ", prioritario=" + prioritario +
                '}';
    }
}
