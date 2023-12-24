package cn.kk.util_box.io;

public interface ObjectCallback<T> {
    void onResult(boolean success, T result);
}
