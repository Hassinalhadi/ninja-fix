package x9;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import androidx.lifecycle.a0;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import delivery.samurai.android.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x.j;
import z3.C3462a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx9/c;", "Landroidx/fragment/app/w;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: x9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3309c extends DialogInterfaceOnCancelListenerC0627w implements GeneratedComponentManagerHolder {

    /* renamed from: j, reason: collision with root package name */
    public ContextWrapper f14102j;

    /* renamed from: l, reason: collision with root package name */
    public volatile FragmentComponentManager f14104l;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14108p;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14103k = false;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14105m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f14106n = false;

    /* renamed from: o, reason: collision with root package name */
    public final Lazy f14107o = LazyKt.lazy(new j(2, this));

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public Context getContext() {
        if (super.getContext() == null && !this.f14103k) {
            return null;
        }
        victor();
        return this.f14102j;
    }

    @Override // androidx.fragment.app.ai, androidx.lifecycle.InterfaceC0651v
    public final a0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public void onAttach(Context context) {
        super.onAttach(context);
        victor();
        whiskey();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public void onCreate(Bundle bundle) {
        C3462a.alpha("LOCATION", 12, getClass().getName(), null);
        super.onCreate(bundle);
        if (getF13962w() && !this.f14108p) {
            C3462a.alpha("LIFECYCLE", 12, "Recreated after process death without state, dismissing: ".concat(getClass().getSimpleName()), null);
            kilo();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        yankee();
    }

    @Override // androidx.fragment.app.ai
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.btnClose);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(23, this));
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: sierra, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f14104l == null) {
            synchronized (this.f14105m) {
                try {
                    if (this.f14104l == null) {
                        this.f14104l = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f14104l;
    }

    public final k tango() {
        return (k) this.f14107o.getValue();
    }

    /* renamed from: uniform */
    public boolean getF13962w() {
        return false;
    }

    public final void victor() {
        if (this.f14102j == null) {
            this.f14102j = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f14103k = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    public void whiskey() {
        if (!this.f14106n) {
            this.f14106n = true;
            InterfaceC3310d interfaceC3310d = (InterfaceC3310d) generatedComponent();
            interfaceC3310d.getClass();
        }
    }

    public final void xray() {
        ViewGroup.LayoutParams layoutParams;
        View view = getView();
        if (view != null) {
            View view2 = getView();
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                layoutParams.width = getResources().getDisplayMetrics().widthPixels - (getResources().getDimensionPixelOffset(R.dimen.spacing_12) * 2);
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public abstract void yankee();

    public final void zulu(String msg) {
        Intrinsics.echo(msg, "msg");
        L9.d.pink(tango(), msg);
    }

    @Override // androidx.fragment.app.ai
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f14102j;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        victor();
        whiskey();
    }
}
