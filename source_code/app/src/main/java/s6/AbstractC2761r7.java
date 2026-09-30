package s6;

import androidx.recyclerview.widget.RecyclerView;
import dd.C1614e;
import ge.InterfaceC1772d;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import od.InterfaceC2225b;
import pd.AbstractC2304b;
import pd.C2306d;
import t6.AbstractC2981d2;
import t6.AbstractC2991f2;

/* renamed from: s6.r7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2761r7 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(AbstractC2304b abstractC2304b, Charset charset, Pd.c cVar) {
        C2306d c2306d;
        Object obj;
        int i4;
        Charset charset2;
        CharsetDecoder charsetDecoder;
        if (cVar instanceof C2306d) {
            C2306d c2306d2 = (C2306d) cVar;
            int i5 = c2306d2.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2306d2.red = i5 - RecyclerView.UNDEFINED_DURATION;
                c2306d = c2306d2;
                obj = c2306d.purple;
                Object obj2 = Od.a.alpha;
                i4 = c2306d.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        charsetDecoder = c2306d.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Intrinsics.echo(abstractC2304b, "<this>");
                    sd.e charlie = AbstractC2991f2.charlie(abstractC2304b);
                    ge.w wVar = null;
                    if (charlie != null) {
                        charset2 = AbstractC2981d2.alpha(charlie);
                    } else {
                        charset2 = null;
                    }
                    if (charset2 != null) {
                        charset = charset2;
                    }
                    CharsetDecoder newDecoder = charset.newDecoder();
                    C1614e bravo = abstractC2304b.bravo();
                    InterfaceC1772d bravo2 = kotlin.jvm.internal.u.alpha.bravo(Gf.i.class);
                    try {
                        wVar = kotlin.jvm.internal.u.alpha(Gf.i.class);
                    } catch (Throwable unused) {
                    }
                    Ed.a aVar = new Ed.a(bravo2, wVar);
                    c2306d.alpha = newDecoder;
                    c2306d.red = 1;
                    obj = bravo.alpha(aVar, c2306d);
                    if (obj == obj2) {
                        return obj2;
                    }
                    charsetDecoder = newDecoder;
                }
                if (obj == null) {
                    Intrinsics.checkNotNull(charsetDecoder);
                    return R4.bravo(charsetDecoder, (Gf.i) obj);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.io.Source");
            }
        }
        c2306d = new Pd.c(cVar);
        obj = c2306d.purple;
        Object obj22 = Od.a.alpha;
        i4 = c2306d.red;
        if (i4 == 0) {
        }
        if (obj == null) {
        }
    }

    public static final InterfaceC2225b bravo(AbstractC2304b abstractC2304b) {
        Intrinsics.echo(abstractC2304b, "<this>");
        return abstractC2304b.bravo().delta();
    }
}
