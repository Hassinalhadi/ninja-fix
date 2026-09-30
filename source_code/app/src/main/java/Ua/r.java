package Ua;

import B9.aa;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
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
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa/r;", "Landroidx/fragment/app/w;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class r extends DialogInterfaceOnCancelListenerC0627w implements GeneratedComponentManagerHolder {

    /* renamed from: j, reason: collision with root package name */
    public ContextWrapper f2143j;

    /* renamed from: l, reason: collision with root package name */
    public volatile FragmentComponentManager f2145l;

    /* renamed from: o, reason: collision with root package name */
    public aa f2148o;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2144k = false;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2146m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f2147n = false;

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f2144k) {
            return null;
        }
        tango();
        return this.f2143j;
    }

    @Override // androidx.fragment.app.ai, androidx.lifecycle.InterfaceC0651v
    public final a0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final Dialog mike(Bundle bundle) {
        Dialog mike = super.mike(bundle);
        mike.setCancelable(false);
        return mike;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        super.onAttach(context);
        tango();
        if (this.f2147n) {
            return;
        }
        this.f2147n = true;
        s sVar = (s) generatedComponent();
        sVar.getClass();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_mock_location_found, viewGroup, false);
        int i4 = R.id.btnGotoSettings;
        Button button = (Button) S3.bravo(R.id.btnGotoSettings, inflate);
        if (button != null) {
            i4 = R.id.retry;
            Button button2 = (Button) S3.bravo(R.id.retry, inflate);
            if (button2 != null) {
                i4 = R.id.textView;
                if (((TextView) S3.bravo(R.id.textView, inflate)) != null) {
                    i4 = R.id.textView19;
                    if (((TextView) S3.bravo(R.id.textView19, inflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        this.f2148o = new aa(constraintLayout, button, button2);
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(FragmentComponentManager.createContextWrapper(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        aa aaVar = this.f2148o;
        if (aaVar != null) {
            final int i4 = 0;
            aaVar.alpha.setOnClickListener(new View.OnClickListener(this) { // from class: Ua.q
                public final /* synthetic */ r purple;

                {
                    this.purple = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i4) {
                        case 0:
                            Intent intent = new Intent("android.settings.SETTINGS");
                            r rVar = this.purple;
                            rVar.startActivity(intent);
                            rVar.lima(false, false);
                            return;
                        default:
                            this.purple.lima(false, false);
                            return;
                    }
                }
            });
            aa aaVar2 = this.f2148o;
            if (aaVar2 != null) {
                final int i5 = 1;
                aaVar2.bravo.setOnClickListener(new View.OnClickListener(this) { // from class: Ua.q
                    public final /* synthetic */ r purple;

                    {
                        this.purple = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i5) {
                            case 0:
                                Intent intent = new Intent("android.settings.SETTINGS");
                                r rVar = this.purple;
                                rVar.startActivity(intent);
                                rVar.lima(false, false);
                                return;
                            default:
                                this.purple.lima(false, false);
                                return;
                        }
                    }
                });
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: sierra, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f2145l == null) {
            synchronized (this.f2146m) {
                try {
                    if (this.f2145l == null) {
                        this.f2145l = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f2145l;
    }

    public final void tango() {
        if (this.f2143j == null) {
            this.f2143j = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f2144k = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f2143j;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        tango();
        if (this.f2147n) {
            return;
        }
        this.f2147n = true;
        s sVar = (s) generatedComponent();
        sVar.getClass();
    }
}
