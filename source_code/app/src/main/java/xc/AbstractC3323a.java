package xc;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import d3.n;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.ui.score.ScoreFragment;
import w9.m;
import z9.i;

/* renamed from: xc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3323a extends n {

    /* renamed from: b, reason: collision with root package name */
    public ContextWrapper f14127b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14128c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14129d = false;

    @Override // d3.n, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f14128c) {
            return null;
        }
        papa();
        return this.f14127b;
    }

    @Override // d3.n
    public final void mike() {
        if (!this.f14129d) {
            this.f14129d = true;
            InterfaceC3325c interfaceC3325c = (InterfaceC3325c) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ((ScoreFragment) UnsafeCasts.unsafeCast(this)).white = (i) ((m) interfaceC3325c).alpha.crimson.get();
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        super.onAttach(context);
        papa();
        mike();
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    public final void papa() {
        if (this.f14127b == null) {
            this.f14127b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f14128c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f14127b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        papa();
        mike();
    }
}
