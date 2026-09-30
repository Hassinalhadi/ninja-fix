package F5;

import L5.j;
import android.content.Context;
import r6.u;

/* loaded from: classes3.dex */
public final class e implements G5.b {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public /* synthetic */ e(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // Kd.a
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return new d((Context) ((e) this.bravo).bravo, new u(6), new g8.d(6));
            case 1:
                String packageName = ((Context) ((e) this.bravo).bravo).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 2:
                return new j((Context) ((e) this.bravo).bravo, Integer.valueOf(j.silver).intValue(), "com.google.android.datatransport.events");
            default:
                return this.bravo;
        }
    }
}
