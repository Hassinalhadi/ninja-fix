package hd;

import ed.InterfaceC1651a;
import ge.InterfaceC1772d;
import h5.C1809a;
import id.C1915c;
import s6.AbstractC2742p5;
import zd.C3509a;

/* renamed from: hd.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1848d {
    public static final C3509a alpha;
    public static final C3509a bravo;
    public static final C1915c charlie;

    static {
        ge.w wVar;
        InterfaceC1772d bravo2 = kotlin.jvm.internal.u.alpha.bravo(InterfaceC1651a.class);
        ge.w wVar2 = null;
        try {
            wVar = kotlin.jvm.internal.u.alpha(InterfaceC1651a.class);
        } catch (Throwable unused) {
            wVar = null;
        }
        alpha = new C3509a("UploadProgressListenerAttributeKey", new Ed.a(bravo2, wVar));
        InterfaceC1772d bravo3 = kotlin.jvm.internal.u.alpha.bravo(InterfaceC1651a.class);
        try {
            wVar2 = kotlin.jvm.internal.u.alpha(InterfaceC1651a.class);
        } catch (Throwable unused2) {
        }
        bravo = new C3509a("DownloadProgressListenerAttributeKey", new Ed.a(bravo3, wVar2));
        charlie = AbstractC2742p5.alpha("BodyProgress", new C1809a(7), new com.clevertap.android.sdk.inapp.images.preload.a(29));
    }
}
