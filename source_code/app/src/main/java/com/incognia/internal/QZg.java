package com.incognia.internal;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class QZg extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ urQ f9505b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QZg(urQ urq) {
        super(1);
        this.f9505b = urq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r4 < r6) goto L13;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        xkS xks = (xkS) obj;
        D5f d5f = this.f9505b.f11502J;
        d5f.getClass();
        if (!(d5f instanceof L4) && xks.b(urQ.DOu)) {
            this.f9505b.getClass();
            String str = xIA.f11783b;
            kT kTVar = QHn.f9491W;
            String str2 = xIA.f11783b;
            rtW rtw = rtW.f11249b;
            Am am2 = (Am) kTVar.b(rtw, str2);
            if (am2 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j5 = am2.f8379W;
                if (elapsedRealtime - j5 < urQ.olU) {
                }
            }
            urQ urq = this.f9505b;
            oBS obs = xks.f11812W;
            if (!urq.f11503V) {
                urq.f11503V = true;
                urq.f11505b.b((Am) kTVar.b(rtw, str2), new br(urq, obs), new J0(urq, obs));
            }
            return Unit.INSTANCE;
        }
        oBS obs2 = xks.f11812W;
        String str3 = urQ.DOu;
        obs2.getClass();
        oBS.b(str3);
        return Unit.INSTANCE;
    }
}
