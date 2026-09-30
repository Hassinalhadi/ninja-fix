package ae;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ah implements InterfaceC0424c {
    public final ac alpha;
    public final /* synthetic */ ai purple;

    public ah(ai aiVar, ac onBackPressedCallback) {
        Intrinsics.echo(onBackPressedCallback, "onBackPressedCallback");
        this.purple = aiVar;
        this.alpha = onBackPressedCallback;
    }

    @Override // ae.InterfaceC0424c
    public final void cancel() {
        ai aiVar = this.purple;
        kotlin.collections.l lVar = aiVar.bravo;
        ac acVar = this.alpha;
        lVar.remove(acVar);
        if (Intrinsics.areEqual(aiVar.charlie, acVar)) {
            acVar.handleOnBackCancelled();
            aiVar.charlie = null;
        }
        acVar.removeCancellable(this);
        Function0<Unit> enabledChangedCallback$activity_release = acVar.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        acVar.setEnabledChangedCallback$activity_release(null);
    }
}
