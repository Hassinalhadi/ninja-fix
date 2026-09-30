package kd;

import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.mlkit.vision.barcode.common.Barcode;
import ge.InterfaceC1772d;
import id.C1914b;
import id.C1915c;
import io.ktor.utils.io.aq;
import io.ktor.utils.io.charsets.MalformedInputException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import od.InterfaceC2225b;
import pd.AbstractC2304b;
import qd.C2464b;
import s6.AbstractC2626c6;
import s6.AbstractC2635d6;
import s6.AbstractC2742p5;
import s6.AbstractC2761r7;
import s6.AbstractC2781u0;
import s6.R4;
import s6.Z4;
import t6.AbstractC2981d2;
import t6.AbstractC2991f2;
import t6.AbstractC3006i2;
import t6.a4;
import vf.C3195B;
import vf.ao;
import zd.C3509a;

/* loaded from: classes2.dex */
public abstract class aa {
    public static final C3509a alpha;
    public static final C3509a bravo;
    public static final C1915c charlie;

    static {
        ge.w wVar;
        InterfaceC1772d bravo2 = kotlin.jvm.internal.u.alpha.bravo(d.class);
        ge.w wVar2 = null;
        try {
            wVar = kotlin.jvm.internal.u.alpha(d.class);
        } catch (Throwable unused) {
            wVar = null;
        }
        alpha = new C3509a("CallLogger", new Ed.a(bravo2, wVar));
        InterfaceC1772d bravo3 = kotlin.jvm.internal.u.alpha.bravo(Unit.class);
        try {
            wVar2 = kotlin.jvm.internal.u.alpha(Unit.class);
        } catch (Throwable unused2) {
        }
        bravo = new C3509a("DisableLogging", new Ed.a(bravo3, wVar2));
        charlie = AbstractC2742p5.alpha("Logging", m.alpha, new hd.l(29));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v0, types: [Gf.a, java.lang.Object, Gf.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable alpha(C1914b c1914b, io.ktor.utils.io.t tVar, Long l10, sd.e eVar, sd.m mVar, Pd.c cVar) {
        q qVar;
        int i4;
        Charset charset;
        byte[] buffer;
        C1914b c1914b2;
        Charset charset2;
        Object obj;
        int i5;
        int intValue;
        String str;
        int i10;
        boolean z2;
        int i11;
        io.ktor.utils.io.m mVar2;
        int i12;
        int i13;
        io.ktor.utils.io.t tVar2 = tVar;
        Long l11 = l10;
        int i14 = 1;
        if (cVar instanceof q) {
            q qVar2 = (q) cVar;
            int i15 = qVar2.f12935t;
            if ((i15 & RecyclerView.UNDEFINED_DURATION) != 0) {
                qVar2.f12935t = i15 - RecyclerView.UNDEFINED_DURATION;
                qVar = qVar2;
                Object obj2 = qVar.f12934s;
                Od.a aVar = Od.a.alpha;
                i4 = qVar.f12935t;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            i11 = qVar.yellow;
                            i12 = qVar.white;
                            mVar2 = (io.ktor.utils.io.m) qVar.alpha;
                            ResultKt.alpha(obj2);
                            i13 = 1;
                            long longValue = ((Number) obj2).longValue();
                            boolean z10 = i13;
                            if (i12 == 0) {
                                z10 = 0;
                            }
                            return new Triple(Boolean.valueOf(z10), new Long(longValue + i11), mVar2);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i16 = qVar.white;
                    byte[] bArr = qVar.teal;
                    Charset charset3 = qVar.silver;
                    Long l12 = qVar.red;
                    io.ktor.utils.io.t tVar3 = qVar.purple;
                    C1914b c1914b3 = (C1914b) qVar.alpha;
                    ResultKt.alpha(obj2);
                    i5 = i16;
                    tVar2 = tVar3;
                    c1914b2 = c1914b3;
                    charset2 = charset3;
                    obj = obj2;
                    buffer = bArr;
                    l11 = l12;
                } else {
                    ResultKt.alpha(obj2);
                    List list = sd.q.alpha;
                    if (mVar.india()) {
                        return new Triple(Boolean.TRUE, l11, tVar2);
                    }
                    if (eVar != null) {
                        charset = AbstractC2981d2.alpha(eVar);
                        if (charset == null) {
                            charset = kotlin.text.a.alpha;
                        }
                    } else {
                        charset = kotlin.text.a.alpha;
                    }
                    Charset charset4 = charset;
                    buffer = new byte[Barcode.FORMAT_UPC_E];
                    c1914b2 = c1914b;
                    qVar.alpha = c1914b2;
                    qVar.purple = tVar2;
                    qVar.red = l11;
                    qVar.silver = charset4;
                    qVar.teal = buffer;
                    qVar.white = 0;
                    qVar.f12935t = 1;
                    Object india = io.ktor.utils.io.ak.india(tVar2, buffer, Barcode.FORMAT_UPC_E, qVar);
                    if (india != aVar) {
                        charset2 = charset4;
                        obj = india;
                        i5 = 0;
                    }
                    return aVar;
                }
                intValue = ((Number) obj).intValue();
                if (intValue >= 1) {
                    return new Triple(Boolean.FALSE, new Long(0L), tVar2);
                }
                ?? obj3 = new Object();
                Intrinsics.echo(buffer, "buffer");
                obj3.uniform(intValue, buffer);
                try {
                    CharsetDecoder newDecoder = charset2.newDecoder();
                    Intrinsics.delta(newDecoder, "newDecoder(...)");
                    str = R4.bravo(newDecoder, obj3);
                } catch (MalformedInputException unused) {
                    str = "";
                    i5 = 1;
                }
                if (i5 == 0) {
                    int length = str.length();
                    int i17 = -1;
                    for (int i18 = 0; i18 < length; i18++) {
                        str.charAt(i18);
                        i17++;
                    }
                    int length2 = str.length();
                    int i19 = 0;
                    while (i19 < length2) {
                        int i20 = i14;
                        if (str.charAt(i19) == 65533 && i19 != i17) {
                            i5 = i20 == true ? 1 : 0;
                            i10 = i20;
                            break;
                        }
                        i19++;
                        i14 = i20 == true ? 1 : 0;
                    }
                }
                i10 = i14;
                if (i5 == 0) {
                    io.ktor.utils.io.m mVar3 = new io.ktor.utils.io.m(false);
                    cd.c cVar2 = c1914b2.alpha;
                    r rVar = new r(mVar3, buffer, intValue, tVar2, null);
                    i11 = intValue;
                    vf.ah golf = vf.ad.golf(cVar2, null, rVar, 3);
                    qVar.alpha = mVar3;
                    qVar.purple = null;
                    qVar.red = null;
                    qVar.silver = null;
                    qVar.teal = null;
                    qVar.white = i5;
                    qVar.yellow = i11;
                    qVar.f12935t = 2;
                    Object tango = golf.tango(qVar);
                    Od.a aVar2 = Od.a.alpha;
                    if (tango != aVar) {
                        mVar2 = mVar3;
                        i12 = i5;
                        obj2 = tango;
                        i13 = i10;
                        long longValue2 = ((Number) obj2).longValue();
                        boolean z102 = i13;
                        if (i12 == 0) {
                        }
                        return new Triple(Boolean.valueOf(z102), new Long(longValue2 + i11), mVar2);
                    }
                    return aVar;
                }
                io.ktor.utils.io.t tVar4 = tVar2;
                if (i5 != 0) {
                    z2 = i10 == true ? 1 : 0;
                } else {
                    z2 = false;
                }
                return new Triple(Boolean.valueOf(z2), l11, tVar4);
            }
        }
        qVar = new Pd.c(cVar);
        Object obj22 = qVar.f12934s;
        Od.a aVar3 = Od.a.alpha;
        i4 = qVar.f12935t;
        if (i4 == 0) {
        }
        intValue = ((Number) obj).intValue();
        if (intValue >= 1) {
        }
    }

    public static final boolean bravo(e eVar) {
        if (eVar != e.white && eVar != e.silver) {
            return false;
        }
        return true;
    }

    public static final boolean charlie(e eVar) {
        if (eVar == e.teal) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object delta(C1914b c1914b, vd.e eVar, sd.s sVar, sd.o oVar, ArrayList arrayList, Pd.c cVar) {
        Pd.c cVar2;
        int i4;
        io.ktor.utils.io.t tVar;
        vd.e eVar2;
        io.ktor.utils.io.t tVar2;
        vd.e eVar3;
        if (cVar instanceof s) {
            s sVar2 = (s) cVar;
            int i5 = sVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                sVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                cVar2 = sVar2;
                s sVar3 = cVar2;
                Object obj = sVar3.red;
                Od.a aVar = Od.a.alpha;
                i4 = sVar3.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    tVar = sVar3.purple;
                                    eVar2 = sVar3.alpha;
                                    ResultKt.alpha(obj);
                                    return new f(eVar2, tVar);
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            tVar2 = sVar3.purple;
                            eVar3 = sVar3.alpha;
                            ResultKt.alpha(obj);
                            return new f(eVar3, tVar2);
                        }
                        ResultKt.alpha(obj);
                        return obj;
                    }
                    ResultKt.alpha(obj);
                    return null;
                }
                ResultKt.alpha(obj);
                if (eVar instanceof vd.c) {
                    byte[] echo = ((vd.c) eVar).echo();
                    Long l10 = new Long(echo.length);
                    aq alpha2 = io.ktor.utils.io.ak.alpha(echo);
                    sVar3.silver = 1;
                    if (echo(c1914b, eVar, l10, oVar, sVar, arrayList, alpha2, sVar3) != aVar) {
                        return null;
                    }
                } else {
                    if (eVar instanceof C2464b) {
                        arrayList.add("--> END ".concat(sVar.alpha));
                        return null;
                    }
                    if (eVar instanceof vd.d) {
                        Pair charlie2 = a4.charlie(((vd.d) eVar).echo(), c1914b.alpha);
                        io.ktor.utils.io.t tVar3 = (io.ktor.utils.io.t) charlie2.first;
                        io.ktor.utils.io.t tVar4 = (io.ktor.utils.io.t) charlie2.second;
                        Long alpha3 = eVar.alpha();
                        sVar3.alpha = eVar;
                        sVar3.purple = tVar3;
                        sVar3.silver = 3;
                        if (echo(c1914b, eVar, alpha3, oVar, sVar, arrayList, tVar4, sVar3) != aVar) {
                            tVar2 = tVar3;
                            eVar3 = eVar;
                            return new f(eVar3, tVar2);
                        }
                    } else if (eVar instanceof vd.a) {
                        io.ktor.utils.io.m mVar = new io.ktor.utils.io.m(false);
                        vf.ad.zulu(c1914b.alpha, null, null, new t(eVar, mVar, null), 3);
                        Pair charlie3 = a4.charlie(mVar, c1914b.alpha);
                        io.ktor.utils.io.t tVar5 = (io.ktor.utils.io.t) charlie3.first;
                        io.ktor.utils.io.t tVar6 = (io.ktor.utils.io.t) charlie3.second;
                        ((vd.a) eVar).getClass();
                        sVar3.alpha = eVar;
                        sVar3.purple = tVar5;
                        sVar3.silver = 4;
                        if (echo(c1914b, eVar, null, oVar, sVar, arrayList, tVar6, sVar3) != aVar) {
                            tVar = tVar5;
                            eVar2 = eVar;
                            return new f(eVar2, tVar);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return aVar;
            }
        }
        cVar2 = new Pd.c(cVar);
        s sVar32 = cVar2;
        Object obj2 = sVar32.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = sVar32.silver;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object echo(C1914b c1914b, vd.e eVar, Long l10, sd.o oVar, sd.s sVar, ArrayList arrayList, io.ktor.utils.io.t tVar, Pd.c cVar) {
        Pd.c cVar2;
        int i4;
        sd.s sVar2;
        Object obj;
        sd.m mVar;
        List list;
        boolean booleanValue;
        String str;
        Charset charset;
        List list2;
        sd.s sVar3;
        Long l11;
        if (cVar instanceof u) {
            u uVar = (u) cVar;
            int i5 = uVar.yellow;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                uVar.yellow = i5 - RecyclerView.UNDEFINED_DURATION;
                cVar2 = uVar;
                u uVar2 = cVar2;
                Object obj2 = uVar2.white;
                Od.a aVar = Od.a.alpha;
                i4 = uVar2.yellow;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            list = uVar2.teal;
                            charset = (Charset) uVar2.silver;
                            l11 = (Long) uVar2.red;
                            list2 = (List) uVar2.purple;
                            sVar3 = (sd.s) uVar2.alpha;
                            ResultKt.alpha(obj2);
                            list.add(Z4.bravo((Gf.i) obj2, charset, 2));
                            list2.add("--> END " + sVar3.alpha + " (" + l11 + "-byte body)");
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) uVar2.silver;
                    sd.s sVar4 = (sd.s) uVar2.red;
                    mVar = (sd.m) uVar2.purple;
                    vd.e eVar2 = (vd.e) uVar2.alpha;
                    ResultKt.alpha(obj2);
                    sVar2 = sVar4;
                    eVar = eVar2;
                    obj = obj2;
                } else {
                    ResultKt.alpha(obj2);
                    sd.e bravo2 = eVar.bravo();
                    uVar2.alpha = eVar;
                    uVar2.purple = oVar;
                    sVar2 = sVar;
                    uVar2.red = sVar2;
                    uVar2.silver = arrayList;
                    uVar2.yellow = 1;
                    Serializable alpha2 = alpha(c1914b, tVar, l10, bravo2, oVar, uVar2);
                    if (alpha2 != aVar) {
                        obj = alpha2;
                        mVar = oVar;
                        list = arrayList;
                    }
                    return aVar;
                }
                Triple triple = (Triple) obj;
                booleanValue = ((Boolean) triple.first).booleanValue();
                Long l12 = (Long) triple.second;
                io.ktor.utils.io.t tVar2 = (io.ktor.utils.io.t) triple.third;
                if (booleanValue) {
                    sd.e bravo3 = eVar.bravo();
                    if (bravo3 != null) {
                        charset = AbstractC2981d2.alpha(bravo3);
                        if (charset == null) {
                            charset = kotlin.text.a.alpha;
                        }
                    } else {
                        charset = kotlin.text.a.alpha;
                    }
                    uVar2.alpha = sVar2;
                    uVar2.purple = list;
                    uVar2.red = l12;
                    uVar2.silver = charset;
                    uVar2.teal = list;
                    uVar2.yellow = 2;
                    Object mike = io.ktor.utils.io.ak.mike(tVar2, uVar2);
                    if (mike != aVar) {
                        list2 = list;
                        sVar3 = sVar2;
                        obj2 = mike;
                        l11 = l12;
                        list.add(Z4.bravo((Gf.i) obj2, charset, 2));
                        list2.add("--> END " + sVar3.alpha + " (" + l11 + "-byte body)");
                        return Unit.INSTANCE;
                    }
                    return aVar;
                }
                List list3 = sd.q.alpha;
                if (mVar.india()) {
                    str = "encoded";
                } else {
                    str = "binary";
                }
                if (l12 != null) {
                    list.add("--> END " + sVar2.alpha + " (" + str + ' ' + l12 + "-byte body omitted)");
                } else {
                    list.add(com.google.android.material.datepicker.j.lima(new StringBuilder("--> END "), sVar2.alpha, " (", str, " body omitted)"));
                }
                return Unit.INSTANCE;
            }
        }
        cVar2 = new Pd.c(cVar);
        u uVar22 = cVar2;
        Object obj22 = uVar22.white;
        Od.a aVar2 = Od.a.alpha;
        i4 = uVar22.yellow;
        if (i4 == 0) {
        }
        Triple triple2 = (Triple) obj;
        booleanValue = ((Boolean) triple2.first).booleanValue();
        Long l122 = (Long) triple2.second;
        io.ktor.utils.io.t tVar22 = (io.ktor.utils.io.t) triple2.third;
        if (booleanValue) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0082, code lost:
    
        if (r3 == r2) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kd.x, Pd.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object foxtrot(C1914b c1914b, AbstractC2304b abstractC2304b, io.ktor.utils.io.t tVar, ArrayList arrayList, Pd.c cVar) {
        Pd.c cVar2;
        int i4;
        AbstractC2304b abstractC2304b2;
        Object alpha2;
        ArrayList arrayList2;
        boolean booleanValue;
        Long l10;
        long j5;
        String str;
        Charset charset;
        Charset charset2;
        long j6;
        List list;
        ArrayList arrayList3;
        ArrayList arrayList4 = arrayList;
        if (cVar instanceof x) {
            x xVar = (x) cVar;
            int i5 = xVar.yellow;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                xVar.yellow = i5 - RecyclerView.UNDEFINED_DURATION;
                cVar2 = xVar;
                ?? r82 = cVar2;
                Object obj = r82.white;
                Od.a aVar = Od.a.alpha;
                i4 = r82.yellow;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            j6 = r82.teal;
                            ?? r02 = r82.silver;
                            charset2 = r82.red;
                            l10 = (Long) r82.purple;
                            list = (List) r82.alpha;
                            ResultKt.alpha(obj);
                            arrayList3 = r02;
                            arrayList3.add(Z4.bravo((Gf.i) obj, charset2, 2));
                            list.add("<-- END HTTP (" + j6 + "ms, " + l10 + "-byte body)");
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r03 = (List) r82.purple;
                    AbstractC2304b abstractC2304b3 = (AbstractC2304b) r82.alpha;
                    ResultKt.alpha(obj);
                    alpha2 = obj;
                    abstractC2304b2 = abstractC2304b3;
                    arrayList2 = r03;
                } else {
                    ResultKt.alpha(obj);
                    arrayList4.add("");
                    Long alpha3 = AbstractC2991f2.alpha(abstractC2304b);
                    sd.e charlie2 = AbstractC2991f2.charlie(abstractC2304b);
                    sd.m alpha4 = abstractC2304b.alpha();
                    abstractC2304b2 = abstractC2304b;
                    r82.alpha = abstractC2304b2;
                    r82.purple = arrayList4;
                    r82.yellow = 1;
                    alpha2 = alpha(c1914b, tVar, alpha3, charlie2, alpha4, r82);
                    arrayList2 = arrayList4;
                }
                Triple triple = (Triple) alpha2;
                booleanValue = ((Boolean) triple.first).booleanValue();
                l10 = (Long) triple.second;
                io.ktor.utils.io.t tVar2 = (io.ktor.utils.io.t) triple.third;
                j5 = abstractC2304b2.foxtrot().f771b - abstractC2304b2.echo().f771b;
                if (l10 != null && l10.longValue() == 0) {
                    arrayList2.add("<-- END HTTP (" + j5 + "ms, " + l10 + "-byte body)");
                    return Unit.INSTANCE;
                }
                if (booleanValue) {
                    sd.e charlie3 = AbstractC2991f2.charlie(abstractC2304b2);
                    if (charlie3 != null) {
                        charset = AbstractC2981d2.alpha(charlie3);
                        if (charset == null) {
                            charset = kotlin.text.a.alpha;
                        }
                    } else {
                        charset = kotlin.text.a.alpha;
                    }
                    charset2 = charset;
                    r82.alpha = arrayList2;
                    r82.purple = l10;
                    r82.red = charset2;
                    r82.silver = arrayList2;
                    r82.teal = j5;
                    r82.yellow = 2;
                    obj = io.ktor.utils.io.ak.mike(tVar2, r82);
                    if (obj != aVar) {
                        j6 = j5;
                        list = arrayList2;
                        arrayList3 = arrayList2;
                        arrayList3.add(Z4.bravo((Gf.i) obj, charset2, 2));
                        list.add("<-- END HTTP (" + j6 + "ms, " + l10 + "-byte body)");
                        return Unit.INSTANCE;
                    }
                    return aVar;
                }
                sd.m alpha5 = abstractC2304b2.alpha();
                List list2 = sd.q.alpha;
                if (alpha5.india()) {
                    str = "encoded";
                } else {
                    str = "binary";
                }
                if (l10 != null) {
                    arrayList2.add("<-- END HTTP (" + j5 + "ms, " + str + ' ' + l10 + "-byte body omitted)");
                } else {
                    arrayList2.add("<-- END HTTP (" + j5 + "ms, " + str + " body omitted)");
                }
                return Unit.INSTANCE;
            }
        }
        cVar2 = new Pd.c(cVar);
        ?? r822 = cVar2;
        Object obj2 = r822.white;
        Od.a aVar2 = Od.a.alpha;
        i4 = r822.yellow;
        if (i4 == 0) {
        }
        Triple triple2 = (Triple) alpha2;
        booleanValue = ((Boolean) triple2.first).booleanValue();
        l10 = (Long) triple2.second;
        io.ktor.utils.io.t tVar22 = (io.ktor.utils.io.t) triple2.third;
        j5 = abstractC2304b2.foxtrot().f771b - abstractC2304b2.echo().f771b;
        if (l10 != null) {
            arrayList2.add("<-- END HTTP (" + j5 + "ms, " + l10 + "-byte body)");
            return Unit.INSTANCE;
        }
        if (booleanValue) {
        }
    }

    public static final Object golf(g gVar, e eVar, ArrayList arrayList, C2226c c2226c, n nVar) {
        Charset charset;
        Object obj = c2226c.delta;
        Intrinsics.charlie(obj, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        vd.e eVar2 = (vd.e) obj;
        d dVar = new d(gVar);
        c2226c.foxtrot.foxtrot(alpha, dVar);
        StringBuilder sb2 = new StringBuilder();
        if (eVar.alpha) {
            sb2.append("REQUEST: " + AbstractC3006i2.bravo(c2226c.alpha));
            sb2.append('\n');
            sb2.append("METHOD: " + c2226c.bravo);
            sb2.append('\n');
        }
        if (eVar.purple) {
            sb2.append("COMMON HEADERS\n");
            AbstractC2626c6.charlie(sb2, c2226c.charlie.foxtrot(), arrayList);
            sb2.append("CONTENT HEADERS");
            sb2.append('\n');
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    Long alpha2 = eVar2.alpha();
                    if (alpha2 != null) {
                        long longValue = alpha2.longValue();
                        List list = sd.q.alpha;
                        AbstractC2626c6.bravo(sb2, "Content-Length", String.valueOf(longValue));
                    }
                    sd.e bravo2 = eVar2.bravo();
                    if (bravo2 != null) {
                        List list2 = sd.q.alpha;
                        AbstractC2626c6.bravo(sb2, CtApi.HEADER_CONTENT_TYPE, bravo2.toString());
                    }
                    AbstractC2626c6.charlie(sb2, eVar2.charlie().foxtrot(), arrayList);
                } else {
                    throw ao.ad.yankee(it2);
                }
            } else {
                throw ao.ad.yankee(it);
            }
        }
        String sb3 = sb2.toString();
        if (sb3.length() > 0) {
            dVar.charlie(sb3);
        }
        if (sb3.length() == 0 || !eVar.red) {
            dVar.alpha();
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("BODY Content-Type: " + eVar2.bravo());
        sb4.append('\n');
        sd.e bravo3 = eVar2.bravo();
        if (bravo3 == null || (charset = AbstractC2981d2.alpha(bravo3)) == null) {
            charset = kotlin.text.a.alpha;
        }
        Charset charset2 = charset;
        io.ktor.utils.io.m mVar = new io.ktor.utils.io.m(false);
        vf.ad.zulu(C3195B.alpha, ao.alpha.plus(new Df.a()), null, new v(mVar, charset2, sb4, dVar, null), 2);
        return AbstractC2635d6.bravo(eVar2, mVar, nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x02a7, code lost:
    
        if (r2 == r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02be, code lost:
    
        if (r2 == r6) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r11v0, types: [sd.n, zd.q, G3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object hotel(ArrayList arrayList, e eVar, C1914b c1914b, C2226c c2226c, ArrayList arrayList2, Pd.c cVar) {
        Pd.c cVar2;
        int i4;
        boolean z2;
        Long l10;
        Long l11;
        sd.o oVar;
        String str;
        boolean z10;
        long j5;
        if (cVar instanceof w) {
            w wVar = (w) cVar;
            int i5 = wVar.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                wVar.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                cVar2 = wVar;
                w wVar2 = cVar2;
                Object obj = wVar2.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = wVar2.purple;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return (vd.e) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                    return (vd.e) obj;
                }
                ResultKt.alpha(obj);
                if (eVar == e.f12929a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return null;
                }
                sd.aa aaVar = new sd.aa();
                AbstractC3006i2.delta(aaVar, c2226c.alpha);
                String kilo = kilo(aaVar.bravo());
                Object obj2 = c2226c.delta;
                ?? aVar2 = new G3.a(10);
                boolean z11 = obj2 instanceof vd.e;
                if (z11 && !Intrinsics.areEqual(c2226c.bravo, sd.s.bravo) && !Intrinsics.areEqual(c2226c.bravo, sd.s.delta) && !(obj2 instanceof C2464b)) {
                    vd.e eVar2 = (vd.e) obj2;
                    sd.e bravo2 = eVar2.bravo();
                    if (bravo2 != null) {
                        List list = sd.q.alpha;
                        String value = bravo2.toString();
                        Intrinsics.echo(value, "value");
                        l10 = null;
                        if (!aVar2.H(CtApi.HEADER_CONTENT_TYPE)) {
                            aVar2.F(CtApi.HEADER_CONTENT_TYPE, value);
                        }
                    } else {
                        l10 = null;
                    }
                    Long alpha2 = eVar2.alpha();
                    if (alpha2 != null) {
                        long longValue = alpha2.longValue();
                        List list2 = sd.q.alpha;
                        String value2 = String.valueOf(longValue);
                        Intrinsics.echo(value2, "value");
                        if (!aVar2.H("Content-Length")) {
                            aVar2.F("Content-Length", value2);
                        }
                    }
                } else {
                    l10 = null;
                }
                sd.n nVar = c2226c.charlie;
                tg.k.alpha(aVar2, nVar);
                sd.o X10 = aVar2.X();
                List list3 = sd.q.alpha;
                String str2 = X10.get("Content-Length");
                if (str2 != null) {
                    l11 = kotlin.text.r.uniform(str2);
                } else {
                    l11 = l10;
                }
                if (Intrinsics.areEqual(c2226c.bravo, sd.s.bravo) || Intrinsics.areEqual(c2226c.bravo, sd.s.delta) || (((charlie(eVar) || bravo(eVar)) && l11 != null) || ((charlie(eVar) && l11 == null) || X10.india()))) {
                    oVar = X10;
                    str = "--> " + c2226c.bravo.alpha + ' ' + kilo;
                } else {
                    if (eVar == e.yellow) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && l11 != null) {
                        str = "--> " + c2226c.bravo.alpha + ' ' + kilo + " (" + l11 + "-byte body)";
                        oVar = X10;
                    } else if ((obj2 instanceof vd.a) || (obj2 instanceof vd.d)) {
                        oVar = X10;
                        str = "--> " + c2226c.bravo.alpha + ' ' + kilo + " (unknown-byte body)";
                    } else {
                        Object obj3 = c2226c.delta;
                        if (obj3 instanceof vd.e) {
                            vd.e eVar3 = (vd.e) obj3;
                            if (eVar3 instanceof vd.c) {
                                oVar = X10;
                                j5 = ((vd.c) obj3).echo().length;
                            } else {
                                oVar = X10;
                                if (eVar3 instanceof C2464b) {
                                    j5 = 0;
                                } else {
                                    throw new IllegalStateException(("Unable to calculate the size for type " + kotlin.jvm.internal.u.alpha.bravo(obj3.getClass()).kilo()).toString());
                                }
                            }
                            StringBuilder sb2 = new StringBuilder("--> ");
                            sb2.append(c2226c.bravo.alpha);
                            sb2.append(' ');
                            sb2.append(kilo);
                            sb2.append(" (");
                            str = Q0.c.mike(j5, "-byte body)", sb2);
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
                arrayList2.add(str);
                if (!charlie(eVar) && !bravo(eVar)) {
                    return l10;
                }
                for (Map.Entry entry : oVar.foxtrot()) {
                    String str3 = (String) entry.getKey();
                    List list4 = (List) entry.getValue();
                    Iterator it = arrayList.iterator();
                    if (!it.hasNext()) {
                        StringBuilder beige = ao.ad.beige(str3, ": ");
                        beige.append(CollectionsKt.maroon(list4, ", ", null, null, null, 62));
                        arrayList2.add(beige.toString());
                    } else {
                        throw ao.ad.yankee(it);
                    }
                }
                if (bravo(eVar) && !Intrinsics.areEqual(c2226c.bravo, sd.s.bravo) && !Intrinsics.areEqual(c2226c.bravo, sd.s.delta)) {
                    arrayList2.add("");
                    if (!z11) {
                        arrayList2.add("--> END ".concat(c2226c.bravo.alpha));
                        return l10;
                    }
                    List list5 = sd.q.alpha;
                    if (Intrinsics.areEqual(nVar.K("Content-Encoding"), "gzip")) {
                        sd.s sVar = c2226c.bravo;
                        wVar2.purple = 1;
                        obj = delta(c1914b, (vd.e) obj2, sVar, oVar, arrayList2, wVar2);
                    } else {
                        sd.s sVar2 = c2226c.bravo;
                        wVar2.purple = 2;
                        obj = delta(c1914b, (vd.e) obj2, sVar2, oVar, arrayList2, wVar2);
                    }
                    return aVar;
                }
                arrayList2.add("--> END ".concat(c2226c.bravo.alpha));
                return l10;
            }
        }
        cVar2 = new Pd.c(cVar);
        w wVar22 = cVar2;
        Object obj4 = wVar22.alpha;
        Od.a aVar3 = Od.a.alpha;
        i4 = wVar22.purple;
        if (i4 == 0) {
        }
    }

    public static final void india(e eVar, StringBuilder sb2, InterfaceC2225b interfaceC2225b, Throwable th) {
        if (!eVar.alpha) {
            return;
        }
        sb2.append("RESPONSE " + interfaceC2225b.getUrl() + " failed with exception: " + th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object juliet(ArrayList arrayList, e eVar, C1914b c1914b, AbstractC2304b abstractC2304b, ArrayList arrayList2, Pd.c cVar) {
        y yVar;
        int i4;
        Long l10;
        String mike;
        AbstractC2304b abstractC2304b2;
        io.ktor.utils.io.t tVar;
        if (cVar instanceof y) {
            y yVar2 = (y) cVar;
            int i5 = yVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                yVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                yVar = yVar2;
                Object obj = yVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = yVar.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            tVar = yVar.purple;
                            abstractC2304b2 = yVar.alpha;
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC2304b abstractC2304b3 = yVar.alpha;
                        ResultKt.alpha(obj);
                        return abstractC2304b3;
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (eVar == e.f12929a) {
                        return abstractC2304b;
                    }
                    sd.m alpha2 = abstractC2304b.alpha();
                    List list = sd.q.alpha;
                    String str = alpha2.get("Content-Length");
                    if (str != null) {
                        l10 = kotlin.text.r.uniform(str);
                    } else {
                        l10 = null;
                    }
                    InterfaceC2225b bravo2 = AbstractC2761r7.bravo(abstractC2304b);
                    long j5 = abstractC2304b.foxtrot().f771b - abstractC2304b.echo().f771b;
                    if (Intrinsics.areEqual(abstractC2304b.alpha().get("Transfer-Encoding"), "chunked") && (eVar == e.yellow || charlie(eVar))) {
                        StringBuilder sb2 = new StringBuilder("<-- ");
                        sb2.append(abstractC2304b.golf());
                        sb2.append(' ');
                        sb2.append(kilo(bravo2.getUrl()));
                        sb2.append(" (");
                        mike = Q0.c.mike(j5, "ms, unknown-byte body)", sb2);
                    } else {
                        e eVar2 = e.yellow;
                        if (eVar == eVar2 && l10 != null) {
                            mike = "<-- " + abstractC2304b.golf() + ' ' + kilo(bravo2.getUrl()) + " (" + j5 + "ms, " + l10 + "-byte body)";
                        } else if (!bravo(eVar) && ((eVar != eVar2 || l10 != null) && ((!charlie(eVar) || l10 == null) && !Intrinsics.areEqual(abstractC2304b.alpha().get("Content-Encoding"), "gzip")))) {
                            StringBuilder sb3 = new StringBuilder("<-- ");
                            sb3.append(abstractC2304b.golf());
                            sb3.append(' ');
                            sb3.append(kilo(bravo2.getUrl()));
                            sb3.append(" (");
                            mike = Q0.c.mike(j5, "ms, unknown-byte body)", sb3);
                        } else {
                            StringBuilder sb4 = new StringBuilder("<-- ");
                            sb4.append(abstractC2304b.golf());
                            sb4.append(' ');
                            sb4.append(kilo(bravo2.getUrl()));
                            sb4.append(" (");
                            mike = Q0.c.mike(j5, "ms)", sb4);
                        }
                    }
                    arrayList2.add(mike);
                    if (charlie(eVar) || bravo(eVar)) {
                        for (Map.Entry entry : abstractC2304b.alpha().foxtrot()) {
                            String str2 = (String) entry.getKey();
                            List list2 = (List) entry.getValue();
                            Iterator it = arrayList.iterator();
                            if (!it.hasNext()) {
                                StringBuilder beige = ao.ad.beige(str2, ": ");
                                beige.append(CollectionsKt.maroon(list2, ", ", null, null, null, 62));
                                arrayList2.add(beige.toString());
                            } else {
                                throw ao.ad.yankee(it);
                            }
                        }
                        if (!bravo(eVar)) {
                            arrayList2.add("<-- END HTTP");
                            return abstractC2304b;
                        }
                        if (l10 != null && l10.longValue() == 0) {
                            arrayList2.add("<-- END HTTP (" + j5 + "ms, " + l10 + "-byte body)");
                            return abstractC2304b;
                        }
                        if (Intrinsics.areEqual(AbstractC2991f2.charlie(abstractC2304b), sd.d.bravo)) {
                            arrayList2.add("<-- END HTTP (streaming)");
                            return abstractC2304b;
                        }
                        if (hd.n.bravo(abstractC2304b)) {
                            io.ktor.utils.io.t delta = abstractC2304b.delta();
                            yVar.alpha = abstractC2304b;
                            yVar.silver = 1;
                            if (foxtrot(c1914b, abstractC2304b, delta, arrayList2, yVar) == aVar) {
                            }
                        } else {
                            Pair charlie2 = a4.charlie(abstractC2304b.delta(), abstractC2304b);
                            io.ktor.utils.io.t tVar2 = (io.ktor.utils.io.t) charlie2.first;
                            io.ktor.utils.io.t tVar3 = (io.ktor.utils.io.t) charlie2.second;
                            yVar.alpha = abstractC2304b;
                            yVar.purple = tVar2;
                            yVar.silver = 2;
                            if (foxtrot(c1914b, abstractC2304b, tVar3, arrayList2, yVar) != aVar) {
                                abstractC2304b2 = abstractC2304b;
                                tVar = tVar2;
                            }
                        }
                        return aVar;
                    }
                    return abstractC2304b;
                }
                return AbstractC2781u0.bravo(abstractC2304b2.bravo(), new k(tVar, 0)).echo();
            }
        }
        yVar = new Pd.c(cVar);
        Object obj2 = yVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = yVar.silver;
        if (i4 == 0) {
        }
        return AbstractC2781u0.bravo(abstractC2304b2.bravo(), new k(tVar, 0)).echo();
    }

    public static final String kilo(sd.af afVar) {
        StringBuilder sb2 = new StringBuilder();
        if (((String) afVar.f13703b.getValue()).length() == 0) {
            sb2.append("/");
        } else {
            sb2.append((String) afVar.f13703b.getValue());
        }
        Lazy lazy = afVar.f13704c;
        if (((String) lazy.getValue()).length() != 0) {
            sb2.append("?");
            sb2.append((String) lazy.getValue());
        }
        return sb2.toString();
    }
}
