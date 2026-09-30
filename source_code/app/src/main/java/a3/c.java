package a3;

import androidx.appcompat.widget.P0;
import androidx.lifecycle.InterfaceC0640j;
import androidx.lifecycle.al;
import kotlin.Result;
import kotlin.Unit;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class c implements InterfaceC0640j {
    public final /* synthetic */ C3207k alpha;

    public c(C3207k c3207k) {
        this.alpha = c3207k;
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final /* synthetic */ void onCreate(al alVar) {
        P0.papa(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onDestroy(al alVar) {
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onPause(al alVar) {
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final /* synthetic */ void onResume(al alVar) {
        P0.sierra(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onStart(al alVar) {
        Result.Companion companion = Result.INSTANCE;
        this.alpha.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onStop(al alVar) {
    }
}
