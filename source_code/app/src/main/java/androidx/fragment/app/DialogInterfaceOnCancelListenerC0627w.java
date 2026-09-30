package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import s6.AbstractC2609a7;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class DialogInterfaceOnCancelListenerC0627w extends ai implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler alpha;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3122c;
    public Dialog e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3124f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3125g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3126h;
    public final r purple = new r(0, this);
    public final DialogInterfaceOnCancelListenerC0623s red = new DialogInterfaceOnCancelListenerC0623s(this);
    public final DialogInterfaceOnDismissListenerC0624t silver = new DialogInterfaceOnDismissListenerC0624t(this);
    public int teal = 0;
    public int white = 0;
    public boolean yellow = true;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3120a = true;

    /* renamed from: b, reason: collision with root package name */
    public int f3121b = -1;

    /* renamed from: d, reason: collision with root package name */
    public final C0625u f3123d = new C0625u(this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f3127i = false;

    @Override // androidx.fragment.app.ai
    public final aq createFragmentContainer() {
        return new C0626v(this, super.createFragmentContainer());
    }

    public void juliet() {
        lima(false, false);
    }

    public void kilo() {
        lima(true, false);
    }

    public final void lima(boolean z2, boolean z10) {
        if (this.f3125g) {
            return;
        }
        this.f3125g = true;
        this.f3126h = false;
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.e.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.alpha.getLooper()) {
                    onDismiss(this.e);
                } else {
                    this.alpha.post(this.purple);
                }
            }
        }
        this.f3124f = true;
        if (this.f3121b >= 0) {
            L parentFragmentManager = getParentFragmentManager();
            int i4 = this.f3121b;
            parentFragmentManager.getClass();
            if (i4 >= 0) {
                parentFragmentManager.xray(new I(parentFragmentManager, null, i4, 1), z2);
                this.f3121b = -1;
                return;
            }
            throw new IllegalArgumentException(ao.ad.zulu(i4, "Bad id: "));
        }
        L parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        C0606a c0606a = new C0606a(parentFragmentManager2);
        c0606a.papa = true;
        c0606a.mike(this);
        if (z2) {
            c0606a.juliet(true, true);
        } else {
            c0606a.india();
        }
    }

    public Dialog mike(Bundle bundle) {
        if (L.gray(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new ae.p(requireContext(), this.white);
    }

    public final Dialog november() {
        Dialog dialog = this.e;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.ai
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.f3123d);
        if (!this.f3126h) {
            this.f3125g = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.ai
    public void onCreate(Bundle bundle) {
        boolean z2;
        super.onCreate(bundle);
        this.alpha = new Handler();
        if (this.mContainerId == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f3120a = z2;
        if (bundle != null) {
            this.teal = bundle.getInt("android:style", 0);
            this.white = bundle.getInt("android:theme", 0);
            this.yellow = bundle.getBoolean("android:cancelable", true);
            this.f3120a = bundle.getBoolean("android:showsDialog", this.f3120a);
            this.f3121b = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.ai
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.e;
        if (dialog != null) {
            this.f3124f = true;
            dialog.setOnDismissListener(null);
            this.e.dismiss();
            if (!this.f3125g) {
                onDismiss(this.e);
            }
            this.e = null;
            this.f3127i = false;
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onDetach() {
        super.onDetach();
        if (!this.f3126h && !this.f3125g) {
            this.f3125g = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.f3123d);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3124f) {
            if (L.gray(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            lima(true, true);
        }
    }

    @Override // androidx.fragment.app.ai
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z2 = this.f3120a;
        if (z2 && !this.f3122c) {
            if (z2 && !this.f3127i) {
                try {
                    this.f3122c = true;
                    Dialog mike = mike(bundle);
                    this.e = mike;
                    if (this.f3120a) {
                        quebec(mike, this.teal);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.e.setOwnerActivity((Activity) context);
                        }
                        this.e.setCancelable(this.yellow);
                        this.e.setOnCancelListener(this.red);
                        this.e.setOnDismissListener(this.silver);
                        this.f3127i = true;
                    } else {
                        this.e = null;
                    }
                    this.f3122c = false;
                } catch (Throwable th) {
                    this.f3122c = false;
                    throw th;
                }
            }
            if (L.gray(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.e;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (L.gray(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f3120a) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return onGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.ai
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.e;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i4 = this.teal;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i5 = this.white;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z2 = this.yellow;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z10 = this.f3120a;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i10 = this.f3121b;
        if (i10 != -1) {
            bundle.putInt("android:backStackId", i10);
        }
    }

    @Override // androidx.fragment.app.ai
    public void onStart() {
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null) {
            this.f3124f = false;
            dialog.show();
            View decorView = this.e.getWindow().getDecorView();
            androidx.lifecycle.T.juliet(decorView, this);
            androidx.lifecycle.T.kilo(decorView, this);
            AbstractC2609a7.delta(decorView, this);
        }
    }

    @Override // androidx.fragment.app.ai
    public void onStop() {
        super.onStop();
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.e != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.e.onRestoreInstanceState(bundle2);
        }
    }

    public final void oscar(boolean z2) {
        this.yellow = z2;
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.setCancelable(z2);
        }
    }

    public final void papa(int i4, int i5) {
        if (L.gray(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i4 + ", " + i5);
        }
        this.teal = i4;
        if (i4 == 2 || i4 == 3) {
            this.white = R.style.Theme.Panel;
        }
        if (i5 != 0) {
            this.white = i5;
        }
    }

    @Override // androidx.fragment.app.ai
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.e != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.e.onRestoreInstanceState(bundle2);
        }
    }

    public void quebec(Dialog dialog, int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void romeo(L l10, String str) {
        this.f3125g = false;
        this.f3126h = true;
        l10.getClass();
        C0606a c0606a = new C0606a(l10);
        c0606a.papa = true;
        c0606a.delta(0, this, str, 1);
        c0606a.india();
    }
}
