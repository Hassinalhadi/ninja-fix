package R2;

import O2.n;
import Tf.ah;
import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r6.u;

/* loaded from: classes3.dex */
public final class h implements g {
    public final File alpha;

    public h(File file) {
        this.alpha = file;
    }

    @Override // R2.g
    public final Object alpha(Nd.c cVar) {
        String str = ah.purple;
        File file = this.alpha;
        n nVar = new n(u.charlie(file), Tf.u.SYSTEM, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        Intrinsics.delta(name, "getName(...)");
        return new m(nVar, singleton.getMimeTypeFromExtension(StringsKt.purple('.', name, "")), O2.f.red);
    }
}
