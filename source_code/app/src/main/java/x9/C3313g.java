package x9;

import androidx.fragment.app.P;
import androidx.fragment.app.ai;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3313g extends P {
    public ArrayList alpha;
    public ArrayList bravo;

    @Override // androidx.viewpager.widget.a
    public final int getCount() {
        return this.alpha.size();
    }

    @Override // androidx.fragment.app.P
    public final ai getItem(int i4) {
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        return (ai) obj;
    }

    @Override // androidx.viewpager.widget.a
    public final CharSequence getPageTitle(int i4) {
        return (CharSequence) this.bravo.get(i4);
    }
}
