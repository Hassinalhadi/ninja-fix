package Ua;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.location.LocationManager;
import android.os.Build;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa/m;", "Landroidx/fragment/app/w;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class m extends DialogInterfaceOnCancelListenerC0627w implements GeneratedComponentManagerHolder {

    /* renamed from: j, reason: collision with root package name */
    public ContextWrapper f2136j;

    /* renamed from: l, reason: collision with root package name */
    public volatile FragmentComponentManager f2138l;

    /* renamed from: o, reason: collision with root package name */
    public Aa.m f2141o;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2137k = false;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2139m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f2140n = false;

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f2137k) {
            return null;
        }
        tango();
        return this.f2136j;
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
        if (this.f2140n) {
            return;
        }
        this.f2140n = true;
        n nVar = (n) generatedComponent();
        nVar.getClass();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_location_turned_off, viewGroup, false);
        int i4 = R.id.gotoLocationSettings;
        Button button = (Button) S3.bravo(R.id.gotoLocationSettings, inflate);
        if (button != null) {
            i4 = R.id.textView20;
            if (((TextView) S3.bravo(R.id.textView20, inflate)) != null) {
                i4 = R.id.textView21;
                if (((TextView) S3.bravo(R.id.textView21, inflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f2141o = new Aa.m(constraintLayout, button, 2);
                    return constraintLayout;
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
    public final void onResume() {
        boolean isProviderEnabled;
        super.onResume();
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = getContext();
            if (context != null) {
                obj = context.getSystemService("location");
            }
            Intrinsics.charlie(obj, "null cannot be cast to non-null type android.location.LocationManager");
            isProviderEnabled = ((LocationManager) obj).isLocationEnabled();
        } else {
            Context context2 = getContext();
            if (context2 != null) {
                obj = context2.getSystemService("location");
            }
            Intrinsics.charlie(obj, "null cannot be cast to non-null type android.location.LocationManager");
            isProviderEnabled = ((LocationManager) obj).isProviderEnabled("gps");
        }
        if (isProviderEnabled) {
            lima(false, false);
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        oscar(false);
        Aa.m mVar = this.f2141o;
        if (mVar != null) {
            ((Button) mVar.purple).setOnClickListener(new Fb.b(this, 15));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: sierra, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f2138l == null) {
            synchronized (this.f2139m) {
                try {
                    if (this.f2138l == null) {
                        this.f2138l = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f2138l;
    }

    public final void tango() {
        if (this.f2136j == null) {
            this.f2136j = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f2137k = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f2136j;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        tango();
        if (this.f2140n) {
            return;
        }
        this.f2140n = true;
        n nVar = (n) generatedComponent();
        nVar.getClass();
    }
}
