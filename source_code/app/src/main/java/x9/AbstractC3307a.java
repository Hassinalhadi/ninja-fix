package x9;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.a0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.m;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import delivery.samurai.android.R;
import ga.as;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wf.RunnableC3267d;
import x.j;
import z3.C3462a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx9/a;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: x9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3307a extends m implements GeneratedComponentManagerHolder {

    /* renamed from: k, reason: collision with root package name */
    public ContextWrapper f14095k;

    /* renamed from: m, reason: collision with root package name */
    public volatile FragmentComponentManager f14097m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14101q;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14096l = false;

    /* renamed from: n, reason: collision with root package name */
    public final Object f14098n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public boolean f14099o = false;

    /* renamed from: p, reason: collision with root package name */
    public final Lazy f14100p = LazyKt.lazy(new j(1, this));

    public final void amber() {
        View view = getView();
        if (view != null) {
            view.post(new as(14, this));
        }
    }

    public abstract void azure();

    public final void beige() {
        ViewParent viewParent;
        View view = getView();
        FrameLayout frameLayout = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof FrameLayout) {
            frameLayout = (FrameLayout) viewParent;
        }
        if (frameLayout != null) {
            BottomSheetBehavior juliet = BottomSheetBehavior.juliet(frameLayout);
            Intrinsics.delta(juliet, "from(...)");
            int whiskey = whiskey();
            if (whiskey != 0) {
                if (whiskey != 1) {
                    if (whiskey != 2) {
                        return;
                    }
                    frameLayout.getLayoutParams().height = -2;
                    juliet.papa(true);
                    juliet.C = true;
                    juliet.sierra(3);
                    frameLayout.post(new RunnableC3267d(1, frameLayout, juliet));
                    return;
                }
                frameLayout.getLayoutParams().height = -1;
                juliet.papa(false);
                juliet.C = true;
                juliet.sierra(3);
                return;
            }
            frameLayout.getLayoutParams().height = -2;
            juliet.papa(true);
            juliet.C = true;
            juliet.sierra(3);
        }
    }

    public final void black(String msg) {
        Intrinsics.echo(msg, "msg");
        L9.d.pink(victor(), msg);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public Context getContext() {
        if (super.getContext() == null && !this.f14096l) {
            return null;
        }
        yankee();
        return this.f14095k;
    }

    @Override // androidx.fragment.app.ai, androidx.lifecycle.InterfaceC0651v
    public final a0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public void onAttach(Context context) {
        super.onAttach(context);
        yankee();
        zulu();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public void onCreate(Bundle bundle) {
        C3462a.alpha("LOCATION", 12, getClass().getName(), null);
        super.onCreate(bundle);
        if (getF742w() && !this.f14101q) {
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
    public void onResume() {
        super.onResume();
        azure();
    }

    @Override // androidx.fragment.app.ai
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.btnClose);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(22, this));
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: uniform, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f14097m == null) {
            synchronized (this.f14098n) {
                try {
                    if (this.f14097m == null) {
                        this.f14097m = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f14097m;
    }

    public final k victor() {
        return (k) this.f14100p.getValue();
    }

    public int whiskey() {
        return 0;
    }

    /* renamed from: xray */
    public boolean getF742w() {
        return false;
    }

    public final void yankee() {
        if (this.f14095k == null) {
            this.f14095k = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f14096l = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    public void zulu() {
        if (!this.f14099o) {
            this.f14099o = true;
            InterfaceC3308b interfaceC3308b = (InterfaceC3308b) generatedComponent();
            interfaceC3308b.getClass();
        }
    }

    @Override // androidx.fragment.app.ai
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f14095k;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        yankee();
        zulu();
    }
}
