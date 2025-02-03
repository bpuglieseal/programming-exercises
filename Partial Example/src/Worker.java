public class Worker {
    private String name;
    private WorkerType type;

    Worker(String name, WorkerType type) {
        this.name = name;
        this.type = type;
    }

    public WorkerType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static String getVerboseWorkerType (WorkerType type) {
        switch (type) {
            case DRIVER -> {
                return "Driver";
            }
            case ENGINEER -> {
                return "Engineer";
            }
            case MANAGER -> {
                return "Manager";
            }
            default -> {
                return "";
            }
        }
    }
}
