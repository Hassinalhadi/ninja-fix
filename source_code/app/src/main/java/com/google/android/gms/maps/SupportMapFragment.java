package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ai;
import h6.AbstractC1811a;
import h6.C1815e;
import h6.InterfaceC1813c;
import h6.f;
import h6.g;
import h6.i;
import x6.u;

/* loaded from: classes2.dex */
public class SupportMapFragment extends ai {
    public final u alpha = new u(this);

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.ai
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        u uVar = this.alpha;
        uVar.golf = activity;
        uVar.echo();
    }

    @Override // androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            u uVar = this.alpha;
            uVar.getClass();
            uVar.delta(bundle, new f(uVar, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        u uVar = this.alpha;
        uVar.getClass();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        uVar.delta(bundle, new g(uVar, frameLayout, layoutInflater, viewGroup, bundle));
        if (uVar.alpha == null) {
            AbstractC1811a.bravo(frameLayout);
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // androidx.fragment.app.ai
    public final void onDestroy() {
        u uVar = this.alpha;
        InterfaceC1813c interfaceC1813c = uVar.alpha;
        if (interfaceC1813c != null) {
            interfaceC1813c.bravo();
        } else {
            uVar.charlie(1);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ai
    public final void onDestroyView() {
        u uVar = this.alpha;
        InterfaceC1813c interfaceC1813c = uVar.alpha;
        if (interfaceC1813c != null) {
            interfaceC1813c.hotel();
        } else {
            uVar.charlie(2);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ai
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            u uVar = this.alpha;
            uVar.golf = activity;
            uVar.echo();
            GoogleMapOptions o5 = GoogleMapOptions.o(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", o5);
            uVar.delta(bundle, new C1815e(uVar, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.ai, android.content.ComponentCallbacks
    public final void onLowMemory() {
        InterfaceC1813c interfaceC1813c = this.alpha.alpha;
        if (interfaceC1813c != null) {
            interfaceC1813c.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.ai
    public final void onPause() {
        u uVar = this.alpha;
        InterfaceC1813c interfaceC1813c = uVar.alpha;
        if (interfaceC1813c != null) {
            interfaceC1813c.onPause();
        } else {
            uVar.charlie(5);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        u uVar = this.alpha;
        uVar.getClass();
        uVar.delta(null, new i(uVar, 1));
    }

    @Override // androidx.fragment.app.ai
    public final void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        u uVar = this.alpha;
        InterfaceC1813c interfaceC1813c = uVar.alpha;
        if (interfaceC1813c != null) {
            interfaceC1813c.golf(bundle);
            return;
        }
        Bundle bundle2 = uVar.bravo;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onStart() {
        super.onStart();
        u uVar = this.alpha;
        uVar.getClass();
        uVar.delta(null, new i(uVar, 0));
    }

    @Override // androidx.fragment.app.ai
    public final void onStop() {
        u uVar = this.alpha;
        InterfaceC1813c interfaceC1813c = uVar.alpha;
        if (interfaceC1813c != null) {
            interfaceC1813c.alpha();
        } else {
            uVar.charlie(4);
        }
        super.onStop();
    }
}
