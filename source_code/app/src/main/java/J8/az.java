package J8;

import android.os.Message;
import java.util.Comparator;
import s6.AbstractC2769s6;

/* loaded from: classes2.dex */
public final class az implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC2769s6.bravo(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}
