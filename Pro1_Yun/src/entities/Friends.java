package entities;

public class Friends {
    private int friendRel;
    private int personID;
    private int myFriend;
    private int dateofF;
    private String desc;

    public int getFriendRel() {
        return friendRel;
    }

    public void setFriendRel(int friendRel) {
        this.friendRel = friendRel;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getMyFriend() {
        return myFriend;
    }

    public void setMyFriend(int myFriend) {
        this.myFriend = myFriend;
    }

    public int getDateofF() {
        return dateofF;
    }

    public void setDateofF(int dateofF) {
        this.dateofF = dateofF;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Friends(int friendRel, int personID, int myFriend, int dateofF, String desc) {
        this.friendRel = friendRel;
        this.personID = personID;
        this.myFriend = myFriend;
        this.dateofF = dateofF;
        this.desc = desc;
    }

    public Friends() {
    }

    @Override
    public String toString() {
        return friendRel + "," + personID + "," + myFriend + "," + dateofF + "," + desc + System.lineSeparator();
    }
}
