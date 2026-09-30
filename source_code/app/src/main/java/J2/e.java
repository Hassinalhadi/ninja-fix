package J2;

import I.ak;
import K1.y;
import K1.z;
import Nf.C0259q;
import Nf.ay;
import V5.x;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ab;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.EnumC0516n;
import androidx.camera.core.impl.EnumC0517o;
import androidx.camera.core.impl.EnumC0518p;
import androidx.camera.core.impl.InterfaceC0519q;
import androidx.camera.core.impl.V;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.j0;
import androidx.work.impl.WorkDatabase_Impl;
import ao.ad;
import be.InterfaceC0757c;
import bv.A;
import bv.ag;
import bv.ai;
import cf.C0848d;
import cf.C0853i;
import cf.InterfaceC0849e;
import com.bumptech.glide.load.engine.w;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.measurement.internal.C1443f0;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.ax;
import com.google.android.gms.measurement.internal.zzov;
import com.google.android.gms.tasks.Task;
import ge.InterfaceC1772d;
import gf.AbstractC1792g;
import gf.C1786a;
import gf.C1794i;
import gf.InterfaceC1787b;
import gf.InterfaceC1788c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlinx.serialization.KSerializer;
import pe.aq;
import q0.InterfaceC2381Q;
import s1.C2576i;
import s1.aj;
import s1.au;
import s1.az;
import s6.AbstractC2625c5;
import s6.AbstractC2777t5;
import t6.AbstractC3062u;
import t6.AbstractC3066u3;
import t6.AbstractC3081x3;
import ue.C3158b;
import ve.AbstractC3192d;

/* loaded from: classes3.dex */
public class e implements InterfaceC0849e, ak, K1.p, ay, InterfaceC1787b, G6.c, G6.e, X7.a, an.a, InterfaceC2381Q, InterfaceC0519q, InterfaceC0757c, E3.l {
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;

    public /* synthetic */ e(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory A(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.red) == null) {
            Context context = (Context) this.purple;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(Constants.SEPARATOR_COMMA, -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.red = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.red = map;
        }
        String str4 = (String) ((Map) this.red).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e4) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e4);
            return null;
        } catch (InstantiationException e5) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e5);
            return null;
        } catch (NoSuchMethodException e10) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e10);
            return null;
        } catch (InvocationTargetException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        }
    }

    public Object B(G3.i iVar) {
        int i4;
        HashMap hashMap = (HashMap) this.red;
        G3.d dVar = (G3.d) hashMap.get(iVar);
        if (dVar == null) {
            dVar = new G3.d(iVar);
            hashMap.put(iVar, dVar);
        } else {
            iVar.alpha();
        }
        G3.d dVar2 = dVar.delta;
        dVar2.charlie = dVar.charlie;
        dVar.charlie.delta = dVar2;
        G3.d dVar3 = (G3.d) this.purple;
        dVar.delta = dVar3;
        G3.d dVar4 = dVar3.charlie;
        dVar.charlie = dVar4;
        dVar4.delta = dVar;
        dVar.delta.charlie = dVar;
        ArrayList arrayList = dVar.bravo;
        if (arrayList != null) {
            i4 = arrayList.size();
        } else {
            i4 = 0;
        }
        if (i4 > 0) {
            return dVar.bravo.remove(i4 - 1);
        }
        return null;
    }

    public CameraCharacteristics C(String str) {
        try {
            return ((CameraManager) this.purple).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    public Set D() {
        return Collections.EMPTY_SET;
    }

    public Long E(String str) {
        l2.p foxtrot = l2.p.foxtrot(1, "SELECT long_value FROM Preference where `key`=?");
        foxtrot.oscar(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.purple;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            Long l10 = null;
            if (mike.moveToFirst() && !mike.isNull(0)) {
                l10 = Long.valueOf(mike.getLong(0));
            }
            return l10;
        } finally {
            mike.close();
            foxtrot.golf();
        }
    }

    public void F(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.purple;
        workDatabase_Impl.bravo();
        workDatabase_Impl.charlie();
        try {
            ((b) this.red).oscar(dVar);
            workDatabase_Impl.papa();
        } finally {
            workDatabase_Impl.kilo();
        }
    }

    public void G(String str, bd.h hVar, CameraDevice.StateCallback stateCallback) {
        hVar.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.purple).openCamera(str, new androidx.camera.camera2.internal.compat.l(hVar, stateCallback), (Handler) ((c) this.red).red);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }

    public void H(G3.i iVar, Object obj) {
        HashMap hashMap = (HashMap) this.red;
        G3.d dVar = (G3.d) hashMap.get(iVar);
        if (dVar == null) {
            dVar = new G3.d(iVar);
            dVar.delta = dVar;
            G3.d dVar2 = (G3.d) this.purple;
            dVar.delta = dVar2.delta;
            dVar.charlie = dVar2;
            dVar2.delta = dVar;
            dVar.delta.charlie = dVar;
            hashMap.put(iVar, dVar);
        } else {
            iVar.alpha();
        }
        if (dVar.bravo == null) {
            dVar.bravo = new ArrayList();
        }
        dVar.bravo.add(obj);
    }

    public void I(bd.h hVar, av.o oVar) {
        androidx.camera.camera2.internal.compat.p pVar;
        c cVar = (c) this.red;
        synchronized (((HashMap) cVar.purple)) {
            try {
                pVar = (androidx.camera.camera2.internal.compat.p) ((HashMap) cVar.purple).get(oVar);
                if (pVar == null) {
                    pVar = new androidx.camera.camera2.internal.compat.p(hVar, oVar);
                    ((HashMap) cVar.purple).put(oVar, pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((CameraManager) this.purple).registerAvailabilityCallback(pVar, (Handler) cVar.red);
    }

    public Object J() {
        int i4;
        G3.d dVar = (G3.d) this.purple;
        G3.d dVar2 = dVar.delta;
        while (true) {
            Object obj = null;
            if (dVar2.equals(dVar)) {
                return null;
            }
            ArrayList arrayList = dVar2.bravo;
            if (arrayList != null) {
                i4 = arrayList.size();
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                obj = dVar2.bravo.remove(i4 - 1);
            }
            if (obj != null) {
                return obj;
            }
            G3.d dVar3 = dVar2.delta;
            dVar3.charlie = dVar2.charlie;
            dVar2.charlie.delta = dVar3;
            HashMap hashMap = (HashMap) this.red;
            G3.i iVar = dVar2.alpha;
            hashMap.remove(iVar);
            iVar.alpha();
            dVar2 = dVar2.delta;
        }
    }

    public void K(int i4, int i5, int i10, int i11) {
        CardView cardView = (CardView) this.red;
        cardView.silver.set(i4, i5, i10, i11);
        Rect rect = cardView.red;
        CardView.alpha(cardView, i4 + rect.left, i5 + rect.top, i10 + rect.right, i11 + rect.bottom);
    }

    public void L(B2.l workSpecId, int i4) {
        Intrinsics.echo(workSpecId, "workSpecId");
        ((L2.c) ((L2.a) this.red)).alpha(new K2.j((B2.f) this.purple, workSpecId, false, i4));
    }

    public void M(CameraManager.AvailabilityCallback availabilityCallback) {
        androidx.camera.camera2.internal.compat.p pVar;
        if (availabilityCallback != null) {
            c cVar = (c) this.red;
            synchronized (((HashMap) cVar.purple)) {
                pVar = (androidx.camera.camera2.internal.compat.p) ((HashMap) cVar.purple).remove(availabilityCallback);
            }
        } else {
            pVar = null;
        }
        if (pVar != null) {
            pVar.alpha();
        }
        ((CameraManager) this.purple).unregisterAvailabilityCallback(pVar);
    }

    public void N() {
        G g2 = (G) ((C1459n0) this.red).alpha;
        ax axVar = g2.f7506a;
        G.delta(axVar);
        SparseArray c02 = axVar.c0();
        zzov zzovVar = (zzov) this.purple;
        c02.put(zzovVar.red, Long.valueOf(zzovVar.purple));
        ax axVar2 = g2.f7506a;
        G.delta(axVar2);
        int[] iArr = new int[c02.size()];
        long[] jArr = new long[c02.size()];
        for (int i4 = 0; i4 < c02.size(); i4++) {
            iArr[i4] = c02.keyAt(i4);
            jArr[i4] = ((Long) c02.valueAt(i4)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        axVar2.f7644h.uniform(bundle);
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public EnumC0516n a() {
        Integer num = (Integer) ((TotalCaptureResult) this.red).get(CaptureResult.CONTROL_AE_STATE);
        EnumC0516n enumC0516n = EnumC0516n.alpha;
        if (num == null) {
            return enumC0516n;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                AbstractC3066u3.charlie("C2CameraCaptureResult", "Undefined ae state: " + num);
                                return enumC0516n;
                            }
                        } else {
                            return EnumC0516n.silver;
                        }
                    } else {
                        return EnumC0516n.white;
                    }
                } else {
                    return EnumC0516n.teal;
                }
            }
            return EnumC0516n.red;
        }
        return EnumC0516n.purple;
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public V alpha() {
        return (V) this.purple;
    }

    @Override // gf.InterfaceC1787b
    public p000if.e amber(p000if.d dVar) {
        return AbstractC1792g.delta(dVar);
    }

    @Override // E3.c
    public boolean azure(Object obj, File file, E3.i iVar) {
        return ((com.bumptech.glide.load.resource.bitmap.b) this.red).azure(new com.bumptech.glide.load.resource.bitmap.c((G3.b) this.purple, ((BitmapDrawable) ((w) obj).get()).getBitmap()), file, iVar);
    }

    @Override // be.InterfaceC0757c
    public void b(Throwable th) {
        int i4 = 1;
        int i5 = 2;
        switch (this.alpha) {
            case 26:
                int i10 = ((bj.k) this.purple).foxtrot;
                if (i10 == 2 && (th instanceof CancellationException)) {
                    AbstractC3066u3.bravo("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                AbstractC3066u3.juliet("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + x6.l.bravo(i10), th);
                return;
            default:
                C1459n0 c1459n0 = (C1459n0) this.red;
                c1459n0.W();
                c1459n0.f7674b = false;
                G g2 = (G) c1459n0.alpha;
                if (g2.yellow.j0(null, ac.f7577S)) {
                    String message = th.getMessage();
                    c1459n0.f7678g = false;
                    if (message != null) {
                        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                            if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                                i5 = 3;
                            }
                        } else {
                            if (message.contains("Background")) {
                                c1459n0.f7678g = true;
                            }
                            i5 = 1;
                        }
                    }
                }
                int i11 = i5 - 1;
                zzov zzovVar = (zzov) this.purple;
                ar arVar = g2.f7507b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        G.foxtrot(arVar);
                        arVar.white.charlie(ar.e0(g2.india().c0()), th, "registerTriggerAsync failed. Dropping URI. App ID, Throwable");
                        N();
                        c1459n0.f7675c = 1;
                        c1459n0.k0();
                        return;
                    }
                    c1459n0.u0().add(zzovVar);
                    if (c1459n0.f7675c > ((Integer) ac.f7609o.alpha(null)).intValue()) {
                        c1459n0.f7675c = 1;
                        G.foxtrot(arVar);
                        arVar.f7632b.charlie(ar.e0(g2.india().c0()), ar.e0(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
                        return;
                    }
                    G.foxtrot(arVar);
                    arVar.f7632b.delta("registerTriggerAsync failed. App ID, delay in seconds, throwable", ar.e0(g2.india().c0()), ar.e0(String.valueOf(c1459n0.f7675c)), ar.e0(th.toString()));
                    int i12 = c1459n0.f7675c;
                    if (c1459n0.f7676d == null) {
                        c1459n0.f7676d = new C1443f0(c1459n0, g2, i4);
                    }
                    c1459n0.f7676d.charlie(i12 * 1000);
                    int i13 = c1459n0.f7675c;
                    c1459n0.f7675c = i13 + i13;
                    return;
                }
                G.foxtrot(arVar);
                arVar.f7632b.charlie(ar.e0(g2.india().c0()), ar.e0(th.toString()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable");
                c1459n0.f7675c = 1;
                c1459n0.u0().add(zzovVar);
                return;
        }
    }

    @Override // E3.l
    public int beige(E3.i iVar) {
        return 2;
    }

    @Override // gf.InterfaceC1787b
    public boolean black(p000if.d dVar) {
        Intrinsics.echo(dVar, "<this>");
        if (AbstractC1792g.coral(maroon(dVar)) && !AbstractC1792g.crimson(dVar)) {
            return true;
        }
        return false;
    }

    @Override // gf.InterfaceC1787b
    public ae blue(p000if.c cVar) {
        ae orange;
        Intrinsics.echo(cVar, "<this>");
        kotlin.reflect.jvm.internal.impl.types.s golf = AbstractC1792g.golf(cVar);
        if (golf != null && (orange = AbstractC1792g.orange(golf)) != null) {
            return orange;
        }
        ae hotel = AbstractC1792g.hotel(cVar);
        Intrinsics.checkNotNull(hotel);
        return hotel;
    }

    @Override // gf.InterfaceC1787b
    public Collection bravo(p000if.d dVar) {
        return AbstractC1792g.lime(this, dVar);
    }

    @Override // gf.InterfaceC1787b
    public int bronze(p000if.c cVar) {
        return AbstractC1792g.charlie(cVar);
    }

    @Override // gf.InterfaceC1787b
    public void c(p000if.d dVar) {
        AbstractC1792g.gold(dVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean charlie(p000if.f fVar) {
        return AbstractC1792g.amber(fVar);
    }

    @Override // gf.InterfaceC1787b
    public ae coral(kotlin.reflect.jvm.internal.impl.types.s sVar) {
        return AbstractC1792g.orange(sVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean crimson(p000if.d dVar) {
        p000if.b bVar;
        Intrinsics.echo(dVar, "<this>");
        ae hotel = AbstractC1792g.hotel(dVar);
        if (hotel != null) {
            bVar = AbstractC1792g.echo(this, hotel);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return true;
        }
        return false;
    }

    @Override // gf.InterfaceC1787b
    public as cyan(Re.b bVar) {
        return AbstractC1792g.magenta(bVar);
    }

    @Override // gf.InterfaceC1787b
    public B d(p000if.d dVar, p000if.d dVar2) {
        return AbstractC1792g.mike(this, dVar, dVar2);
    }

    @Override // gf.InterfaceC1787b
    public boolean delta(p000if.b bVar) {
        return AbstractC1792g.emerald(bVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean e(p000if.f c12, p000if.f c22) {
        Intrinsics.echo(c12, "c1");
        Intrinsics.echo(c22, "c2");
        if (c12 instanceof ap) {
            if (c22 instanceof ap) {
                if (!AbstractC1792g.bravo(c12, c22)) {
                    ap apVar = (ap) c12;
                    ap apVar2 = (ap) c22;
                    if (!((InterfaceC1788c) this.red).alpha(apVar, apVar2)) {
                        HashMap hashMap = (HashMap) this.purple;
                        if (hashMap != null) {
                            ap apVar3 = (ap) hashMap.get(apVar);
                            ap apVar4 = (ap) hashMap.get(apVar2);
                            if (apVar3 == null || !Intrinsics.areEqual(apVar3, apVar2)) {
                                if (apVar4 == null || !Intrinsics.areEqual(apVar4, apVar)) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // gf.InterfaceC1787b
    public boolean echo(p000if.d dVar) {
        return AbstractC1792g.azure(dVar);
    }

    @Override // X7.a
    public StackTraceElement[] emerald(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        X7.a[] aVarArr = (X7.a[]) this.purple;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i4 = 0; i4 < 1; i4++) {
            X7.a aVar = aVarArr[i4];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.emerald(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((g7.f) this.red).emerald(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override // gf.InterfaceC1787b
    public B f(as asVar) {
        return AbstractC1792g.romeo(asVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gf.InterfaceC1787b
    public as foxtrot(p000if.e eVar, int i4) {
        Intrinsics.echo(eVar, "<this>");
        if (eVar instanceof p000if.d) {
            return AbstractC1792g.papa((p000if.c) eVar, i4);
        }
        if (eVar instanceof p000if.a) {
            E e = ((p000if.a) eVar).get(i4);
            Intrinsics.delta(e, "get(index)");
            return (as) e;
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + u.alpha.bravo(eVar.getClass())).toString());
    }

    @Override // gf.InterfaceC1787b
    public void fuchsia(p000if.d dVar) {
        AbstractC1792g.gray(dVar);
    }

    @Override // gf.InterfaceC1787b
    public C1794i g(p000if.b bVar) {
        return AbstractC1792g.ochre(bVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public long getTimestamp() {
        Long l10 = (Long) ((TotalCaptureResult) this.red).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // an.a
    public boolean gold(an.b bVar, MenuItem menuItem) {
        return ((an.a) this.purple).gold(bVar, menuItem);
    }

    @Override // gf.InterfaceC1787b
    public Collection golf(p000if.f fVar) {
        return AbstractC1792g.navy(fVar);
    }

    @Override // gf.InterfaceC1787b
    public int gray(aq receiver) {
        Intrinsics.echo(receiver, "$receiver");
        int fuchsia = receiver.fuchsia();
        com.google.android.material.datepicker.j.sierra(fuchsia, "this.variance");
        return AbstractC2777t5.alpha(fuchsia);
    }

    @Override // q0.InterfaceC2381Q
    public boolean green(Object obj, Object obj2) {
        androidx.compose.foundation.lazy.layout.u uVar = (androidx.compose.foundation.lazy.layout.u) this.purple;
        return Intrinsics.areEqual(uVar.bravo(obj), uVar.bravo(obj2));
    }

    @Override // gf.InterfaceC1787b
    public void h(p000if.c cVar) {
        Intrinsics.echo(cVar, "<this>");
        AbstractC1792g.golf(cVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean hotel(p000if.f fVar) {
        return AbstractC1792g.black(fVar);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, androidx.appcompat.app.j] */
    @Override // an.a
    public void i(an.b bVar) {
        ((an.a) this.purple).i(bVar);
        ab abVar = (ab) this.red;
        if (abVar.f2739p != null) {
            abVar.e.getDecorView().removeCallbacks(abVar.f2740q);
        }
        if (abVar.f2738o != null) {
            az azVar = abVar.f2741r;
            if (azVar != null) {
                azVar.bravo();
            }
            az alpha = au.alpha(abVar.f2738o);
            alpha.alpha(0.0f);
            abVar.f2741r = alpha;
            alpha.delta(new androidx.appcompat.app.s(2, this));
        }
        abVar.f2730g.onSupportActionModeFinished(abVar.f2737n);
        abVar.f2737n = null;
        ViewGroup viewGroup = abVar.f2743t;
        WeakHashMap weakHashMap = au.alpha;
        aj.charlie(viewGroup);
        abVar.gold();
    }

    @Override // cf.InterfaceC0849e
    public C0848d india(Ne.b classId) {
        Intrinsics.echo(classId, "classId");
        Ge.e eVar = (Ge.e) this.red;
        Intrinsics.echo((C0853i) eVar.charlie().charlie, "<this>");
        C3158b bravo = AbstractC2625c5.bravo((C2576i) this.purple, classId, Me.f.golf);
        if (bravo == null) {
            return null;
        }
        Intrinsics.areEqual(AbstractC3192d.alpha(bravo.alpha), classId);
        return eVar.foxtrot(bravo);
    }

    @Override // an.a
    public boolean indigo(an.b bVar, ao.l lVar) {
        ViewGroup viewGroup = ((ab) this.red).f2743t;
        WeakHashMap weakHashMap = au.alpha;
        aj.charlie(viewGroup);
        return ((an.a) this.purple).indigo(bVar, lVar);
    }

    @Override // G6.c
    public Object ivory(Task task) {
        S5.a aVar = (S5.a) this.purple;
        aVar.getClass();
        if (!task.juliet()) {
            return task;
        }
        Bundle bundle = (Bundle) task.hotel();
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return aVar.alpha((Bundle) this.red).november(S5.f.red, S5.c.silver);
        }
        return task;
    }

    @Override // gf.InterfaceC1787b
    public ae j(p000if.d dVar, boolean z2) {
        return AbstractC1792g.pink(dVar, z2);
    }

    @Override // gf.InterfaceC1787b
    public p000if.c jade(p000if.c cVar) {
        return AbstractC1792g.peach(this, cVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean juliet(p000if.d dVar) {
        Intrinsics.echo(dVar, "<this>");
        return AbstractC1792g.yankee(AbstractC1792g.olive(dVar));
    }

    @Override // K1.p
    public boolean k(CharSequence charSequence, int i4, int i5, y yVar) {
        Spannable spannableString;
        if ((yVar.charlie & 4) > 0) {
            return true;
        }
        if (((K1.ab) this.purple) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.purple = new K1.ab(spannableString);
        }
        ((W8.a) this.red).getClass();
        ((K1.ab) this.purple).setSpan(new z(yVar), i4, i5, 33);
        return true;
    }

    @Override // gf.InterfaceC1787b
    public p000if.d kilo(p000if.d dVar) {
        ae jade;
        Intrinsics.echo(dVar, "<this>");
        kotlin.reflect.jvm.internal.impl.types.o foxtrot = AbstractC1792g.foxtrot(dVar);
        if (foxtrot != null && (jade = AbstractC1792g.jade(foxtrot)) != null) {
            return jade;
        }
        return dVar;
    }

    @Override // gf.InterfaceC1787b
    public boolean l(p000if.f fVar) {
        return AbstractC1792g.yankee(fVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean lavender(p000if.d dVar, p000if.d dVar2) {
        return AbstractC1792g.whiskey(dVar, dVar2);
    }

    @Override // q0.InterfaceC2381Q
    public void lima(A a6) {
        int i4;
        ag agVar = (ag) this.red;
        agVar.alpha();
        ai aiVar = (ai) a6.purple;
        Object[] objArr = aiVar.bravo;
        long[] jArr = aiVar.charlie;
        int i5 = aiVar.echo;
        while (i5 != Integer.MAX_VALUE) {
            int i10 = (int) ((jArr[i5] >> 31) & 2147483647L);
            Object obj = objArr[i5];
            Object bravo = ((androidx.compose.foundation.lazy.layout.u) this.purple).bravo(obj);
            int delta = agVar.delta(bravo);
            if (delta >= 0) {
                i4 = agVar.charlie[delta];
            } else {
                i4 = 0;
            }
            if (i4 == 7) {
                a6.remove(obj);
            } else {
                agVar.hotel(i4 + 1, bravo);
            }
            i5 = i10;
        }
    }

    @Override // gf.InterfaceC1787b
    public ae lime(p000if.c cVar) {
        ae green;
        Intrinsics.echo(cVar, "<this>");
        kotlin.reflect.jvm.internal.impl.types.s golf = AbstractC1792g.golf(cVar);
        if (golf != null && (green = AbstractC1792g.green(golf)) != null) {
            return green;
        }
        ae hotel = AbstractC1792g.hotel(cVar);
        Intrinsics.checkNotNull(hotel);
        return hotel;
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public CaptureResult m() {
        return (TotalCaptureResult) this.red;
    }

    @Override // K1.p
    public Object magenta() {
        return (K1.ab) this.purple;
    }

    @Override // gf.InterfaceC1787b
    public ap maroon(p000if.c cVar) {
        Intrinsics.echo(cVar, "<this>");
        ae hotel = AbstractC1792g.hotel(cVar);
        if (hotel == null) {
            hotel = lime(cVar);
        }
        return AbstractC1792g.olive(hotel);
    }

    @Override // gf.InterfaceC1787b
    public boolean mike(p000if.f fVar) {
        return AbstractC1792g.blue(fVar);
    }

    @Override // Nf.ay
    public Object n(InterfaceC1772d interfaceC1772d, ArrayList arrayList) {
        Object obj;
        int collectionSizeOrDefault;
        Object m206constructorimpl;
        obj = ((C0259q) this.red).get(AbstractC3062u.bravo(interfaceC1772d));
        Intrinsics.delta(obj, "get(...)");
        Nf.as asVar = (Nf.as) obj;
        Object obj2 = asVar.alpha.get();
        if (obj2 == null) {
            synchronized (asVar) {
                obj2 = asVar.alpha.get();
                if (obj2 == null) {
                    obj2 = new Nf.ax();
                    asVar.alpha = new SoftReference(obj2);
                }
            }
        }
        Nf.ax axVar = (Nf.ax) obj2;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new Nf.ak((ge.w) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = axVar.alpha;
        Object obj3 = concurrentHashMap.get(arrayList2);
        if (obj3 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl((KSerializer) ((Xd.l) this.purple).invoke(interfaceC1772d, arrayList));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            Result result = new Result(m206constructorimpl);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, result);
            if (putIfAbsent == null) {
                obj3 = result;
            } else {
                obj3 = putIfAbsent;
            }
        }
        return ((Result) obj3).alpha;
    }

    @Override // gf.InterfaceC1787b
    public boolean navy(p000if.c receiver) {
        Intrinsics.echo(receiver, "$receiver");
        return receiver instanceof Fe.h;
    }

    @Override // gf.InterfaceC1787b
    public boolean november(p000if.f fVar) {
        return AbstractC1792g.zulu(fVar);
    }

    @Override // gf.InterfaceC1787b
    public int o(p000if.e eVar) {
        Intrinsics.echo(eVar, "<this>");
        if (eVar instanceof p000if.d) {
            return AbstractC1792g.charlie((p000if.c) eVar);
        }
        if (eVar instanceof p000if.a) {
            return ((p000if.a) eVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + u.alpha.bravo(eVar.getClass())).toString());
    }

    @Override // gf.InterfaceC1787b
    public kotlin.reflect.jvm.internal.impl.types.o ochre(p000if.d dVar) {
        return AbstractC1792g.foxtrot(dVar);
    }

    @Override // gf.InterfaceC1787b
    public int olive(p000if.b bVar) {
        return AbstractC1792g.kilo(bVar);
    }

    @Override // G6.e
    public void onComplete(Task task) {
        ((Map) ((l) this.red).purple).remove((G6.h) this.purple);
    }

    @Override // be.InterfaceC0757c
    public void onSuccess(Object obj) {
        bj.l lVar = (bj.l) obj;
        lVar.getClass();
        try {
            ((bj.m) ((B9.ab) this.red).purple).bravo(lVar);
        } catch (ProcessingException e) {
            AbstractC3066u3.delta("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
        }
    }

    @Override // gf.InterfaceC1787b
    public ae orange(kotlin.reflect.jvm.internal.impl.types.o oVar) {
        return AbstractC1792g.jade(oVar);
    }

    @Override // gf.InterfaceC1787b
    public kotlin.reflect.jvm.internal.impl.types.s oscar(p000if.c cVar) {
        return AbstractC1792g.golf(cVar);
    }

    @Override // gf.InterfaceC1787b
    public ae p(kotlin.reflect.jvm.internal.impl.types.s sVar) {
        return AbstractC1792g.green(sVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean papa(p000if.d dVar) {
        return AbstractC1792g.bronze(dVar);
    }

    @Override // gf.InterfaceC1787b
    public C1786a peach(p000if.d dVar) {
        return AbstractC1792g.maroon(this, dVar);
    }

    @Override // an.a
    public boolean pink(an.b bVar, ao.l lVar) {
        return ((an.a) this.purple).pink(bVar, lVar);
    }

    @Override // gf.InterfaceC1787b
    public aq plum(p000if.f fVar, int i4) {
        return AbstractC1792g.quebec(fVar, i4);
    }

    @Override // gf.InterfaceC1787b
    public B purple(p000if.b bVar) {
        return AbstractC1792g.indigo(bVar);
    }

    @Override // gf.InterfaceC1787b
    public int q(as asVar) {
        return AbstractC1792g.tango(asVar);
    }

    @Override // gf.InterfaceC1787b
    public ae quebec(p000if.c cVar) {
        return AbstractC1792g.hotel(cVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean r(p000if.b receiver) {
        Intrinsics.echo(receiver, "$receiver");
        return receiver instanceof Re.a;
    }

    @Override // gf.InterfaceC1787b
    public B red(ArrayList arrayList) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        ae aeVar;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator it = arrayList.iterator();
                boolean z2 = false;
                boolean z10 = false;
                while (it.hasNext()) {
                    B b2 = (B) it.next();
                    if (!z2 && !kotlin.reflect.jvm.internal.impl.types.c.india(b2)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (b2 instanceof ae) {
                        aeVar = (ae) b2;
                    } else if (b2 instanceof kotlin.reflect.jvm.internal.impl.types.s) {
                        Intrinsics.echo(b2, "<this>");
                        aeVar = ((kotlin.reflect.jvm.internal.impl.types.s) b2).purple;
                        z10 = true;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(aeVar);
                }
                if (z2) {
                    return hf.i.charlie(hf.h.f12737q, arrayList.toString());
                }
                gf.u uVar = gf.u.alpha;
                if (z10) {
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(kotlin.reflect.jvm.internal.impl.types.c.yankee((B) it2.next()));
                    }
                    return kotlin.reflect.jvm.internal.impl.types.ab.alpha(uVar.bravo(arrayList2), uVar.bravo(arrayList3));
                }
                return uVar.bravo(arrayList2);
            }
            return (B) CollectionsKt.k(arrayList);
        }
        throw new IllegalStateException("Expected some types");
    }

    @Override // gf.InterfaceC1787b
    public p000if.b romeo(p000if.d dVar) {
        return AbstractC1792g.echo(this, dVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public EnumC0517o s() {
        Integer num = (Integer) ((TotalCaptureResult) this.red).get(CaptureResult.CONTROL_AF_STATE);
        EnumC0517o enumC0517o = EnumC0517o.alpha;
        if (num == null) {
            return enumC0517o;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC0517o.purple;
            case 1:
            case 3:
                return EnumC0517o.red;
            case 2:
                return EnumC0517o.silver;
            case 4:
                return EnumC0517o.white;
            case 5:
                return EnumC0517o.yellow;
            case 6:
                return EnumC0517o.teal;
            default:
                AbstractC3066u3.charlie("C2CameraCaptureResult", "Undefined af state: " + num);
                return enumC0517o;
        }
    }

    @Override // gf.InterfaceC1787b
    public boolean sierra(p000if.f fVar) {
        return AbstractC1792g.coral(fVar);
    }

    @Override // gf.InterfaceC1787b
    public void silver(p000if.d dVar, p000if.f fVar) {
    }

    @Override // gf.InterfaceC1787b
    public boolean t(p000if.d dVar) {
        Intrinsics.echo(dVar, "<this>");
        return AbstractC1792g.black(AbstractC1792g.olive(dVar));
    }

    @Override // gf.InterfaceC1787b
    public as tango(p000if.c cVar, int i4) {
        return AbstractC1792g.papa(cVar, i4);
    }

    @Override // I.ak
    public List teal(Integer num) {
        List teal = ((ak) this.purple).teal(null);
        j0 j0Var = (j0) this.red;
        int i4 = j0Var.victor;
        if (i4 < 0) {
            return teal;
        }
        return CollectionsKt.a(AbstractC3081x3.alpha(j0Var, num, i4, Integer.valueOf(j0Var.black(i4, j0Var.bravo))), teal);
    }

    public String toString() {
        int i4;
        switch (this.alpha) {
            case 7:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                G3.d dVar = (G3.d) this.purple;
                G3.d dVar2 = dVar.charlie;
                boolean z2 = false;
                while (!dVar2.equals(dVar)) {
                    sb2.append('{');
                    sb2.append(dVar2.alpha);
                    sb2.append(':');
                    ArrayList arrayList = dVar2.bravo;
                    if (arrayList != null) {
                        i4 = arrayList.size();
                    } else {
                        i4 = 0;
                    }
                    sb2.append(i4);
                    sb2.append("}, ");
                    dVar2 = dVar2.charlie;
                    z2 = true;
                }
                if (z2) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            case 17:
                StringBuilder sb3 = new StringBuilder(100);
                sb3.append(this.red.getClass().getSimpleName());
                sb3.append('{');
                ArrayList arrayList2 = (ArrayList) this.purple;
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    sb3.append((String) arrayList2.get(i5));
                    if (i5 < size - 1) {
                        sb3.append(", ");
                    }
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    @Override // gf.InterfaceC1787b
    public as u(p000if.d dVar, int i4) {
        Intrinsics.echo(dVar, "<this>");
        if (i4 >= 0 && i4 < AbstractC1792g.charlie(dVar)) {
            return AbstractC1792g.papa(dVar, i4);
        }
        return null;
    }

    @Override // gf.InterfaceC1787b
    public at uniform(p000if.c cVar) {
        return AbstractC1792g.india(cVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean v(p000if.c cVar) {
        kotlin.reflect.jvm.internal.impl.types.o oVar;
        Intrinsics.echo(cVar, "<this>");
        ae hotel = AbstractC1792g.hotel(cVar);
        if (hotel != null) {
            oVar = AbstractC1792g.foxtrot(hotel);
        } else {
            oVar = null;
        }
        if (oVar != null) {
            return true;
        }
        return false;
    }

    @Override // gf.InterfaceC1787b
    public B victor(p000if.c cVar) {
        return AbstractC1792g.ivory(cVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean w(p000if.f fVar) {
        return AbstractC1792g.xray(fVar);
    }

    @Override // gf.InterfaceC1787b
    public int whiskey(p000if.f fVar) {
        return AbstractC1792g.lavender(fVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean white(B b2) {
        Intrinsics.echo(b2, "<this>");
        if (AbstractC1792g.bronze(lime(b2)) != AbstractC1792g.bronze(blue(b2))) {
            return true;
        }
        return false;
    }

    @Override // gf.InterfaceC1787b
    public ap x(p000if.d dVar) {
        return AbstractC1792g.olive(dVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public EnumC0518p xray() {
        Integer num = (Integer) ((TotalCaptureResult) this.red).get(CaptureResult.CONTROL_AWB_STATE);
        EnumC0518p enumC0518p = EnumC0518p.alpha;
        if (num == null) {
            return enumC0518p;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        AbstractC3066u3.charlie("C2CameraCaptureResult", "Undefined awb state: " + num);
                        return enumC0518p;
                    }
                    return EnumC0518p.teal;
                }
                return EnumC0518p.silver;
            }
            return EnumC0518p.red;
        }
        return EnumC0518p.purple;
    }

    public void y(Object obj, String str) {
        ((ArrayList) this.purple).add(ad.amber(str, "=", String.valueOf(obj)));
    }

    @Override // gf.InterfaceC1787b
    public ae yankee(p000if.d dVar) {
        return AbstractC1792g.juliet(dVar);
    }

    @Override // gf.InterfaceC1787b
    public boolean yellow(aq aqVar, p000if.f fVar) {
        return AbstractC1792g.victor(aqVar, fVar);
    }

    public void z() {
        String str = (String) this.purple;
        try {
            U7.c cVar = (U7.c) this.red;
            cVar.getClass();
            new File((File) cVar.red, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override // gf.InterfaceC1787b
    public boolean zulu(as asVar) {
        return AbstractC1792g.fuchsia(asVar);
    }

    public /* synthetic */ e(int i4, Object obj, Object obj2, boolean z2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    public /* synthetic */ e(ViewGroup viewGroup, View view, View view2, int i4) {
        this.alpha = i4;
        this.purple = view;
        this.red = view2;
    }

    public /* synthetic */ e(Object obj) {
        this.alpha = 17;
        x.hotel(obj);
        this.red = obj;
        this.purple = new ArrayList();
    }

    public e(HashMap hashMap, InterfaceC1788c equalityAxioms) {
        this.alpha = 14;
        Intrinsics.echo(equalityAxioms, "equalityAxioms");
        this.purple = hashMap;
        this.red = equalityAxioms;
    }

    public e() {
        this.alpha = 7;
        this.purple = new G3.d(null);
        this.red = new HashMap();
    }

    public e(X7.a[] aVarArr) {
        this.alpha = 19;
        this.purple = aVarArr;
        this.red = new g7.f(12);
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.alpha = 0;
        this.purple = workDatabase_Impl;
        this.red = new b(workDatabase_Impl, 1);
    }

    public e(Context context, c cVar) {
        this.alpha = 21;
        this.purple = (CameraManager) context.getSystemService("camera");
        this.red = cVar;
    }

    public e(B2.f processor, L2.a workTaskExecutor) {
        this.alpha = 1;
        Intrinsics.echo(processor, "processor");
        Intrinsics.echo(workTaskExecutor, "workTaskExecutor");
        this.purple = processor;
        this.red = workTaskExecutor;
    }

    public e(Context context, Object obj, LinkedHashSet linkedHashSet) {
        androidx.camera.camera2.internal.compat.q alpha;
        this.alpha = 24;
        u8.b bVar = new u8.b(15);
        this.purple = new HashMap();
        this.red = bVar;
        if (obj instanceof androidx.camera.camera2.internal.compat.q) {
            alpha = (androidx.camera.camera2.internal.compat.q) obj;
        } else {
            alpha = androidx.camera.camera2.internal.compat.q.alpha(context, bc.e.alpha());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.purple).put(str, new av.ar(context, str, alpha, (u8.b) this.red));
        }
    }

    public e(Context context) {
        this.alpha = 6;
        this.red = null;
        this.purple = context;
    }

    public e(l lVar) {
        this.alpha = 11;
        int delta = O7.f.delta((Context) lVar.alpha, "com.google.firebase.crashlytics.unity_version", CTVariableUtils.STRING);
        Context context = (Context) lVar.alpha;
        if (delta != 0) {
            this.purple = "Unity";
            String string = context.getResources().getString(delta);
            this.red = string;
            String echo = av.q.echo("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", echo, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.purple = "Flutter";
                this.red = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.purple = null;
                this.red = null;
            }
        }
        this.purple = null;
        this.red = null;
    }

    public e(Xd.l lVar) {
        this.alpha = 12;
        this.purple = lVar;
        this.red = new C0259q();
    }

    public e(androidx.compose.foundation.lazy.layout.u uVar) {
        this.alpha = 22;
        this.purple = uVar;
        ag agVar = bv.aq.alpha;
        this.red = new ag();
    }

    public e(CardView cardView) {
        this.alpha = 27;
        this.red = cardView;
    }
}
