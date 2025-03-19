package behavioral.chainofresponsibility;

public interface LeaveApprover {
    void setNextApprover(LeaveApprover nextLeaveApprover);
    void processRequest(LeaveRequest leaveRequest);
}
