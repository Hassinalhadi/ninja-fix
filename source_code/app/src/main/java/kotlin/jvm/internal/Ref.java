package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class Ref {

    /* loaded from: classes2.dex */
    public static final class ObjectRef<T> implements Serializable {
        public Object alpha;

        public final String toString() {
            return String.valueOf(this.alpha);
        }
    }

    private Ref() {
    }
}
