package Yb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYb/I0;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class I0 extends com.google.android.material.bottomsheet.m implements GeneratedComponentManagerHolder {

    /* renamed from: k, reason: collision with root package name */
    public ContextWrapper f2324k;

    /* renamed from: m, reason: collision with root package name */
    public volatile FragmentComponentManager f2326m;

    /* renamed from: p, reason: collision with root package name */
    public C0322o0 f2329p;

    /* renamed from: q, reason: collision with root package name */
    public C0322o0 f2330q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2331r;

    /* renamed from: s, reason: collision with root package name */
    public J2.c f2332s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2333t;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2325l = false;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2327n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public boolean f2328o = false;

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.ai
    public final Context getContext() {
        if (super.getContext() == null && !this.f2325l) {
            return null;
        }
        victor();
        return this.f2324k;
    }

    @Override // androidx.fragment.app.ai, androidx.lifecycle.InterfaceC0651v
    public final androidx.lifecycle.a0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onAttach(Context context) {
        super.onAttach(context);
        victor();
        if (this.f2328o) {
            return;
        }
        this.f2328o = true;
        J0 j02 = (J0) generatedComponent();
        j02.getClass();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.f2331r) {
            kilo();
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_scan_qr_code_v2, viewGroup, false);
        int i4 = R.id.btnClose;
        ImageButton imageButton = (ImageButton) S3.bravo(R.id.btnClose, inflate);
        if (imageButton != null) {
            i4 = R.id.btnScanQr;
            MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnScanQr, inflate);
            if (materialButton != null) {
                i4 = R.id.lottieView;
                if (((LottieAnimationView) S3.bravo(R.id.lottieView, inflate)) != null) {
                    i4 = R.id.tvQrInfo;
                    if (((TextView) S3.bravo(R.id.tvQrInfo, inflate)) != null) {
                        i4 = R.id.tvTitle;
                        if (((TextView) S3.bravo(R.id.tvTitle, inflate)) != null) {
                            ScrollView scrollView = (ScrollView) inflate;
                            this.f2332s = new J2.c(scrollView, imageButton, materialButton);
                            Intrinsics.delta(scrollView, "getRoot(...)");
                            return scrollView;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        C0322o0 c0322o0;
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f2331r && !this.f2333t && (c0322o0 = this.f2330q) != null) {
            c0322o0.invoke();
        }
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
        if (!this.f2331r) {
            return;
        }
        J2.c cVar = this.f2332s;
        if (cVar != null) {
            final int i4 = 0;
            ((ImageButton) cVar.purple).setOnClickListener(new View.OnClickListener(this) { // from class: Yb.H0
                public final /* synthetic */ I0 purple;

                {
                    this.purple = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i4) {
                        case 0:
                            this.purple.juliet();
                            return;
                        default:
                            I0 i02 = this.purple;
                            i02.f2333t = true;
                            C0322o0 c0322o0 = i02.f2329p;
                            if (c0322o0 != null) {
                                c0322o0.invoke();
                            }
                            i02.juliet();
                            return;
                    }
                }
            });
            J2.c cVar2 = this.f2332s;
            if (cVar2 != null) {
                final int i5 = 1;
                ((MaterialButton) cVar2.red).setOnClickListener(new View.OnClickListener(this) { // from class: Yb.H0
                    public final /* synthetic */ I0 purple;

                    {
                        this.purple = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i5) {
                            case 0:
                                this.purple.juliet();
                                return;
                            default:
                                I0 i02 = this.purple;
                                i02.f2333t = true;
                                C0322o0 c0322o0 = i02.f2329p;
                                if (c0322o0 != null) {
                                    c0322o0.invoke();
                                }
                                i02.juliet();
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
    /* renamed from: uniform, reason: merged with bridge method [inline-methods] */
    public final FragmentComponentManager componentManager() {
        if (this.f2326m == null) {
            synchronized (this.f2327n) {
                try {
                    if (this.f2326m == null) {
                        this.f2326m = new FragmentComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.f2326m;
    }

    public final void victor() {
        if (this.f2324k == null) {
            this.f2324k = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.f2325l = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f2324k;
        Preconditions.checkState(contextWrapper == null || FragmentComponentManager.findActivity(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        victor();
        if (this.f2328o) {
            return;
        }
        this.f2328o = true;
        J0 j02 = (J0) generatedComponent();
        j02.getClass();
    }
}
