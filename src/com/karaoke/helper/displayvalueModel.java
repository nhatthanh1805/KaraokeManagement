/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karaoke.helper;

/**
 *
 * @author Admin
 */
public class displayvalueModel {

    public Object displayMember;
    public Object displayvalue;

    public displayvalueModel() {

    }

    public displayvalueModel(Object displayMember, Object displayvalue) {
        this.displayMember = displayMember;
        this.displayvalue = displayvalue;
    }

    @Override
    public String toString() {
        return displayMember.toString();
    }
}
