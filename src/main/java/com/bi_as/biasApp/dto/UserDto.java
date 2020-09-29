package com.bi_as.biasApp.dto;

import com.bi_as.biasApp.domain.User;

import java.util.List;

public class UserDto {

    private Integer idUser;
    private String nicknameUser;
    private String name;
    private String secondName;
    private String lastName;
    private String secondLastName;
    private String mail;
    private String password;
    private List<DashboardDto> dashboardDtoList;


    public UserDto(){

    }

    public UserDto(User user) {
        this.idUser=user.getIdUser();
        this.nicknameUser=user.getNicknameUser();
        this.name=user.getName();
        this.secondName=user.getSecondName();
        this.lastName=user.getLastName();
        this.secondLastName=user.getSecondLastName();
        this.mail=user.getSecondLastName();
        this.password=user.getPassword();
    }

/*    public UserDto(Integer idUser, String nicknameUser, String name, String secondName, String lastName, String secondLastName, String mail, String password) {
        this.idUser = idUser;
        this.nicknameUser = nicknameUser;
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.mail = mail;
        this.password = password;
    }*/

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNicknameUser() {
        return nicknameUser;
    }

    public void setNicknameUser(String nicknameUser) {
        this.nicknameUser = nicknameUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<DashboardDto> getDashboardDtoList() {
        return dashboardDtoList;
    }

    public void setDashboardDtoList(List<DashboardDto> dashboardDtoList) {
        this.dashboardDtoList = dashboardDtoList;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "idUser=" + idUser +
                ", nicknameUser='" + nicknameUser + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}