package rabotyaga;

@FunctionalInterface
public interface OnTaskErrorListener {
    void  onError(String resultError);
}
