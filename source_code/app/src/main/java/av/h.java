package av;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.J;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.InterfaceC0519q;
import androidx.camera.core.impl.InterfaceC0522u;
import androidx.camera.core.impl.K;
import androidx.camera.core.impl.L;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.Z;
import ba.C0741b;
import ba.C0742c;
import bd.ScheduledExecutorServiceC0750c;
import id.C1915c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class h implements InterfaceC0522u {

    /* renamed from: a, reason: collision with root package name */
    public final bp.c f3245a;
    public final androidx.camera.camera2.internal.compat.e alpha;

    /* renamed from: b, reason: collision with root package name */
    public final A f3246b;

    /* renamed from: c, reason: collision with root package name */
    public final Pf.j f3247c;

    /* renamed from: d, reason: collision with root package name */
    public final E f3248d;
    public final C0742c e;

    /* renamed from: f, reason: collision with root package name */
    public final r6.u f3249f;

    /* renamed from: g, reason: collision with root package name */
    public final ah f3250g;

    /* renamed from: h, reason: collision with root package name */
    public int f3251h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f3252i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f3253j;

    /* renamed from: k, reason: collision with root package name */
    public final ah f3254k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.compose.foundation.layout.af f3255l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicLong f3256m;

    /* renamed from: n, reason: collision with root package name */
    public int f3257n;

    /* renamed from: o, reason: collision with root package name */
    public long f3258o;

    /* renamed from: p, reason: collision with root package name */
    public final f f3259p;
    public final bd.h purple;
    public final Object red = new Object();
    public final androidx.camera.camera2.internal.compat.j silver;
    public final androidx.core.widget.f teal;
    public final L white;
    public final al yellow;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.L, androidx.camera.core.impl.K] */
    public h(androidx.camera.camera2.internal.compat.j jVar, ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c, bd.h hVar, androidx.core.widget.f fVar, Q3.c cVar) {
        ?? k6 = new K();
        this.white = k6;
        this.f3251h = 0;
        this.f3252i = false;
        this.f3253j = 2;
        this.f3256m = new AtomicLong(0L);
        this.f3257n = 1;
        this.f3258o = 0L;
        f fVar2 = new f();
        fVar2.bravo = new HashSet();
        fVar2.charlie = new ArrayMap();
        this.f3259p = fVar2;
        this.silver = jVar;
        this.teal = fVar;
        this.purple = hVar;
        this.f3250g = new ah(hVar);
        androidx.camera.camera2.internal.compat.e eVar = new androidx.camera.camera2.internal.compat.e(hVar);
        this.alpha = eVar;
        k6.bravo.alpha = this.f3257n;
        k6.bravo.delta(new ae(eVar));
        k6.bravo.delta(fVar2);
        this.f3247c = new Pf.j(this, hVar);
        this.yellow = new al(this, hVar);
        this.f3245a = new bp.c(this, jVar, hVar);
        this.f3246b = new A(this, jVar, hVar);
        this.f3248d = new E(jVar);
        this.f3254k = new ah(cVar, 2);
        this.f3255l = new androidx.compose.foundation.layout.af(cVar, 1);
        this.e = new C0742c(this, hVar);
        this.f3249f = new r6.u(this, jVar, cVar, hVar, scheduledExecutorServiceC0750c);
    }

    public static int echo(androidx.camera.camera2.internal.compat.j jVar, int i4) {
        int[] iArr = (int[]) jVar.alpha(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (golf(i4, iArr)) {
            return i4;
        }
        if (!golf(1, iArr)) {
            return 0;
        }
        return 1;
    }

    public static boolean golf(int i4, int[] iArr) {
        for (int i5 : iArr) {
            if (i4 == i5) {
                return true;
            }
        }
        return false;
    }

    public final void alpha(g gVar) {
        ((HashSet) this.alpha.charlie).add(gVar);
    }

    public final void bravo() {
        synchronized (this.red) {
            try {
                int i4 = this.f3251h;
                if (i4 != 0) {
                    this.f3251h = i4 - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void charlie(boolean z2) {
        this.f3252i = z2;
        if (!z2) {
            S2.l lVar = new S2.l();
            lVar.alpha = this.f3257n;
            lVar.purple = true;
            androidx.camera.core.impl.aw bravo = androidx.camera.core.impl.aw.bravo();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            bravo.hotel(au.a.yellow(key), Integer.valueOf(echo(this.silver, 1)));
            bravo.hotel(au.a.yellow(CaptureRequest.FLASH_MODE), 0);
            lVar.echo(new ah(6, androidx.camera.core.impl.B.alpha(bravo)));
            india(Collections.singletonList(lVar.hotel()));
        }
        juliet();
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public final void cyan(androidx.camera.core.impl.af afVar) {
        C0742c c0742c = this.e;
        ah charlie = androidx.camera.core.r.delta(afVar).charlie();
        synchronized (c0742c.echo) {
            androidx.camera.core.r rVar = c0742c.foxtrot;
            rVar.getClass();
            androidx.camera.core.impl.ae aeVar = androidx.camera.core.impl.ae.red;
            for (C0505c c0505c : charlie.romeo()) {
                rVar.bravo.foxtrot(c0505c, aeVar, charlie.quebec(c0505c));
            }
        }
        be.h.delta(AbstractC3003i.alpha(new C0741b(c0742c, 0))).foxtrot(new K5.a(3), tg.k.bravo());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        if (r4 != 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x004c, code lost:
    
        if (golf(1, r7) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final P delta() {
        int i4;
        MeteringRectangle[] meteringRectangleArr;
        MeteringRectangle[] meteringRectangleArr2;
        MeteringRectangle[] meteringRectangleArr3;
        Range range;
        int i5;
        int[] iArr;
        Pf.j jVar;
        L l10 = this.white;
        l10.bravo.alpha = this.f3257n;
        androidx.camera.core.r rVar = new androidx.camera.core.r(2);
        int i10 = 1;
        rVar.echo(CaptureRequest.CONTROL_MODE, 1);
        al alVar = this.yellow;
        alVar.getClass();
        int i11 = 3;
        if (alVar.charlie != 3) {
            i4 = 4;
        } else {
            i4 = 3;
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        int[] iArr2 = (int[]) alVar.alpha.silver.alpha(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            if (!golf(i4, iArr2)) {
                i4 = 4;
                if (!golf(4, iArr2)) {
                    i4 = 1;
                }
            }
            rVar.echo(key, Integer.valueOf(i4));
            meteringRectangleArr = alVar.delta;
            if (meteringRectangleArr.length != 0) {
                rVar.echo(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
            }
            meteringRectangleArr2 = alVar.echo;
            if (meteringRectangleArr2.length != 0) {
                rVar.echo(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
            }
            meteringRectangleArr3 = alVar.foxtrot;
            if (meteringRectangleArr3.length != 0) {
                rVar.echo(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
            }
            range = (Range) this.f3254k.purple;
            if (range != null) {
                rVar.echo(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
            }
            ((C) this.f3245a.teal).delta(rVar);
            if (!this.yellow.golf) {
                i5 = 5;
            } else {
                i5 = 1;
            }
            if (!this.f3252i) {
                rVar.echo(CaptureRequest.FLASH_MODE, 2);
            } else {
                int i12 = this.f3253j;
                if (i12 != 0) {
                    if (i12 != 1) {
                    }
                } else {
                    androidx.compose.foundation.layout.af afVar = this.f3255l;
                    if (!afVar.alpha && !afVar.bravo) {
                        i11 = 2;
                    }
                    i11 = 1;
                }
                rVar.echo(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(echo(this.silver, i11)));
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
                iArr = (int[]) this.silver.alpha(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
                if (iArr != null || (!golf(1, iArr) && !golf(1, iArr))) {
                    i10 = 0;
                }
                rVar.echo(key2, Integer.valueOf(i10));
                jVar = this.f3247c;
                jVar.getClass();
                CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
                synchronized (((ai.a) jVar.red).alpha) {
                }
                rVar.echo(key3, 0);
                this.e.alpha(rVar);
                ah ahVar = new ah(6, androidx.camera.core.impl.B.alpha(rVar.bravo));
                S2.l lVar = l10.bravo;
                lVar.getClass();
                lVar.silver = androidx.camera.core.impl.aw.delta(ahVar);
                ((androidx.camera.core.impl.ay) this.white.bravo.white).alpha.put("CameraControlSessionUpdateId", Long.valueOf(this.f3258o));
                return this.white.charlie();
            }
            i11 = i5;
            rVar.echo(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(echo(this.silver, i11)));
            CaptureRequest.Key key22 = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.silver.alpha(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null) {
            }
            i10 = 0;
            rVar.echo(key22, Integer.valueOf(i10));
            jVar = this.f3247c;
            jVar.getClass();
            CaptureRequest.Key key32 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            synchronized (((ai.a) jVar.red).alpha) {
            }
        }
        i4 = 0;
        rVar.echo(key, Integer.valueOf(i4));
        meteringRectangleArr = alVar.delta;
        if (meteringRectangleArr.length != 0) {
        }
        meteringRectangleArr2 = alVar.echo;
        if (meteringRectangleArr2.length != 0) {
        }
        meteringRectangleArr3 = alVar.foxtrot;
        if (meteringRectangleArr3.length != 0) {
        }
        range = (Range) this.f3254k.purple;
        if (range != null) {
        }
        ((C) this.f3245a.teal).delta(rVar);
        if (!this.yellow.golf) {
        }
        if (!this.f3252i) {
        }
        i11 = i5;
        rVar.echo(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(echo(this.silver, i11)));
        CaptureRequest.Key key222 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.silver.alpha(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
        }
        i10 = 0;
        rVar.echo(key222, Integer.valueOf(i10));
        jVar = this.f3247c;
        jVar.getClass();
        CaptureRequest.Key key322 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        synchronized (((ai.a) jVar.red).alpha) {
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public final void f(androidx.camera.core.am amVar) {
    }

    public final boolean foxtrot() {
        int i4;
        synchronized (this.red) {
            i4 = this.f3251h;
        }
        if (i4 > 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public final Rect gold() {
        Rect rect = (Rect) this.silver.alpha(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    public final void hotel(boolean z2) {
        bf.b bVar;
        AbstractC3066u3.bravo("Camera2CameraControlImp", "setActive: isActive = " + z2);
        al alVar = this.yellow;
        if (z2 != alVar.bravo) {
            alVar.bravo = z2;
            if (!alVar.bravo) {
                h hVar = alVar.alpha;
                ((HashSet) hVar.alpha.charlie).remove(null);
                ((HashSet) hVar.alpha.charlie).remove(null);
                if (alVar.delta.length > 0 && alVar.bravo) {
                    S2.l lVar = new S2.l();
                    lVar.purple = true;
                    lVar.alpha = alVar.charlie;
                    androidx.camera.core.impl.aw bravo = androidx.camera.core.impl.aw.bravo();
                    bravo.hotel(au.a.yellow(CaptureRequest.CONTROL_AF_TRIGGER), 2);
                    lVar.echo(new ah(6, androidx.camera.core.impl.B.alpha(bravo)));
                    alVar.alpha.india(Collections.singletonList(lVar.hotel()));
                }
                MeteringRectangle[] meteringRectangleArr = al.hotel;
                alVar.delta = meteringRectangleArr;
                alVar.echo = meteringRectangleArr;
                alVar.foxtrot = meteringRectangleArr;
                hVar.juliet();
            }
        }
        bp.c cVar = this.f3245a;
        if (cVar.purple != z2) {
            cVar.purple = z2;
            if (!z2) {
                synchronized (((Z.a) cVar.silver)) {
                    ((Z.a) cVar.silver).golf();
                    Z.a aVar = (Z.a) cVar.silver;
                    bVar = new bf.b(aVar.delta(), aVar.bravo(), aVar.charlie(), aVar.alpha());
                }
                Looper myLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                androidx.lifecycle.az azVar = cVar.alpha;
                if (myLooper == mainLooper) {
                    azVar.setValue(bVar);
                } else {
                    azVar.postValue(bVar);
                }
                ((C) cVar.teal).xray();
                ((h) cVar.red).juliet();
            }
        }
        A a6 = this.f3246b;
        if (a6.echo != z2) {
            a6.echo = z2;
            if (!z2) {
                if (a6.golf) {
                    a6.golf = false;
                    a6.alpha.charlie(false);
                    A.alpha(a6.bravo, 0);
                }
                V0.h hVar2 = a6.foxtrot;
                if (hVar2 != null) {
                    hVar2.delta(new CameraControl$OperationCanceledException("Camera is not active."));
                    a6.foxtrot = null;
                }
            }
        }
        this.f3247c.sierra(z2);
        C0742c c0742c = this.e;
        c0742c.getClass();
        c0742c.delta.execute(new l(c0742c, z2, 1));
        if (!z2) {
            ((AtomicInteger) this.f3250g.purple).set(0);
            AbstractC3066u3.bravo("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
        }
    }

    public final void india(List list) {
        InterfaceC0519q interfaceC0519q;
        int bravo;
        int alpha;
        InterfaceC0519q interfaceC0519q2;
        androidx.core.widget.f fVar = this.teal;
        fVar.getClass();
        list.getClass();
        s sVar = (s) fVar.purple;
        sVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.ad adVar = (androidx.camera.core.impl.ad) it.next();
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.aw.bravo();
            ArrayList arrayList2 = new ArrayList();
            androidx.camera.core.impl.ay.alpha();
            hashSet.addAll(adVar.alpha);
            androidx.camera.core.impl.aw delta = androidx.camera.core.impl.aw.delta(adVar.bravo);
            arrayList2.addAll(adVar.delta);
            ArrayMap arrayMap = new ArrayMap();
            V v4 = adVar.foxtrot;
            for (String str : v4.alpha.keySet()) {
                arrayMap.put(str, v4.alpha.get(str));
            }
            V v6 = new V(arrayMap);
            if (adVar.charlie == 5 && (interfaceC0519q2 = adVar.golf) != null) {
                interfaceC0519q = interfaceC0519q2;
            } else {
                interfaceC0519q = null;
            }
            if (Collections.unmodifiableList(adVar.alpha).isEmpty() && adVar.echo) {
                if (!hashSet.isEmpty()) {
                    AbstractC3066u3.india("Camera2CameraImpl", "The capture config builder already has surface inside.");
                } else {
                    J2.c cVar = sVar.alpha;
                    cVar.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) cVar.red).entrySet()) {
                        X x4 = (X) entry.getValue();
                        if (x4.foxtrot && x4.echo) {
                            arrayList3.add(((X) entry.getValue()).alpha);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableCollection(arrayList3).iterator();
                    while (it2.hasNext()) {
                        androidx.camera.core.impl.ad adVar2 = ((P) it2.next()).golf;
                        List unmodifiableList = Collections.unmodifiableList(adVar2.alpha);
                        if (!unmodifiableList.isEmpty()) {
                            if (adVar2.alpha() != 0 && (alpha = adVar2.alpha()) != 0) {
                                delta.hotel(Z.black, Integer.valueOf(alpha));
                            }
                            if (adVar2.bravo() != 0 && (bravo = adVar2.bravo()) != 0) {
                                delta.hotel(Z.blue, Integer.valueOf(bravo));
                            }
                            Iterator it3 = unmodifiableList.iterator();
                            while (it3.hasNext()) {
                                hashSet.add((androidx.camera.core.impl.ah) it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        AbstractC3066u3.india("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            androidx.camera.core.impl.B alpha2 = androidx.camera.core.impl.B.alpha(delta);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            V v10 = V.bravo;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = v6.alpha;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new androidx.camera.core.impl.ad(arrayList4, alpha2, adVar.charlie, arrayList5, adVar.echo, new V(arrayMap2), interfaceC0519q));
        }
        sVar.uniform("Issue capture request", null);
        sVar.e.kilo(arrayList);
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public final void ivory(int i4) {
        if (!foxtrot()) {
            AbstractC3066u3.india("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f3253j = i4;
        AbstractC3066u3.bravo("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f3253j);
        E e = this.f3248d;
        if (this.f3253j != 1) {
            int i5 = this.f3253j;
        }
        e.getClass();
        be.h.delta(AbstractC3003i.alpha(new a4.u(4, this)));
    }

    public final long juliet() {
        this.f3258o = this.f3256m.getAndIncrement();
        ((s) this.teal.purple).gold();
        return this.f3258o;
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public final void m() {
        C0742c c0742c = this.e;
        synchronized (c0742c.echo) {
            c0742c.foxtrot = new androidx.camera.core.r(2);
        }
        be.h.delta(AbstractC3003i.alpha(new C0741b(c0742c, 1))).foxtrot(new K5.a(3), tg.k.bravo());
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public final void ochre(L l10) {
        boolean isEmpty;
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        E e = this.f3248d;
        C1915c c1915c = e.bravo;
        while (true) {
            synchronized (c1915c.red) {
                isEmpty = ((ArrayDeque) c1915c.purple).isEmpty();
            }
            if (isEmpty) {
                break;
            } else {
                ((androidx.camera.core.ar) c1915c.kilo()).close();
            }
        }
        J j5 = e.hotel;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (j5 != null) {
            S2.l lVar = e.foxtrot;
            if (lVar != null) {
                be.h.delta(j5.echo).foxtrot(new D(lVar, 0), tg.k.echo());
                e.foxtrot = null;
            }
            j5.alpha();
            e.hotel = null;
        }
        ImageWriter imageWriter = e.india;
        if (imageWriter != null) {
            imageWriter.close();
            e.india = null;
        }
        if (e.charlie) {
            l10.bravo.alpha = 1;
            return;
        }
        if (e.echo) {
            l10.bravo.alpha = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) e.alpha.alpha(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e4) {
            AbstractC3066u3.charlie("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e4.getMessage());
        }
        if (streamConfigurationMap2 != null && streamConfigurationMap2.getInputFormats() != null) {
            hashMap = new HashMap();
            for (int i4 : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i4);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new bc.c(true));
                    hashMap.put(Integer.valueOf(i4), inputSizes[0]);
                }
            }
        } else {
            hashMap = new HashMap();
        }
        if (e.delta && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) e.alpha.alpha(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i5 : validOutputFormatsForInput) {
                if (i5 == 256) {
                    Size size = (Size) hashMap.get(34);
                    androidx.camera.core.av avVar = new androidx.camera.core.av(size.getWidth(), size.getHeight(), 34, 9);
                    e.golf = avVar.purple;
                    e.foxtrot = new S2.l(avVar);
                    avVar.yankee(new a4.u(6, e), tg.k.delta());
                    J j6 = new J(e.foxtrot.romeo(), new Size(e.foxtrot.bravo(), e.foxtrot.alpha()), 34);
                    e.hotel = j6;
                    S2.l lVar2 = e.foxtrot;
                    com.google.common.util.concurrent.e delta = be.h.delta(j6.echo);
                    Objects.requireNonNull(lVar2);
                    delta.foxtrot(new D(lVar2, 0), tg.k.echo());
                    l10.bravo(e.hotel, androidx.camera.core.t.delta, -1);
                    androidx.camera.core.au auVar = e.golf;
                    l10.bravo.delta(auVar);
                    ArrayList arrayList = l10.echo;
                    if (!arrayList.contains(auVar)) {
                        arrayList.add(auVar);
                    }
                    aa aaVar = new aa(2, e);
                    ArrayList arrayList2 = l10.delta;
                    if (!arrayList2.contains(aaVar)) {
                        arrayList2.add(aaVar);
                    }
                    l10.golf = new InputConfiguration(e.foxtrot.bravo(), e.foxtrot.alpha(), e.foxtrot.golf());
                    return;
                }
            }
        }
        l10.bravo.alpha = 1;
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public final com.google.common.util.concurrent.e purple(boolean z2) {
        com.google.common.util.concurrent.e alpha;
        if (!foxtrot()) {
            return new be.j(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        A a6 = this.f3246b;
        if (!a6.charlie) {
            AbstractC3066u3.bravo("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            alpha = new be.j(1, new IllegalStateException("No flash unit"));
        } else {
            A.alpha(a6.bravo, Integer.valueOf(z2 ? 1 : 0));
            alpha = AbstractC3003i.alpha(new ax(a6, z2));
        }
        return be.h.delta(alpha);
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public final androidx.camera.core.impl.af white() {
        ah ahVar;
        C0742c c0742c = this.e;
        synchronized (c0742c.echo) {
            androidx.camera.core.r rVar = c0742c.foxtrot;
            rVar.getClass();
            ahVar = new ah(6, androidx.camera.core.impl.B.alpha(rVar.bravo));
        }
        return ahVar;
    }
}
