import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void showWorkers (HashMap<String, ArrayList<Worker>> teams, int option, String team) {
        ArrayList<Worker> workers = teams.get(team);

        switch (option) {
            case 1: {
                System.out.format("+ Drivers of the team %s:\n", team);
                workers.forEach(worker -> {
                    if (worker.getType() == WorkerType.DRIVER) {
                        System.out.format("- %s - %s\n", worker.getName(), Worker.getVerboseWorkerType(worker.getType()));
                    }
                });
                break;
            }
            case 2: {
                System.out.format("+ Manager of the team %s:\n", team);
                workers.forEach(worker -> {
                    if (worker.getType() == WorkerType.MANAGER) {
                        System.out.format("- %s - %s\n", worker.getName(), Worker.getVerboseWorkerType(worker.getType()));
                    }
                });
                break;
            }
            case 3: {
                workers.forEach(worker -> {
                    System.out.format("+ Engineers of the team %s:\n", team);
                    if (worker.getType() == WorkerType.ENGINEER) {
                        System.out.format("- %s - %s\n", worker.getName(), Worker.getVerboseWorkerType(worker.getType()));
                    }
                });
                break;
            }
        }
    }

    public static void addNewTeam (String newTeam, HashMap<String, ArrayList<Worker>> teams) {
        teams.put(newTeam, new ArrayList<Worker>());
    }

    public static void removeTeam (String teamToRemove, HashMap<String, ArrayList<Worker>> teams) {
        teams.remove(teamToRemove);
    }

    public static void addWorker (String team, HashMap<String, ArrayList<Worker>> teams, Worker newWorker) {
        switch (newWorker.getType()) {
            case DRIVER -> {
                int count = 0;
                ArrayList<Worker> workers = teams.get(team);
                for (Worker worker : workers) {
                    if (worker.getType() == WorkerType.DRIVER) {
                        count++;
                    }
                }
                if (count == 3) {
                    System.out.format("The team %s already have three drivers\n", team);
                } else {
                    System.out.format("Driver added to the team %s\n", team);
                    workers.add(newWorker);
                }
            }
            case MANAGER -> {
                boolean hasManager = false;
                ArrayList<Worker> workers = teams.get(team);
                Iterator<Worker> it = workers.iterator();
                while (it.hasNext() && !hasManager) {
                    if (it.next().getType() == WorkerType.MANAGER) {
                        hasManager = true;
                    }
                }
                if (hasManager) {
                    System.out.format("The team %s already has a manager", team);
                } else {
                    System.out.format("Manager added to the team %s\n", team);
                    workers.add(newWorker);
                }
            }
            case ENGINEER -> {
                ArrayList<Worker> workers = teams.get(team);
                workers.add(newWorker);
                System.out.format("Engineer added to the team %s\n", team);
            }
        }
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
                    break;
                }
                case 2: {
                    System.out.print("Input the name of the new team: ");
                    String team = sc.nextLine();

                    if (teams.containsKey(team.toLowerCase())) {
                        System.out.println("- The indicated team already exists");
                        break;
                    }

                    addNewTeam(team, teams);
                }
                case 3: {
                    System.out.print("Input the name of the team you want to remove: ");
                    String team = sc.nextLine();

                    if (!teams.containsKey(team.toLowerCase())) {
                        System.out.println("- The indicated team does not exist");
                        break;
                    }

                    removeTeam(team, teams);
                }
                case 4: {
                    sc.nextLine();
                    System.out.print("Input the name of the team you want to add a worker: ");
                    String team = sc.nextLine();

                    if (!teams.containsKey(team.toLowerCase())) {
                        System.out.println("- The indicated team does not exist");
                        break;
                    }

                    int subMenuOption;

                    do {
                        System.out.print("¿What kind of worker you want to create?: ");
                        subMenuOption = sc.nextInt();
                        if (subMenuOption < 1 || subMenuOption > 3) System.out.println("Invalid option. Try Again");
                    } while (subMenuOption < 1 || subMenuOption > 3);

                    sc.nextLine();
                    System.out.print("Input the name of your new worker: ");
                    String name = sc.nextLine();
                    Worker worker;

                    switch (subMenuOption) {
                        case 1 -> worker = new Worker(name, WorkerType.DRIVER);
                        case 2 -> worker = new Worker(name, WorkerType.MANAGER);
                        default -> worker = new Worker(name, WorkerType.ENGINEER);
                    }

                    addWorker(team, teams, worker);
                    break;
                }
                case 6: {
                    System.out.println("Bye Bye!");
                }
            }

        } while (option != 6);
    }
}