package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "monster",uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class MonsterModel extends EntityBase {

    @Column(name = "MONSTERNAME",nullable = false)
    private String monsterName;
    @Column(name = "MONSTERNICKNAME",nullable = false)
    private String monsterNickName;
    @Column(name ="MONSTERCUTE",nullable = false)
    private Boolean monsterCuteNot;
    @Column(name="PHONENUMBER")
    private int phoneNumber;
    @Column(name = "NOTE")
    private String note;

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getMonsterNickName() {
        return monsterNickName;
    }

    public void setMonsterNickName(String monsterNickName) {
        this.monsterNickName = monsterNickName;
    }

    public Boolean getMonsterCuteNot() {
        return monsterCuteNot;
    }

    public void setMonsterCuteNot(Boolean monsterCuteNot) {
        this.monsterCuteNot = monsterCuteNot;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
