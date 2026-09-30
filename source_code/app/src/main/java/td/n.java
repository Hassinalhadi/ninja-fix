package td;

import F.C0121j0;
import androidx.recyclerview.widget.RecyclerView;
import io.ktor.utils.io.ag;
import io.ktor.utils.io.ak;
import io.ktor.utils.io.ao;
import io.ktor.utils.io.q;
import io.ktor.utils.io.t;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.jvm.internal.s;
import s6.Z4;
import ud.C3154b;
import ud.C3155c;

/* loaded from: classes2.dex */
public abstract class n {
    public static final Hf.a alpha = new Hf.a(0, Z4.charlie("\r\n", kotlin.text.a.alpha));
    public static final Hf.a bravo = new Hf.a(new byte[]{45, 45});

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ae, code lost:
    
        if (((io.ktor.utils.io.m) r3).charlie(r7) != r8) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(Hf.a aVar, ao aoVar, io.ktor.utils.io.m mVar, d dVar, long j5, Pd.c cVar) {
        Pd.c cVar2;
        int i4;
        long j6;
        Long l10;
        long j7;
        ag agVar;
        Hf.a aVar2;
        t tVar;
        ag agVar2;
        long j10;
        ag agVar3;
        long longValue;
        long j11;
        if (cVar instanceof k) {
            k kVar = (k) cVar;
            int i5 = kVar.white;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                kVar.white = i5 - RecyclerView.UNDEFINED_DURATION;
                cVar2 = kVar;
                k kVar2 = cVar2;
                Object obj = kVar2.teal;
                Object obj2 = Od.a.alpha;
                i4 = kVar2.white;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    longValue = kVar2.silver;
                                    ResultKt.alpha(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                j11 = kVar2.silver;
                                agVar3 = (ag) kVar2.alpha;
                                ResultKt.alpha(obj);
                                longValue = ((Number) obj).longValue() + j11;
                                kVar2.alpha = null;
                                kVar2.silver = longValue;
                                kVar2.white = 4;
                            }
                        } else {
                            agVar = kVar2.red;
                            tVar = kVar2.purple;
                            aVar2 = (Hf.a) kVar2.alpha;
                            ResultKt.alpha(obj);
                            long longValue2 = ((Number) obj).longValue();
                            kVar2.alpha = agVar;
                            kVar2.purple = null;
                            kVar2.red = null;
                            kVar2.silver = longValue2;
                            kVar2.white = 3;
                            obj = delta(tVar, aVar2, kVar2);
                            if (obj != obj2) {
                                agVar3 = agVar;
                                j11 = longValue2;
                                longValue = ((Number) obj).longValue() + j11;
                                kVar2.alpha = null;
                                kVar2.silver = longValue;
                                kVar2.white = 4;
                            }
                            return obj2;
                        }
                    } else {
                        agVar2 = (ag) kVar2.alpha;
                        ResultKt.alpha(obj);
                        agVar3 = agVar2;
                        longValue = ((Number) obj).longValue();
                        kVar2.alpha = null;
                        kVar2.silver = longValue;
                        kVar2.white = 4;
                    }
                } else {
                    ResultKt.alpha(obj);
                    C3154b alpha2 = dVar.alpha("Content-Length");
                    if (alpha2 != null) {
                        int i10 = ud.g.alpha;
                        int length = alpha2.length();
                        if (length <= 19) {
                            if (length == 19) {
                                int length2 = alpha2.length();
                                j10 = 0;
                                for (int i11 = 0; i11 < length2; i11++) {
                                    long charAt = alpha2.charAt(i11) - 48;
                                    if (charAt >= 0 && charAt <= 9) {
                                        j10 = (j10 << 3) + (j10 << 1) + charAt;
                                        if (j10 < 0) {
                                            throw new NumberFormatException("Invalid number " + ((Object) alpha2) + ": too large for Long type");
                                        }
                                    } else {
                                        ud.g.bravo(alpha2, i11);
                                        throw null;
                                    }
                                }
                                j6 = 0;
                            } else {
                                j6 = 0;
                                j10 = 0;
                                for (int i12 = 0; i12 < length; i12++) {
                                    long charAt2 = alpha2.charAt(i12) - 48;
                                    if (charAt2 >= 0 && charAt2 <= 9) {
                                        j10 = (j10 << 3) + (j10 << 1) + charAt2;
                                    } else {
                                        ud.g.bravo(alpha2, i12);
                                        throw null;
                                    }
                                }
                            }
                            l10 = new Long(j10);
                        } else {
                            throw new NumberFormatException("Invalid number " + ((Object) alpha2) + ": too large for Long type");
                        }
                    } else {
                        j6 = 0;
                        l10 = null;
                    }
                    if (l10 == null) {
                        kVar2.alpha = mVar;
                        kVar2.white = 1;
                        obj = new q(aoVar, aVar, mVar, j5).delta(true, kVar2);
                        if (obj != obj2) {
                            agVar2 = mVar;
                            agVar3 = agVar2;
                            longValue = ((Number) obj).longValue();
                            kVar2.alpha = null;
                            kVar2.silver = longValue;
                            kVar2.white = 4;
                        }
                    } else {
                        if (j6 >= j5) {
                            j7 = j5;
                        } else {
                            long j12 = j5 % 1;
                            if (j12 < j6) {
                                j12++;
                            }
                            long j13 = j6 % 1;
                            if (j13 < j6) {
                                j13++;
                            }
                            long j14 = (j12 - j13) % 1;
                            if (j14 < j6) {
                                j14++;
                            }
                            j7 = j5 - j14;
                        }
                        long longValue3 = l10.longValue();
                        if (j6 <= longValue3 && longValue3 <= j7) {
                            long longValue4 = l10.longValue();
                            kVar2.alpha = aVar;
                            kVar2.purple = aoVar;
                            kVar2.red = mVar;
                            kVar2.white = 2;
                            obj = ak.delta(aoVar, mVar, longValue4, kVar2);
                            if (obj != obj2) {
                                agVar = mVar;
                                aVar2 = aVar;
                                tVar = aoVar;
                                long longValue22 = ((Number) obj).longValue();
                                kVar2.alpha = agVar;
                                kVar2.purple = null;
                                kVar2.red = null;
                                kVar2.silver = longValue22;
                                kVar2.white = 3;
                                obj = delta(tVar, aVar2, kVar2);
                                if (obj != obj2) {
                                }
                            }
                        } else {
                            throw new IOException(Q0.c.mike(j5, "; limit is defined using 'formFieldLimit' argument", Q0.c.uniform("Multipart content length exceeds limit ", l10.longValue(), " > ")));
                        }
                    }
                    return obj2;
                }
                return new Long(longValue);
            }
        }
        cVar2 = new Pd.c(cVar);
        k kVar22 = cVar2;
        Object obj3 = kVar22.teal;
        Object obj22 = Od.a.alpha;
        i4 = kVar22.white;
        if (i4 == 0) {
        }
        return new Long(longValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0055, B:16:0x005a, B:17:0x0061), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(ao aoVar, Pd.c cVar) {
        l lVar;
        int i4;
        Throwable th;
        C3155c c3155c;
        ArrayList arrayList;
        d dVar;
        if (cVar instanceof l) {
            l lVar2 = (l) cVar;
            int i5 = lVar2.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                lVar2.red = i5 - RecyclerView.UNDEFINED_DURATION;
                lVar = lVar2;
                Object obj = lVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = lVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c3155c = lVar.alpha;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList = c3155c.purple;
                            Id.d dVar2 = c3155c.alpha;
                            if (arrayList == null) {
                            }
                            c3155c.teal = true;
                            c3155c.purple = null;
                            c3155c.silver = null;
                            c3155c.yellow = 0;
                            c3155c.white = 0;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    C3155c c3155c2 = new C3155c();
                    try {
                        lVar.alpha = c3155c2;
                        lVar.red = 1;
                        Set set = g.alpha;
                        C0121j0 c0121j0 = new C0121j0();
                        c0121j0.bravo = 0;
                        c0121j0.charlie = 0;
                        Object charlie = g.charlie(aoVar, c3155c2, c0121j0, lVar);
                        if (charlie == aVar) {
                            return aVar;
                        }
                        obj = charlie;
                        c3155c = c3155c2;
                    } catch (Throwable th3) {
                        th = th3;
                        c3155c = c3155c2;
                        arrayList = c3155c.purple;
                        Id.d dVar22 = c3155c.alpha;
                        if (arrayList == null) {
                            c3155c.red = null;
                            int size = arrayList.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                dVar22.s(arrayList.get(i10));
                            }
                        } else {
                            char[] cArr = c3155c.red;
                            if (cArr != null) {
                                dVar22.s(cArr);
                            }
                            c3155c.red = null;
                        }
                        c3155c.teal = true;
                        c3155c.purple = null;
                        c3155c.silver = null;
                        c3155c.yellow = 0;
                        c3155c.white = 0;
                        throw th;
                    }
                }
                dVar = (d) obj;
                if (dVar == null) {
                    return dVar;
                }
                throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
            }
        }
        lVar = new Pd.c(cVar);
        Object obj2 = lVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = lVar.red;
        if (i4 == 0) {
        }
        dVar = (d) obj2;
        if (dVar == null) {
        }
    }

    public static final void charlie(s sVar, byte[] bArr, byte b2) {
        int i4 = sVar.alpha;
        if (i4 < bArr.length) {
            sVar.alpha = i4 + 1;
            bArr[i4] = b2;
            return;
        }
        throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object delta(t tVar, Hf.a aVar, Pd.c cVar) {
        m mVar;
        Object obj;
        int i4;
        long j5;
        if (cVar instanceof m) {
            m mVar2 = (m) cVar;
            int i5 = mVar2.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                mVar2.red = i5 - RecyclerView.UNDEFINED_DURATION;
                mVar = mVar2;
                obj = mVar.purple;
                Od.a aVar2 = Od.a.alpha;
                i4 = mVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        aVar = mVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    mVar.alpha = aVar;
                    mVar.red = 1;
                    obj = ak.papa(tVar, aVar, mVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    j5 = aVar.alpha.length;
                } else {
                    j5 = 0;
                }
                return new Long(j5);
            }
        }
        mVar = new Pd.c(cVar);
        obj = mVar.purple;
        Od.a aVar22 = Od.a.alpha;
        i4 = mVar.red;
        if (i4 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return new Long(j5);
    }
}
