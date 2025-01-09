package ChristmasHomework;

public class Client {
    private String name;
    private String identityCard;
    private boolean isMember;
    private MemberLevel level;

    Client(String name, String identityCard, MemberLevel level) {
        this.name = name;
        this.identityCard = identityCard;
        this.isMember = true;
        this.level = level;
    }

    Client(String name, String identityCard) {
        this.isMember = false;
        this.name = name;
        this.identityCard = identityCard;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Identity Card: %s | Level: %s", this.name, this.identityCard, Client.levelToString(this.level));
    }

    public double getDiscount(double price) {
        if (!this.isMember) return price;

        switch (this.level) {
            case PLATINUM -> {
                return (float) (price - (price * 0.1));
            }
            case GOLD -> {
                return (float) (price - (price * 0.15));
            }
            case PREMIUM -> {
                return (float) (price - (price * 0.20));
            }
            default -> {
                return price;
            }
        }
    }

    public static String levelToString(MemberLevel level) {
        switch (level) {
            case GOLD -> {
                return "Gold";
            }
            case PREMIUM -> {
                return "Premium";
            }
            case PLATINUM -> {
                return "Platinum";
            }
            default -> {
                return "";
            }
        }
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setLevel(MemberLevel level) {
        this.level = level;
    }
}
