package behavioral.chainofresponsibility;

public class Director implements LeaveApprover{
    private LeaveApprover nextLeaveApprover;
    @Override
    public void setNextApprover(LeaveApprover nextLeaveApprover) {
        this.nextLeaveApprover = nextLeaveApprover;
    }

    @Override
    public void processRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getCount() > 5 && leaveRequest.getCount() < 10) {
            System.out.println("Director has approved your " + leaveRequest.getType() + " request for " + leaveRequest.getCount() + " days");
        } else if (this.nextLeaveApprover != null) {
            this.nextLeaveApprover.processRequest(leaveRequest);
        } else {
            System.out.println("Your request has been rejected...!!");
        }

    }
}
