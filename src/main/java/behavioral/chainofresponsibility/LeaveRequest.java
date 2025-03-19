package behavioral.chainofresponsibility;

public class LeaveRequest {
    private int count;
    private LeaveType type;
    private String reason;

    public LeaveRequest(int count, LeaveType type, String reason) {
        this.count = count;
        this.type = type;
        this.reason = reason;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LeaveType getType() {
        return type;
    }

    public void setType(LeaveType type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
