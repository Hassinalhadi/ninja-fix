package J2;

import H0.af;
import a0.InterfaceC0364r;
import android.database.Cursor;
import android.graphics.Rect;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.C0499f;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.lifecycle.aa;
import androidx.lifecycle.an;
import androidx.work.impl.WorkDatabase_Impl;
import ao.ad;
import bd.RunnableScheduledFutureC0749b;
import be.RunnableC0756b;
import bv.al;
import bv.au;
import bv.w;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.zendesk.service.HttpConstants;
import ge.v;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ac;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.reflect.jvm.internal.impl.types.y;
import oe.C2233d;
import oe.C2234e;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.aq;
import pf.C2355e;
import qe.C2471g;
import qe.C2473i;
import qe.InterfaceC2466b;
import qe.InterfaceC2472h;
import r1.C2486e;
import r1.InterfaceC2485d;
import r6.u;
import s6.E6;
import s6.G4;
import s6.O5;
import s6.T7;
import t6.AbstractC3066u3;
import t6.j4;
import ve.ab;
import ve.ag;
import xe.EnumC3339b;

/* loaded from: classes3.dex */
public final class t implements K0.c, M7.b, M7.a, R.f, W2.f, InterfaceC2485d, V0.i {
    public static t silver;
    public Object alpha;
    public Object purple;
    public Object red;

    public /* synthetic */ t(ViewGroup viewGroup, View view, View view2, View view3) {
        this.alpha = view;
        this.purple = view2;
        this.red = view3;
    }

    public static final void golf(t tVar, Network network, boolean z2) {
        boolean z10;
        Network[] allNetworks = ((ConnectivityManager) tVar.alpha).getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Network network2 = allNetworks[i4];
            if (Intrinsics.areEqual(network2, network)) {
                z10 = z2;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) tVar.alpha).getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
                break;
            }
            i4++;
        }
        a3.n nVar = (a3.n) tVar.purple;
        synchronized (nVar) {
            try {
                if (((M2.k) nVar.alpha.get()) != null) {
                    nVar.teal = z11;
                } else {
                    nVar.bravo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String kilo(String str, HashMap hashMap) {
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb2.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb2.append(str3);
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb3 = "&".concat(sb3);
            }
            return P0.crimson(str, sb3);
        }
        return ad.amber(str, "?", sb3);
    }

    public static void uniform(t tVar, H0.i iVar, H0.a aVar, Object obj) {
        tVar.getClass();
        aVar.getClass();
        H0.f fVar = new H0.f(iVar);
        synchronized (((u) tVar.red)) {
            try {
                if (obj == null) {
                    ((al) tVar.purple).mike(fVar, new H0.e(null));
                } else {
                    ((w) tVar.alpha).delta(fVar, new H0.e(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r1.InterfaceC2485d
    public boolean alpha(Object obj) {
        if (obj instanceof Z3.b) {
            ((Z3.b) obj).charlie().alpha = true;
        }
        ((Z3.c) this.purple).delta(obj);
        return ((C2486e) this.red).alpha(obj);
    }

    public y amber(Ee.d dVar, De.a aVar) {
        boolean z2 = dVar instanceof ab;
        me.j jVar = null;
        B9.ab abVar = (B9.ab) this.alpha;
        if (z2) {
            Class cls = ((ab) dVar).alpha;
            if (!Intrinsics.areEqual(cls, Void.TYPE)) {
                jVar = Ve.c.bravo(cls.getName()).delta();
            }
            if (jVar != null) {
                return ((Be.a) abVar.purple).oscar.silver.romeo(jVar);
            }
            return ((Be.a) abVar.purple).oscar.silver.victor();
        }
        boolean z10 = false;
        if (dVar instanceof ve.s) {
            ve.s sVar = (ve.s) dVar;
            if (!aVar.delta && aVar.alpha != 1) {
                z10 = true;
            }
            boolean delta = sVar.delta();
            hf.h hVar = hf.h.red;
            Type type = sVar.alpha;
            if (!delta && !z10) {
                ae hotel = hotel(sVar, aVar, null);
                if (hotel != null) {
                    return hotel;
                }
                return hf.i.charlie(hVar, type.toString());
            }
            ae hotel2 = hotel(sVar, aVar.bravo(3), null);
            if (hotel2 == null) {
                return hf.i.charlie(hVar, type.toString());
            }
            ae hotel3 = hotel(sVar, aVar.bravo(2), hotel2);
            if (hotel3 == null) {
                return hf.i.charlie(hVar, type.toString());
            }
            if (delta) {
                return new De.f(hotel2, hotel3);
            }
            return kotlin.reflect.jvm.internal.impl.types.ab.alpha(hotel2, hotel3);
        }
        if (dVar instanceof ve.i) {
            return zulu((ve.i) dVar, aVar, false);
        }
        if (dVar instanceof ag) {
            ve.ad charlie = ((ag) dVar).charlie();
            if (charlie != null) {
                return amber(charlie, aVar);
            }
            return ((Be.a) abVar.purple).oscar.silver.november();
        }
        if (dVar == null) {
            return ((Be.a) abVar.purple).oscar.silver.november();
        }
        throw new UnsupportedOperationException("Unsupported type: " + dVar);
    }

    public void azure() {
        al alVar = (al) this.alpha;
        String str = (String) this.purple;
        List list = (List) alVar.kilo(str);
        if (list != null) {
            list.remove((Function0) this.red);
        }
        if (list != null && !list.isEmpty()) {
            alVar.mike(str, list);
        }
    }

    @Override // V0.i
    public Object black(V0.h hVar) {
        hVar.alpha(new F6.b(13, this), tg.k.bravo());
        ((RunnableScheduledFutureC0749b) this.red).alpha.set(hVar);
        return "HandlerScheduledFuture-" + ((Callable) this.purple).toString();
    }

    @Override // W2.f
    public boolean bravo() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.alpha;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // r1.InterfaceC2485d
    public Object charlie() {
        Object charlie = ((C2486e) this.red).charlie();
        if (charlie == null) {
            charlie = ((Z3.a) this.alpha).kilo();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + charlie.getClass());
            }
        }
        if (charlie instanceof Z3.b) {
            ((Z3.b) charlie).charlie().alpha = false;
        }
        return charlie;
    }

    @Override // K0.c
    public K0.b delta() {
        LocaleList localeList;
        int size;
        Locale locale;
        localeList = LocaleList.getDefault();
        synchronized (((u) this.red)) {
            try {
                K0.b bVar = (K0.b) this.purple;
                if (bVar == null || localeList != ((LocaleList) this.alpha)) {
                    size = localeList.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        locale = localeList.get(i4);
                        arrayList.add(new K0.a(locale));
                    }
                    K0.b bVar2 = new K0.b(arrayList);
                    this.alpha = localeList;
                    this.purple = bVar2;
                    return bVar2;
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K0.c
    public Locale echo(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (Intrinsics.areEqual(forLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    @Override // M7.b
    public void foxtrot(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.red;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x012f, code lost:
    
        if (r10 != 3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ef, code lost:
    
        if (r2.isEmpty() == false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0269  */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ae hotel(ve.s sVar, De.a aVar, ae aeVar) {
        kotlin.reflect.jvm.internal.impl.types.al whiskey;
        boolean z2;
        ap apVar;
        boolean z10;
        ap apVar2;
        boolean z11;
        ap apVar3;
        int collectionSizeOrDefault;
        List list;
        boolean z12;
        Object atVar;
        int i4;
        Object obj;
        InterfaceC2472h c2473i;
        int collectionSizeOrDefault2;
        List list2;
        int collectionSizeOrDefault3;
        t tVar;
        ap apVar4;
        ve.s sVar2;
        as echo;
        InterfaceC2330f bravo;
        ag agVar;
        InterfaceC2330f interfaceC2330f;
        t tVar2 = this;
        ve.s sVar3 = sVar;
        De.a aVar2 = aVar;
        B9.ab c3 = (B9.ab) tVar2.alpha;
        if (aeVar == null || (whiskey = aeVar.gold()) == null) {
            whiskey = kotlin.reflect.jvm.internal.impl.types.c.whiskey(new Be.c(c3, sVar3, false));
        }
        kotlin.reflect.jvm.internal.impl.types.al alVar = whiskey;
        ve.u uVar = sVar3.bravo;
        if (uVar != null) {
            boolean z13 = uVar instanceof ve.q;
            int i5 = aVar2.alpha;
            boolean z14 = false;
            int i10 = aVar2.bravo;
            ap apVar5 = null;
            boolean z15 = aVar2.delta;
            if (z13) {
                ve.q qVar = (ve.q) uVar;
                Ne.c charlie = qVar.charlie();
                if (z15 && Intrinsics.areEqual(charlie, De.c.alpha)) {
                    me.l lVar = ((Be.a) c3.purple).papa;
                    lVar.getClass();
                    v property = me.l.echo[0];
                    lVar.charlie.getClass();
                    Intrinsics.echo(property, "property");
                    Ne.f echo2 = Ne.f.echo(E6.alpha(property.getName()));
                    z2 = z15;
                    InterfaceC2332h golf = ((Xe.n) lVar.bravo.getValue()).golf(echo2, EnumC3339b.purple);
                    if (golf instanceof InterfaceC2330f) {
                        interfaceC2330f = (InterfaceC2330f) golf;
                    } else {
                        interfaceC2330f = null;
                    }
                    bravo = interfaceC2330f == null ? lVar.alpha.alpha(new Ne.b(me.n.hotel, echo2), kotlin.collections.ab.juliet(1)) : interfaceC2330f;
                } else {
                    z2 = z15;
                    bravo = C2234e.bravo(charlie, ((Be.a) c3.purple).oscar.silver);
                    if (bravo == null) {
                        bravo = null;
                    } else {
                        String str = C2233d.alpha;
                        Ne.e golf2 = Qe.e.golf(bravo);
                        HashMap hashMap = C2233d.kilo;
                        if (hashMap.containsKey(golf2)) {
                            if (i10 != 3 && i5 != 1) {
                                Ee.d dVar = (Ee.d) CollectionsKt.olive(sVar3.charlie());
                                if (dVar instanceof ag) {
                                    agVar = (ag) dVar;
                                } else {
                                    agVar = null;
                                }
                                if (agVar != null && agVar.charlie() != null) {
                                    Type[] upperBounds = agVar.alpha.getUpperBounds();
                                    Intrinsics.delta(upperBounds, "reflectType.upperBounds");
                                    if (Intrinsics.areEqual(ArraysKt.gold(upperBounds), Object.class)) {
                                        Ne.e golf3 = Qe.e.golf(bravo);
                                        String str2 = C2233d.alpha;
                                        Ne.c cVar = (Ne.c) hashMap.get(golf3);
                                        if (cVar != null) {
                                            List parameters = Ue.e.echo(bravo).india(cVar).tango().getParameters();
                                            Intrinsics.delta(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
                                            aq aqVar = (aq) CollectionsKt.olive(parameters);
                                            if (aqVar != null) {
                                                int fuchsia = aqVar.fuchsia();
                                                if (fuchsia != 0) {
                                                }
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Given class " + bravo + " is not a read-only collection");
                                        }
                                    }
                                }
                            }
                            bravo = C2234e.alpha(bravo);
                        }
                    }
                }
                if (bravo == null) {
                    D8.c cVar2 = ((Be.a) c3.purple).kilo;
                    cVar2.getClass();
                    O7.j jVar = (O7.j) cVar2.purple;
                    if (jVar != null) {
                        bravo = jVar.kilo(qVar);
                    } else {
                        Intrinsics.lima("resolver");
                        throw null;
                    }
                }
                if (bravo == null || (apVar = bravo.tango()) == null) {
                    sVar3.getClass();
                    throw new UnsupportedOperationException("Type not found: " + sVar3.alpha);
                }
            } else {
                z2 = z15;
                if (uVar instanceof ve.ae) {
                    aq alpha = ((Be.f) tVar2.purple).alpha((ve.ae) uVar);
                    if (alpha != null) {
                        apVar = alpha.tango();
                    } else {
                        apVar = null;
                    }
                } else {
                    throw new IllegalStateException("Unknown classifier kind: " + uVar);
                }
            }
            if (apVar == null) {
                return null;
            }
            if (i10 == 3 || z2 || i5 == 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (aeVar != null) {
                apVar2 = aeVar.green();
            } else {
                apVar2 = null;
            }
            if (Intrinsics.areEqual(apVar2, apVar) && !sVar3.delta() && z10) {
                return aeVar.pink(true);
            }
            if (!sVar3.delta()) {
                if (sVar3.charlie().isEmpty()) {
                    List parameters2 = apVar.getParameters();
                    Intrinsics.delta(parameters2, "constructor.parameters");
                }
                z11 = false;
                List<aq> parameters3 = apVar.getParameters();
                Intrinsics.delta(parameters3, "constructor.parameters");
                if (!z11) {
                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters3, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault3);
                    for (aq aqVar2 : parameters3) {
                        if (O5.hotel(aqVar2, apVar5, aVar2.echo)) {
                            echo = az.lima(aqVar2, aVar2);
                            tVar = tVar2;
                            apVar4 = apVar;
                            sVar2 = sVar3;
                        } else {
                            ap apVar6 = apVar;
                            tVar = tVar2;
                            apVar4 = apVar6;
                            sVar2 = sVar3;
                            echo = U8.a.echo(aqVar2, De.a.alpha(aVar, 0, sVar2.delta(), null, null, 59), (gd.a) tVar.red, new ac(((Be.a) c3.purple).alpha, new De.b(tVar2, aqVar2, aVar, apVar6, sVar3, 0)));
                        }
                        arrayList.add(echo);
                        aVar2 = aVar;
                        apVar = apVar4;
                        tVar2 = tVar;
                        sVar3 = sVar2;
                        apVar5 = null;
                    }
                    apVar3 = apVar;
                    list2 = arrayList;
                } else {
                    apVar3 = apVar;
                    if (parameters3.size() != sVar3.charlie().size()) {
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters3, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                        for (aq aqVar3 : parameters3) {
                            hf.h hVar = hf.h.f12732l;
                            String bravo2 = aqVar3.getName().bravo();
                            Intrinsics.delta(bravo2, "p.name.asString()");
                            arrayList2.add(new at(1, hf.i.charlie(hVar, bravo2)));
                        }
                        list2 = CollectionsKt.z(arrayList2);
                    } else {
                        Lf.i G9 = CollectionsKt.G(sVar3.charlie());
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(G9, 10);
                        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                        Iterator it = G9.iterator();
                        while (true) {
                            kotlin.collections.w wVar = (kotlin.collections.w) it;
                            if (((Iterator) wVar.red).hasNext()) {
                                kotlin.collections.v vVar = (kotlin.collections.v) wVar.next();
                                Ee.d dVar2 = (Ee.d) vVar.bravo;
                                parameters3.size();
                                aq parameter = (aq) parameters3.get(vVar.alpha);
                                Iterator it2 = it;
                                De.a delta = G4.delta(2, z14, null, 7);
                                Intrinsics.delta(parameter, "parameter");
                                if (dVar2 instanceof ag) {
                                    ag wildcardType = (ag) dVar2;
                                    ve.ad charlie2 = wildcardType.charlie();
                                    Type[] upperBounds2 = wildcardType.alpha.getUpperBounds();
                                    Intrinsics.delta(upperBounds2, "reflectType.upperBounds");
                                    if (!Intrinsics.areEqual(ArraysKt.gold(upperBounds2), Object.class)) {
                                        i4 = 3;
                                    } else {
                                        i4 = 2;
                                    }
                                    if (charlie2 == null || (parameter.fuchsia() != 1 && i4 != parameter.fuchsia())) {
                                        list = parameters3;
                                        z12 = false;
                                        atVar = az.lima(parameter, delta);
                                    } else {
                                        Intrinsics.echo(c3, "c");
                                        Intrinsics.echo(wildcardType, "wildcardType");
                                        if (wildcardType.charlie() != null) {
                                            Iterator it3 = new Be.c(c3, wildcardType, false).iterator();
                                            while (true) {
                                                C2355e c2355e = (C2355e) it3;
                                                if (c2355e.hasNext()) {
                                                    Object next = c2355e.next();
                                                    InterfaceC2466b interfaceC2466b = (InterfaceC2466b) next;
                                                    Ne.c[] cVarArr = ye.u.bravo;
                                                    Iterator it4 = it3;
                                                    int length = cVarArr.length;
                                                    obj = next;
                                                    int i11 = 0;
                                                    while (i11 < length) {
                                                        int i12 = length;
                                                        int i13 = i11;
                                                        if (Intrinsics.areEqual(interfaceC2466b.alpha(), cVarArr[i11])) {
                                                            break;
                                                        }
                                                        i11 = i13 + 1;
                                                        length = i12;
                                                    }
                                                    it3 = it4;
                                                } else {
                                                    obj = null;
                                                    break;
                                                }
                                            }
                                            InterfaceC2466b interfaceC2466b2 = (InterfaceC2466b) obj;
                                            list = parameters3;
                                            y amber = tVar2.amber(charlie2, G4.delta(2, false, null, 7));
                                            if (interfaceC2466b2 != null) {
                                                List annotations = CollectionsKt.b(amber.getAnnotations(), interfaceC2466b2);
                                                Intrinsics.echo(annotations, "annotations");
                                                if (annotations.isEmpty()) {
                                                    c2473i = C2471g.alpha;
                                                    z12 = false;
                                                } else {
                                                    z12 = false;
                                                    c2473i = new C2473i(0, annotations);
                                                }
                                                amber = O5.kilo(amber, c2473i);
                                            } else {
                                                z12 = false;
                                            }
                                            atVar = O5.charlie(amber, i4, parameter);
                                        } else {
                                            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
                                        }
                                    }
                                } else {
                                    list = parameters3;
                                    z12 = false;
                                    atVar = new at(1, tVar2.amber(dVar2, delta));
                                }
                                arrayList3.add(atVar);
                                it = it2;
                                z14 = z12;
                                parameters3 = list;
                            } else {
                                list2 = CollectionsKt.z(arrayList3);
                                break;
                            }
                        }
                    }
                }
                return kotlin.reflect.jvm.internal.impl.types.ab.charlie(list2, alVar, apVar3, z10);
            }
            z11 = true;
            List<aq> parameters32 = apVar.getParameters();
            Intrinsics.delta(parameters32, "constructor.parameters");
            if (!z11) {
            }
            return kotlin.reflect.jvm.internal.impl.types.ab.charlie(list2, alVar, apVar3, z10);
        }
        sVar3.getClass();
        throw new UnsupportedOperationException("Type not found: " + sVar3.alpha);
    }

    public void india(bj.k kVar, Map.Entry entry) {
        InterfaceC0525x interfaceC0525x;
        bj.k kVar2 = (bj.k) entry.getValue();
        Size size = kVar.golf.alpha;
        Rect rect = ((bl.b) entry.getKey()).delta;
        C0499f c0499f = null;
        if (kVar.charlie) {
            interfaceC0525x = (InterfaceC0525x) this.purple;
        } else {
            interfaceC0525x = null;
        }
        C0499f c0499f2 = new C0499f(size, rect, interfaceC0525x, ((bl.b) entry.getKey()).foxtrot, ((bl.b) entry.getKey()).golf);
        int i4 = ((bl.b) entry.getKey()).charlie;
        kVar2.getClass();
        j4.alpha();
        kVar2.alpha();
        T7.golf("Consumer can only be linked once.", !kVar2.juliet);
        kVar2.juliet = true;
        bj.j jVar = kVar2.lima;
        RunnableC0756b foxtrot = be.h.foxtrot(jVar.charlie(), new bj.i(kVar2, jVar, i4, c0499f2, c0499f), tg.k.echo());
        foxtrot.foxtrot(new be.g(0, foxtrot, new c(24, this, kVar2, false)), tg.k.echo());
    }

    @Override // M7.a
    public void juliet(Bundle bundle) {
        synchronized (this.purple) {
            try {
                L7.c cVar = L7.c.alpha;
                cVar.foxtrot("Logging event _ae to Firebase Analytics with params " + bundle);
                this.red = new CountDownLatch(1);
                ((D8.c) this.alpha).juliet(bundle);
                cVar.foxtrot("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.red).await(HttpConstants.HTTP_INTERNAL_ERROR, TimeUnit.MILLISECONDS)) {
                        cVar.foxtrot("App exception callback received from Analytics listener.");
                    } else {
                        cVar.golf("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.red = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Fe.c lima() {
        HttpsURLConnection httpsURLConnection;
        P7.e.alpha(new P7.c(0, P7.f.delta, P7.e.class, "isBlockingThread", "isBlockingThread()Z", 0, 1), P7.d.red);
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            String kilo = kilo((String) this.alpha, (HashMap) this.purple);
            String str = "GET Request URL: " + kilo;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(kilo).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.red).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb3.append(cArr, 0, read);
                        }
                        sb2 = sb3.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new Fe.c(responseCode, sb2, 6);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public InterfaceC0364r mike() {
        return ((c0.b) this.red).alpha.charlie;
    }

    public Size[] november(int i4) {
        boolean z2;
        boolean z10;
        ArrayList arrayList;
        List list;
        Size[] sizeArr;
        HashMap hashMap = (HashMap) this.red;
        if (hashMap.containsKey(Integer.valueOf(i4))) {
            if (((Size[]) hashMap.get(Integer.valueOf(i4))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i4))).clone();
        }
        Size[] outputSizes = ((StreamConfigurationMap) ((O7.j) this.alpha).purple).getOutputSizes(i4);
        if (outputSizes != null && outputSizes.length != 0) {
            c cVar = (c) this.purple;
            cVar.getClass();
            ArrayList arrayList2 = new ArrayList(Arrays.asList(outputSizes));
            if (((ExtraSupportedOutputSizeQuirk) cVar.purple) != null) {
                if (i4 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                    sizeArr = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                } else {
                    sizeArr = new Size[0];
                }
                if (sizeArr.length > 0) {
                    arrayList2.addAll(Arrays.asList(sizeArr));
                }
            }
            K1.r rVar = (K1.r) cVar.red;
            rVar.getClass();
            if (((ExcludedSupportedSizesQuirk) ax.b.alpha.delta(ExcludedSupportedSizesQuirk.class)) == null) {
                list = new ArrayList();
            } else {
                String str = rVar.purple;
                String str2 = Build.BRAND;
                if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList = new ArrayList();
                    if (str.equals(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO) && i4 == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO) && i4 == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else {
                    if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ArrayList arrayList3 = new ArrayList();
                        list = arrayList3;
                        list = arrayList3;
                        if (str.equals(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO) && (i4 == 34 || i4 == 35)) {
                            arrayList3.add(new Size(720, 720));
                            arrayList3.add(new Size(HttpConstants.HTTP_BAD_REQUEST, HttpConstants.HTTP_BAD_REQUEST));
                            list = arrayList3;
                        }
                    } else if (ExcludedSupportedSizesQuirk.charlie()) {
                        ArrayList arrayList4 = new ArrayList();
                        list = arrayList4;
                        if (str.equals(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO)) {
                            if (i4 != 34) {
                                if (i4 == 35) {
                                    arrayList4.add(new Size(4128, 2322));
                                    arrayList4.add(new Size(3088, 3088));
                                    arrayList4.add(new Size(3264, 2448));
                                    arrayList4.add(new Size(3264, 1836));
                                    arrayList4.add(new Size(2048, 1536));
                                    arrayList4.add(new Size(2048, 1152));
                                    arrayList4.add(new Size(1920, 1080));
                                    list = arrayList4;
                                }
                            } else {
                                arrayList4.add(new Size(4128, 3096));
                                arrayList4.add(new Size(4128, 2322));
                                arrayList4.add(new Size(3088, 3088));
                                arrayList4.add(new Size(3264, 2448));
                                arrayList4.add(new Size(3264, 1836));
                                arrayList4.add(new Size(2048, 1536));
                                arrayList4.add(new Size(2048, 1152));
                                arrayList4.add(new Size(1920, 1080));
                                list = arrayList4;
                            }
                        } else {
                            list = arrayList4;
                            list = arrayList4;
                            if (str.equals("1") && (i4 == 34 || i4 == 35)) {
                                arrayList4.add(new Size(3264, 2448));
                                arrayList4.add(new Size(3264, 1836));
                                arrayList4.add(new Size(2448, 2448));
                                arrayList4.add(new Size(1920, 1920));
                                arrayList4.add(new Size(2048, 1536));
                                arrayList4.add(new Size(2048, 1152));
                                arrayList4.add(new Size(1920, 1080));
                                list = arrayList4;
                            }
                        }
                    } else if (ExcludedSupportedSizesQuirk.bravo()) {
                        ArrayList arrayList5 = new ArrayList();
                        list = arrayList5;
                        if (str.equals(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO)) {
                            if (i4 != 34) {
                                if (i4 == 35) {
                                    arrayList5.add(new Size(2048, 1536));
                                    arrayList5.add(new Size(2048, 1152));
                                    arrayList5.add(new Size(1920, 1080));
                                    list = arrayList5;
                                }
                            } else {
                                arrayList5.add(new Size(4128, 3096));
                                arrayList5.add(new Size(4128, 2322));
                                arrayList5.add(new Size(3088, 3088));
                                arrayList5.add(new Size(3264, 2448));
                                arrayList5.add(new Size(3264, 1836));
                                arrayList5.add(new Size(2048, 1536));
                                arrayList5.add(new Size(2048, 1152));
                                arrayList5.add(new Size(1920, 1080));
                                list = arrayList5;
                            }
                        } else {
                            list = arrayList5;
                            list = arrayList5;
                            if (str.equals("1") && (i4 == 34 || i4 == 35)) {
                                arrayList5.add(new Size(2576, 1932));
                                arrayList5.add(new Size(2560, 1440));
                                arrayList5.add(new Size(1920, 1920));
                                arrayList5.add(new Size(2048, 1536));
                                arrayList5.add(new Size(2048, 1152));
                                arrayList5.add(new Size(1920, 1080));
                                list = arrayList5;
                            }
                        }
                    } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                        ArrayList arrayList6 = new ArrayList();
                        list = arrayList6;
                        if (str.equals(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO)) {
                            list = arrayList6;
                            if (i4 == 256) {
                                arrayList6.add(new Size(9280, 6944));
                                list = arrayList6;
                            }
                        }
                    } else {
                        AbstractC3066u3.india("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                        list = Collections.EMPTY_LIST;
                    }
                }
                list = arrayList;
            }
            if (!list.isEmpty()) {
                arrayList2.removeAll(list);
            }
            if (arrayList2.isEmpty()) {
                AbstractC3066u3.india("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
            }
            Size[] sizeArr2 = (Size[]) arrayList2.toArray(new Size[0]);
            hashMap.put(Integer.valueOf(i4), sizeArr2);
            return (Size[]) sizeArr2.clone();
        }
        AbstractC3066u3.india("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i4);
        return outputSizes;
    }

    public long oscar() {
        return ((c0.b) this.red).alpha.delta;
    }

    public ArrayList papa(String str) {
        l2.p foxtrot = l2.p.foxtrot(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        foxtrot.oscar(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.alpha;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            ArrayList arrayList = new ArrayList(mike.getCount());
            while (mike.moveToNext()) {
                arrayList.add(mike.getString(0));
            }
            return arrayList;
        } finally {
            mike.close();
            foxtrot.golf();
        }
    }

    public void quebec(String str, String str2) {
        ((HashMap) this.red).put(str, str2);
    }

    public void romeo(String id2, Set tags) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            s sVar = new s((String) it.next(), id2);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.alpha;
            workDatabase_Impl.bravo();
            workDatabase_Impl.charlie();
            try {
                ((b) this.purple).oscar(sVar);
                workDatabase_Impl.papa();
            } finally {
                workDatabase_Impl.kilo();
            }
        }
    }

    @Override // W2.f
    public void shutdown() {
        ((ConnectivityManager) this.alpha).unregisterNetworkCallback((F2.d) this.red);
    }

    public boolean sierra() {
        if (((af) this.alpha).getValue() == this.red) {
            t tVar = (t) this.purple;
            if (tVar == null || !tVar.sierra()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void tango(aa aaVar) {
        O6.e eVar = (O6.e) this.red;
        if (eVar != null) {
            eVar.run();
        }
        O6.e eVar2 = new O6.e((an) this.alpha, aaVar);
        this.red = eVar2;
        Handler handler = (Handler) this.purple;
        Intrinsics.checkNotNull(eVar2);
        handler.postAtFrontOfQueue(eVar2);
    }

    public void victor(InterfaceC0364r interfaceC0364r) {
        ((c0.b) this.red).alpha.charlie = interfaceC0364r;
    }

    public void whiskey(Q0.d dVar) {
        ((c0.b) this.red).alpha.alpha = dVar;
    }

    public void xray(Q0.n nVar) {
        ((c0.b) this.red).alpha.bravo = nVar;
    }

    public void yankee(long j5) {
        ((c0.b) this.red).alpha.delta = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B zulu(ve.i arrayType, De.a aVar, boolean z2) {
        ab abVar;
        me.j jVar;
        int i4 = 1;
        Intrinsics.echo(arrayType, "arrayType");
        ve.ad adVar = arrayType.bravo;
        if (adVar instanceof ab) {
            abVar = (ab) adVar;
        } else {
            abVar = null;
        }
        if (abVar != null) {
            Class cls = abVar.alpha;
            if (!Intrinsics.areEqual(cls, Void.TYPE)) {
                jVar = Ve.c.bravo(cls.getName()).delta();
                B9.ab abVar2 = (B9.ab) this.alpha;
                Be.c cVar = new Be.c(abVar2, arrayType, true);
                Be.a aVar2 = (Be.a) abVar2.purple;
                boolean z10 = aVar.delta;
                if (jVar == null) {
                    ae papa = aVar2.oscar.silver.papa(jVar);
                    y kilo = O5.kilo(papa, new C2473i(1, ArraysKt.b(new InterfaceC2472h[]{papa.getAnnotations(), cVar})));
                    Intrinsics.charlie(kilo, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
                    ae aeVar = (ae) kilo;
                    if (z10) {
                        return aeVar;
                    }
                    return kotlin.reflect.jvm.internal.impl.types.ab.alpha(aeVar, aeVar.pink(true));
                }
                y amber = amber(adVar, G4.delta(2, z10, null, 6));
                if (z10) {
                    if (z2) {
                        i4 = 3;
                    }
                    return aVar2.oscar.silver.golf(i4, amber, cVar);
                }
                return kotlin.reflect.jvm.internal.impl.types.ab.alpha(aVar2.oscar.silver.golf(1, amber, cVar), aVar2.oscar.silver.golf(3, amber, cVar).pink(true));
            }
        }
        jVar = null;
        B9.ab abVar22 = (B9.ab) this.alpha;
        Be.c cVar2 = new Be.c(abVar22, arrayType, true);
        Be.a aVar22 = (Be.a) abVar22.purple;
        boolean z102 = aVar.delta;
        if (jVar == null) {
        }
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3) {
        this.alpha = obj;
        this.purple = obj2;
        this.red = obj3;
    }

    public /* synthetic */ t(boolean z2, Object obj, Object obj2, Object obj3) {
        this.red = obj;
        this.alpha = obj2;
        this.purple = obj3;
    }

    public t(ConnectivityManager connectivityManager, a3.n nVar) {
        this.alpha = connectivityManager;
        this.purple = nVar;
        F2.d dVar = new F2.d(3, this);
        this.red = dVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), dVar);
    }

    public t(af afVar, t tVar) {
        this.alpha = afVar;
        this.purple = tVar;
        this.red = afVar.getValue();
    }

    public t(int i4) {
        int i5 = 5;
        switch (i4) {
            case 14:
                this.alpha = new w(16);
                long[] jArr = au.alpha;
                this.purple = new al();
                this.red = new u(i5);
                return;
            case 15:
                this.red = new u(i5);
                return;
            default:
                List list = Collections.EMPTY_LIST;
                this.alpha = list;
                this.purple = list;
                return;
        }
    }
}
