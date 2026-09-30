package com.google.firebase.messaging;

import B9.ab;
import I.al;
import android.R;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.incognia.Callback;
import com.incognia.internal.L8H;
import com.incognia.internal.y6;
import com.squareup.picasso.Picasso;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.ui.assets.AssetsDetailActivity;
import f8.InterfaceC1695a;
import j1.C1929c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.Intrinsics;
import p8.C2294e;
import q9.InterfaceC2431a;
import r7.InterfaceC2502d;
import s1.InterfaceC2587u;
import s1.X;
import s1.a0;
import t6.AbstractC3042p3;
import y.C3382v;
import y.C3383w;
import y.C3385y;
import y.EnumC3370j;
import y.InterfaceC3386z;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements InterfaceC1695a, B5.e, com.google.gson.internal.n, InterfaceC2587u, y6, I7.e, InterfaceC2431a, InterfaceC2502d, Callback, x2.y, InterfaceC3386z {
    public final /* synthetic */ int alpha;

    public /* synthetic */ l(int i4) {
        this.alpha = i4;
    }

    @Override // x2.y
    public void alpha(x2.x xVar, x2.z zVar, boolean z2) {
        switch (this.alpha) {
            case 22:
                xVar.onTransitionStart(zVar, z2);
                return;
            case 23:
                xVar.onTransitionEnd(zVar, z2);
                return;
            case 24:
                xVar.onTransitionCancel(zVar);
                return;
            case 25:
                xVar.onTransitionPause(zVar);
                return;
            default:
                xVar.onTransitionResume(zVar);
                return;
        }
    }

    @Override // B5.e, L5.f, be.InterfaceC0755a
    public Object apply(Object obj) {
        C2294e c2294e = (C2294e) obj;
        c2294e.getClass();
        C1298c c1298c = n.alpha;
        c1298c.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c1298c.quebec(c2294e, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.incognia.internal.y6
    public void b(boolean z2) {
        L8H.b(z2);
    }

    @Override // y.InterfaceC3386z
    public C3383w bravo(R3.s sVar) {
        boolean z2;
        switch (this.alpha) {
            case 27:
                al alVar = (al) sVar.silver;
                C3382v bravo = alVar.bravo(alVar.bravo);
                C3382v bravo2 = alVar.bravo(alVar.charlie);
                if (sVar.echo() == EnumC3370j.alpha) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new C3383w(bravo, bravo2, z2);
            case 28:
                return AbstractC3042p3.alpha(sVar, C3385y.charlie);
            default:
                return AbstractC3042p3.alpha(sVar, C3385y.bravo);
        }
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        ab abVar = (ab) cVar;
        switch (this.alpha) {
            case 13:
                return FirebaseInstallationsRegistrar.alpha(abVar);
            default:
                return FirebasePerfRegistrar.alpha(abVar);
        }
    }

    @Override // com.google.gson.internal.n
    public Object delta() {
        switch (this.alpha) {
            case 2:
                return new com.google.gson.internal.m(true);
            case 3:
                return new LinkedHashMap();
            case 4:
                return new TreeMap();
            case 5:
                return new ConcurrentHashMap();
            case 6:
                return new ConcurrentSkipListMap();
            case 7:
                return new ArrayList();
            case 8:
                return new LinkedHashSet();
            case 9:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // q9.InterfaceC2431a
    public void foxtrot(ImageView imageView, Object obj) {
        String str = (String) obj;
        switch (this.alpha) {
            case 16:
                Picasso.get().load(str).into(imageView);
                return;
            default:
                int i4 = AssetsDetailActivity.f12148M;
                Picasso.get().load(str).into(imageView);
                return;
        }
    }

    @Override // r7.InterfaceC2502d
    public Object get() {
        throw new IllegalStateException();
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View v4, a0 a0Var) {
        Intrinsics.echo(v4, "v");
        X x4 = a0Var.alpha;
        C1929c golf = x4.golf(519);
        Intrinsics.delta(golf, "getInsets(...)");
        View findViewById = v4.findViewById(R.id.content);
        C1929c golf2 = x4.golf(8);
        Intrinsics.delta(golf2, "getInsets(...)");
        Intrinsics.checkNotNull(findViewById);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = golf.alpha;
            marginLayoutParams.bottomMargin = Math.max(golf.delta, golf2.delta);
            marginLayoutParams.rightMargin = golf.charlie;
            marginLayoutParams.topMargin = golf.bravo;
            findViewById.setLayoutParams(marginLayoutParams);
            return a0.bravo;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.incognia.Callback
    public void onCompleted(Object obj) {
        AndroidApp androidApp = AndroidApp.yellow;
        Log.d("Incognia", "Token: " + ((String) obj));
    }
}
