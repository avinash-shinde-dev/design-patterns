package behavioral.chainofresponsibility;

public class ChangeOfResponsibilityDesignPattern {
    public static void main(String[] args) {
        // ex. ATM / vending machine
        // Design logger ( Amazon )
        /**
         * Chain of Responsibility design pattern that decouples the sender of a request
         * from its receivers by giving more than one object chance to handle the request.
         *
         * the receiving objects are chained and the requests is passed along the
         * chain until the object handles it.
         *
         * Real world examples:
         *   - ATM / Vending machine
         *   - java.util.logging.Logger
         *   - middleware frameworks where request passes through a chain of processing objects.
         *   - Apache commons chain
         *   - servlet.Filter#doFilter
         *   - technical support call center
         *     * each level of tech support represents the handler in the chain.
         *
         *  Advantage:
         *    - decoupling of components
         *    - flexible
         *    - specific role to the specific handler.
         */

        LeaveRequest leaveRequest = new LeaveRequest(3, LeaveType.CL, "CL");
        LeaveRequest leaveRequest1 = new LeaveRequest(6, LeaveType.PTO, "PTO");

        LeaveApprover manager = new Manager();
        LeaveApprover seniorManager = new SeniorManager();

        manager.setNextApprover(seniorManager);
        seniorManager.setNextApprover(new Director());

        manager.processRequest(leaveRequest);
        manager.processRequest(leaveRequest1);


    }
}
