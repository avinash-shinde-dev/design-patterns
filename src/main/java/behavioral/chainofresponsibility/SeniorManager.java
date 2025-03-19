package behavioral.chainofresponsibility;

public class SeniorManager implements LeaveApprover{

    private LeaveApprover nextLeaveApprover;
    @Override
    public void setNextApprover(LeaveApprover nextLeaveApprover) {
        this.nextLeaveApprover = nextLeaveApprover;
    }

    @Override
    public void processRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getCount() > 2 && leaveRequest.getCount() < 5) {
            System.out.println("SeniorManager has approved your " + leaveRequest.getType() + " request for " + leaveRequest.getCount() + " days");
        } else if (this.nextLeaveApprover != null) {
            this.nextLeaveApprover.processRequest(leaveRequest);
        } else {
            System.out.println("Your request has been rejected...!!");
        }
    }
}
