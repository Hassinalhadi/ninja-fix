package sa;

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
import delivery.samurai.android.ui.attendanceRegistry.AttendanceRegistryFragment;
import w9.m;
import z9.i;

/* loaded from: classes2.dex */
public abstract class f extends n {

    /* renamed from: b, reason: collision with root package name */
    public ContextWrapper f13699b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13700c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13701d = false;

    @Override // d3.n, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f13700c) {
            return null;
        }
        papa();
        return this.f13699b;
    }

    @Override // d3.n
    public final void mike() {
        if (!this.f13701d) {
            this.f13701d = true;
            InterfaceC2840a interfaceC2840a = (InterfaceC2840a) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ((AttendanceRegistryFragment) UnsafeCasts.unsafeCast(this)).white = (i) ((m) interfaceC2840a).alpha.crimson.get();
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
        if (this.f13699b == null) {
            this.f13699b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f13700c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f13699b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        papa();
        mike();
    }
}
