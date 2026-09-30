package Pb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ai;
import androidx.lifecycle.a0;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LPb/c;", "Landroidx/fragment/app/ai;", "<init>", "()V", "s6/M6", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class c extends ai implements GeneratedComponentManagerHolder {
    public ContextWrapper alpha;
    public volatile FragmentComponentManager red;
    public boolean purple = false;
    public final Object silver = new Object();
    public boolean teal = false;

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.purple) {
            return null;
        }
        kilo();
        return this.alpha;
    }

    @Override // androidx.fragment.app.ai, androidx.lifecycle.InterfaceC0651v
    public final a0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: juliet, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.red == null) {
            synchronized (this.silver) {
                try {
                    if (this.red == null) {
                        this.red = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.red;
    }

    public final void kilo() {
        if (this.alpha == null) {
            this.alpha = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.purple = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Context context) {
        super.onAttach(context);
        kilo();
        if (this.teal) {
            return;
        }
        this.teal = true;
        d dVar = (d) generatedComponent();
        dVar.getClass();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments;
        Intrinsics.echo(inflater, "inflater");
        if ((bundle == null || bundle.getString("arg_tutorial") == null) && (arguments = getArguments()) != null) {
            arguments.getString("arg_tutorial");
        }
        return inflater.inflate(R.layout.tutorial_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.ai
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.alpha;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        kilo();
        if (this.teal) {
            return;
        }
        this.teal = true;
        d dVar = (d) generatedComponent();
        dVar.getClass();
    }
}
