import java.util.HashMap;

public class LoginDTO {

    private long accNo;

    private int pin;

    private HashMap<Long,Integer> map;

    public LoginDTO(long accNo, int pin, HashMap<Long, Integer> map) {
        this.accNo = accNo;
        this.pin = pin;
        this.map = map;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public HashMap<Long, Integer> getMap() {
        return map;
    }

    public void setMap(HashMap<Long, Integer> map) {
        this.map = map;
    }
}
