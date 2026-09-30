package androidx.viewpager.widget;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e eVar = (e) ((View) obj).getLayoutParams();
        e eVar2 = (e) ((View) obj2).getLayoutParams();
        boolean z2 = eVar.alpha;
        if (z2 != eVar2.alpha) {
            if (z2) {
                return 1;
            }
            return -1;
        }
        return eVar.echo - eVar2.echo;
    }
}
