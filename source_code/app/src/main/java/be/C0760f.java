package be;

import androidx.camera.core.impl.ai;
import bd.ExecutorC0748a;
import com.clevertap.android.sdk.Constants;

/* renamed from: be.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0760f implements V0.i {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ com.google.common.util.concurrent.e purple;

    public /* synthetic */ C0760f(com.google.common.util.concurrent.e eVar, int i4) {
        this.alpha = i4;
        this.purple = eVar;
    }

    @Override // V0.i
    public final Object black(V0.h hVar) {
        switch (this.alpha) {
            case 0:
                ai aiVar = new ai(11, hVar);
                ExecutorC0748a bravo = tg.k.bravo();
                com.google.common.util.concurrent.e eVar = this.purple;
                eVar.foxtrot(aiVar, bravo);
                return "transformVoidFuture [" + eVar + Constants.AES_SUFFIX;
            default:
                ExecutorC0748a bravo2 = tg.k.bravo();
                com.google.common.util.concurrent.e eVar2 = this.purple;
                h.echo(false, eVar2, hVar, bravo2);
                return "nonCancellationPropagating[" + eVar2 + Constants.AES_SUFFIX;
        }
    }
}
