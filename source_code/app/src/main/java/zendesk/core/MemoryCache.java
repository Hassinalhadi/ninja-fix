package zendesk.core;

/* loaded from: classes.dex */
public interface MemoryCache {
    void clear();

    boolean contains(String str);

    <T> T get(String str);

    <T> T getOrDefault(String str, T t5);

    void put(String str, Object obj);

    void remove(String str);
}
