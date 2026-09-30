package s6;

import android.content.Context;
import android.os.SystemClock;
import i6.C1894c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class P7 {
    public static aj kilo;
    public static final ao lima;
    public final String alpha;
    public final String bravo;
    public final N7 charlie;
    public final com.google.mlkit.common.sdkinternal.m delta;
    public final G6.q echo;
    public final G6.q foxtrot;
    public final String golf;
    public final int hotel;
    public final HashMap india = new HashMap();
    public final HashMap juliet = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        lima = new ao(0, objArr);
    }

    public P7(Context context, com.google.mlkit.common.sdkinternal.m mVar, N7 n72, String str) {
        int i4;
        this.alpha = context.getPackageName();
        this.bravo = com.google.mlkit.common.sdkinternal.c.alpha(context);
        this.delta = mVar;
        this.charlie = n72;
        U7.bravo();
        this.golf = str;
        com.google.mlkit.common.sdkinternal.g alpha = com.google.mlkit.common.sdkinternal.g.alpha();
        C3.b bVar = new C3.b(6, this);
        alpha.getClass();
        this.echo = com.google.mlkit.common.sdkinternal.g.bravo(bVar);
        com.google.mlkit.common.sdkinternal.g alpha2 = com.google.mlkit.common.sdkinternal.g.alpha();
        Objects.requireNonNull(mVar);
        r6.p pVar = new r6.p(mVar, 1);
        alpha2.getClass();
        this.foxtrot = com.google.mlkit.common.sdkinternal.g.bravo(pVar);
        ao aoVar = lima;
        if (aoVar.containsKey(str)) {
            i4 = C1894c.delta(context, (String) aoVar.get(str), false);
        } else {
            i4 = -1;
        }
        this.hotel = i4;
    }

    public static long alpha(ArrayList arrayList, double d4) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d4 / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void bravo(O7 o72, A5 a52) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!delta(a52, elapsedRealtime)) {
            return;
        }
        this.india.put(a52, Long.valueOf(elapsedRealtime));
        com.google.mlkit.common.sdkinternal.p.alpha.execute(new ao.d(this, o72.zza(), a52, charlie(), 11, false));
    }

    public final String charlie() {
        G6.q qVar = this.echo;
        if (qVar.juliet()) {
            return (String) qVar.hotel();
        }
        return V5.k.charlie.alpha(this.golf);
    }

    public final boolean delta(A5 a52, long j5) {
        HashMap hashMap = this.india;
        if (hashMap.get(a52) == null || j5 - ((Long) hashMap.get(a52)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
