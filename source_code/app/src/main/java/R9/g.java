package R9;

import Xd.p;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vf.C3207k;

/* loaded from: classes2.dex */
public final class g implements p {
    public final /* synthetic */ C3207k alpha;
    public final /* synthetic */ i purple;
    public final /* synthetic */ boolean red;

    public g(C3207k c3207k, i iVar, boolean z2) {
        this.alpha = c3207k;
        this.purple = iVar;
        this.red = z2;
    }

    @Override // Xd.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean z2;
        long j5;
        boolean z10;
        f fVar;
        Object dVar;
        String str;
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        String str2 = (String) obj2;
        Long l10 = (Long) obj3;
        String str3 = (String) obj4;
        Boolean bool2 = (Boolean) obj5;
        Boolean bool3 = (Boolean) obj6;
        C3207k c3207k = this.alpha;
        if (!c3207k.isCancelled()) {
            this.purple.invoke(bool, str2, l10, str3, bool2, bool3);
            Result.Companion companion = Result.INSTANCE;
            AtomicBoolean atomicBoolean = k.bravo;
            boolean z11 = false;
            if (!booleanValue && !Intrinsics.areEqual(str2, "same_as_last")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (l10 != null) {
                j5 = l10.longValue();
            } else {
                j5 = Long.MAX_VALUE;
            }
            if (0 <= j5 && j5 < 30001) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z2 && z10) {
                dVar = new b(booleanValue);
            } else {
                if (z2) {
                    if (booleanValue) {
                        str = "sent_but_stale";
                    } else {
                        str = "same_as_last_stale";
                    }
                    fVar = new f(l10, str);
                } else {
                    fVar = null;
                }
                if (str2 != null && StringsKt.beige(str2, "STOMP", false)) {
                    z11 = true;
                }
                if (this.red) {
                    dVar = new c(fVar, z11);
                } else {
                    dVar = new d(fVar);
                }
            }
            c3207k.resumeWith(Result.m206constructorimpl(dVar));
        }
        return Unit.INSTANCE;
    }
}
