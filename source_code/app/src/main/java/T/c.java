package T;

import java.lang.reflect.Field;
import java.util.Comparator;
import s6.AbstractC2769s6;

/* loaded from: classes3.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC2769s6.bravo(((Field) obj).getName(), ((Field) obj2).getName());
    }
}
