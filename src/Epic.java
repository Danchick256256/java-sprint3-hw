import java.util.HashMap;


public class Epic extends Task {


    private final HashMap<Integer, Subtask> subTasks;

    public Epic(String name, String description) {
        super(name, description);
        subTasks = new HashMap<>();
    }

    public HashMap<Integer, Subtask> getSubTasks() {
        return subTasks;
    }

    @Override
    public String setStatus(Status status) {
         return "You can not set status of Epic. ";
    }

    public void addSubtask(Subtask subtask) {
        subTasks.put(subtask.getId(), subtask);
    }

    public void removeSubtask(Subtask subtask) {
        subTasks.remove(subtask.getId());
    }

    public void removeAllSubtasks() {
        subTasks.clear();
    }

    public Subtask getSubtaskById(int id) {
        return subTasks.get(id);
    }

    @Override
    public String toString() {
        return "Epic{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", id=" + getId() +
                ", status=" + getStatus() + ", subtasks=" + subTasks + "}";
    }

}