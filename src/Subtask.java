public class Subtask extends Task {

    public Subtask(String name, String description) {
        super(name, description);
    }

    @Override
    public String setStatus(Status status) {
        super.setStatus(status);
        return null;
    }


    @Override
    public String toString() {

         return "Subtask{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", id=" + getId() +
                ", status=" + getStatus();
    }
}