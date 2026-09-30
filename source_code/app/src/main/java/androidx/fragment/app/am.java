package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import g1.InterfaceC1738g;
import g1.InterfaceC1739h;
import o2.C2194d;
import o2.InterfaceC2196f;
import r1.InterfaceC2482a;
import s1.InterfaceC2578k;
import s1.InterfaceC2582o;

/* loaded from: classes3.dex */
public final class am extends as implements InterfaceC1738g, InterfaceC1739h, f1.ad, f1.ae, androidx.lifecycle.d0, ae.aj, ah.i, InterfaceC2196f, O, InterfaceC2578k {
    public final /* synthetic */ an teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(an anVar) {
        super(anVar);
        this.teal = anVar;
    }

    @Override // s1.InterfaceC2578k
    public final void addMenuProvider(InterfaceC2582o interfaceC2582o) {
        this.teal.addMenuProvider(interfaceC2582o);
    }

    @Override // g1.InterfaceC1738g
    public final void addOnConfigurationChangedListener(InterfaceC2482a interfaceC2482a) {
        this.teal.addOnConfigurationChangedListener(interfaceC2482a);
    }

    @Override // f1.ad
    public final void addOnMultiWindowModeChangedListener(InterfaceC2482a interfaceC2482a) {
        this.teal.addOnMultiWindowModeChangedListener(interfaceC2482a);
    }

    @Override // f1.ae
    public final void addOnPictureInPictureModeChangedListener(InterfaceC2482a interfaceC2482a) {
        this.teal.addOnPictureInPictureModeChangedListener(interfaceC2482a);
    }

    @Override // g1.InterfaceC1739h
    public final void addOnTrimMemoryListener(InterfaceC2482a interfaceC2482a) {
        this.teal.addOnTrimMemoryListener(interfaceC2482a);
    }

    @Override // androidx.fragment.app.O
    public final void alpha(L l10, ai aiVar) {
        this.teal.onAttachFragment(aiVar);
    }

    @Override // androidx.fragment.app.aq
    public final View bravo(int i4) {
        return this.teal.findViewById(i4);
    }

    @Override // androidx.fragment.app.aq
    public final boolean charlie() {
        Window window = this.teal.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // ah.i
    public final ah.h getActivityResultRegistry() {
        return this.teal.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.al
    public final androidx.lifecycle.ac getLifecycle() {
        return this.teal.mFragmentLifecycleRegistry;
    }

    @Override // ae.aj
    public final ae.ai getOnBackPressedDispatcher() {
        return this.teal.getOnBackPressedDispatcher();
    }

    @Override // o2.InterfaceC2196f
    public final C2194d getSavedStateRegistry() {
        return this.teal.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.d0
    public final androidx.lifecycle.c0 getViewModelStore() {
        return this.teal.getViewModelStore();
    }

    @Override // s1.InterfaceC2578k
    public final void removeMenuProvider(InterfaceC2582o interfaceC2582o) {
        this.teal.removeMenuProvider(interfaceC2582o);
    }

    @Override // g1.InterfaceC1738g
    public final void removeOnConfigurationChangedListener(InterfaceC2482a interfaceC2482a) {
        this.teal.removeOnConfigurationChangedListener(interfaceC2482a);
    }

    @Override // f1.ad
    public final void removeOnMultiWindowModeChangedListener(InterfaceC2482a interfaceC2482a) {
        this.teal.removeOnMultiWindowModeChangedListener(interfaceC2482a);
    }

    @Override // f1.ae
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC2482a interfaceC2482a) {
        this.teal.removeOnPictureInPictureModeChangedListener(interfaceC2482a);
    }

    @Override // g1.InterfaceC1739h
    public final void removeOnTrimMemoryListener(InterfaceC2482a interfaceC2482a) {
        this.teal.removeOnTrimMemoryListener(interfaceC2482a);
    }
}
