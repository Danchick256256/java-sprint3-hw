import java.util.HashMap;


public class Manager {

    private static int idNumber = 0;

    private final HashMap<Integer, Task> tasksList;
    private final HashMap<Integer, Subtask> subtasksList;
    private final HashMap<Integer, Epic> epicsList;


    public static int getIdNumber() {
        return ++idNumber;
    }

    public Manager() {
        tasksList = new HashMap<>();
        subtasksList = new HashMap<>();
        epicsList = new HashMap<>();
    }

    public void setTask(Task task) {

        if (task instanceof Epic) {
            epicsList.put(task.getId(), (Epic)task);
            return;
        }

        if (task instanceof Subtask) {
            subtasksList.put(task.getId(),(Subtask)task);
            return;
        }

        if (task != null) {
            tasksList.put(task.getId(), task);
        }
    }

    public void updateTask(Task task) {
        setTask(task);
    }


    public Task getTask(int id) {

        if (epicsList.containsKey(id)) {
            return epicsList.get(id);
        }

        if (subtasksList.containsKey(id)) {
            return subtasksList.get(id);
        }

        if (tasksList.containsKey(id)) {
            return tasksList.get(id);
        }

        return null;
    }

    public void removeTask(Task task) {

        int TaskId = task.getId();

        if (epicsList.containsKey(TaskId)) {
            epicsList.remove(TaskId);
            return;
        }

        if (subtasksList.containsKey(TaskId)) {
            subtasksList.remove(TaskId);
            return;
        }

        if (tasksList.containsKey(TaskId)) {
            tasksList.remove(TaskId);
            return;
        }
    }


    public void removeAllEpics() {
        epicsList.clear();
    }

    public void removeAllSubtasks() {
        subtasksList.clear();
    }

    public void removeAllTasks() {
        tasksList.clear();
    }


    public HashMap<Integer, Task> getTasksList() {
        return tasksList;
    }

    public HashMap<Integer, Subtask> getSubtasksList() {
        return subtasksList;
    }

    public HashMap<Integer, Epic> getEpicsList() {
        return epicsList;
    }

}