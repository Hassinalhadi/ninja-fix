package Ua;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import androidx.lifecycle.a0;
import com.google.android.material.button.MaterialButton;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa/t;", "Landroidx/fragment/app/w;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class t extends DialogInterfaceOnCancelListenerC0627w implements GeneratedComponentManagerHolder {

    /* renamed from: j, reason: collision with root package name */
    public ContextWrapper f2149j;

    /* renamed from: l, reason: collision with root package name */
    public volatile FragmentComponentManager f2151l;

    /* renamed from: o, reason: collision with root package name */
    public J2.e f2154o;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2150k = false;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2152m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public boolean f2153n = false;

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f2150k) {
            return null;
        }
        tango();
        return this.f2149j;
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
        if (this.f2153n) {
            return;
        }
        this.f2153n = true;
        u uVar = (u) generatedComponent();
        uVar.getClass();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_new_bonus, viewGroup, false);
        int i4 = R.id.btnThankYou;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnThankYou, inflate);
        if (materialButton != null) {
            i4 = R.id.imageView7;
            if (((ImageView) S3.bravo(R.id.imageView7, inflate)) != null) {
                i4 = R.id.textView32;
                if (((TextView) S3.bravo(R.id.textView32, inflate)) != null) {
                    i4 = R.id.textView33;
                    if (((TextView) S3.bravo(R.id.textView33, inflate)) != null) {
                        i4 = R.id.tvBonusAmount;
                        TextView textView = (TextView) S3.bravo(R.id.tvBonusAmount, inflate);
                        if (textView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            this.f2154o = new J2.e(constraintLayout, materialButton, textView, 3);
                            return constraintLayout;
                        }
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
    public final void onResume() {
        String str;
        super.onResume();
        J2.e eVar = this.f2154o;
        if (eVar != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("amount");
            } else {
                str = null;
            }
            ((TextView) eVar.red).setText(str);
            J2.e eVar2 = this.f2154o;
            if (eVar2 != null) {
                ((MaterialButton) eVar2.purple).setOnClickListener(new Fb.b(this, 17));
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        oscar(true);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: sierra, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f2151l == null) {
            synchronized (this.f2152m) {
                try {
                    if (this.f2151l == null) {
                        this.f2151l = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f2151l;
    }

    public final void tango() {
        if (this.f2149j == null) {
            this.f2149j = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f2150k = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f2149j;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        tango();
        if (this.f2153n) {
            return;
        }
        this.f2153n = true;
        u uVar = (u) generatedComponent();
        uVar.getClass();
    }
}
