package yd;

import androidx.recyclerview.widget.RecyclerView;
import io.ktor.serialization.JsonConvertException;
import io.ktor.utils.io.ag;
import io.ktor.utils.io.ak;
import io.ktor.utils.io.t;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import pf.InterfaceC2358h;
import vf.ad;
import vf.ao;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class j {
    public final Of.d alpha;
    public final LinkedHashMap bravo = new LinkedHashMap();

    public j(Of.d dVar) {
        this.alpha = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (io.ktor.utils.io.ak.sierra(r1, r0, r0.length, r6) != r7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(j jVar, InterfaceC3439i interfaceC3439i, KSerializer kSerializer, Charset charset, ag agVar, Pd.c cVar) {
        i iVar;
        i iVar2;
        Od.a aVar;
        int i4;
        C3417a c3417a;
        InterfaceC3439i interfaceC3439i2;
        KSerializer kSerializer2;
        Charset charset2;
        g gVar;
        C3417a c3417a2;
        ag agVar2 = agVar;
        jVar.getClass();
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i5 = iVar.f14159s;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                iVar.f14159s = i5 - RecyclerView.UNDEFINED_DURATION;
                iVar2 = iVar;
                Object obj = iVar2.white;
                aVar = Od.a.alpha;
                i4 = iVar2.f14159s;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                ResultKt.alpha(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c3417a2 = (C3417a) iVar2.purple;
                        agVar2 = (ag) iVar2.alpha;
                        ResultKt.alpha(obj);
                        byte[] bArr = c3417a2.bravo;
                        iVar2.alpha = null;
                        iVar2.purple = null;
                        iVar2.f14159s = 3;
                    } else {
                        C3417a c3417a3 = iVar2.teal;
                        agVar2 = iVar2.silver;
                        Charset charset3 = iVar2.red;
                        KSerializer kSerializer3 = (KSerializer) iVar2.purple;
                        interfaceC3439i2 = (InterfaceC3439i) iVar2.alpha;
                        ResultKt.alpha(obj);
                        charset2 = charset3;
                        kSerializer2 = kSerializer3;
                        c3417a = c3417a3;
                    }
                } else {
                    ResultKt.alpha(obj);
                    LinkedHashMap linkedHashMap = jVar.bravo;
                    Object obj2 = linkedHashMap.get(charset);
                    if (obj2 == null) {
                        obj2 = new C3417a(charset);
                        linkedHashMap.put(charset, obj2);
                    }
                    c3417a = (C3417a) obj2;
                    iVar2.alpha = interfaceC3439i;
                    iVar2.purple = kSerializer;
                    iVar2.red = charset;
                    iVar2.silver = agVar2;
                    iVar2.teal = c3417a;
                    iVar2.f14159s = 1;
                    byte[] bArr2 = c3417a.alpha;
                    if (ak.sierra(agVar2, bArr2, bArr2.length, iVar2) != aVar) {
                        interfaceC3439i2 = interfaceC3439i;
                        kSerializer2 = kSerializer;
                        charset2 = charset;
                    }
                    return aVar;
                }
                gVar = new g(agVar2, c3417a, jVar, kSerializer2, charset2);
                iVar2.alpha = agVar2;
                iVar2.purple = c3417a;
                iVar2.red = null;
                iVar2.silver = null;
                iVar2.teal = null;
                iVar2.f14159s = 2;
                if (interfaceC3439i2.collect(gVar, iVar2) != aVar) {
                    c3417a2 = c3417a;
                    byte[] bArr3 = c3417a2.bravo;
                    iVar2.alpha = null;
                    iVar2.purple = null;
                    iVar2.f14159s = 3;
                }
                return aVar;
            }
        }
        iVar = new i(jVar, cVar);
        iVar2 = iVar;
        Object obj3 = iVar2.white;
        aVar = Od.a.alpha;
        i4 = iVar2.f14159s;
        if (i4 == 0) {
        }
        gVar = new g(agVar2, c3417a, jVar, kSerializer2, charset2);
        iVar2.alpha = agVar2;
        iVar2.purple = c3417a;
        iVar2.red = null;
        iVar2.silver = null;
        iVar2.teal = null;
        iVar2.f14159s = 2;
        if (interfaceC3439i2.collect(gVar, iVar2) != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(Charset charset, Ed.a aVar, t tVar, Pd.c cVar) {
        C3421e c3421e;
        int i4;
        try {
            if (cVar instanceof C3421e) {
                c3421e = (C3421e) cVar;
                int i5 = c3421e.red;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    c3421e.red = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = c3421e.alpha;
                    Od.a aVar2 = Od.a.alpha;
                    i4 = c3421e.red;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                    if (!Intrinsics.areEqual(charset, kotlin.text.a.alpha) || !Intrinsics.areEqual(aVar.alpha, u.alpha.bravo(InterfaceC2358h.class))) {
                        return null;
                    }
                    Of.d dVar = this.alpha;
                    c3421e.red = 1;
                    Cf.e eVar = ao.alpha;
                    Object blue = ad.blue(Cf.d.purple, new C3418b(tVar, aVar, dVar, null), c3421e);
                    if (blue == aVar2) {
                        return aVar2;
                    }
                    return blue;
                }
            }
            if (i4 == 0) {
            }
        } catch (Throwable th) {
            throw new JsonConvertException("Illegal input: " + th.getMessage(), th);
        }
        c3421e = new C3421e(this, cVar);
        Object obj2 = c3421e.alpha;
        Od.a aVar22 = Od.a.alpha;
        i4 = c3421e.red;
    }
}
