package kd;

import java.util.Comparator;
import java.util.Map;
import s6.AbstractC2769s6;

/* loaded from: classes2.dex */
public final class ac implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC2769s6.bravo((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }
}
