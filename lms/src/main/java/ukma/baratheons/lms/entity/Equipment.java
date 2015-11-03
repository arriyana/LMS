package ukma.baratheons.lms.entity;

public class Equipment {

    private int id;
    private String localNum;
    private boolean isDecommissioned;
    private int eqptTypeId;
    private int roomId;
    private String invNumber;

    public Equipment() {
    }

    public Equipment(String localNum, boolean isDecommissioned,
                     int eqptTypeId, int roomId, String invNumber) {
        this.localNum = localNum;
        this.isDecommissioned = isDecommissioned;
        this.eqptTypeId = eqptTypeId;
        this.roomId = roomId;
        this.invNumber = invNumber;
    }

    public Equipment(int id, String localNum, boolean isDecommissioned,
                     int eqptTypeId, int roomId, String invNumber) {
        this.id = id;
        this.localNum = localNum;
        this.isDecommissioned = isDecommissioned;
        this.eqptTypeId = eqptTypeId;
        this.roomId = roomId;
        this.invNumber = invNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalNum() {
        return localNum;
    }

    public void setLocalNum(String localNum) {
        this.localNum = localNum;
    }

    public boolean isDecommissioned() {
        return isDecommissioned;
    }

    public void setIsDecommissioned(boolean isDecommissioned) {
        this.isDecommissioned = isDecommissioned;
    }

    public int getEqptTypeId() {
        return eqptTypeId;
    }

    public void setEqptTypeId(int eqptTypeId) {
        this.eqptTypeId = eqptTypeId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getInvNumber() {
        return invNumber;
    }

    public void setInvNumber(String invNumber) {
        this.invNumber = invNumber;
    }
}
