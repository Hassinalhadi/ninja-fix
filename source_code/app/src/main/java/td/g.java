package td;

import F.C0121j0;
import androidx.recyclerview.widget.RecyclerView;
import g4.C1752a;
import io.ktor.http.cio.ParserException;
import io.ktor.utils.io.ak;
import io.ktor.utils.io.ao;
import io.ktor.utils.io.ap;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pf.C2361k;
import s6.AbstractC2743p6;
import sd.q;
import t6.AbstractC3070v2;
import ud.C3154b;
import ud.C3155c;

/* loaded from: classes2.dex */
public abstract class g {
    public static final Set alpha = ArraysKt.g(new Character[]{'/', '?', '#', '@'});
    public static final int bravo;

    static {
        List list = ap.bravo;
        bravo = 6;
        List from = CollectionsKt.listOf("HTTP/1.0", "HTTP/1.1");
        Intrinsics.echo(from, "from");
        AbstractC3070v2.alpha(from, new C2361k(20), new C1752a(29));
    }

    public static final void alpha(C3155c c3155c, char c3) {
        throw new ParserException("Character with code " + (c3 & 255) + " is not allowed in header names, \n" + ((Object) c3155c));
    }

    public static final int bravo(C3155c c3155c, C0121j0 c0121j0) {
        int i4 = c0121j0.charlie;
        for (int i5 = c0121j0.bravo; i5 < i4; i5++) {
            char charAt = c3155c.charAt(i5);
            if (charAt == ':' && i5 != c0121j0.bravo) {
                c0121j0.bravo = i5 + 1;
                return i5;
            }
            if (Intrinsics.golf(charAt, 32) <= 0 || StringsKt.black("\"(),/:;<=>?@[\\]{}", charAt)) {
                int i10 = c0121j0.bravo;
                if (charAt != ':') {
                    if (i5 == i10) {
                        throw new ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
                    }
                    alpha(c3155c, charAt);
                    throw null;
                }
                throw new ParserException("Empty header names are not allowed as per RFC7230.");
            }
        }
        throw new ParserException("No colon in HTTP header in " + c3155c.subSequence(c0121j0.bravo, c0121j0.charlie).toString() + " in builder: \n" + ((Object) c3155c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        alpha(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:14:0x0070, B:16:0x0079, B:19:0x0081, B:22:0x008c, B:25:0x0098, B:58:0x00a4, B:30:0x00a8, B:31:0x00da, B:32:0x0058, B:38:0x00b1, B:51:0x00c7, B:52:0x00ca, B:48:0x00cb, B:56:0x00d2, B:61:0x00ea, B:62:0x00f1, B:63:0x00f2, B:65:0x00fc), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:14:0x0070, B:16:0x0079, B:19:0x0081, B:22:0x008c, B:25:0x0098, B:58:0x00a4, B:30:0x00a8, B:31:0x00da, B:32:0x0058, B:38:0x00b1, B:51:0x00c7, B:52:0x00ca, B:48:0x00cb, B:56:0x00d2, B:61:0x00ea, B:62:0x00f1, B:63:0x00f2, B:65:0x00fc), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [td.f] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [io.ktor.utils.io.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x006b -> B:13:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object charlie(ao aoVar, C3155c c3155c, C0121j0 c0121j0, Pd.c cVar) {
        ?? r22;
        int i4;
        C3155c c3155c2;
        d dVar;
        f fVar;
        ao aoVar2;
        C0121j0 c0121j02;
        Throwable th;
        Object november;
        int i5;
        int i10 = 1;
        if (cVar instanceof f) {
            f fVar2 = (f) cVar;
            int i11 = fVar2.white;
            if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                fVar2.white = i11 - RecyclerView.UNDEFINED_DURATION;
                r22 = fVar2;
                Object obj = r22.teal;
                Od.a aVar = Od.a.alpha;
                i4 = r22.white;
                int i12 = 8192;
                if (i4 == 0) {
                    if (i4 == 1) {
                        d dVar2 = r22.silver;
                        C0121j0 c0121j03 = r22.red;
                        C3155c c3155c3 = r22.purple;
                        ?? r82 = r22.alpha;
                        try {
                            ResultKt.alpha(obj);
                            fVar = r22;
                            c0121j02 = c0121j03;
                            dVar = dVar2;
                            c3155c2 = c3155c3;
                            ao aoVar3 = r82;
                            try {
                                if (((Boolean) obj).booleanValue()) {
                                    dVar.delta();
                                    return null;
                                }
                                int i13 = c3155c2.yellow;
                                c0121j02.charlie = i13;
                                int i14 = c0121j02.bravo;
                                int i15 = i13 - i14;
                                if (i15 != 0) {
                                    if (i15 < i12) {
                                        int bravo2 = bravo(c3155c2, c0121j02);
                                        int i16 = c0121j02.charlie;
                                        int i17 = c0121j02.bravo;
                                        while (i17 < i16) {
                                            char charAt = c3155c2.charAt(i17);
                                            if (!AbstractC2743p6.delta(charAt) && charAt != '\t') {
                                                break;
                                            }
                                            i17 += i10;
                                        }
                                        if (i17 >= i16) {
                                            c0121j02.bravo = i16;
                                            i5 = i10;
                                        } else {
                                            int i18 = i17;
                                            int i19 = i18;
                                            while (i18 < i16) {
                                                int i20 = i10;
                                                char charAt2 = c3155c2.charAt(i18);
                                                if (charAt2 != '\t') {
                                                    if (charAt2 == '\n' || charAt2 == '\r') {
                                                        break;
                                                    }
                                                    if (charAt2 != ' ') {
                                                        i19 = i18;
                                                    }
                                                }
                                                i18++;
                                                i10 = i20;
                                            }
                                            i5 = i10;
                                            c0121j02.bravo = i17;
                                            c0121j02.charlie = i19 + 1;
                                        }
                                        int i21 = c0121j02.bravo;
                                        int i22 = c0121j02.charlie;
                                        c0121j02.bravo = i16;
                                        dVar.charlie(i14, bravo2, i21, i22);
                                        aoVar2 = aoVar3;
                                        i10 = i5;
                                        i12 = 8192;
                                        int i23 = bravo;
                                        fVar.alpha = aoVar2;
                                        fVar.purple = c3155c2;
                                        fVar.red = c0121j02;
                                        fVar.silver = dVar;
                                        fVar.white = i10;
                                        november = ak.november(aoVar2, c3155c2, i12, i23, fVar);
                                        if (november != aVar) {
                                            return aVar;
                                        }
                                        aoVar3 = aoVar2;
                                        obj = november;
                                        if (((Boolean) obj).booleanValue()) {
                                        }
                                    } else {
                                        throw new IllegalStateException("Header line length limit exceeded");
                                    }
                                } else {
                                    List list = q.alpha;
                                    C3154b alpha2 = dVar.alpha("Host");
                                    if (alpha2 != null) {
                                        delta(alpha2);
                                    }
                                    return dVar;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dVar2 = dVar;
                                dVar2.delta();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            dVar2.delta();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    c3155c2 = c3155c;
                    dVar = new d(c3155c2);
                    fVar = r22;
                    aoVar2 = aoVar;
                    c0121j02 = c0121j0;
                    int i232 = bravo;
                    fVar.alpha = aoVar2;
                    fVar.purple = c3155c2;
                    fVar.red = c0121j02;
                    fVar.silver = dVar;
                    fVar.white = i10;
                    november = ak.november(aoVar2, c3155c2, i12, i232, fVar);
                    if (november != aVar) {
                    }
                }
            }
        }
        r22 = new Pd.c(cVar);
        Object obj2 = r22.teal;
        Od.a aVar2 = Od.a.alpha;
        i4 = r22.white;
        int i122 = 8192;
        if (i4 == 0) {
        }
    }

    public static final void delta(C3154b c3154b) {
        if (!StringsKt.bronze(c3154b, ":")) {
            for (int i4 = 0; i4 < c3154b.length(); i4++) {
                Character valueOf = Character.valueOf(c3154b.charAt(i4));
                Set set = alpha;
                if (set.contains(valueOf)) {
                    throw new ParserException("Host cannot contain any of the following symbols: " + set);
                }
            }
            return;
        }
        throw new ParserException("Host header with ':' should contains port: " + ((Object) c3154b));
    }
}
