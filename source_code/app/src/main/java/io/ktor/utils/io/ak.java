package io.ktor.utils.io;

import Yb.C0331t0;
import androidx.recyclerview.widget.RecyclerView;
import d.C1534h0;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.J6;
import s6.Y4;
import t6.AbstractC3018l;
import ud.C3155c;
import vf.Y;

/* loaded from: classes2.dex */
public abstract class ak {
    public static final ah alpha = new Object();
    public static final am bravo = new am(null);

    /* JADX WARN: Type inference failed for: r1v1, types: [Gf.a, java.lang.Object] */
    public static aq alpha(byte[] content) {
        int length = content.length;
        Intrinsics.echo(content, "content");
        ?? obj = new Object();
        obj.uniform(length, content);
        return new aq(obj);
    }

    public static final void bravo(t tVar) {
        Intrinsics.echo(tVar, "<this>");
        tVar.delta(new IOException("Channel was cancelled"));
    }

    public static final void charlie(ag agVar, Throwable th) {
        Intrinsics.echo(agVar, "<this>");
        if (th == null) {
            C0331t0 c0331t0 = new C0331t0(1, agVar, ag.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15);
            ah ahVar = alpha;
            try {
                Nd.c delta = J6.delta(new Od.b(c0331t0));
                Result.Companion companion = Result.INSTANCE;
                Af.f.golf(delta, Result.m206constructorimpl(Unit.INSTANCE));
                return;
            } catch (Throwable th2) {
                Bf.a.alpha(ahVar, th2);
                throw null;
            }
        }
        ((m) agVar).delta(th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r1.foxtrot(r4, r13) == r2) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.utils.io.v] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [io.ktor.utils.io.v, Pd.c] */
    /* JADX WARN: Type inference failed for: r1v8, types: [io.ktor.utils.io.v, Pd.c] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [io.ktor.utils.io.ag] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ag] */
    /* JADX WARN: Type inference failed for: r3v3, types: [io.ktor.utils.io.m] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v2, types: [io.ktor.utils.io.ag, io.ktor.utils.io.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00da -> B:24:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object delta(t tVar, ag agVar, long j5, Pd.c cVar) {
        ?? r12;
        ?? r32;
        t tVar2;
        long j6;
        long j7;
        v vVar;
        t tVar3;
        ag agVar2;
        ?? r4;
        long j10;
        long j11;
        try {
            if (cVar instanceof v) {
                v vVar2 = (v) cVar;
                int i4 = vVar2.white;
                if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    vVar2.white = i4 - RecyclerView.UNDEFINED_DURATION;
                    r12 = vVar2;
                    Object obj = r12.teal;
                    Od.a aVar = Od.a.alpha;
                    r32 = r12.white;
                    int i5 = 1;
                    if (r32 == 0) {
                        if (r32 != 1) {
                            if (r32 != 2) {
                                if (r32 != 3) {
                                    if (r32 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Throwable th = (Throwable) r12.alpha;
                                    ResultKt.alpha(obj);
                                    throw th;
                                }
                                j10 = r12.silver;
                                j11 = r12.red;
                                ResultKt.alpha(obj);
                                return new Long(j11 - j10);
                            }
                            j6 = r12.silver;
                            j7 = r12.red;
                            ag agVar3 = r12.purple;
                            t tVar4 = (t) r12.alpha;
                            ResultKt.alpha(obj);
                            vVar = r12;
                            tVar3 = tVar4;
                            ag agVar4 = agVar3;
                            i5 = 1;
                            r32 = agVar4;
                            try {
                                if (tVar3.hotel() && j6 > 0) {
                                    try {
                                        if (tVar3.golf().hotel()) {
                                            vVar.alpha = tVar3;
                                            vVar.purple = r32;
                                            vVar.red = j7;
                                            vVar.silver = j6;
                                            vVar.white = i5;
                                        }
                                        v vVar3 = vVar;
                                        tVar2 = tVar3;
                                        r12 = vVar3;
                                        agVar2 = r32;
                                        tVar2.golf().echo(r4.kilo(), r14);
                                        j6 -= r14;
                                        r12.alpha = tVar2;
                                        r12.purple = r4;
                                        r12.red = j7;
                                        r12.silver = j6;
                                        r12.white = 2;
                                        if (r4.charlie(r12) != aVar) {
                                            t tVar5 = tVar2;
                                            vVar = r12;
                                            tVar3 = tVar5;
                                            agVar4 = r4;
                                            i5 = 1;
                                            r32 = agVar4;
                                            if (tVar3.hotel()) {
                                            }
                                            vVar.alpha = null;
                                            vVar.purple = null;
                                            vVar.red = j7;
                                            vVar.silver = j6;
                                            vVar.white = 3;
                                            if (((m) r32).charlie(vVar) != aVar) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r32 = r4;
                                        try {
                                            tVar2.delta(th);
                                            charlie(r32, th);
                                            throw th;
                                        } catch (Throwable th3) {
                                            r12.alpha = th3;
                                            r12.purple = null;
                                            r12.white = 4;
                                            if (((m) r32).charlie(r12) != aVar) {
                                                throw th3;
                                            }
                                        }
                                    }
                                    long min = Math.min(j6, Y4.charlie(tVar2.golf()));
                                    r4 = (m) agVar2;
                                } else {
                                    vVar.alpha = null;
                                    vVar.purple = null;
                                    vVar.red = j7;
                                    vVar.silver = j6;
                                    vVar.white = 3;
                                    if (((m) r32).charlie(vVar) != aVar) {
                                        j10 = j6;
                                        j11 = j7;
                                        return new Long(j11 - j10);
                                    }
                                }
                                return aVar;
                            } catch (Throwable th4) {
                                th = th4;
                                v vVar4 = vVar;
                                tVar2 = tVar3;
                                r12 = vVar4;
                                tVar2.delta(th);
                                charlie(r32, th);
                                throw th;
                            }
                        }
                        j6 = r12.silver;
                        j7 = r12.red;
                        ag agVar5 = r12.purple;
                        tVar2 = (t) r12.alpha;
                        ResultKt.alpha(obj);
                        r12 = r12;
                        agVar2 = agVar5;
                        long min2 = Math.min(j6, Y4.charlie(tVar2.golf()));
                        r4 = (m) agVar2;
                        tVar2.golf().echo(r4.kilo(), min2);
                        j6 -= min2;
                        r12.alpha = tVar2;
                        r12.purple = r4;
                        r12.red = j7;
                        r12.silver = j6;
                        r12.white = 2;
                        if (r4.charlie(r12) != aVar) {
                        }
                        return aVar;
                    }
                    ResultKt.alpha(obj);
                    r32 = agVar;
                    j6 = j5;
                    j7 = j6;
                    vVar = r12;
                    tVar3 = tVar;
                    if (tVar3.hotel()) {
                    }
                    vVar.alpha = null;
                    vVar.purple = null;
                    vVar.red = j7;
                    vVar.silver = j6;
                    vVar.white = 3;
                    if (((m) r32).charlie(vVar) != aVar) {
                    }
                    return aVar;
                }
            }
            if (r32 == 0) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
        r12 = new Pd.c(cVar);
        Object obj2 = r12.teal;
        Od.a aVar2 = Od.a.alpha;
        r32 = r12.white;
        int i52 = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r14 != r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #2 {all -> 0x00a9, blocks: (B:25:0x0069, B:27:0x006f), top: B:24:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.utils.io.ag] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009d -> B:23:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object echo(t tVar, ag agVar, Pd.c cVar) {
        u uVar;
        m mVar;
        t tVar2;
        long j5;
        long j6;
        long j7;
        t tVar3;
        ag agVar2;
        try {
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                int i4 = uVar2.teal;
                if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    uVar2.teal = i4 - RecyclerView.UNDEFINED_DURATION;
                    uVar = uVar2;
                    Object obj = uVar.silver;
                    Object obj2 = Od.a.alpha;
                    mVar = uVar.teal;
                    if (mVar == 0) {
                        if (mVar != 1) {
                            if (mVar != 2) {
                                if (mVar != 3) {
                                    if (mVar != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Throwable th = (Throwable) uVar.alpha;
                                    ResultKt.alpha(obj);
                                    throw th;
                                }
                                j7 = uVar.red;
                                ResultKt.alpha(obj);
                                return new Long(j7);
                            }
                            j6 = uVar.red;
                            ag agVar3 = uVar.purple;
                            t tVar4 = (t) uVar.alpha;
                            ResultKt.alpha(obj);
                            agVar2 = agVar3;
                            tVar3 = tVar4;
                            long j10 = j6;
                            tVar = tVar3;
                            j5 = j10;
                            agVar = agVar2;
                            try {
                                if (tVar.hotel()) {
                                    mVar = (m) agVar;
                                    try {
                                        long papa = j5 + tVar.golf().papa(mVar.kilo());
                                        uVar.alpha = tVar;
                                        uVar.purple = mVar;
                                        uVar.red = papa;
                                        uVar.teal = 1;
                                        if (mVar.charlie(uVar) != obj2) {
                                            tVar2 = tVar;
                                            j6 = papa;
                                            mVar = mVar;
                                            uVar.alpha = tVar2;
                                            uVar.purple = mVar;
                                            uVar.red = j6;
                                            uVar.teal = 2;
                                            Object foxtrot = tVar2.foxtrot(1, uVar);
                                            agVar2 = mVar;
                                            tVar3 = tVar2;
                                        }
                                    } catch (Throwable th2) {
                                        tVar2 = tVar;
                                        th = th2;
                                        try {
                                            tVar2.delta(th);
                                            charlie(mVar, th);
                                            throw th;
                                        } catch (Throwable th3) {
                                            uVar.alpha = th3;
                                            uVar.purple = null;
                                            uVar.teal = 4;
                                            if (mVar.charlie(uVar) != obj2) {
                                                throw th3;
                                            }
                                        }
                                    }
                                } else {
                                    uVar.alpha = null;
                                    uVar.purple = null;
                                    uVar.red = j5;
                                    uVar.teal = 3;
                                    if (((m) agVar).charlie(uVar) != obj2) {
                                        j7 = j5;
                                        return new Long(j7);
                                    }
                                }
                                return obj2;
                            } catch (Throwable th4) {
                                tVar2 = tVar;
                                mVar = agVar;
                                th = th4;
                            }
                        } else {
                            j6 = uVar.red;
                            ag agVar4 = uVar.purple;
                            t tVar5 = (t) uVar.alpha;
                            ResultKt.alpha(obj);
                            mVar = agVar4;
                            tVar2 = tVar5;
                            uVar.alpha = tVar2;
                            uVar.purple = mVar;
                            uVar.red = j6;
                            uVar.teal = 2;
                            Object foxtrot2 = tVar2.foxtrot(1, uVar);
                            agVar2 = mVar;
                            tVar3 = tVar2;
                        }
                    } else {
                        ResultKt.alpha(obj);
                        j5 = 0;
                        if (tVar.hotel()) {
                        }
                        return obj2;
                    }
                }
            }
            if (mVar == 0) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
        uVar = new Pd.c(cVar);
        Object obj3 = uVar.silver;
        Object obj22 = Od.a.alpha;
        mVar = uVar.teal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:11:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:10:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object foxtrot(t tVar, long j5, Pd.c cVar) {
        w wVar;
        int i4;
        long j6;
        t tVar2;
        if (cVar instanceof w) {
            w wVar2 = (w) cVar;
            int i5 = wVar2.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                wVar2.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                wVar = wVar2;
                Object obj = wVar.silver;
                Object obj2 = Od.a.alpha;
                i4 = wVar.teal;
                if (i4 == 0) {
                    if (i4 == 1) {
                        long j7 = wVar.red;
                        j6 = wVar.purple;
                        t tVar3 = wVar.alpha;
                        ResultKt.alpha(obj);
                        long j10 = j7;
                        t tVar4 = tVar3;
                        j5 = j10;
                        long min = Math.min(j5, Y4.charlie(tVar4.golf()));
                        Y4.bravo(tVar4.golf(), min);
                        j5 -= min;
                        tVar2 = tVar4;
                        if (j5 <= 0 && !tVar2.hotel()) {
                            Gf.a golf = tVar2.golf();
                            golf.getClass();
                            tVar4 = tVar2;
                            if (((int) golf.red) == 0) {
                                wVar.alpha = tVar2;
                                wVar.purple = j6;
                                wVar.red = j5;
                                wVar.teal = 1;
                                if (tVar2.foxtrot(1, wVar) == obj2) {
                                    return obj2;
                                }
                                tVar3 = tVar2;
                                j7 = j5;
                                long j102 = j7;
                                t tVar42 = tVar3;
                                j5 = j102;
                            }
                            long min2 = Math.min(j5, Y4.charlie(tVar42.golf()));
                            Y4.bravo(tVar42.golf(), min2);
                            j5 -= min2;
                            tVar2 = tVar42;
                            if (j5 <= 0) {
                            }
                            return new Long(j6 - j5);
                        }
                        return new Long(j6 - j5);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                j6 = j5;
                tVar2 = tVar;
                if (j5 <= 0) {
                }
                return new Long(j6 - j5);
            }
        }
        wVar = new Pd.c(cVar);
        Object obj3 = wVar.silver;
        Object obj22 = Od.a.alpha;
        i4 = wVar.teal;
        if (i4 == 0) {
        }
    }

    public static final Object golf(ag agVar, Pd.c cVar) {
        m mVar;
        Intrinsics.echo(agVar, "<this>");
        m mVar2 = (m) agVar;
        Throwable echo = mVar2.echo();
        if (echo == null) {
            if (agVar instanceof m) {
                mVar = (m) agVar;
            } else {
                mVar = null;
            }
            if (mVar == null || !mVar.bravo) {
                Gf.a kilo = mVar2.kilo();
                Intrinsics.echo(kilo, "<this>");
                if (((int) kilo.red) < 1048576) {
                    return Unit.INSTANCE;
                }
            }
            Object charlie = mVar2.charlie(cVar);
            if (charlie == Od.a.alpha) {
                return charlie;
            }
            return Unit.INSTANCE;
        }
        throw echo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Comparable hotel(t tVar, int i4, Pd.c cVar) {
        x xVar;
        Object obj;
        int i5;
        t tVar2;
        if (cVar instanceof x) {
            x xVar2 = (x) cVar;
            int i10 = xVar2.silver;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                xVar2.silver = i10 - RecyclerView.UNDEFINED_DURATION;
                xVar = xVar2;
                obj = xVar.red;
                Od.a aVar = Od.a.alpha;
                i5 = xVar.silver;
                if (i5 == 0) {
                    if (i5 == 1) {
                        i4 = xVar.purple;
                        t tVar3 = xVar.alpha;
                        ResultKt.alpha(obj);
                        tVar2 = tVar3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (!tVar.hotel()) {
                        xVar.alpha = tVar;
                        xVar.purple = i4;
                        xVar.silver = 1;
                        obj = tVar.foxtrot(i4, xVar);
                        tVar2 = tVar;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        return null;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return new Hf.a(Gf.k.delta(tVar2.golf().peek(), i4));
            }
        }
        xVar = new Pd.c(cVar);
        obj = xVar.red;
        Od.a aVar2 = Od.a.alpha;
        i5 = xVar.silver;
        if (i5 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object india(t tVar, byte[] buffer, int i4, Pd.c cVar) {
        y yVar;
        int i5;
        t tVar2;
        if (cVar instanceof y) {
            y yVar2 = (y) cVar;
            int i10 = yVar2.teal;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                yVar2.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                yVar = yVar2;
                Object obj = yVar.silver;
                Object obj2 = Od.a.alpha;
                i5 = yVar.teal;
                if (i5 == 0) {
                    if (i5 == 1) {
                        i4 = yVar.red;
                        buffer = yVar.purple;
                        t tVar3 = yVar.alpha;
                        ResultKt.alpha(obj);
                        tVar2 = tVar3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (tVar.hotel()) {
                        return new Integer(-1);
                    }
                    boolean hotel = tVar.golf().hotel();
                    tVar2 = tVar;
                    if (hotel) {
                        yVar.alpha = tVar;
                        yVar.purple = buffer;
                        yVar.red = i4;
                        yVar.teal = 1;
                        Object foxtrot = tVar.foxtrot(1, yVar);
                        tVar2 = tVar;
                        if (foxtrot == obj2) {
                            return obj2;
                        }
                    }
                }
                if (!tVar2.hotel()) {
                    return new Integer(-1);
                }
                Gf.a golf = tVar2.golf();
                Intrinsics.echo(golf, "<this>");
                Intrinsics.echo(buffer, "buffer");
                int i11 = 0;
                int charlie = golf.charlie(buffer, 0, i4);
                if (charlie != -1) {
                    i11 = charlie;
                }
                return new Integer(i11);
            }
        }
        yVar = new Pd.c(cVar);
        Object obj3 = yVar.silver;
        Object obj22 = Od.a.alpha;
        i5 = yVar.teal;
        if (i5 == 0) {
        }
        if (!tVar2.hotel()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object juliet(t tVar, Pd.c cVar) {
        z zVar;
        int i4;
        Gf.a aVar;
        t tVar2;
        Throwable echo;
        if (cVar instanceof z) {
            z zVar2 = (z) cVar;
            int i5 = zVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                zVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                zVar = zVar2;
                Object obj = zVar.red;
                Object obj2 = Od.a.alpha;
                i4 = zVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Gf.a aVar2 = zVar.purple;
                        t tVar3 = zVar.alpha;
                        ResultKt.alpha(obj);
                        aVar = aVar2;
                        tVar2 = tVar3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    tVar2 = tVar;
                    aVar = new Object();
                }
                while (!tVar2.hotel()) {
                    aVar.juliet(tVar2.golf());
                    zVar.alpha = tVar2;
                    zVar.purple = aVar;
                    zVar.silver = 1;
                    if (tVar2.foxtrot(1, zVar) == obj2) {
                        return obj2;
                    }
                }
                echo = tVar2.echo();
                if (echo != null) {
                    return aVar;
                }
                throw echo;
            }
        }
        zVar = new Pd.c(cVar);
        Object obj3 = zVar.red;
        Object obj22 = Od.a.alpha;
        i4 = zVar.silver;
        if (i4 == 0) {
        }
        while (!tVar2.hotel()) {
        }
        echo = tVar2.echo();
        if (echo != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:11:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0060 -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object kilo(t tVar, int i4, Pd.c cVar) {
        aa aaVar;
        int i5;
        int i10;
        Gf.a obj;
        Gf.a aVar;
        t tVar2;
        long j5;
        if (cVar instanceof aa) {
            aa aaVar2 = (aa) cVar;
            int i11 = aaVar2.teal;
            if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aaVar2.teal = i11 - RecyclerView.UNDEFINED_DURATION;
                aaVar = aaVar2;
                Object obj2 = aaVar.silver;
                Object obj3 = Od.a.alpha;
                i5 = aaVar.teal;
                if (i5 == 0) {
                    if (i5 == 1) {
                        int i12 = aaVar.red;
                        Gf.a aVar2 = aaVar.purple;
                        t tVar3 = aaVar.alpha;
                        ResultKt.alpha(obj2);
                        Gf.a aVar3 = aVar2;
                        i10 = i12;
                        t tVar4 = tVar3;
                        Gf.a aVar4 = aVar3;
                        aVar = aVar4;
                        if (!tVar4.hotel()) {
                            long j6 = i10;
                            if (Y4.charlie(tVar4.golf()) > j6 - aVar4.red) {
                                tVar4.golf().echo(aVar4, j6 - aVar4.red);
                                tVar2 = tVar4;
                                obj = aVar4;
                            } else {
                                Pd.f.bravo(tVar4.golf().papa(aVar4));
                                tVar2 = tVar4;
                                obj = aVar4;
                            }
                            j5 = obj.red;
                            aVar = obj;
                            if (j5 < i10) {
                                boolean hotel = tVar2.golf().hotel();
                                tVar4 = tVar2;
                                aVar4 = obj;
                                if (hotel) {
                                    aaVar.alpha = tVar2;
                                    aaVar.purple = obj;
                                    aaVar.red = i10;
                                    aaVar.teal = 1;
                                    if (tVar2.foxtrot(1, aaVar) == obj3) {
                                        return obj3;
                                    }
                                    tVar3 = tVar2;
                                    i12 = i10;
                                    aVar3 = obj;
                                    i10 = i12;
                                    t tVar42 = tVar3;
                                    Gf.a aVar42 = aVar3;
                                }
                                aVar = aVar42;
                                if (!tVar42.hotel()) {
                                }
                            }
                        }
                        if (aVar.red < i10) {
                            return aVar;
                        }
                        throw new EOFException(Q0.c.mike(aVar.red, " available", Q0.c.sierra(i10, "Not enough data available, required ", " bytes but only ")));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj2);
                i10 = i4;
                obj = new Object();
                tVar2 = tVar;
                j5 = obj.red;
                aVar = obj;
                if (j5 < i10) {
                }
                if (aVar.red < i10) {
                }
            }
        }
        aaVar = new Pd.c(cVar);
        Object obj22 = aaVar.silver;
        Object obj32 = Od.a.alpha;
        i5 = aaVar.teal;
        if (i5 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lima(t tVar, long j5, Pd.c cVar) {
        ac acVar;
        int i4;
        Gf.a aVar;
        t tVar2;
        if (cVar instanceof ac) {
            ac acVar2 = (ac) cVar;
            int i5 = acVar2.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                acVar2.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                acVar = acVar2;
                Object obj = acVar.silver;
                Object obj2 = Od.a.alpha;
                i4 = acVar.teal;
                if (i4 == 0) {
                    if (i4 == 1) {
                        long j6 = acVar.red;
                        Gf.a aVar2 = acVar.purple;
                        t tVar3 = acVar.alpha;
                        ResultKt.alpha(obj);
                        aVar = aVar2;
                        j5 = j6;
                        tVar2 = tVar3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    tVar2 = tVar;
                    aVar = new Object();
                }
                while (!tVar2.hotel()) {
                    long j7 = 0;
                    if (j5 <= 0) {
                        break;
                    }
                    if (j5 >= Y4.charlie(tVar2.golf())) {
                        j7 = j5 - Y4.charlie(tVar2.golf());
                        Pd.f.bravo(tVar2.golf().papa(aVar));
                    } else {
                        tVar2.golf().echo(aVar, j5);
                    }
                    acVar.alpha = tVar2;
                    acVar.purple = aVar;
                    acVar.red = j7;
                    acVar.teal = 1;
                    if (tVar2.foxtrot(1, acVar) == obj2) {
                        return obj2;
                    }
                    j5 = j7;
                }
                aVar.getClass();
                return aVar;
            }
        }
        acVar = new Pd.c(cVar);
        Object obj3 = acVar.silver;
        Object obj22 = Od.a.alpha;
        i4 = acVar.teal;
        if (i4 == 0) {
        }
        while (!tVar2.hotel()) {
        }
        aVar.getClass();
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mike(t tVar, Pd.c cVar) {
        ab abVar;
        int i4;
        Gf.a aVar;
        t tVar2;
        Throwable echo;
        if (cVar instanceof ab) {
            ab abVar2 = (ab) cVar;
            int i5 = abVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                abVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                abVar = abVar2;
                Object obj = abVar.red;
                Object obj2 = Od.a.alpha;
                i4 = abVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Gf.a aVar2 = abVar.purple;
                        t tVar3 = abVar.alpha;
                        ResultKt.alpha(obj);
                        aVar = aVar2;
                        tVar2 = tVar3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    tVar2 = tVar;
                    aVar = new Object();
                }
                while (!tVar2.hotel()) {
                    aVar.juliet(tVar2.golf());
                    abVar.alpha = tVar2;
                    abVar.purple = aVar;
                    abVar.silver = 1;
                    if (tVar2.foxtrot(1, abVar) == obj2) {
                        return obj2;
                    }
                }
                echo = tVar2.echo();
                if (echo != null) {
                    aVar.getClass();
                    return aVar;
                }
                throw echo;
            }
        }
        abVar = new Pd.c(cVar);
        Object obj3 = abVar.red;
        Object obj22 = Od.a.alpha;
        i4 = abVar.silver;
        if (i4 == 0) {
        }
        while (!tVar2.hotel()) {
        }
        echo = tVar2.echo();
        if (echo != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x018b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
    
        if (r14.red >= r7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0176, code lost:
    
        r5.alpha = r4;
        r5.purple = r3;
        r5.red = r15;
        r5.silver = r14;
        r5.teal = r7;
        r5.white = r0;
        r1 = 3;
        r5.f12785s = 3;
        r2 = r4.foxtrot(1, r5);
        r4 = r4;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0189, code lost:
    
        if (r2 != r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ad, code lost:
    
        throw new io.ktor.utils.io.charsets.TooLongLineException("Line exceeds limit of " + r7 + " characters");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0098, code lost:
    
        if (r7 == r6) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x01cc: INVOKE (r15 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: t6.l.alpha(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void (m)] (LINE:461), block:B:87:0x01cc */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd A[Catch: all -> 0x0047, LOOP:0: B:18:0x00bd->B:24:0x0169, LOOP_START, TryCatch #0 {all -> 0x0047, blocks: (B:13:0x0041, B:16:0x00b7, B:18:0x00bd, B:20:0x00c7, B:31:0x00d3, B:33:0x00dd, B:39:0x00f7, B:41:0x0104, B:43:0x010f, B:44:0x0128, B:47:0x0123, B:48:0x013a, B:49:0x014e, B:26:0x0151, B:24:0x0169, B:51:0x016f, B:53:0x0176, B:55:0x0192, B:56:0x01ad, B:57:0x01ae, B:60:0x01b7, B:62:0x01bd, B:69:0x005f), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ae A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:13:0x0041, B:16:0x00b7, B:18:0x00bd, B:20:0x00c7, B:31:0x00d3, B:33:0x00dd, B:39:0x00f7, B:41:0x0104, B:43:0x010f, B:44:0x0128, B:47:0x0123, B:48:0x013a, B:49:0x014e, B:26:0x0151, B:24:0x0169, B:51:0x016f, B:53:0x0176, B:55:0x0192, B:56:0x01ad, B:57:0x01ae, B:60:0x01b7, B:62:0x01bd, B:69:0x005f), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [io.ktor.utils.io.t] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4, types: [Gf.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [io.ktor.utils.io.t] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [io.ktor.utils.io.ad, Pd.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0189 -> B:15:0x018c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object november(t tVar, C3155c c3155c, int i4, int i5, Pd.c cVar) {
        ?? r5;
        int i10;
        long j5;
        C3155c c3155c2;
        int i11;
        int i12;
        t tVar2;
        ?? r4;
        int i13;
        ?? r15;
        int i14;
        Appendable appendable;
        Gf.a aVar;
        t tVar3;
        t tVar4;
        Appendable appendable2;
        Gf.a aVar2;
        ?? r14;
        boolean z2;
        ?? r02 = tVar;
        int i15 = 0;
        try {
            if (cVar instanceof ad) {
                ad adVar = (ad) cVar;
                int i16 = adVar.f12785s;
                if ((i16 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    adVar.f12785s = i16 - RecyclerView.UNDEFINED_DURATION;
                    r5 = adVar;
                    Object obj = r5.yellow;
                    Od.a aVar3 = Od.a.alpha;
                    i10 = r5.f12785s;
                    byte b2 = 10;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    i13 = r5.white;
                                    i14 = r5.teal;
                                    Gf.a aVar4 = r5.silver;
                                    r15 = r5.red;
                                    j5 = 0;
                                    appendable = r5.purple;
                                    t tVar5 = r5.alpha;
                                    ResultKt.alpha(obj);
                                    char c3 = 3;
                                    t tVar6 = tVar5;
                                    Gf.a aVar5 = aVar4;
                                    i15 = 0;
                                    b2 = 10;
                                    r4 = tVar6;
                                    r14 = aVar5;
                                    if (!r4.hotel()) {
                                        if (r14.red > j5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        Boolean valueOf = Boolean.valueOf(z2);
                                        if (z2) {
                                            appendable.append(Gf.j.alpha(r14, r14.red));
                                        }
                                        AbstractC3018l.alpha(r15, null);
                                        return valueOf;
                                    }
                                    while (true) {
                                        if (r4.golf().hotel()) {
                                            break;
                                        }
                                        byte readByte = r4.golf().readByte();
                                        if (readByte == 13) {
                                            boolean hotel = r4.golf().hotel();
                                            tVar3 = r4;
                                            aVar = r14;
                                            if (hotel) {
                                                r5.alpha = r4;
                                                r5.purple = appendable;
                                                r5.red = r15;
                                                r5.silver = r14;
                                                r5.teal = i13;
                                                r5.f12785s = 2;
                                                if (r4.foxtrot(1, r5) != aVar3) {
                                                    tVar4 = r4;
                                                    appendable2 = appendable;
                                                    aVar2 = r14;
                                                }
                                            }
                                        } else {
                                            if (readByte == b2) {
                                                List list = ap.bravo;
                                                oscar(i13, 2);
                                                Intrinsics.echo(r14, "<this>");
                                                appendable.append(Gf.j.alpha(r14, r14.red));
                                                Boolean bool = Boolean.TRUE;
                                                AbstractC3018l.alpha(r15, null);
                                                return bool;
                                            }
                                            r14.beige(readByte);
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                j5 = 0;
                                i13 = r5.teal;
                                aVar2 = r5.silver;
                                r15 = r5.red;
                                appendable2 = r5.purple;
                                tVar4 = r5.alpha;
                                ResultKt.alpha(obj);
                                aVar = aVar2;
                                appendable = appendable2;
                                tVar3 = tVar4;
                                Gf.a golf = tVar3.golf();
                                golf.getClass();
                                if (j5 < golf.red) {
                                    Gf.g gVar = golf.alpha;
                                    Intrinsics.checkNotNull(gVar);
                                    if (gVar.charlie(i15) == b2) {
                                        List list2 = ap.bravo;
                                        oscar(i13, 4);
                                        Pd.f.bravo(Y4.bravo(tVar3.golf(), 1L));
                                    } else {
                                        List list3 = ap.bravo;
                                        oscar(i13, 1);
                                    }
                                    Intrinsics.echo(aVar, "<this>");
                                    appendable.append(Gf.j.alpha(aVar, aVar.red));
                                    Boolean bool2 = Boolean.TRUE;
                                    AbstractC3018l.alpha(r15, null);
                                    return bool2;
                                }
                                throw new IndexOutOfBoundsException(Q0.c.mike(golf.red, "))", new StringBuilder("position (0) is not within the range [0..size(")));
                            }
                        } else {
                            j5 = 0;
                            int i17 = r5.white;
                            i11 = r5.teal;
                            ?? r42 = r5.purple;
                            t tVar7 = r5.alpha;
                            ResultKt.alpha(obj);
                            c3155c2 = r42;
                            i12 = i17;
                            tVar2 = tVar7;
                        }
                    } else {
                        j5 = 0;
                        ResultKt.alpha(obj);
                        if (r02.golf().hotel()) {
                            r5.alpha = r02;
                            c3155c2 = c3155c;
                            r5.purple = c3155c2;
                            i11 = i4;
                            r5.teal = i11;
                            i12 = i5;
                            r5.white = i12;
                            r5.f12785s = 1;
                            Object foxtrot = r02.foxtrot(1, r5);
                            tVar2 = r02;
                        } else {
                            c3155c2 = c3155c;
                            i11 = i4;
                            i12 = i5;
                            tVar2 = r02;
                        }
                    }
                    if (!tVar2.hotel()) {
                        return Boolean.FALSE;
                    }
                    int i18 = i12;
                    r4 = tVar2;
                    i13 = i18;
                    Object obj2 = new Object();
                    r15 = obj2;
                    i14 = i11;
                    appendable = c3155c2;
                    r14 = obj2;
                    if (!r4.hotel()) {
                    }
                }
            }
            if (i10 == 0) {
            }
            if (!tVar2.hotel()) {
            }
        } finally {
        }
        r5 = new Pd.c(cVar);
        Object obj3 = r5.yellow;
        Od.a aVar32 = Od.a.alpha;
        i10 = r5.f12785s;
        byte b22 = 10;
    }

    public static final void oscar(int i4, int i5) {
        List list = ap.bravo;
        if ((i4 | i5) == i4) {
            return;
        }
        throw new IOException("Unexpected line ending " + ((Object) ap.alpha(i5)) + ", while expected " + ((Object) ap.alpha(i4)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (foxtrot(r5, r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object papa(t tVar, Hf.a aVar, Pd.c cVar) {
        ae aeVar;
        Object obj;
        int i4;
        if (cVar instanceof ae) {
            ae aeVar2 = (ae) cVar;
            int i5 = aeVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aeVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                aeVar = aeVar2;
                obj = aeVar.red;
                Od.a aVar2 = Od.a.alpha;
                i4 = aeVar.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Boolean.TRUE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = aeVar.purple;
                    tVar = aeVar.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    int length = aVar.alpha.length;
                    aeVar.alpha = tVar;
                    aeVar.purple = aVar;
                    aeVar.silver = 1;
                    obj = hotel(tVar, length, aeVar);
                }
                if (!Intrinsics.areEqual(obj, aVar)) {
                    long length2 = aVar.alpha.length;
                    aeVar.alpha = null;
                    aeVar.purple = null;
                    aeVar.silver = 2;
                } else {
                    return Boolean.FALSE;
                }
            }
        }
        aeVar = new Pd.c(cVar);
        obj = aeVar.red;
        Od.a aVar22 = Od.a.alpha;
        i4 = aeVar.silver;
        if (i4 == 0) {
        }
        if (!Intrinsics.areEqual(obj, aVar)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable quebec(t tVar, Pd.c cVar) {
        af afVar;
        int i4;
        if (cVar instanceof af) {
            af afVar2 = (af) cVar;
            int i5 = afVar2.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                afVar2.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                afVar = afVar2;
                Object obj = afVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = afVar.purple;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    afVar.purple = 1;
                    obj = juliet(tVar, afVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                Gf.a aVar2 = (Gf.a) obj;
                return Gf.k.delta(aVar2, (int) aVar2.red);
            }
        }
        afVar = new Pd.c(cVar);
        Object obj2 = afVar.alpha;
        Od.a aVar3 = Od.a.alpha;
        i4 = afVar.purple;
        if (i4 == 0) {
        }
        Gf.a aVar22 = (Gf.a) obj2;
        return Gf.k.delta(aVar22, (int) aVar22.red);
    }

    public static Object romeo(ag agVar, X9.e eVar, gd.i iVar) {
        m mVar = (m) agVar;
        Gf.a kilo = mVar.kilo();
        kilo.getClass();
        Gf.g quebec = kilo.quebec(1);
        int i4 = quebec.charlie;
        byte[] bArr = quebec.alpha;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i4, bArr.length - i4);
        Intrinsics.checkNotNull(wrap);
        eVar.invoke(wrap);
        int position = wrap.position() - i4;
        if (position == 1) {
            quebec.charlie += position;
            kilo.red += position;
        } else if (position >= 0 && position <= quebec.alpha()) {
            if (position != 0) {
                quebec.charlie += position;
                kilo.red += position;
            } else if (Gf.k.charlie(quebec)) {
                kilo.golf();
            }
        } else {
            StringBuilder sierra = Q0.c.sierra(position, "Invalid number of bytes written: ", ". Should be in 0..");
            sierra.append(quebec.alpha());
            throw new IllegalStateException(sierra.toString().toString());
        }
        Object charlie = mVar.charlie(iVar);
        if (charlie == Od.a.alpha) {
            return charlie;
        }
        return Unit.INSTANCE;
    }

    public static final Object sierra(ag agVar, byte[] bArr, int i4, Pd.c cVar) {
        m mVar = (m) agVar;
        mVar.kilo().uniform(i4, bArr);
        Object golf = golf(mVar, cVar);
        if (golf == Od.a.alpha) {
            return golf;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.ktor.utils.io.ag, io.ktor.utils.io.m] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.utils.io.ai] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object tango(ag agVar, Gf.i iVar, Pd.c cVar) {
        ?? r12;
        int i4;
        ?? r02;
        ai aiVar;
        Gf.i iVar2;
        if (cVar instanceof ai) {
            ai aiVar2 = (ai) cVar;
            int i5 = aiVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aiVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                r12 = aiVar2;
                Object obj = r12.red;
                Od.a aVar = Od.a.alpha;
                i4 = r12.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Gf.i iVar3 = r12.purple;
                        m mVar = r12.alpha;
                        ResultKt.alpha(obj);
                        aiVar = r12;
                        iVar2 = iVar3;
                        r02 = mVar;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    r02 = agVar;
                    aiVar = r12;
                    iVar2 = iVar;
                }
                while (!iVar2.hotel()) {
                    r02 = (m) r02;
                    Gf.a kilo = r02.kilo();
                    long charlie = Y4.charlie(iVar2);
                    kilo.getClass();
                    if (charlie >= 0) {
                        long j5 = charlie;
                        while (j5 > 0) {
                            long h4 = iVar2.h(kilo, j5);
                            if (h4 != -1) {
                                j5 -= h4;
                            } else {
                                throw new EOFException(Q0.c.mike(charlie - j5, " were read.", Q0.c.uniform("Source exhausted before reading ", charlie, " bytes. Only ")));
                            }
                        }
                        aiVar.alpha = r02;
                        aiVar.purple = iVar2;
                        aiVar.silver = 1;
                        if (golf(r02, aiVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        throw new IllegalArgumentException(com.google.android.material.datepicker.j.kilo("byteCount (", charlie, ") < 0").toString());
                    }
                }
                return Unit.INSTANCE;
            }
        }
        r12 = new Pd.c(cVar);
        Object obj2 = r12.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = r12.silver;
        if (i4 == 0) {
        }
        while (!iVar2.hotel()) {
        }
        return Unit.INSTANCE;
    }

    public static com.google.android.play.core.integrity.c uniform(vf.ab abVar, Nd.h coroutineContext, Xd.l lVar, int i4) {
        if ((i4 & 1) != 0) {
            coroutineContext = Nd.i.alpha;
        }
        Intrinsics.echo(abVar, "<this>");
        Intrinsics.echo(coroutineContext, "coroutineContext");
        m mVar = new m(false);
        Y zulu = vf.ad.zulu(abVar, coroutineContext, null, new aj(lVar, mVar, null), 2);
        zulu.crimson(new C1534h0(15, mVar));
        return new com.google.android.play.core.integrity.c(2, mVar, zulu);
    }
}
