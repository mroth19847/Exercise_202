package bl;

public class Sender {
    
    private String sender;
    private double frequence;
    private String band;

    public Sender(String sender, double frequence, String band) {
        this.sender = sender;
        this.frequence = frequence;
        this.band = band;
    }

    public String getSender() {
        return sender;
    }

    public double getFrequence() {
        return frequence;
    }

    public String getBand() {
        return band;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setFrequence(double frequence) {
        this.frequence = frequence;
    }

    public void setBand(String band) {
        this.band = band;
    }
    
    
}
