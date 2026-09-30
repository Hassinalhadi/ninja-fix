package t6;

import android.content.Context;
import i6.C1894c;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class h4 {
    public static q4 juliet;
    public static final s6.ao kilo;
    public final String alpha;
    public final String bravo;
    public final g4 charlie;
    public final com.google.mlkit.common.sdkinternal.m delta;
    public final G6.q echo;
    public final G6.q foxtrot;
    public final String golf;
    public final int hotel;
    public final HashMap india = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        kilo = new s6.ao(1, objArr);
    }

    public h4(Context context, com.google.mlkit.common.sdkinternal.m mVar, g4 g4Var) {
        int i4;
        new HashMap();
        this.alpha = context.getPackageName();
        this.bravo = com.google.mlkit.common.sdkinternal.c.alpha(context);
        this.delta = mVar;
        this.charlie = g4Var;
        l4.bravo();
        this.golf = "vision-common";
        com.google.mlkit.common.sdkinternal.g alpha = com.google.mlkit.common.sdkinternal.g.alpha();
        C3.b bVar = new C3.b(7, this);
        alpha.getClass();
        this.echo = com.google.mlkit.common.sdkinternal.g.bravo(bVar);
        com.google.mlkit.common.sdkinternal.g alpha2 = com.google.mlkit.common.sdkinternal.g.alpha();
        mVar.getClass();
        r6.p pVar = new r6.p(mVar, 2);
        alpha2.getClass();
        this.foxtrot = com.google.mlkit.common.sdkinternal.g.bravo(pVar);
        s6.ao aoVar = kilo;
        if (aoVar.containsKey("vision-common")) {
            i4 = C1894c.delta(context, (String) aoVar.get("vision-common"), false);
        } else {
            i4 = -1;
        }
        this.hotel = i4;
    }
}
