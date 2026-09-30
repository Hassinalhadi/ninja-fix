package d3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ai;
import androidx.fragment.app.an;
import androidx.lifecycle.a0;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld3/n;", "Landroidx/fragment/app/ai;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public abstract class n extends ai implements GeneratedComponentManagerHolder {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f12061a;
    public ContextWrapper alpha;
    public volatile FragmentComponentManager red;
    public z9.i white;
    public final Lazy yellow;
    public boolean purple = false;
    public final Object silver = new Object();
    public boolean teal = false;

    public n() {
        final int i4 = 0;
        this.yellow = LazyKt.lazy(new Function0(this) { // from class: d3.m
            public final /* synthetic */ n purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        an activity = this.purple.getActivity();
                        Intrinsics.charlie(activity, "null cannot be cast to non-null type com.app.base.BaseActivity");
                        return (k) activity;
                    default:
                        return this.purple.kilo().papa();
                }
            }
        });
        final int i5 = 1;
        this.f12061a = LazyKt.lazy(new Function0(this) { // from class: d3.m
            public final /* synthetic */ n purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        an activity = this.purple.getActivity();
                        Intrinsics.charlie(activity, "null cannot be cast to non-null type com.app.base.BaseActivity");
                        return (k) activity;
                    default:
                        return this.purple.kilo().papa();
                }
            }
        });
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public Context getContext() {
        if (super.getContext() == null && !this.purple) {
            return null;
        }
        lima();
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

    public final k kilo() {
        return (k) this.yellow.getValue();
    }

    public final void lima() {
        if (this.alpha == null) {
            this.alpha = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.purple = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    public void mike() {
        if (!this.teal) {
            this.teal = true;
            o oVar = (o) generatedComponent();
            ((n) UnsafeCasts.unsafeCast(this)).white = (z9.i) ((w9.m) oVar).alpha.crimson.get();
        }
    }

    public void november() {
        n nVar;
        List<ai> foxtrot = getChildFragmentManager().charlie.foxtrot();
        Intrinsics.delta(foxtrot, "getFragments(...)");
        for (ai aiVar : foxtrot) {
            if (aiVar instanceof n) {
                nVar = (n) aiVar;
            } else {
                nVar = null;
            }
            if (nVar != null) {
                nVar.november();
            }
        }
    }

    @Override // androidx.fragment.app.ai
    public void onAttach(Context context) {
        super.onAttach(context);
        lima();
        mike();
    }

    @Override // androidx.fragment.app.ai
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3462a.alpha("SCREEN_SWITCHED", 12, getClass().getName(), null);
    }

    @Override // androidx.fragment.app.ai
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.ai
    public void onResume() {
        super.onResume();
        oscar();
    }

    @Override // androidx.fragment.app.ai
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (this.white != null) {
            final k baseActivity = kilo();
            Intrinsics.echo(baseActivity, "baseActivity");
            Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
            if (toolbar != null) {
                final int i4 = 1;
                toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: z9.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i4) {
                            case 0:
                                baseActivity.onBackPressed();
                                return;
                            default:
                                baseActivity.onBackPressed();
                                return;
                        }
                    }
                });
                return;
            }
            return;
        }
        Intrinsics.lima("uiManager");
        throw null;
    }

    public abstract void oscar();

    @Override // androidx.fragment.app.ai
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.alpha;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        lima();
        mike();
    }
}
