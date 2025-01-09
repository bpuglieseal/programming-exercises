package ChristmasHomework;

public class Salon {
    Client[] clients;
    Visit[] visits;
    int totalClients;
    int totalVisits;

    Salon(int maxClients, int maxVisits) {
        totalClients = 0;
        totalVisits = 0;
        clients = new Client[maxClients];
        visits = new Visit[maxVisits];
    }

    public Client getClient(String identityCard) {
        for (int i = 0; i < clients.length; i++) {
            if (this.clients[i].getIdentityCard().equals(identityCard)) {
                return this.clients[i];
            }
        }
        return null;
    }

    public void addClient (Client client) {
        this.clients[this.totalClients] = client;
        this.totalClients += 1;
    }

    public boolean setMembershipClient (String identityCard, MemberLevel level) {
        for (int i = 0; i < clients.length; i++) {
            if (this.clients[i].getIdentityCard().equals(identityCard)) {
                this.clients[i].setLevel(level);
                return true;
            }
        }
        return false;
    }

    public Salon addVisit (Visit visit) {
        this.visits[this.totalVisits] = visit;
        this.totalVisits += 1;
        return this;
    }

    public Visit[] getClientVisits (String identityCard) {
        int c = 0;
        for (int i = 0; i < this.totalVisits; i++) {
            if (visits[i].getClient().getIdentityCard().equals(identityCard)) c++;
        }

        if (c == 0) return null;
        Visit[] clientVisits = new Visit[c];

        for (int i = 0, j = 0; i < this.totalVisits; i++) {
            if (visits[i].getClient().getIdentityCard().equals(identityCard)) {
                clientVisits[j] = visits[i];
                j++;
            };
        }

        return clientVisits;
    }

    public void showClients () {
        for (int i = 0; i < this.totalClients; i++) {
            System.out.println(this.clients[i].toString());
        }
    }

    public void showVisits () {
        for (int i = 0; i < this.totalVisits; i++) {
            System.out.println(this.visits[i].toString());
        }
    }
}

