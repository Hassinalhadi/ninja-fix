package zendesk.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface Serializer {
    <E> E deserialize(Object obj, Class<E> cls);

    String serialize(Object obj);
}
