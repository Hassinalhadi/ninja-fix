package io.ktor.utils.io;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q {
    public final t alpha;
    public final Hf.a bravo;
    public final ag charlie;
    public final long delta;
    public final Gf.i echo;
    public final int[] foxtrot;
    public final Gf.a golf;
    public long hotel;
    public int india;

    /* JADX WARN: Type inference failed for: r3v5, types: [Gf.a, java.lang.Object] */
    public q(t channel, Hf.a matchString, ag writeChannel, long j5) {
        Intrinsics.echo(channel, "channel");
        Intrinsics.echo(matchString, "matchString");
        Intrinsics.echo(writeChannel, "writeChannel");
        this.alpha = channel;
        this.bravo = matchString;
        this.charlie = writeChannel;
        this.delta = j5;
        byte[] bArr = matchString.alpha;
        if (bArr.length > 0) {
            this.echo = channel.golf();
            int[] iArr = new int[bArr.length];
            int length = bArr.length;
            int i4 = 0;
            for (int i5 = 1; i5 < length; i5++) {
                while (i4 > 0 && matchString.alpha(i5) != matchString.alpha(i4)) {
                    i4 = iArr[i4 - 1];
                }
                if (matchString.alpha(i5) == matchString.alpha(i4)) {
                    i4++;
                }
                iArr[i5] = i4;
            }
            this.foxtrot = iArr;
            this.golf = new Object();
            return;
        }
        throw new IllegalArgumentException("Empty match string not permitted for scanning");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0177, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r1 == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019f, code lost:
    
        if (io.ktor.utils.io.ak.golf(r4, r2) == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c6, code lost:
    
        if (io.ktor.utils.io.ak.golf(r4, r2) == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        if (r11 == (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        if (r16 <= r11) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r6 = Gf.k.bravo(r5, r1, java.lang.Math.max((int) (r21 - r11), 0), java.lang.Math.min(r5.bravo(), (int) (r16 - r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fc, code lost:
    
        if (r6 == (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0101, code lost:
    
        r11 = r11 + r5.bravo();
        r5 = r5.foxtrot;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
    
        if (r5 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010d, code lost:
    
        if (r11 < r16) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fe, code lost:
    
        r11 = r11 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0115, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012d, code lost:
    
        if (r11 == (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0133, code lost:
    
        if (r16 <= r11) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0135, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        r6 = Gf.k.bravo(r5, r1, java.lang.Math.max((int) (r21 - r11), 0), java.lang.Math.min(r5.bravo(), (int) (r16 - r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014f, code lost:
    
        if (r6 == (-1)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        r11 = r11 + r5.bravo();
        r5 = r5.foxtrot;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015a, code lost:
    
        if (r5 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r11 < r16) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167 A[LOOP:0: B:29:0x0075->B:38:0x0167, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017a A[EDGE_INSN: B:39:0x017a->B:40:0x017a BREAK  A[LOOP:0: B:29:0x0075->B:38:0x0167], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x019f -> B:18:0x01a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Pd.c cVar) {
        n nVar;
        int i4;
        long j5;
        long j6;
        Gf.a delta;
        long min;
        Gf.g gVar;
        long j7;
        long j10;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i5 = nVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                nVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = nVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = nVar.red;
                int i10 = 1;
                Gf.i iVar = this.echo;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                ResultKt.alpha(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.alpha(obj);
                        char c3 = 2;
                        i10 = 1;
                        if (iVar.hotel()) {
                            nVar.red = i10;
                            obj = this.alpha.foxtrot(i10, nVar);
                        }
                        byte alpha = this.bravo.alpha(0);
                        Intrinsics.echo(iVar, "<this>");
                        j5 = 0;
                        loop0: while (j5 < Long.MAX_VALUE && iVar.request(j5 + 1)) {
                            delta = iVar.delta();
                            long min2 = Math.min(Long.MAX_VALUE, iVar.delta().red);
                            Intrinsics.echo(delta, "<this>");
                            min = Math.min(min2, delta.red);
                            Gf.k.alpha(delta.red, j5, min);
                            if (j5 != min && (gVar = delta.alpha) != null) {
                                j7 = delta.red;
                                if (j7 - j5 >= j5) {
                                    Gf.g gVar2 = delta.purple;
                                    while (gVar2 != null && j7 > j5) {
                                        j10 = j5;
                                        j7 -= gVar2.charlie - gVar2.bravo;
                                        if (j7 <= j10) {
                                            break;
                                        }
                                        gVar2 = gVar2.golf;
                                        j5 = j10;
                                    }
                                    j10 = j5;
                                } else {
                                    long j11 = j5;
                                    j7 = 0;
                                    while (gVar != null) {
                                        long j12 = (gVar.charlie - gVar.bravo) + j7;
                                        if (j12 > j11) {
                                            break;
                                        }
                                        gVar = gVar.foxtrot;
                                        j7 = j12;
                                    }
                                }
                                if (j6 == -1) {
                                    break;
                                }
                                j5 = iVar.delta().red;
                            }
                            j6 = -1;
                            if (j6 == -1) {
                            }
                        }
                        j6 = -1;
                        ag agVar = this.charlie;
                        if (j6 == -1) {
                            Gf.a aVar2 = (Gf.a) iVar;
                            bravo(aVar2.red);
                            this.hotel = aVar2.papa(((m) agVar).kilo()) + this.hotel;
                            c3 = 2;
                            nVar.red = 2;
                        } else {
                            bravo(j6);
                            long j13 = this.hotel;
                            Gf.a kilo = ((m) agVar).kilo();
                            Intrinsics.charlie(kilo, "null cannot be cast to non-null type kotlinx.io.Buffer");
                            this.hotel = iVar.h(kilo, j6) + j13;
                            nVar.red = 3;
                        }
                        return aVar;
                    }
                    ResultKt.alpha(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    byte alpha2 = this.bravo.alpha(0);
                    Intrinsics.echo(iVar, "<this>");
                    j5 = 0;
                    loop0: while (j5 < Long.MAX_VALUE) {
                        delta = iVar.delta();
                        long min22 = Math.min(Long.MAX_VALUE, iVar.delta().red);
                        Intrinsics.echo(delta, "<this>");
                        min = Math.min(min22, delta.red);
                        Gf.k.alpha(delta.red, j5, min);
                        if (j5 != min) {
                            j7 = delta.red;
                            if (j7 - j5 >= j5) {
                            }
                            if (j6 == -1) {
                            }
                        }
                        j6 = -1;
                        if (j6 == -1) {
                        }
                    }
                    j6 = -1;
                    ag agVar2 = this.charlie;
                    if (j6 == -1) {
                    }
                    return aVar;
                }
                ResultKt.alpha(obj);
                if (iVar.hotel()) {
                }
                byte alpha22 = this.bravo.alpha(0);
                Intrinsics.echo(iVar, "<this>");
                j5 = 0;
                loop0: while (j5 < Long.MAX_VALUE) {
                }
                j6 = -1;
                ag agVar22 = this.charlie;
                if (j6 == -1) {
                }
                return aVar;
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.alpha;
        Od.a aVar3 = Od.a.alpha;
        i4 = nVar.red;
        int i102 = 1;
        Gf.i iVar2 = this.echo;
        if (i4 == 0) {
        }
    }

    public final void bravo(long j5) {
        long j6 = this.hotel + j5;
        long j7 = this.delta;
        if (j6 <= j7) {
            return;
        }
        StringBuilder uniform = Q0.c.uniform("Limit of ", j7, " bytes exceeded while searching for \"");
        Hf.a aVar = this.bravo;
        Intrinsics.echo(aVar, "<this>");
        uniform.append(kotlin.text.r.oscar(kotlin.text.r.foxtrot(aVar.alpha), "\n", "\\n"));
        uniform.append('\"');
        throw new IOException(uniform.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r15 != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004a, code lost:
    
        if (r15 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0040 -> B:21:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x004a -> B:17:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object charlie(Pd.c cVar) {
        o oVar;
        int i4;
        int i5;
        Hf.a aVar;
        int i10;
        int i11;
        m mVar;
        int i12;
        Object golf;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i13 = oVar.red;
            if ((i13 & RecyclerView.UNDEFINED_DURATION) != 0) {
                oVar.red = i13 - RecyclerView.UNDEFINED_DURATION;
                Object obj = oVar.alpha;
                Od.a aVar2 = Od.a.alpha;
                i4 = oVar.red;
                Gf.i iVar = this.echo;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            this.hotel++;
                            return Boolean.FALSE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    byte readByte = iVar.readByte();
                    i5 = this.india;
                    Gf.a aVar3 = this.golf;
                    aVar = this.bravo;
                    if (i5 > 0 && readByte != aVar.alpha(i5)) {
                        int i14 = this.india;
                        while (true) {
                            i11 = this.india;
                            if (i11 <= 0 || readByte == aVar.alpha(i11)) {
                                break;
                            }
                            this.india = this.foxtrot[this.india - 1];
                        }
                        long j5 = i14 - this.india;
                        bravo(j5);
                        long j6 = this.hotel;
                        mVar = (m) this.charlie;
                        Gf.a kilo = mVar.kilo();
                        Intrinsics.charlie(kilo, "null cannot be cast to non-null type kotlinx.io.Buffer");
                        this.hotel = aVar3.h(kilo, j5) + j6;
                        i12 = this.india;
                        if (i12 == 0 && readByte != aVar.alpha(i12)) {
                            oVar.red = 2;
                            mVar.kilo().beige(readByte);
                            golf = ak.golf(mVar, oVar);
                            if (golf != Od.a.alpha) {
                                golf = Unit.INSTANCE;
                            }
                        }
                    }
                    i10 = this.india + 1;
                    this.india = i10;
                    if (i10 == aVar.alpha.length) {
                        return Boolean.TRUE;
                    }
                    aVar3.beige(readByte);
                    if (iVar.hotel()) {
                        oVar.red = 1;
                        obj = this.alpha.foxtrot(1, oVar);
                    }
                    byte readByte2 = iVar.readByte();
                    i5 = this.india;
                    Gf.a aVar32 = this.golf;
                    aVar = this.bravo;
                    if (i5 > 0) {
                        int i142 = this.india;
                        while (true) {
                            i11 = this.india;
                            if (i11 <= 0) {
                                break;
                            }
                            break;
                            this.india = this.foxtrot[this.india - 1];
                        }
                        long j52 = i142 - this.india;
                        bravo(j52);
                        long j62 = this.hotel;
                        mVar = (m) this.charlie;
                        Gf.a kilo2 = mVar.kilo();
                        Intrinsics.charlie(kilo2, "null cannot be cast to non-null type kotlinx.io.Buffer");
                        this.hotel = aVar32.h(kilo2, j52) + j62;
                        i12 = this.india;
                        if (i12 == 0) {
                            oVar.red = 2;
                            mVar.kilo().beige(readByte2);
                            golf = ak.golf(mVar, oVar);
                            if (golf != Od.a.alpha) {
                            }
                        }
                    }
                    i10 = this.india + 1;
                    this.india = i10;
                    if (i10 == aVar.alpha.length) {
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (iVar.hotel()) {
                    }
                    byte readByte22 = iVar.readByte();
                    i5 = this.india;
                    Gf.a aVar322 = this.golf;
                    aVar = this.bravo;
                    if (i5 > 0) {
                    }
                    i10 = this.india + 1;
                    this.india = i10;
                    if (i10 == aVar.alpha.length) {
                    }
                }
            }
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.alpha;
        Od.a aVar22 = Od.a.alpha;
        i4 = oVar.red;
        Gf.i iVar2 = this.echo;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r2.charlie(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (alpha(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d9 -> B:19:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delta(boolean z2, Pd.c cVar) {
        p pVar;
        int i4;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i5 = pVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                pVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = pVar.purple;
                Object obj2 = Od.a.alpha;
                i4 = pVar.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    ResultKt.alpha(obj);
                                    return new Long(this.hotel);
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z2 = pVar.alpha;
                            ResultKt.alpha(obj);
                            if (((Boolean) obj).booleanValue()) {
                                return new Long(this.hotel);
                            }
                            if (this.echo.hotel()) {
                                pVar.alpha = z2;
                                pVar.silver = 1;
                                obj = this.alpha.foxtrot(1, pVar);
                            }
                            pVar.alpha = z2;
                            pVar.silver = 2;
                        } else {
                            z2 = pVar.alpha;
                            ResultKt.alpha(obj);
                            pVar.alpha = z2;
                            pVar.silver = 3;
                            obj = charlie(pVar);
                        }
                    } else {
                        z2 = pVar.alpha;
                        ResultKt.alpha(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                long j5 = this.hotel;
                                m mVar = (m) this.charlie;
                                this.hotel = this.golf.papa(mVar.kilo()) + j5;
                                pVar.silver = 4;
                            } else {
                                StringBuilder sb2 = new StringBuilder("Expected \"");
                                Hf.a aVar = this.bravo;
                                Intrinsics.echo(aVar, "<this>");
                                sb2.append(kotlin.text.r.oscar(kotlin.text.r.foxtrot(aVar.alpha), "\n", "\\n"));
                                sb2.append("\" but encountered end of input");
                                throw new IOException(sb2.toString());
                            }
                        }
                        pVar.alpha = z2;
                        pVar.silver = 2;
                    }
                } else {
                    ResultKt.alpha(obj);
                    this.hotel = 0L;
                    if (this.echo.hotel()) {
                    }
                    pVar.alpha = z2;
                    pVar.silver = 2;
                }
            }
        }
        pVar = new p(this, cVar);
        Object obj3 = pVar.purple;
        Object obj22 = Od.a.alpha;
        i4 = pVar.silver;
        if (i4 == 0) {
        }
    }
}
