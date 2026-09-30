package d0;

import E.s;
import Q0.n;
import a0.C0354h;
import a0.ah;
import a0.ai;
import a0.aj;
import a0.ao;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import bv.am;
import bv.av;
import bx.C0769g;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s6.AbstractC2627c7;
import t6.L2;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1564b {
    public final InterfaceC1566d alpha;
    public Outline foxtrot;
    public float juliet;
    public ao kilo;
    public C0354h lima;
    public C0354h mike;
    public boolean november;
    public c0.b oscar;
    public Be.e papa;
    public int quebec;
    public boolean sierra;
    public long tango;
    public long uniform;
    public long victor;
    public boolean whiskey;
    public RectF xray;
    public Q0.d bravo = c0.c.alpha;
    public n charlie = n.alpha;
    public Lambda delta = C1563a.purple;
    public final C0769g echo = new C0769g(6, this);
    public boolean golf = true;
    public long hotel = 0;
    public long india = 9205357640488583168L;
    public final s romeo = new Object();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.delta(lowerCase, "toLowerCase(...)");
        Intrinsics.areEqual(lowerCase, "robolectric");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, E.s] */
    public C1564b(InterfaceC1566d interfaceC1566d) {
        this.alpha = interfaceC1566d;
        interfaceC1566d.blue(false);
        this.tango = 0L;
        this.uniform = 0L;
        this.victor = 9205357640488583168L;
    }

    public final void alpha() {
        Outline outline;
        if (this.golf) {
            boolean z2 = this.whiskey;
            InterfaceC1566d interfaceC1566d = this.alpha;
            Outline outline2 = null;
            if (!z2 && interfaceC1566d.gold() <= 0.0f) {
                interfaceC1566d.blue(false);
                interfaceC1566d.golf(null, 0L);
            } else {
                C0354h c0354h = this.lima;
                if (c0354h != null) {
                    RectF rectF = this.xray;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.xray = rectF;
                    }
                    Path path = c0354h.alpha;
                    path.computeBounds(rectF, false);
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 <= 28 && !path.isConvex()) {
                        Outline outline3 = this.foxtrot;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.november = true;
                        outline = null;
                    } else {
                        outline = this.foxtrot;
                        if (outline == null) {
                            outline = new Outline();
                            this.foxtrot = outline;
                        }
                        if (i4 >= 30) {
                            outline.setPath(path);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.november = !outline.canClip();
                    }
                    this.lima = c0354h;
                    if (outline != null) {
                        outline.setAlpha(interfaceC1566d.alpha());
                        outline2 = outline;
                    }
                    interfaceC1566d.golf(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.november && this.whiskey) {
                        interfaceC1566d.blue(false);
                        interfaceC1566d.india();
                    } else {
                        interfaceC1566d.blue(this.whiskey);
                    }
                } else {
                    interfaceC1566d.blue(this.whiskey);
                    Outline outline4 = this.foxtrot;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.foxtrot = outline4;
                    }
                    Outline outline5 = outline4;
                    long bravo = AbstractC2627c7.bravo(this.uniform);
                    long j5 = this.hotel;
                    long j6 = this.india;
                    if (j6 != 9205357640488583168L) {
                        bravo = j6;
                    }
                    int i5 = (int) (j5 >> 32);
                    int i10 = (int) (j5 & 4294967295L);
                    int i11 = (int) (bravo >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i5)), Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11) + Float.intBitsToFloat(i5)), Math.round(Float.intBitsToFloat((int) (bravo & 4294967295L)) + Float.intBitsToFloat(i10)), this.juliet);
                    outline5.setAlpha(interfaceC1566d.alpha());
                    interfaceC1566d.golf(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i11)) << 32));
                }
            }
        }
        this.golf = false;
    }

    public final void bravo() {
        if (this.sierra && this.quebec == 0) {
            s sVar = this.romeo;
            C1564b c1564b = (C1564b) sVar.bravo;
            if (c1564b != null) {
                c1564b.echo();
                sVar.bravo = null;
            }
            am amVar = (am) sVar.delta;
            if (amVar != null) {
                Object[] objArr = amVar.bravo;
                long[] jArr = amVar.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j5 = jArr[i4];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i10 = 0; i10 < i5; i10++) {
                                if ((255 & j5) < 128) {
                                    ((C1564b) objArr[(i4 << 3) + i10]).echo();
                                }
                                j5 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                amVar.bravo();
            }
            this.alpha.india();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void charlie(c0.d dVar) {
        s sVar = this.romeo;
        sVar.charlie = (C1564b) sVar.bravo;
        am amVar = (am) sVar.delta;
        if (amVar != null && amVar.hotel()) {
            am amVar2 = (am) sVar.echo;
            if (amVar2 == null) {
                am amVar3 = av.alpha;
                amVar2 = new am();
                sVar.echo = amVar2;
            }
            amVar2.juliet(amVar);
            amVar.bravo();
        }
        sVar.alpha = true;
        this.delta.invoke(dVar);
        sVar.alpha = false;
        C1564b c1564b = (C1564b) sVar.charlie;
        if (c1564b != null) {
            c1564b.echo();
        }
        am amVar4 = (am) sVar.echo;
        if (amVar4 != null && amVar4.hotel()) {
            Object[] objArr = amVar4.bravo;
            long[] jArr = amVar4.alpha;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j5 = jArr[i4];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i10 = 0; i10 < i5; i10++) {
                            if ((255 & j5) < 128) {
                                ((C1564b) objArr[(i4 << 3) + i10]).echo();
                            }
                            j5 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            amVar4.bravo();
        }
    }

    public final ao delta() {
        ao aiVar;
        ao aoVar = this.kilo;
        C0354h c0354h = this.lima;
        if (aoVar != null) {
            return aoVar;
        }
        if (c0354h != null) {
            ah ahVar = new ah(c0354h);
            this.kilo = ahVar;
            return ahVar;
        }
        long bravo = AbstractC2627c7.bravo(this.uniform);
        long j5 = this.hotel;
        long j6 = this.india;
        if (j6 != 9205357640488583168L) {
            bravo = j6;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (bravo >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (bravo & 4294967295L)) + intBitsToFloat2;
        if (this.juliet > 0.0f) {
            aiVar = new aj(L2.alpha(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            aiVar = new ai(new Z.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.kilo = aiVar;
        return aiVar;
    }

    public final void echo() {
        this.quebec--;
        bravo();
    }

    public final void foxtrot(long j5, long j6, float f5) {
        if (Z.b.bravo(this.hotel, j5) && Z.e.alpha(this.india, j6) && this.juliet == f5 && this.lima == null) {
            return;
        }
        this.kilo = null;
        this.lima = null;
        this.golf = true;
        this.november = false;
        this.hotel = j5;
        this.india = j6;
        this.juliet = f5;
        alpha();
    }
}
