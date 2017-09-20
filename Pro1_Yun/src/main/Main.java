package main;

import entities.*;

import java.util.*;
import java.text.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {

        String dirMyPage = "MyPage.csv";
        String dirFriends = "Friends.csv";
        String dirAccessLog = "AccessLog.csv";

        DataOperator dataop = new DataOperator();
        int min;
        int max;


        ArrayList<MyPage> listMyPage = new ArrayList<MyPage>();
        ArrayList<Friends> listFriends = new ArrayList<Friends>();
        ArrayList<AccessLog> listAccessLog = new ArrayList<AccessLog>();



        for (int i = 1; i <= 100000; i++) {

            MyPage mp = new MyPage();
            mp.setId(i);
            mp.setName(dataop.sgenerator(min = 10, max = 20));
            mp.setNationality(dataop.sgenerator(min = 10, max = 20));
            mp.setCountryCode(dataop.intgenerator(min = 1, max = 10));
            mp.setHobby(dataop.sgenerator(min = 10, max = 20));
            listMyPage.add(mp);
        }

        dataop.output(listMyPage, dirMyPage);


//        for (int i = 1; i <= 20000000; i++) {
            for (int i = 1; i <= 2000000; i++) {

                Friends fr = new Friends();
            fr.setFriendRel(i);
            fr.setPersonID(dataop.intgenerator(min = 1, max = 100000));
            fr.setMyFriend(dataop.intgenerator(min = 1, max = 100000));
            fr.setDateofF(dataop.intgenerator(min = 1, max = 1000000));
            fr.setDesc(dataop.sgenerator(min = 20, max = 50));
            listFriends.add(fr);
            if(i%1000000 == 0) {
                System.out.println("Now running Friends i = " + i);
                dataop.output(listFriends, dirFriends);
                listFriends = new ArrayList<Friends>();

            }
        }

//        for (int i = 1; i <= 10000000; i++) {
        for (int i = 1; i <= 1000000; i++) {

            AccessLog al = new AccessLog();
            al.setAccessID(i);
            al.setByWho(dataop.intgenerator(min = 1, max = 100000));
            al.setWhatPage(dataop.intgenerator(min = 1, max = 100000));
            al.setTypeOfAccess(dataop.sgenerator(min = 20, max = 50));
            al.setAccessTime(dataop.intgenerator(min = 1, max = 1000000));
            listAccessLog.add(al);


            if(i%1000000 == 0) {
                System.out.println("Now running AccessLog i = " + i);
                dataop.output(listAccessLog, dirAccessLog);
                listAccessLog = new ArrayList<AccessLog>();

            }
        }



    }

}

