package s6;

import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pd.AbstractC2304b;
import t6.AbstractC2981d2;
import t6.AbstractC2991f2;

/* renamed from: s6.c6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2626c6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(StringBuilder sb2, sd.e eVar, io.ktor.utils.io.t tVar, Pd.c cVar) {
        kd.ab abVar;
        int i4;
        Charset charset;
        StringBuilder sb3;
        Charset charset2;
        String str;
        if (cVar instanceof kd.ab) {
            kd.ab abVar2 = (kd.ab) cVar;
            int i5 = abVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                abVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                abVar = abVar2;
                Object obj = abVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = abVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        charset2 = abVar.purple;
                        sb3 = abVar.alpha;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable unused) {
                            sb2 = sb3;
                            sb3 = sb2;
                            str = null;
                            if (str == null) {
                            }
                            sb3.append(str);
                            sb3.append("\nBODY END");
                            return Unit.INSTANCE;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    sb2.append("BODY Content-Type: " + eVar);
                    sb2.append('\n');
                    sb2.append("BODY START");
                    sb2.append('\n');
                    if (eVar == null || (charset = AbstractC2981d2.alpha(eVar)) == null) {
                        charset = kotlin.text.a.alpha;
                    }
                    try {
                        abVar.alpha = sb2;
                        abVar.purple = charset;
                        abVar.silver = 1;
                        obj = io.ktor.utils.io.ak.mike(tVar, abVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        Charset charset3 = charset;
                        sb3 = sb2;
                        charset2 = charset3;
                    } catch (Throwable unused2) {
                        sb3 = sb2;
                        str = null;
                        if (str == null) {
                        }
                        sb3.append(str);
                        sb3.append("\nBODY END");
                        return Unit.INSTANCE;
                    }
                }
                str = Z4.bravo((Gf.i) obj, charset2, 2);
                if (str == null) {
                    str = "[response body omitted]";
                }
                sb3.append(str);
                sb3.append("\nBODY END");
                return Unit.INSTANCE;
            }
        }
        abVar = new Pd.c(cVar);
        Object obj2 = abVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = abVar.silver;
        if (i4 == 0) {
        }
        str = Z4.bravo((Gf.i) obj2, charset2, 2);
        if (str == null) {
        }
        sb3.append(str);
        sb3.append("\nBODY END");
        return Unit.INSTANCE;
    }

    public static final void bravo(StringBuilder sb2, String key, String value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        sb2.append((CharSequence) ("-> " + key + ": " + value)).append('\n');
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
    public static final void charlie(StringBuilder sb2, Set headers, ArrayList sanitizedHeaders) {
        Intrinsics.echo(headers, "headers");
        Intrinsics.echo(sanitizedHeaders, "sanitizedHeaders");
        for (Map.Entry entry : CollectionsKt.p(CollectionsKt.z(headers), new Object())) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Iterator it = sanitizedHeaders.iterator();
            if (!it.hasNext()) {
                bravo(sb2, str, CollectionsKt.maroon(list, "; ", null, null, null, 62));
            } else {
                throw ao.ad.yankee(it);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r8.delta(r9, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (r8.delta(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (alpha(r10, r2, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object delta(kd.d dVar, AbstractC2304b abstractC2304b, Pd.c cVar) {
        kd.ad adVar;
        int i4;
        StringBuilder sb2;
        kd.d dVar2;
        if (cVar instanceof kd.ad) {
            kd.ad adVar2 = (kd.ad) cVar;
            int i5 = adVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                adVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                adVar = adVar2;
                Object obj = adVar.red;
                Object obj2 = Od.a.alpha;
                i4 = adVar.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3) {
                            if (i4 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) adVar.alpha;
                            ResultKt.alpha(obj);
                            throw th;
                        }
                        ResultKt.alpha(obj);
                        return Unit.INSTANCE;
                    }
                    StringBuilder sb3 = adVar.purple;
                    kd.d dVar3 = adVar.alpha;
                    try {
                        ResultKt.alpha(obj);
                        sb2 = sb3;
                        dVar2 = dVar3;
                    } catch (Throwable unused) {
                        sb2 = sb3;
                        dVar = dVar3;
                        String sb4 = sb2.toString();
                        Intrinsics.delta(sb4, "toString(...)");
                        String obj3 = StringsKt.b(sb4).toString();
                        adVar.alpha = null;
                        adVar.purple = null;
                        adVar.silver = 3;
                    }
                } else {
                    ResultKt.alpha(obj);
                    sb2 = new StringBuilder();
                    try {
                        sd.e charlie = AbstractC2991f2.charlie(abstractC2304b);
                        io.ktor.utils.io.t delta = abstractC2304b.delta();
                        adVar.alpha = dVar;
                        adVar.purple = sb2;
                        adVar.silver = 1;
                        dVar2 = dVar;
                    } catch (Throwable unused2) {
                        String sb42 = sb2.toString();
                        Intrinsics.delta(sb42, "toString(...)");
                        String obj32 = StringsKt.b(sb42).toString();
                        adVar.alpha = null;
                        adVar.purple = null;
                        adVar.silver = 3;
                    }
                }
                String sb5 = sb2.toString();
                Intrinsics.delta(sb5, "toString(...)");
                String obj4 = StringsKt.b(sb5).toString();
                adVar.alpha = null;
                adVar.purple = null;
                adVar.silver = 2;
            }
        }
        adVar = new Pd.c(cVar);
        Object obj5 = adVar.red;
        Object obj22 = Od.a.alpha;
        i4 = adVar.silver;
        if (i4 == 0) {
        }
        String sb52 = sb2.toString();
        Intrinsics.delta(sb52, "toString(...)");
        String obj42 = StringsKt.b(sb52).toString();
        adVar.alpha = null;
        adVar.purple = null;
        adVar.silver = 2;
    }

    public static final void echo(StringBuilder sb2, AbstractC2304b abstractC2304b, kd.e level, ArrayList sanitizedHeaders) {
        Intrinsics.echo(level, "level");
        Intrinsics.echo(sanitizedHeaders, "sanitizedHeaders");
        if (level.alpha) {
            sb2.append("RESPONSE: " + abstractC2304b.golf());
            sb2.append('\n');
            sb2.append("METHOD: " + abstractC2304b.bravo().delta().uniform());
            sb2.append('\n');
            sb2.append("FROM: " + abstractC2304b.bravo().delta().getUrl());
            sb2.append('\n');
        }
        if (level.purple) {
            sb2.append("COMMON HEADERS");
            sb2.append('\n');
            charlie(sb2, abstractC2304b.alpha().foxtrot(), sanitizedHeaders);
        }
    }

    public static final Ie.aq foxtrot(Ie.aq aqVar, G6.j jVar) {
        Intrinsics.echo(aqVar, "<this>");
        int i4 = aqVar.red;
        if ((i4 & Barcode.FORMAT_QR_CODE) == 256) {
            return aqVar.f1478f;
        }
        if ((i4 & 512) == 512) {
            return jVar.alpha(aqVar.f1479g);
        }
        return null;
    }

    public static final Ie.aq golf(Ie.y yVar, G6.j typeTable) {
        Intrinsics.echo(yVar, "<this>");
        Intrinsics.echo(typeTable, "typeTable");
        int i4 = yVar.red;
        if ((i4 & 32) == 32) {
            return yVar.f1614c;
        }
        if ((i4 & 64) == 64) {
            return typeTable.alpha(yVar.f1615d);
        }
        return null;
    }

    public static final Ie.aq hotel(Ie.y yVar, G6.j typeTable) {
        Intrinsics.echo(yVar, "<this>");
        Intrinsics.echo(typeTable, "typeTable");
        int i4 = yVar.red;
        if ((i4 & 8) == 8) {
            Ie.aq returnType = yVar.yellow;
            Intrinsics.delta(returnType, "returnType");
            return returnType;
        }
        if ((i4 & 16) == 16) {
            return typeTable.alpha(yVar.f1612a);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final Ie.aq india(Ie.ag agVar, G6.j typeTable) {
        Intrinsics.echo(agVar, "<this>");
        Intrinsics.echo(typeTable, "typeTable");
        int i4 = agVar.red;
        if ((i4 & 8) == 8) {
            Ie.aq returnType = agVar.yellow;
            Intrinsics.delta(returnType, "returnType");
            return returnType;
        }
        if ((i4 & 16) == 16) {
            return typeTable.alpha(agVar.f1446a);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final Ie.aq juliet(Ie.ay ayVar, G6.j typeTable) {
        Intrinsics.echo(typeTable, "typeTable");
        int i4 = ayVar.red;
        if ((i4 & 4) == 4) {
            Ie.aq type = ayVar.white;
            Intrinsics.delta(type, "type");
            return type;
        }
        if ((i4 & 8) == 8) {
            return typeTable.alpha(ayVar.yellow);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }
}
