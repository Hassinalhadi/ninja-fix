package Nb;

import android.content.Context;
import androidx.lifecycle.G;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2832z6;
import td.C3117a;
import vf.ad;
import vf.ao;
import yf.AbstractC3428A;
import yf.N;
import yf.av;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class h {
    public final Context alpha;
    public final N bravo;
    public final av charlie;

    public h(Context context) {
        Intrinsics.echo(context, "context");
        this.alpha = context;
        C3117a charlie = ad.charlie(AbstractC2832z6.charlie(ad.foxtrot(), ao.alpha));
        N charlie2 = AbstractC3428A.charlie(Boolean.valueOf(e.bravo(context)));
        this.bravo = charlie2;
        this.charlie = new av(charlie2);
        ad.zulu(charlie, null, null, new g(this, null), 3);
        G.f3128b.white.alpha(new f(0, this));
    }

    public final void alpha(boolean z2) {
        N n5 = this.bravo;
        boolean booleanValue = ((Boolean) n5.getValue()).booleanValue();
        if (booleanValue != z2) {
            Boolean valueOf = Boolean.valueOf(z2);
            n5.getClass();
            n5.juliet(null, valueOf);
            String str = "evt=VALIDATED_INTERNET transition prev=" + booleanValue + " current=" + z2 + " atMs=" + System.currentTimeMillis();
            C3462a.alpha("InternetRepository", 12, str, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                K7.b.alpha().bravo("TAG -> InternetRepository," + str);
                Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
