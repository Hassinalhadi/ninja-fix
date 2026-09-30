package w;

import A2.aj;
import Ie.C0184d;
import Ie.ag;
import Ie.ai;
import Ie.aq;
import Nf.ak;
import Nf.ax;
import Nf.ay;
import Oe.ap;
import V5.x;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.C0497d;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.core.impl.N;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.at;
import androidx.camera.core.impl.az;
import androidx.compose.runtime.av;
import androidx.fragment.app.L;
import androidx.lifecycle.RunnableC0643m;
import androidx.lifecycle.ac;
import androidx.lifecycle.au;
import bd.ScheduledExecutorServiceC0750c;
import be.InterfaceC0757c;
import bv.ah;
import bv.al;
import bv.ar;
import cf.InterfaceC0845a;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.maps.android.BuildConfig;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import df.C1622a;
import ge.InterfaceC1772d;
import ge.w;
import i8.InterfaceC1904b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlinx.serialization.KSerializer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe.InterfaceC2349y;
import s6.AbstractC2617b6;
import t6.AbstractC3062u;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public class o implements Ke.e, ay, A, InterfaceC0757c, InterfaceC0845a {
    public static int silver;
    public static int teal;
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;

    public /* synthetic */ o(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    public static ArrayList amber(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((aw.i) it.next()).alpha.echo());
        }
        return arrayList;
    }

    public static int papa() {
        int i4 = silver;
        int i5 = i4 % 8652795;
        silver = i4 + 1;
        if (i5 != 0) {
            return teal;
        }
        int myTid = Process.myTid();
        teal = myTid;
        return myTid;
    }

    public static void quebec(CameraDevice cameraDevice, aw.v vVar) {
        cameraDevice.getClass();
        aw.u uVar = vVar.alpha;
        uVar.echo().getClass();
        List foxtrot = uVar.foxtrot();
        if (foxtrot != null) {
            if (uVar.charlie() != null) {
                String id2 = cameraDevice.getId();
                Iterator it = foxtrot.iterator();
                while (it.hasNext()) {
                    String delta = ((aw.i) it.next()).alpha.delta();
                    if (delta != null && !delta.isEmpty()) {
                        AbstractC3066u3.india("CameraDeviceCompat", av.q.golf("Camera ", id2, ": Camera doesn't support physicalCameraId ", delta, ". Ignoring."));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    public static M3.c sierra(ImageDecoder.Source source, int i4, int i5, E3.i iVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new L3.b(i4, i5, iVar));
        if (E0.m.victor(decodeDrawable)) {
            return new M3.c(1, E0.m.golf(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    @Override // cf.InterfaceC0847c
    public List alpha(aj ajVar, Oe.l callableProto, int i4, int i5, Ie.ay ayVar) {
        int collectionSizeOrDefault;
        Intrinsics.echo(callableProto, "callableProto");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        List list = (List) ayVar.kilo(((C1622a) this.purple).juliet);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((J2.c) this.red).lima((Ie.g) it.next(), (Ke.e) ajVar.bravo));
        }
        return arrayList;
    }

    public void azure(av avVar) {
        Object golf = ((al) this.red).golf(avVar);
        if (golf != null) {
            if (golf instanceof ah) {
                ar arVar = (ar) golf;
                Object[] objArr = arVar.alpha;
                if (arVar.bravo > 0) {
                    Intrinsics.charlie(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                    throw new ClassCastException();
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    @Override // be.InterfaceC0757c
    public void b(Throwable th) {
        switch (this.alpha) {
            case 23:
                P p4 = null;
                if (th instanceof DeferrableSurface$SurfaceClosedException) {
                    av.s sVar = (av.s) this.red;
                    androidx.camera.core.impl.ah deferrableSurface = ((DeferrableSurface$SurfaceClosedException) th).getDeferrableSurface();
                    Iterator it = sVar.alpha.quebec().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            P p5 = (P) it.next();
                            if (p5.bravo().contains(deferrableSurface)) {
                                p4 = p5;
                            }
                        }
                    }
                    if (p4 != null) {
                        av.s sVar2 = (av.s) this.red;
                        sVar2.getClass();
                        ScheduledExecutorServiceC0750c echo = tg.k.echo();
                        N n5 = p4.foxtrot;
                        if (n5 != null) {
                            sVar2.uniform("Posting surface closed", new Throwable());
                            echo.execute(new RunnableC0643m(4, n5, p4));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (th instanceof CancellationException) {
                    ((av.s) this.red).uniform("Unable to configure camera cancelled", null);
                    return;
                }
                if (((av.s) this.red).A == 9) {
                    ((av.s) this.red).bronze(9, new C0497d(4, th), true);
                }
                AbstractC3066u3.delta("Camera2CameraImpl", "Unable to configure camera " + ((av.s) this.red), th);
                av.s sVar3 = (av.s) this.red;
                if (sVar3.e == ((av.aj) this.purple)) {
                    sVar3.blue();
                    return;
                }
                return;
            case 24:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            default:
                ((V0.h) this.purple).delta(th);
                return;
        }
    }

    public void beige(int i4, F0.e eVar) {
        while (true) {
            Map.Entry entry = (Map.Entry) this.red;
            if (entry != null && ((Oe.m) entry.getKey()).alpha < i4) {
                Oe.m mVar = (Oe.m) ((Map.Entry) this.red).getKey();
                Object value = ((Map.Entry) this.red).getValue();
                Oe.i iVar = Oe.i.charlie;
                ap apVar = mVar.purple;
                boolean z2 = mVar.red;
                int i5 = mVar.alpha;
                if (z2) {
                    for (Object obj : (List) value) {
                        if (apVar == ap.teal) {
                            eVar.cyan(i5, 3);
                            ((Oe.v) obj).echo(eVar);
                            eVar.cyan(i5, 4);
                        } else {
                            eVar.cyan(i5, apVar.purple);
                            Oe.i.kilo(eVar, apVar, obj);
                        }
                    }
                } else if (apVar == ap.teal) {
                    eVar.cyan(i5, 3);
                    ((Oe.v) value).echo(eVar);
                    eVar.cyan(i5, 4);
                } else {
                    eVar.cyan(i5, apVar.purple);
                    Oe.i.kilo(eVar, apVar, value);
                }
                Iterator it = (Iterator) this.purple;
                if (it.hasNext()) {
                    this.red = (Map.Entry) it.next();
                } else {
                    this.red = null;
                }
            } else {
                return;
            }
        }
    }

    @Override // cf.InterfaceC0845a
    public Object bravo(aj container, ag proto, y yVar) {
        Intrinsics.echo(container, "container");
        Intrinsics.echo(proto, "proto");
        C0184d c0184d = (C0184d) AbstractC2617b6.charlie(proto, ((C1622a) this.purple).india);
        if (c0184d == null) {
            return null;
        }
        return ((J2.c) this.red).azure(yVar, c0184d, (Ke.e) container.bravo);
    }

    @Override // cf.InterfaceC0847c
    public ArrayList charlie(Ie.av proto, Ke.e nameResolver) {
        int collectionSizeOrDefault;
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        List list = (List) proto.kilo(((C1622a) this.purple).lima);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((J2.c) this.red).lima((Ie.g) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // cf.InterfaceC0847c
    public List delta(aj ajVar, Oe.l proto, int i4) {
        List list;
        int collectionSizeOrDefault;
        Intrinsics.echo(proto, "proto");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        boolean z2 = proto instanceof Ie.l;
        C1622a c1622a = (C1622a) this.purple;
        if (z2) {
            list = (List) ((Ie.l) proto).kilo(c1622a.bravo);
        } else if (proto instanceof Ie.y) {
            list = (List) ((Ie.y) proto).kilo(c1622a.delta);
        } else if (proto instanceof ag) {
            int mike = av.q.mike(i4);
            if (mike != 1) {
                if (mike != 2) {
                    if (mike == 3) {
                        list = (List) ((ag) proto).kilo(c1622a.golf);
                    } else {
                        throw new IllegalStateException("Unsupported callable kind with property proto");
                    }
                } else {
                    list = (List) ((ag) proto).kilo(c1622a.foxtrot);
                }
            } else {
                list = (List) ((ag) proto).kilo(c1622a.echo);
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + proto).toString());
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((J2.c) this.red).lima((Ie.g) it.next(), (Ke.e) ajVar.bravo));
        }
        return arrayList;
    }

    @Override // androidx.camera.core.impl.A
    public void echo(az azVar) {
        synchronized (((HashMap) this.red)) {
            try {
                at atVar = (at) ((HashMap) this.red).remove(azVar);
                if (atVar != null) {
                    atVar.alpha.set(false);
                    tg.k.echo().execute(new A8.g(28, this, atVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // cf.InterfaceC0847c
    public List foxtrot(aj ajVar, ag proto) {
        int collectionSizeOrDefault;
        Intrinsics.echo(proto, "proto");
        ((C1622a) this.purple).getClass();
        List emptyList = CollectionsKt.emptyList();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(emptyList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(((J2.c) this.red).lima((Ie.g) it.next(), (Ke.e) ajVar.bravo));
        }
        return arrayList;
    }

    @Override // Ke.e
    public String getString(int i4) {
        String str = (String) ((Ie.al) this.purple).purple.get(i4);
        Intrinsics.delta(str, "strings.getString(index)");
        return str;
    }

    @Override // cf.InterfaceC0847c
    public ArrayList golf(cf.r container) {
        int collectionSizeOrDefault;
        Intrinsics.echo(container, "container");
        List list = (List) container.echo.kilo(((C1622a) this.purple).charlie);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((J2.c) this.red).lima((Ie.g) it.next(), (Ke.e) container.bravo));
        }
        return arrayList;
    }

    @Override // Ke.e
    public String hotel(int i4) {
        Triple zulu = zulu(i4);
        List list = (List) zulu.first;
        String maroon = CollectionsKt.maroon((List) zulu.second, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return maroon;
        }
        return CollectionsKt.maroon(list, "/", null, null, null, 62) + '/' + maroon;
    }

    @Override // cf.InterfaceC0847c
    public List india(aj container, Ie.t tVar) {
        int collectionSizeOrDefault;
        Intrinsics.echo(container, "container");
        List list = (List) tVar.kilo(((C1622a) this.purple).hotel);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((J2.c) this.red).lima((Ie.g) it.next(), (Ke.e) container.bravo));
        }
        return arrayList;
    }

    @Override // cf.InterfaceC0845a
    public Object juliet(aj container, ag proto, y yVar) {
        Intrinsics.echo(container, "container");
        Intrinsics.echo(proto, "proto");
        return null;
    }

    @Override // androidx.camera.core.impl.A
    public void kilo(Executor executor, az azVar) {
        synchronized (((HashMap) this.red)) {
            at atVar = (at) ((HashMap) this.red).get(azVar);
            if (atVar != null) {
                atVar.alpha.set(false);
            }
            at atVar2 = new at(executor, (bp.c) azVar);
            ((HashMap) this.red).put(azVar, atVar2);
            tg.k.echo().execute(new A2.s(this, atVar, atVar2, 13));
        }
    }

    @Override // cf.InterfaceC0847c
    public List lima(aj ajVar, ag proto) {
        int collectionSizeOrDefault;
        Intrinsics.echo(proto, "proto");
        ((C1622a) this.purple).getClass();
        List emptyList = CollectionsKt.emptyList();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(emptyList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(((J2.c) this.red).lima((Ie.g) it.next(), (Ke.e) ajVar.bravo));
        }
        return arrayList;
    }

    @Override // Ke.e
    public boolean mike(int i4) {
        return ((Boolean) zulu(i4).getThird()).booleanValue();
    }

    @Override // Nf.ay
    public Object n(InterfaceC1772d interfaceC1772d, ArrayList arrayList) {
        int collectionSizeOrDefault;
        Object m206constructorimpl;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.red;
        Class bravo = AbstractC3062u.bravo(interfaceC1772d);
        Object obj = concurrentHashMap.get(bravo);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(bravo, (obj = new ax()))) != null) {
            obj = putIfAbsent;
        }
        ax axVar = (ax) obj;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ak((w) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = axVar.alpha;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl((KSerializer) ((Xd.l) this.purple).invoke(interfaceC1772d, arrayList));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            Result result = new Result(m206constructorimpl);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, result);
            if (putIfAbsent2 == null) {
                obj2 = result;
            } else {
                obj2 = putIfAbsent2;
            }
        }
        return ((Result) obj2).alpha;
    }

    @Override // cf.InterfaceC0847c
    public ArrayList november(aq proto, Ke.e nameResolver) {
        int collectionSizeOrDefault;
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        List list = (List) proto.kilo(((C1622a) this.purple).kilo);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((J2.c) this.red).lima((Ie.g) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // be.InterfaceC0757c
    public void onSuccess(Object obj) {
        switch (this.alpha) {
            case 23:
                av.s sVar = (av.s) this.red;
                if (sVar.f3267i.alpha == 2 && sVar.A == 9) {
                    ((av.s) this.red).coral(10);
                    return;
                }
                return;
            case 24:
                ((Surface) this.purple).release();
                ((SurfaceTexture) this.red).release();
                return;
            default:
                ((V0.h) this.purple).bravo((androidx.camera.core.q) this.red);
                return;
        }
    }

    @Override // cf.InterfaceC0847c
    public List oscar(aj ajVar, Oe.l proto, int i4) {
        String str;
        int collectionSizeOrDefault;
        Intrinsics.echo(proto, "proto");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        boolean z2 = proto instanceof Ie.y;
        C1622a c1622a = (C1622a) this.purple;
        if (z2) {
            c1622a.getClass();
        } else if (proto instanceof ag) {
            int mike = av.q.mike(i4);
            if (mike != 1 && mike != 2 && mike != 3) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                str = BuildConfig.TRAVIS;
                            } else {
                                str = "PROPERTY_SETTER";
                            }
                        } else {
                            str = "PROPERTY_GETTER";
                        }
                    } else {
                        str = "PROPERTY";
                    }
                } else {
                    str = "FUNCTION";
                }
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
            }
            c1622a.getClass();
        } else {
            throw new IllegalStateException(("Unknown message: " + proto).toString());
        }
        List emptyList = CollectionsKt.emptyList();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(emptyList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(((J2.c) this.red).lima((Ie.g) it.next(), (Ke.e) ajVar.bravo));
        }
        return arrayList;
    }

    public void romeo(aw.v vVar) {
        CameraDevice cameraDevice = (CameraDevice) this.purple;
        quebec(cameraDevice, vVar);
        aw.u uVar = vVar.alpha;
        androidx.camera.camera2.internal.compat.g gVar = new androidx.camera.camera2.internal.compat.g(uVar.charlie(), uVar.echo());
        ArrayList amber = amber(uVar.foxtrot());
        B2.b bVar = (B2.b) this.red;
        bVar.getClass();
        aw.h bravo = uVar.bravo();
        Handler handler = bVar.alpha;
        try {
            if (bravo != null) {
                InputConfiguration inputConfiguration = bravo.alpha.alpha;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSession(inputConfiguration, amber, gVar, handler);
            } else {
                if (uVar.delta() == 1) {
                    cameraDevice.createConstrainedHighSpeedCaptureSession(amber, gVar, handler);
                    return;
                }
                try {
                    cameraDevice.createCaptureSession(amber, gVar, handler);
                } catch (CameraAccessException e) {
                    throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
                }
            }
        } catch (CameraAccessException e4) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: JSONException -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0014, B:7:0x002a, B:8:0x0040, B:13:0x005a, B:22:0x0070, B:24:0x0079, B:26:0x0084, B:28:0x0088, B:30:0x009e, B:31:0x00a5, B:34:0x00a6, B:35:0x00ad, B:37:0x00ae, B:38:0x00b5), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: JSONException -> 0x003d, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0014, B:7:0x002a, B:8:0x0040, B:13:0x005a, B:22:0x0070, B:24:0x0079, B:26:0x0084, B:28:0x0088, B:30:0x009e, B:31:0x00a5, B:34:0x00a6, B:35:0x00ad, B:37:0x00ae, B:38:0x00b5), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [I8.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public I8.d tango(F8.g gVar) {
        String string;
        JSONArray jSONArray = gVar.golf;
        long j5 = gVar.foxtrot;
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String optString = jSONArray2.optString(0, "");
                F8.g charlie = ((F8.e) this.purple).charlie();
                String str = null;
                if (charlie != null) {
                    try {
                        string = charlie.bravo.getString(optString);
                    } catch (JSONException unused) {
                    }
                    if (string == null) {
                        F8.g charlie2 = ((F8.e) this.red).charlie();
                        if (charlie2 != null) {
                            try {
                                str = charlie2.bravo.getString(optString);
                            } catch (JSONException unused2) {
                            }
                        }
                        if (str == null) {
                            string = "";
                        } else {
                            string = str;
                        }
                    }
                    int i5 = I8.e.alpha;
                    ?? obj = new Object();
                    if (string2 == null) {
                        obj.alpha = string2;
                        String string3 = jSONObject.getString("variantId");
                        if (string3 != null) {
                            obj.bravo = string3;
                            if (optString != null) {
                                obj.charlie = optString;
                                obj.delta = string;
                                obj.echo = j5;
                                obj.foxtrot = (byte) (obj.foxtrot | 1);
                                hashSet.add(obj.alpha());
                            } else {
                                throw new NullPointerException("Null parameterKey");
                            }
                        } else {
                            throw new NullPointerException("Null variantId");
                        }
                    } else {
                        throw new NullPointerException("Null rolloutId");
                    }
                }
                string = null;
                if (string == null) {
                }
                int i52 = I8.e.alpha;
                ?? obj2 = new Object();
                if (string2 == null) {
                }
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new I8.d(hashSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public InputMethodManager uniform() {
        return (InputMethodManager) this.red.getValue();
    }

    public synchronized List victor(String str) {
        List list;
        if (!((ArrayList) this.purple).contains(str)) {
            ((ArrayList) this.purple).add(str);
        }
        list = (List) ((HashMap) this.red).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.red).put(str, list);
        }
        return list;
    }

    public com.bumptech.glide.m whiskey(Context context, com.bumptech.glide.b bVar, ac acVar, L l10, boolean z2) {
        Y3.l.alpha();
        Y3.l.alpha();
        HashMap hashMap = (HashMap) this.purple;
        com.bumptech.glide.m mVar = (com.bumptech.glide.m) hashMap.get(acVar);
        if (mVar == null) {
            R3.h hVar = new R3.h(acVar);
            g7.f fVar = new g7.f(this, l10);
            ((g8.d) this.red).getClass();
            com.bumptech.glide.m mVar2 = new com.bumptech.glide.m(bVar, hVar, fVar, context);
            hashMap.put(acVar, mVar2);
            hVar.alpha(new R3.j(this, acVar));
            if (z2) {
                mVar2.charlie();
            }
            return mVar2;
        }
        return mVar;
    }

    public synchronized ArrayList xray(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z2;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.purple).iterator();
        while (it.hasNext()) {
            List<T3.d> list = (List) ((HashMap) this.red).get((String) it.next());
            if (list != null) {
                for (T3.d dVar : list) {
                    if (dVar.alpha.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.bravo)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && !arrayList.contains(dVar.bravo)) {
                        arrayList.add(dVar.bravo);
                    }
                }
            }
        }
        return arrayList;
    }

    public void yankee(String str) {
        H3.b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.purple).get(str);
                Y3.f.charlie(obj, "Argument must not be null");
                bVar = (H3.b) obj;
                int i4 = bVar.bravo;
                if (i4 >= 1) {
                    int i5 = i4 - 1;
                    bVar.bravo = i5;
                    if (i5 == 0) {
                        H3.b bVar2 = (H3.b) ((HashMap) this.purple).remove(str);
                        if (bVar2.equals(bVar)) {
                            ((D8.c) this.red).kilo(bVar2);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.bravo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.alpha.unlock();
    }

    public Triple zulu(int i4) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z2 = false;
        while (i4 != -1) {
            Ie.aj ajVar = (Ie.aj) ((Ie.ak) this.red).purple.get(i4);
            String str = (String) ((Ie.al) this.purple).purple.get(ajVar.silver);
            ai aiVar = ajVar.teal;
            Intrinsics.checkNotNull(aiVar);
            int ordinal = aiVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        linkedList2.addFirst(str);
                        z2 = true;
                    }
                } else {
                    linkedList.addFirst(str);
                }
            } else {
                linkedList2.addFirst(str);
            }
            i4 = ajVar.red;
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z2));
    }

    public /* synthetic */ o(int i4, Object obj, Object obj2, boolean z2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    public /* synthetic */ o(int i4, boolean z2) {
        this.alpha = i4;
    }

    public /* synthetic */ o(ViewGroup viewGroup, View view, View view2, int i4) {
        this.alpha = i4;
        this.purple = view;
        this.red = view2;
    }

    public o(GoogleApiAvailability googleApiAvailability) {
        this.alpha = 17;
        this.purple = new SparseIntArray();
        x.hotel(googleApiAvailability);
        this.red = googleApiAvailability;
    }

    public o(Ie.al strings, Ie.ak qualifiedNames) {
        this.alpha = 10;
        Intrinsics.echo(strings, "strings");
        Intrinsics.echo(qualifiedNames, "qualifiedNames");
        this.purple = strings;
        this.red = qualifiedNames;
    }

    public o(g8.d dVar) {
        this.alpha = 14;
        this.purple = new HashMap();
        this.red = dVar;
    }

    public o(InterfaceC2349y module, J2.i iVar, C1622a protocol) {
        this.alpha = 27;
        Intrinsics.echo(module, "module");
        Intrinsics.echo(protocol, "protocol");
        this.purple = protocol;
        this.red = new J2.c(module, iVar);
    }

    public o(CameraDevice cameraDevice, B2.b bVar) {
        this.alpha = 20;
        cameraDevice.getClass();
        this.purple = cameraDevice;
        this.red = bVar;
    }

    public o(InterfaceC1904b interfaceC1904b) {
        this.alpha = 6;
        this.red = Collections.synchronizedMap(new HashMap());
        this.purple = interfaceC1904b;
    }

    public o(View view) {
        this.alpha = 0;
        this.purple = view;
        this.red = LazyKt.alpha(kotlin.i.purple, new kotlin.collections.n(24, this));
    }

    public o(Xd.l lVar) {
        this.alpha = 12;
        this.purple = lVar;
        this.red = new ConcurrentHashMap();
    }

    public o(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 8:
                this.purple = new HashMap();
                this.red = new D8.c(13);
                return;
            case 15:
                this.purple = new ArrayList();
                this.red = new HashMap();
                return;
            case 18:
                this.purple = Ef.d.alpha();
                this.red = new LinkedHashMap();
                return;
            case 21:
                this.purple = new au();
                this.red = new HashMap();
                return;
            case 22:
                this.purple = new al();
                this.red = new al();
                return;
            default:
                this.purple = new LinkedHashMap();
                this.red = new LinkedHashMap();
                return;
        }
    }

    public o(ProcessOrderActivityV2 processOrderActivityV2) {
        this.alpha = 19;
        this.red = processOrderActivityV2;
        this.purple = processOrderActivityV2.f12404U;
    }

    public o(J1.b bVar) {
        this.alpha = 9;
        this.red = bVar;
    }

    public o(Oe.l lVar) {
        this.alpha = 13;
        Oe.i iVar = lVar.alpha;
        iVar.getClass();
        Iterator it = ((Oe.ah) iVar.alpha.entrySet()).iterator();
        this.purple = it;
        if (it.hasNext()) {
            this.red = (Map.Entry) it.next();
        }
    }
}
