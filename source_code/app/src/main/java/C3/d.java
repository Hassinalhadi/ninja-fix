package C3;

import I7.k;
import R3.o;
import T5.m;
import Tf.ah;
import V5.x;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.aw;
import androidx.compose.foundation.lazy.layout.u;
import bx.C0769g;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.gms.measurement.internal.C1477x;
import com.google.android.gms.measurement.internal.ax;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.l;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f8.InterfaceC1697c;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import p6.C2283d;
import p6.n;
import p6.q;
import q0.C2379O;
import q9.InterfaceC2431a;
import qe.C2474j;
import t6.P2;
import t9.DialogInterfaceOnDismissListenerC3093b;
import t9.DialogInterfaceOnKeyListenerC3094c;
import t9.DialogInterfaceOnShowListenerC3092a;

/* loaded from: classes3.dex */
public final class d implements o, Y3.g, m, n {
    public boolean alpha;
    public Object purple;
    public final Object red;
    public Object silver;

    public d(C2283d c2283d, K1.f fVar, C1477x c1477x) {
        this.silver = c2283d;
        this.alpha = true;
        this.purple = fVar;
        this.red = c1477x;
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        T5.i iVar;
        boolean z2;
        q qVar = (q) obj;
        G6.h hVar = (G6.h) obj2;
        synchronized (this) {
            iVar = (T5.i) ((K1.f) this.purple).bravo;
            z2 = this.alpha;
            ((K1.f) this.purple).alpha();
        }
        if (iVar == null) {
            hVar.bravo(Boolean.FALSE);
        } else {
            ((C1477x) this.red).getClass();
            qVar.coral(iVar, z2, hVar);
        }
    }

    @Override // p6.n
    public synchronized void alpha(K1.f fVar) {
        K1.f fVar2 = (K1.f) this.purple;
        if (fVar2 != fVar) {
            fVar2.alpha();
            this.purple = fVar;
        }
    }

    public void bravo() {
        f.charlie((f) this.silver, this, false);
    }

    public void charlie(boolean z2) {
        P2.f fVar = (P2.f) this.silver;
        synchronized (fVar) {
            try {
                if (!this.alpha) {
                    if (Intrinsics.areEqual(((P2.b) this.red).golf, this)) {
                        P2.f.charlie(fVar, this, z2);
                    }
                    this.alpha = true;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ah delta(int i4) {
        ah ahVar;
        P2.f fVar = (P2.f) this.silver;
        synchronized (fVar) {
            if (!this.alpha) {
                ((boolean[]) this.purple)[i4] = true;
                Object obj = ((P2.b) this.red).delta.get(i4);
                P2.d dVar = fVar.f1895i;
                ah ahVar2 = (ah) obj;
                if (!dVar.exists(ahVar2)) {
                    a3.h.alpha(dVar.sink(ahVar2));
                }
                ahVar = (ah) obj;
            } else {
                throw new IllegalStateException("editor is closed");
            }
        }
        return ahVar;
    }

    public File echo() {
        File file;
        synchronized (((f) this.silver)) {
            try {
                e eVar = (e) this.red;
                if (eVar.foxtrot == this) {
                    if (!eVar.echo) {
                        ((boolean[]) this.purple)[0] = true;
                    }
                    file = eVar.delta[0];
                    ((f) this.silver).alpha.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public int[] foxtrot() {
        boolean z2;
        synchronized (this) {
            try {
                if (!this.alpha) {
                    return null;
                }
                long[] jArr = (long[]) this.red;
                int length = jArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i10 = i5 + 1;
                    int i11 = 1;
                    if (jArr[i4] > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean[] zArr = (boolean[]) this.purple;
                    if (z2 != zArr[i5]) {
                        int[] iArr = (int[]) this.silver;
                        if (!z2) {
                            i11 = 2;
                        }
                        iArr[i5] = i11;
                    } else {
                        ((int[]) this.silver)[i5] = 0;
                    }
                    zArr[i5] = z2;
                    i4++;
                    i5 = i10;
                }
                this.alpha = false;
                return (int[]) ((int[]) this.silver).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y3.g
    public Object get() {
        if (!this.alpha) {
            Trace.beginSection(P2.foxtrot("Glide registry"));
            this.alpha = true;
            try {
                return android.support.v4.media.session.a.alpha((com.bumptech.glide.b) this.red, (List) this.purple, (S3.a) this.silver);
            } finally {
                this.alpha = false;
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }

    public synchronized void golf() {
        try {
            if (this.alpha) {
                return;
            }
            Boolean lima = lima();
            this.purple = lima;
            if (lima == null) {
                l lVar = new l(0);
                k kVar = (k) ((InterfaceC1697c) this.red);
                kVar.alpha(kVar.charlie, lVar);
            }
            this.alpha = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean hotel() {
        boolean hotel;
        try {
            golf();
            Boolean bool = (Boolean) this.purple;
            if (bool != null) {
                hotel = bool.booleanValue();
            } else {
                hotel = ((FirebaseMessaging) this.silver).alpha.hotel();
            }
        } catch (Throwable th) {
            throw th;
        }
        return hotel;
    }

    public boolean india() {
        boolean z2;
        synchronized (this.red) {
            z2 = this.alpha;
        }
        return z2;
    }

    public boolean juliet(int... tableIds) {
        boolean z2;
        Intrinsics.echo(tableIds, "tableIds");
        synchronized (this) {
            z2 = false;
            for (int i4 : tableIds) {
                long[] jArr = (long[]) this.red;
                long j5 = jArr[i4];
                jArr[i4] = 1 + j5;
                if (j5 == 0) {
                    z2 = true;
                    this.alpha = true;
                }
            }
        }
        return z2;
    }

    public boolean kilo(int... tableIds) {
        boolean z2;
        Intrinsics.echo(tableIds, "tableIds");
        synchronized (this) {
            z2 = false;
            for (int i4 : tableIds) {
                long[] jArr = (long[]) this.red;
                long j5 = jArr[i4];
                jArr[i4] = j5 - 1;
                if (j5 == 1) {
                    z2 = true;
                    this.alpha = true;
                }
            }
        }
        return z2;
    }

    public Boolean lima() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        B7.g gVar = ((FirebaseMessaging) this.silver).alpha;
        gVar.alpha();
        Context context = gVar.alpha;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public boolean mike(String str, String str2) {
        synchronized (this) {
            try {
                if (!((Q7.e) ((AtomicMarkableReference) this.red).getReference()).charlie(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.red;
                atomicMarkableReference.set((Q7.e) atomicMarkableReference.getReference(), true);
                A2.q qVar = new A2.q(16, this);
                AtomicReference atomicReference = (AtomicReference) this.purple;
                while (!atomicReference.compareAndSet(null, qVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((P7.f) ((U7.c) this.silver).red).bravo.alpha(qVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String november() {
        if (!this.alpha) {
            this.alpha = true;
            this.purple = ((ax) this.silver).b0().getString((String) this.red, null);
        }
        return (String) this.purple;
    }

    public void oscar(String str) {
        SharedPreferences.Editor edit = ((ax) this.silver).b0().edit();
        edit.putString((String) this.red, str);
        edit.apply();
        this.purple = str;
    }

    @Override // R3.o
    public boolean register() {
        boolean z2;
        com.google.android.gms.common.f fVar = (com.google.android.gms.common.f) this.purple;
        if (((ConnectivityManager) fVar.get()).getActiveNetwork() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.alpha = z2;
        try {
            ((ConnectivityManager) fVar.get()).registerDefaultNetworkCallback((F2.d) this.silver);
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
            return false;
        }
    }

    @Override // R3.o
    public void unregister() {
        ((ConnectivityManager) ((com.google.android.gms.common.f) this.purple).get()).unregisterNetworkCallback((F2.d) this.silver);
    }

    @Override // p6.n
    public synchronized K1.f zza() {
        return (K1.f) this.purple;
    }

    @Override // p6.n
    public void zzc() {
        T5.i iVar;
        synchronized (this) {
            this.alpha = false;
            iVar = (T5.i) ((K1.f) this.purple).bravo;
        }
        if (iVar != null) {
            ((C2283d) this.silver).charlie(iVar, 2441);
        }
    }

    public d(ax axVar, String str) {
        this.silver = axVar;
        x.echo(str);
        this.red = str;
    }

    public d(Context context, C1298c c1298c) {
        Intrinsics.foxtrot(context, "context");
        this.silver = c1298c;
        u9.c cVar = new u9.c(context);
        this.purple = cVar;
        this.alpha = true;
        cVar.setZoomingAllowed$imageviewer_release(true);
        cVar.setSwipeToDismissAllowed$imageviewer_release(true);
        cVar.setContainerPadding$imageviewer_release((int[]) c1298c.purple);
        cVar.setImagesMargin$imageviewer_release(0);
        cVar.setOverlayView$imageviewer_release(null);
        cVar.setBackgroundColor(ShapeBuilder.DEFAULT_SHAPE_COLOR);
        cVar.foxtrot((List) c1298c.red, (InterfaceC2431a) c1298c.silver);
        cVar.setOnPageChange$imageviewer_release(new C0769g(24, this));
        cVar.setOnDismiss$imageviewer_release(new C2474j(9, this));
        Fe.c cVar2 = new Fe.c(context, R.style.ImageViewerDialog_NoStatusBar);
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar2.red;
        dVar.sierra = cVar;
        dVar.oscar = new DialogInterfaceOnKeyListenerC3094c(this);
        androidx.appcompat.app.g foxtrot = cVar2.foxtrot();
        foxtrot.setOnShowListener(new DialogInterfaceOnShowListenerC3092a(this));
        foxtrot.setOnDismissListener(new DialogInterfaceOnDismissListenerC3093b(this));
        this.red = foxtrot;
    }

    public d() {
        this.red = new Object();
        this.purple = new ArrayList();
        this.silver = new ArrayList();
        this.alpha = true;
    }

    public d(com.bumptech.glide.b bVar, List list, S3.a aVar) {
        this.red = bVar;
        this.purple = list;
        this.silver = aVar;
    }

    public d(com.google.android.gms.common.f fVar, R3.n nVar) {
        this.silver = new F2.d(2, this);
        this.purple = fVar;
        this.red = nVar;
    }

    public d(U7.c cVar, boolean z2) {
        this.silver = cVar;
        this.purple = new AtomicReference(null);
        this.alpha = z2;
        this.red = new AtomicMarkableReference(new Q7.e(z2 ? 8192 : Barcode.FORMAT_UPC_E), false);
    }

    public d(u uVar, C2379O c2379o, aw awVar) {
        this.red = uVar;
        this.purple = c2379o;
        this.silver = awVar;
        this.alpha = true;
    }

    public d(int i4) {
        this.red = new long[i4];
        this.purple = new boolean[i4];
        this.silver = new int[i4];
    }

    public d(P2.f fVar, P2.b bVar) {
        this.silver = fVar;
        this.red = bVar;
        fVar.getClass();
        this.purple = new boolean[2];
    }

    public d(FirebaseMessaging firebaseMessaging, InterfaceC1697c interfaceC1697c) {
        this.silver = firebaseMessaging;
        this.red = interfaceC1697c;
    }

    public d(f fVar, e eVar) {
        this.silver = fVar;
        this.red = eVar;
        this.purple = eVar.echo ? null : new boolean[fVar.yellow];
    }
}
