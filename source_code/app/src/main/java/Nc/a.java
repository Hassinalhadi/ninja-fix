package Nc;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;

/* loaded from: classes2.dex */
public abstract class a extends d3.n {

    /* renamed from: b, reason: collision with root package name */
    public ContextWrapper f1877b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1878c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1879d = false;

    @Override // d3.n, androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f1878c) {
            return null;
        }
        papa();
        return this.f1877b;
    }

    @Override // d3.n
    public final void mike() {
        if (!this.f1879d) {
            this.f1879d = true;
            i iVar = (i) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ((TicketDetailsFragment) UnsafeCasts.unsafeCast(this)).white = (z9.i) ((w9.m) iVar).alpha.crimson.get();
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
        if (this.f1877b == null) {
            this.f1877b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f1878c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f1877b;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        papa();
        mike();
    }
}
