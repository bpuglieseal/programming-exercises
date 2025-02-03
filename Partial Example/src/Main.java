import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void showWorkers (HashMap<String, ArrayList<Worker>> teams, int option, String team) {
        ArrayList<Worker> workers = teams.get(team);

        switch (option) {
            case 1: {
                System.out.format("+ Drivers of the team %s: ", team);
                workers.forEach(worker -> {
                    if (worker.getType() == WorkerType.DRIVER) {
                        System.out.format("- %s - %s", worker.getName(), Worker.getVerboseWorkerType(worker.getType()));
                    }
                });
            }
            case 2: {
                System.out.format("+ Manager of the team %s: ", team);
                workers.forEach(worker -> {
                    if (worker.getType() == WorkerType.MANAGER) {
                        System.out.format("- %s - %s", worker.getName(), Worker.getVerboseWorkerType(worker.getType()));
                    }
                });
            }
            case 3: {
                workers.forEach(worker -> {
                    System.out.format("+ Engineers of the team %s: ", team);
                    if (worker.getType() == WorkerType.ENGINEER) {
                        System.out.format("- %s - %s", worker.getName(), Worker.getVerboseWorkerType(worker.getType()));
                    }
                });
            }
        }
    }

    public static void addNewTeam () {

    }

    public static void main(String[] args) {
        int option = -1;
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<Worker>> teams = new HashMap<String, ArrayList<Worker>>();

        teams.put("team-1", new ArrayList<Worker>());
        teams.put("team-2", new ArrayList<Worker>());

        do {
            System.out.println("1. Show");
            System.out.println("\t1. Drivers");
            System.out.println("\t2. Manager");
            System.out.println("\t3. Engineers");
            System.out.println("2. Add new Team");
            System.out.println("3. Remove Team");
            System.out.println("4. Add Worker");
            System.out.println("\t1. Drivers");
            System.out.println("\t2. Manager");
            System.out.println("\t3. Engineers");
            System.out.println("5. Change Team Of Worker");
            System.out.println("6. Close Application");

            System.out.print("+ Input your option: ");
            option = sc.nextInt();

            switch (option) {
                case 1: {
                    sc.nextLine();

                    System.out.print("Input the name of the team: ");
                    String team = sc.nextLine();

                    if (!teams.containsKey(team.toLowerCase())) {
                        System.out.println("- The indicated team does not exist");
                        break;
                    }

                    int subMenuOption;

                    do {
                        System.out.print("¿What members type you want see?: ");
                        subMenuOption = sc.nextInt();
                        if (subMenuOption < 1 || subMenuOption > 3) System.out.println("Invalid option. Try Again");
                    } while (subMenuOption < 1 || subMenuOption > 3);

                    showWorkers(teams, subMenuOption, team);
                }
                case 2: {
                    System.out.print("Input the name of the new team: ");
                    String team = sc.nextLine();

                    if (!teams.containsKey(team.toLowerCase())) {
                        System.out.println("- The indicated team already exists");
                        break;
                    }
                }
                case 6: {
                    System.out.println("Bye Bye!");
                }
            }

        } while (option != 6);
    }
}