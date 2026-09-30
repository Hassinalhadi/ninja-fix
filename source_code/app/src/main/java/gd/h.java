package gd;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import sd.q;

/* loaded from: classes2.dex */
public final class h implements Xd.l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ Request.Builder purple;

    public h(boolean z2, Request.Builder builder) {
        this.alpha = z2;
        this.purple = builder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, "Content-Length") != false) goto L8;
     */
    @Override // Xd.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        String key = (String) obj;
        String value = (String) obj2;
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        if (this.alpha) {
            List list = q.alpha;
        }
        this.purple.addHeader(key, value);
        return Unit.INSTANCE;
    }
}
