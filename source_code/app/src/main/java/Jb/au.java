package Jb;

import android.os.Bundle;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3075w2;

/* loaded from: classes2.dex */
public final /* synthetic */ class au implements Y1.p {
    public final /* synthetic */ HomeActivityV2 alpha;

    @Override // Y1.p
    public final void alpha(Y1.r rVar, Y1.aa destination, Bundle bundle) {
        Object m206constructorimpl;
        HomeActivityV2 homeActivityV2 = this.alpha;
        int i4 = HomeActivityV2.f12269k0;
        Intrinsics.echo(rVar, "<unused var>");
        Intrinsics.echo(destination, "destination");
        He.b bVar = destination.purple;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(homeActivityV2.getResources().getResourceEntryName(bVar.charlie));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        String valueOf = String.valueOf(bVar.charlie);
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = valueOf;
        }
        String str = (String) m206constructorimpl;
        Intrinsics.checkNotNull(str);
        AbstractC3075w2.charlie("current_nav_destination", str);
    }
}
