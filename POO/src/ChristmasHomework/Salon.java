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
}

