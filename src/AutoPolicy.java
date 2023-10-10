public class AutoPolicy {
    private int accountNumber;
    private String makeAndMode1;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndMode1, String state){
        this.accountNumber = accountNumber;
        this.makeAndMode1 = makeAndMode1;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setMakeAndMode1(String makeAndMode1){
        this.makeAndMode1 = makeAndMode1;
    }

    public String getMakeAndMode1(){
        return makeAndMode1;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public boolean isNoFaultState(){
        boolean noFaultState;

        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}

