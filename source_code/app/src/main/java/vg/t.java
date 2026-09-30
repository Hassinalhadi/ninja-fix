package vg;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class t {
    public final Class alpha;
    public final Object bravo;
    public final Method charlie;
    public final List delta;

    public t(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.alpha = cls;
        this.bravo = obj;
        this.charlie = method;
        this.delta = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.alpha.getName(), this.charlie.getName(), this.delta);
    }
}
