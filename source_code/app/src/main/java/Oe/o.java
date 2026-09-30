package Oe;

import java.io.Serializable;
import java.util.Collections;

/* loaded from: classes2.dex */
public abstract class o extends b implements Serializable {
    public static n golf(l lVar, o oVar, int i4, an anVar, Class cls) {
        return new n(lVar, Collections.EMPTY_LIST, oVar, new m(i4, anVar, true), cls);
    }

    public static n hotel(l lVar, Serializable serializable, o oVar, int i4, ap apVar, Class cls) {
        return new n(lVar, serializable, oVar, new m(i4, apVar, false), cls);
    }
}
