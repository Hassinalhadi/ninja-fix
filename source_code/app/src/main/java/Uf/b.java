package Uf;

import Tf.ah;
import Tf.ak;
import Tf.an;
import Tf.u;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pf.C2359i;

/* loaded from: classes3.dex */
public abstract class b {
    public static final char[] alpha = {'0', ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK, ExpiryDateConstantsKt.EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK, '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
    public static final byte[] bravo = new byte[0];

    public static final int alpha(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' <= c3 && c3 < 'G') {
            return c3 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [pf.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [pf.i] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [Uf.c, Nd.c] */
    /* JADX WARN: Type inference failed for: r5v3, types: [Uf.c, Nd.c] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Uf.c] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.l] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(C2359i c2359i, u uVar, kotlin.collections.l lVar, ah ahVar, boolean z2, boolean z10, Pd.a aVar) {
        ?? r5;
        ?? r72;
        kotlin.collections.l lVar2;
        ?? r12;
        boolean z11;
        u uVar2;
        List listOrNull;
        ah bravo2;
        ah ahVar2;
        boolean z12;
        Iterator it;
        C2359i c2359i2;
        ah ahVar3 = ahVar;
        boolean z13 = z10;
        boolean z14 = true;
        try {
            if (aVar instanceof c) {
                c cVar = (c) aVar;
                int i4 = cVar.f2157t;
                if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    cVar.f2157t = i4 - RecyclerView.UNDEFINED_DURATION;
                    r5 = cVar;
                    Object obj = r5.f2156s;
                    Od.a aVar2 = Od.a.alpha;
                    r72 = r5.f2157t;
                    if (r72 == 0) {
                        if (r72 != 1) {
                            if (r72 != 2) {
                                if (r72 == 3) {
                                    ResultKt.alpha(obj);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            boolean z15 = r5.yellow;
                            boolean z16 = r5.white;
                            it = r5.teal;
                            ahVar2 = r5.silver;
                            kotlin.collections.l lVar3 = r5.red;
                            uVar2 = r5.purple;
                            C2359i c2359i3 = r5.alpha;
                            ResultKt.alpha(obj);
                            z12 = z15;
                            z11 = z16;
                            r72 = lVar3;
                            c2359i2 = c2359i3;
                            kotlin.collections.l lVar4 = r72;
                            u uVar3 = uVar2;
                            C2359i c2359i4 = c2359i2;
                            r5 = r5;
                            while (it.hasNext()) {
                                try {
                                    ah ahVar4 = (ah) it.next();
                                    r5.alpha = c2359i4;
                                    r5.purple = uVar3;
                                    r5.red = lVar4;
                                    r5.silver = ahVar2;
                                    r5.teal = it;
                                    r5.white = z11;
                                    r5.yellow = z12;
                                    r5.f2157t = 2;
                                    boolean z17 = z11;
                                    boolean z18 = z12;
                                    Pd.a aVar3 = r5;
                                    if (bravo(c2359i4, uVar3, lVar4, ahVar4, z17, z18, aVar3) == aVar2) {
                                        return aVar2;
                                    }
                                    z11 = z17;
                                    z12 = z18;
                                    r5 = aVar3;
                                } catch (Throwable th) {
                                    th = th;
                                    r72 = lVar4;
                                    r72.removeLast();
                                    throw th;
                                }
                            }
                            boolean z19 = z12;
                            lVar4.removeLast();
                            ahVar3 = ahVar2;
                            r12 = c2359i4;
                            z13 = z19;
                            if (z13) {
                                r5.alpha = null;
                                r5.purple = null;
                                r5.red = null;
                                r5.silver = null;
                                r5.teal = null;
                                r5.f2157t = 3;
                                r12.bravo(r5, ahVar3);
                                Od.a aVar4 = Od.a.alpha;
                                return aVar2;
                            }
                            return Unit.INSTANCE;
                        }
                        boolean z20 = r5.yellow;
                        boolean z21 = r5.white;
                        ah ahVar5 = r5.silver;
                        kotlin.collections.l lVar5 = r5.red;
                        uVar2 = r5.purple;
                        C2359i c2359i5 = r5.alpha;
                        ResultKt.alpha(obj);
                        z13 = z20;
                        z11 = z21;
                        ahVar3 = ahVar5;
                        lVar2 = lVar5;
                        r12 = c2359i5;
                    } else {
                        ResultKt.alpha(obj);
                        if (!z13) {
                            r5.alpha = c2359i;
                            r5.purple = uVar;
                            r5.red = lVar;
                            r5.silver = ahVar3;
                            r5.white = z2;
                            r5.yellow = z13;
                            r5.f2157t = 1;
                            c2359i.bravo(r5, ahVar3);
                            return aVar2;
                        }
                        lVar2 = lVar;
                        r12 = c2359i;
                        z11 = z2;
                        uVar2 = uVar;
                    }
                    listOrNull = uVar2.listOrNull(ahVar3);
                    if (listOrNull == null) {
                        listOrNull = CollectionsKt.emptyList();
                    }
                    if (!listOrNull.isEmpty()) {
                        ah path = ahVar3;
                        int i5 = 0;
                        while (true) {
                            if (!z11 || !lVar2.contains(path)) {
                                boolean z22 = z14;
                                Intrinsics.echo(path, "path");
                                ah ahVar6 = uVar2.metadata(path).charlie;
                                if (ahVar6 == null) {
                                    bravo2 = null;
                                } else {
                                    ah charlie = path.charlie();
                                    Intrinsics.checkNotNull(charlie);
                                    charlie.getClass();
                                    bravo2 = f.bravo(charlie, ahVar6, false);
                                }
                                if (bravo2 == null) {
                                    if (z11 || i5 == 0) {
                                        lVar2.addLast(path);
                                        ahVar2 = ahVar3;
                                        z12 = z13;
                                        it = listOrNull.iterator();
                                        r72 = lVar2;
                                        c2359i2 = r12;
                                    }
                                } else {
                                    i5++;
                                    path = bravo2;
                                    z14 = z22;
                                }
                            } else {
                                throw new IOException(Q0.c.november(ahVar3, "symlink cycle at "));
                            }
                        }
                    }
                    if (z13) {
                    }
                }
            }
            if (r72 == 0) {
            }
            listOrNull = uVar2.listOrNull(ahVar3);
            if (listOrNull == null) {
            }
            if (!listOrNull.isEmpty()) {
            }
            if (z13) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        r5 = new Pd.c(aVar);
        Object obj2 = r5.f2156s;
        Od.a aVar22 = Od.a.alpha;
        r72 = r5.f2157t;
    }

    public static final long charlie(ak akVar, Tf.n bytes, int i4, long j5, long j6) {
        long j7;
        Intrinsics.echo(akVar, "<this>");
        Intrinsics.echo(bytes, "bytes");
        long j10 = i4;
        Tf.b.echo(bytes.delta(), 0, j10);
        if (!akVar.red) {
            long j11 = j5;
            while (true) {
                Tf.k kVar = akVar.purple;
                long alpha2 = a.alpha(kVar, bytes, j11, j6, i4);
                long j12 = -1;
                if (alpha2 != -1) {
                    return alpha2;
                }
                long j13 = kVar.purple;
                long j14 = (j13 - j10) + 1;
                if (j14 >= j6) {
                    break;
                }
                if (j13 < j6) {
                    j7 = -1;
                } else {
                    int max = (int) Math.max(1L, (j13 - j6) + 1);
                    int min = ((int) Math.min(j10, (kVar.purple - j11) + 1)) - 1;
                    if (max > min) {
                        break;
                    }
                    while (true) {
                        j7 = j12;
                        if (kVar.uniform(min, bytes, kVar.purple - min)) {
                            break;
                        }
                        if (min != max) {
                            min--;
                            j12 = j7;
                        } else {
                            return j7;
                        }
                    }
                }
                if (akVar.alpha.read(kVar, 8192L) != j7) {
                    j11 = Math.max(j11, j14);
                } else {
                    return j7;
                }
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    public static final int delta(an anVar, int i4) {
        int i5;
        Intrinsics.echo(anVar, "<this>");
        int i10 = i4 + 1;
        int length = anVar.teal.length;
        int[] iArr = anVar.white;
        Intrinsics.echo(iArr, "<this>");
        int i11 = length - 1;
        int i12 = 0;
        while (true) {
            if (i12 <= i11) {
                i5 = (i12 + i11) >>> 1;
                int i13 = iArr[i5];
                if (i13 < i10) {
                    i12 = i5 + 1;
                } else {
                    if (i13 <= i10) {
                        break;
                    }
                    i11 = i5 - 1;
                }
            } else {
                i5 = (-i12) - 1;
                break;
            }
        }
        if (i5 >= 0) {
            return i5;
        }
        return ~i5;
    }
}
