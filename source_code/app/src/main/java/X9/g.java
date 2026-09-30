package X9;

import android.content.Intent;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import d3.C1586b;
import e3.InterfaceC1627a;
import io.reactivex.disposables.Disposable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2957b;
import z9.C3490g;

/* loaded from: classes2.dex */
public final class g {
    public final InterfaceC2957b alpha;
    public final C3490g bravo;
    public final InterfaceC1627a charlie;
    public Disposable delta;

    public g(InterfaceC2957b captainService, C3490g locationManager, InterfaceC1627a userManager) {
        Intrinsics.echo(captainService, "captainService");
        Intrinsics.echo(locationManager, "locationManager");
        Intrinsics.echo(userManager, "userManager");
        this.alpha = captainService;
        this.bravo = locationManager;
        this.charlie = userManager;
    }

    public static void bravo(d3.k kVar, C1586b c1586b) {
        if (!kVar.isFinishing() && !kVar.isDestroyed()) {
            kVar.runOnUiThread(new A8.g(20, kVar, c1586b));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            c1586b.invoke();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void alpha(d3.k kVar, UserInfo userInfo) {
        Captain captain = userInfo.getCaptain();
        if (captain == null) {
            captain = new Captain();
            userInfo.setCaptain(captain);
        }
        captain.setReadyToWork(Boolean.FALSE);
        z9.j jVar = (z9.j) this.charlie;
        jVar.getClass();
        L9.d.lavender(jVar.alpha, userInfo);
        kVar.oscar().postValue(userInfo);
        W1.b.alpha(kVar).charlie(new Intent("REFRESH_CONTENT"));
    }
}
