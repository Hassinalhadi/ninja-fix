package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: Ie.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0184d extends Oe.o implements Oe.w {

    /* renamed from: i, reason: collision with root package name */
    public static final C0184d f1529i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0181a f1530j = new C0181a(2);

    /* renamed from: a, reason: collision with root package name */
    public int f1531a;
    public final Oe.e alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f1532b;

    /* renamed from: c, reason: collision with root package name */
    public g f1533c;

    /* renamed from: d, reason: collision with root package name */
    public List f1534d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1535f;

    /* renamed from: g, reason: collision with root package name */
    public byte f1536g;

    /* renamed from: h, reason: collision with root package name */
    public int f1537h;
    public int purple;
    public EnumC0183c red;
    public long silver;
    public float teal;
    public double white;
    public int yellow;

    static {
        C0184d c0184d = new C0184d();
        f1529i = c0184d;
        c0184d.india();
    }

    public C0184d() {
        this.f1536g = (byte) -1;
        this.f1537h = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1536g;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.purple & 128) == 128 && !this.f1533c.alpha()) {
            this.f1536g = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < this.f1534d.size(); i4++) {
            if (!((C0184d) this.f1534d.get(i4)).alpha()) {
                this.f1536g = (byte) 0;
                return false;
            }
        }
        this.f1536g = (byte) 1;
        return true;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        C0182b kilo = C0182b.kilo();
        kilo.lima(this);
        return kilo;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1537h;
        if (i5 != -1) {
            return i5;
        }
        if ((this.purple & 1) == 1) {
            i4 = F0.e.bravo(1, this.red.alpha);
        } else {
            i4 = 0;
        }
        if ((this.purple & 2) == 2) {
            long j5 = this.silver;
            i4 += F0.e.hotel((j5 >> 63) ^ (j5 << 1)) + F0.e.india(2);
        }
        if ((this.purple & 4) == 4) {
            i4 += F0.e.india(3) + 4;
        }
        if ((this.purple & 8) == 8) {
            i4 += F0.e.india(4) + 8;
        }
        if ((this.purple & 16) == 16) {
            i4 += F0.e.charlie(5, this.yellow);
        }
        if ((this.purple & 32) == 32) {
            i4 += F0.e.charlie(6, this.f1531a);
        }
        if ((this.purple & 64) == 64) {
            i4 += F0.e.charlie(7, this.f1532b);
        }
        if ((this.purple & 128) == 128) {
            i4 += F0.e.echo(8, this.f1533c);
        }
        for (int i10 = 0; i10 < this.f1534d.size(); i10++) {
            i4 += F0.e.echo(9, (Oe.v) this.f1534d.get(i10));
        }
        if ((this.purple & 512) == 512) {
            i4 += F0.e.charlie(10, this.f1535f);
        }
        if ((this.purple & Barcode.FORMAT_QR_CODE) == 256) {
            i4 += F0.e.charlie(11, this.e);
        }
        int size = this.alpha.size() + i4;
        this.f1537h = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        if ((this.purple & 1) == 1) {
            eVar.whiskey(1, this.red.alpha);
        }
        if ((this.purple & 2) == 2) {
            long j5 = this.silver;
            eVar.cyan(2, 0);
            eVar.crimson((j5 >> 63) ^ (j5 << 1));
        }
        if ((this.purple & 4) == 4) {
            float f5 = this.teal;
            eVar.cyan(3, 5);
            eVar.blue(Float.floatToRawIntBits(f5));
        }
        if ((this.purple & 8) == 8) {
            double d4 = this.white;
            eVar.cyan(4, 1);
            eVar.bronze(Double.doubleToRawLongBits(d4));
        }
        if ((this.purple & 16) == 16) {
            eVar.xray(5, this.yellow);
        }
        if ((this.purple & 32) == 32) {
            eVar.xray(6, this.f1531a);
        }
        if ((this.purple & 64) == 64) {
            eVar.xray(7, this.f1532b);
        }
        if ((this.purple & 128) == 128) {
            eVar.zulu(8, this.f1533c);
        }
        for (int i4 = 0; i4 < this.f1534d.size(); i4++) {
            eVar.zulu(9, (Oe.v) this.f1534d.get(i4));
        }
        if ((this.purple & 512) == 512) {
            eVar.xray(10, this.f1535f);
        }
        if ((this.purple & Barcode.FORMAT_QR_CODE) == 256) {
            eVar.xray(11, this.e);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return C0182b.kilo();
    }

    public final void india() {
        this.red = EnumC0183c.BYTE;
        this.silver = 0L;
        this.teal = 0.0f;
        this.white = 0.0d;
        this.yellow = 0;
        this.f1531a = 0;
        this.f1532b = 0;
        this.f1533c = g.yellow;
        this.f1534d = Collections.EMPTY_LIST;
        this.e = 0;
        this.f1535f = 0;
    }

    public C0184d(C0182b c0182b) {
        this.f1536g = (byte) -1;
        this.f1537h = -1;
        this.alpha = c0182b.alpha;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C0184d(Oe.f fVar, Oe.h hVar) {
        f fVar2;
        this.f1536g = (byte) -1;
        this.f1537h = -1;
        india();
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        char c3 = 0;
        while (true) {
            ?? r5 = 256;
            if (!z2) {
                try {
                    try {
                        int mike = fVar.mike();
                        switch (mike) {
                            case 0:
                                z2 = true;
                            case 8:
                                int juliet = fVar.juliet();
                                EnumC0183c bravo = EnumC0183c.bravo(juliet);
                                if (bravo == null) {
                                    romeo.coral(mike);
                                    romeo.coral(juliet);
                                } else {
                                    this.purple |= 1;
                                    this.red = bravo;
                                }
                            case 16:
                                this.purple |= 2;
                                long kilo = fVar.kilo();
                                this.silver = (-(kilo & 1)) ^ (kilo >>> 1);
                            case 29:
                                this.purple |= 4;
                                this.teal = Float.intBitsToFloat(fVar.hotel());
                            case 33:
                                this.purple |= 8;
                                this.white = Double.longBitsToDouble(fVar.india());
                            case 40:
                                this.purple |= 16;
                                this.yellow = fVar.juliet();
                            case 48:
                                this.purple |= 32;
                                this.f1531a = fVar.juliet();
                            case 56:
                                this.purple |= 64;
                                this.f1532b = fVar.juliet();
                            case 66:
                                if ((this.purple & 128) == 128) {
                                    g gVar = this.f1533c;
                                    gVar.getClass();
                                    fVar2 = new f(0);
                                    fVar2.silver = Collections.EMPTY_LIST;
                                    fVar2.oscar(gVar);
                                } else {
                                    fVar2 = null;
                                }
                                g gVar2 = (g) fVar.foxtrot(g.f1539a, hVar);
                                this.f1533c = gVar2;
                                if (fVar2 != null) {
                                    fVar2.oscar(gVar2);
                                    this.f1533c = fVar2.kilo();
                                }
                                this.purple |= 128;
                            case 74:
                                if ((c3 & 256) != 256) {
                                    this.f1534d = new ArrayList();
                                    c3 = 256;
                                }
                                this.f1534d.add(fVar.foxtrot(f1530j, hVar));
                            case 80:
                                this.purple |= 512;
                                this.f1535f = fVar.juliet();
                            case 88:
                                this.purple |= Barcode.FORMAT_QR_CODE;
                                this.e = fVar.juliet();
                            default:
                                r5 = fVar.papa(mike, romeo);
                                if (r5 == 0) {
                                    z2 = true;
                                }
                        }
                    } catch (Throwable th) {
                        if ((c3 & 256) == r5) {
                            this.f1534d = Collections.unmodifiableList(this.f1534d);
                        }
                        try {
                            romeo.juliet();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            } else {
                if ((c3 & 256) == 256) {
                    this.f1534d = Collections.unmodifiableList(this.f1534d);
                }
                try {
                    romeo.juliet();
                    return;
                } catch (IOException unused2) {
                    return;
                } finally {
                    this.alpha = dVar.foxtrot();
                }
            }
        }
    }
}
