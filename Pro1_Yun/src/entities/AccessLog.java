package entities;

public class AccessLog {
    private int accessID;
    private int byWho;
    private int whatPage;
    private String typeOfAccess;
    private int accessTime;

    public int getAccessID() {
        return accessID;
    }

    public void setAccessID(int accessID) {
        this.accessID = accessID;
    }

    public int getByWho() {
        return byWho;
    }

    public void setByWho(int byWho) {
        this.byWho = byWho;
    }

    public int getWhatPage() {
        return whatPage;
    }

    public void setWhatPage(int whatPage) {
        this.whatPage = whatPage;
    }

    public String getTypeOfAccess() {
        return typeOfAccess;
    }

    public void setTypeOfAccess(String typeOfAccess) {
        this.typeOfAccess = typeOfAccess;
    }

    public int getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(int accessTime) {
        this.accessTime = accessTime;
    }

    public AccessLog(int accessID, int byWho, int whatPage, String typeOfAccess, int accessTime) {
        this.accessID = accessID;
        this.byWho = byWho;
        this.whatPage = whatPage;
        this.typeOfAccess = typeOfAccess;
        this.accessTime = accessTime;
    }

    public AccessLog() {
    }

    @Override
    public String toString() {
        return accessID + "," + byWho + "," + whatPage + "," + whatPage + "," + typeOfAccess + "," + accessTime + System.lineSeparator();
    }
}

