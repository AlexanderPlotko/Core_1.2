package rabotyaga;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
