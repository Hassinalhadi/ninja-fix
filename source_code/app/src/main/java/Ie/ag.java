package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class ag extends Oe.l {

    /* renamed from: n, reason: collision with root package name */
    public static final ag f1444n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0181a f1445o = new C0181a(12);

    /* renamed from: a, reason: collision with root package name */
    public int f1446a;

    /* renamed from: b, reason: collision with root package name */
    public List f1447b;

    /* renamed from: c, reason: collision with root package name */
    public aq f1448c;

    /* renamed from: d, reason: collision with root package name */
    public int f1449d;
    public List e;

    /* renamed from: f, reason: collision with root package name */
    public List f1450f;

    /* renamed from: g, reason: collision with root package name */
    public int f1451g;

    /* renamed from: h, reason: collision with root package name */
    public ay f1452h;

    /* renamed from: i, reason: collision with root package name */
    public int f1453i;

    /* renamed from: j, reason: collision with root package name */
    public int f1454j;

    /* renamed from: k, reason: collision with root package name */
    public List f1455k;

    /* renamed from: l, reason: collision with root package name */
    public byte f1456l;

    /* renamed from: m, reason: collision with root package name */
    public int f1457m;
    public final Oe.e purple;
    public int red;
    public int silver;
    public int teal;
    public int white;
    public aq yellow;

    static {
        ag agVar = new ag();
        f1444n = agVar;
        agVar.papa();
    }

    public ag(af afVar) {
        super(afVar);
        this.f1451g = -1;
        this.f1456l = (byte) -1;
        this.f1457m = -1;
        this.purple = afVar.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1456l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i4 = this.red;
        if ((i4 & 4) == 4) {
            if ((i4 & 8) == 8 && !this.yellow.alpha()) {
                this.f1456l = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < this.f1447b.size(); i5++) {
                if (!((av) this.f1447b.get(i5)).alpha()) {
                    this.f1456l = (byte) 0;
                    return false;
                }
            }
            if ((this.red & 32) == 32 && !this.f1448c.alpha()) {
                this.f1456l = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < this.e.size(); i10++) {
                if (!((aq) this.e.get(i10)).alpha()) {
                    this.f1456l = (byte) 0;
                    return false;
                }
            }
            if ((this.red & 128) == 128 && !this.f1452h.alpha()) {
                this.f1456l = (byte) 0;
                return false;
            }
            if (!india()) {
                this.f1456l = (byte) 0;
                return false;
            }
            this.f1456l = (byte) 1;
            return true;
        }
        this.f1456l = (byte) 0;
        return false;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return f1444n;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        af lima = af.lima();
        lima.mike(this);
        return lima;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1457m;
        if (i5 != -1) {
            return i5;
        }
        if ((this.red & 2) == 2) {
            i4 = F0.e.charlie(1, this.teal);
        } else {
            i4 = 0;
        }
        if ((this.red & 4) == 4) {
            i4 += F0.e.charlie(2, this.white);
        }
        if ((this.red & 8) == 8) {
            i4 += F0.e.echo(3, this.yellow);
        }
        for (int i10 = 0; i10 < this.f1447b.size(); i10++) {
            i4 += F0.e.echo(4, (Oe.v) this.f1447b.get(i10));
        }
        if ((this.red & 32) == 32) {
            i4 += F0.e.echo(5, this.f1448c);
        }
        if ((this.red & 128) == 128) {
            i4 += F0.e.echo(6, this.f1452h);
        }
        if ((this.red & Barcode.FORMAT_QR_CODE) == 256) {
            i4 += F0.e.charlie(7, this.f1453i);
        }
        if ((this.red & 512) == 512) {
            i4 += F0.e.charlie(8, this.f1454j);
        }
        if ((this.red & 16) == 16) {
            i4 += F0.e.charlie(9, this.f1446a);
        }
        if ((this.red & 64) == 64) {
            i4 += F0.e.charlie(10, this.f1449d);
        }
        if ((this.red & 1) == 1) {
            i4 += F0.e.charlie(11, this.silver);
        }
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            i4 += F0.e.echo(12, (Oe.v) this.e.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f1450f.size(); i13++) {
            i12 += F0.e.delta(((Integer) this.f1450f.get(i13)).intValue());
        }
        int i14 = i4 + i12;
        if (!this.f1450f.isEmpty()) {
            i14 = i14 + 1 + F0.e.delta(i12);
        }
        this.f1451g = i12;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f1455k.size(); i16++) {
            i15 += F0.e.delta(((Integer) this.f1455k.get(i16)).intValue());
        }
        int size = this.purple.size() + juliet() + (this.f1455k.size() * 2) + i14 + i15;
        this.f1457m = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        w.o oVar = new w.o(this);
        if ((this.red & 2) == 2) {
            eVar.xray(1, this.teal);
        }
        if ((this.red & 4) == 4) {
            eVar.xray(2, this.white);
        }
        if ((this.red & 8) == 8) {
            eVar.zulu(3, this.yellow);
        }
        for (int i4 = 0; i4 < this.f1447b.size(); i4++) {
            eVar.zulu(4, (Oe.v) this.f1447b.get(i4));
        }
        if ((this.red & 32) == 32) {
            eVar.zulu(5, this.f1448c);
        }
        if ((this.red & 128) == 128) {
            eVar.zulu(6, this.f1452h);
        }
        if ((this.red & Barcode.FORMAT_QR_CODE) == 256) {
            eVar.xray(7, this.f1453i);
        }
        if ((this.red & 512) == 512) {
            eVar.xray(8, this.f1454j);
        }
        if ((this.red & 16) == 16) {
            eVar.xray(9, this.f1446a);
        }
        if ((this.red & 64) == 64) {
            eVar.xray(10, this.f1449d);
        }
        if ((this.red & 1) == 1) {
            eVar.xray(11, this.silver);
        }
        for (int i5 = 0; i5 < this.e.size(); i5++) {
            eVar.zulu(12, (Oe.v) this.e.get(i5));
        }
        if (this.f1450f.size() > 0) {
            eVar.coral(106);
            eVar.coral(this.f1451g);
        }
        for (int i10 = 0; i10 < this.f1450f.size(); i10++) {
            eVar.yankee(((Integer) this.f1450f.get(i10)).intValue());
        }
        for (int i11 = 0; i11 < this.f1455k.size(); i11++) {
            eVar.xray(31, ((Integer) this.f1455k.get(i11)).intValue());
        }
        oVar.beige(19000, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return af.lima();
    }

    public final void papa() {
        this.silver = 518;
        this.teal = 2054;
        this.white = 0;
        aq aqVar = aq.f1472m;
        this.yellow = aqVar;
        this.f1446a = 0;
        List list = Collections.EMPTY_LIST;
        this.f1447b = list;
        this.f1448c = aqVar;
        this.f1449d = 0;
        this.e = list;
        this.f1450f = list;
        this.f1452h = ay.e;
        this.f1453i = 0;
        this.f1454j = 0;
        this.f1455k = list;
    }

    public ag() {
        this.f1451g = -1;
        this.f1456l = (byte) -1;
        this.f1457m = -1;
        this.purple = Oe.e.alpha;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0028. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [Oe.k, Ie.ax] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public ag(Oe.f fVar, Oe.h hVar) {
        this.f1451g = -1;
        this.f1456l = (byte) -1;
        this.f1457m = -1;
        papa();
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        char c3 = 0;
        while (true) {
            ?? r5 = 256;
            if (!z2) {
                try {
                    try {
                        try {
                            int mike = fVar.mike();
                            ap apVar = null;
                            ax axVar = null;
                            ap apVar2 = null;
                            switch (mike) {
                                case 0:
                                    z2 = true;
                                case 8:
                                    this.red |= 2;
                                    this.teal = fVar.juliet();
                                case 16:
                                    this.red |= 4;
                                    this.white = fVar.juliet();
                                case 26:
                                    if ((this.red & 8) == 8) {
                                        aq aqVar = this.yellow;
                                        aqVar.getClass();
                                        apVar = aq.romeo(aqVar);
                                    }
                                    aq aqVar2 = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                    this.yellow = aqVar2;
                                    if (apVar != null) {
                                        apVar.mike(aqVar2);
                                        this.yellow = apVar.kilo();
                                    }
                                    this.red |= 8;
                                case 34:
                                    int i4 = (c3 == true ? 1 : 0) & 32;
                                    c3 = c3;
                                    if (i4 != 32) {
                                        this.f1447b = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | ' ';
                                    }
                                    this.f1447b.add(fVar.foxtrot(av.f1502g, hVar));
                                case 42:
                                    if ((this.red & 32) == 32) {
                                        aq aqVar3 = this.f1448c;
                                        aqVar3.getClass();
                                        apVar2 = aq.romeo(aqVar3);
                                    }
                                    aq aqVar4 = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                    this.f1448c = aqVar4;
                                    if (apVar2 != null) {
                                        apVar2.mike(aqVar4);
                                        this.f1448c = apVar2.kilo();
                                    }
                                    this.red |= 32;
                                case 50:
                                    if ((this.red & 128) == 128) {
                                        ay ayVar = this.f1452h;
                                        ayVar.getClass();
                                        ?? kVar = new Oe.k();
                                        aq aqVar5 = aq.f1472m;
                                        kVar.yellow = aqVar5;
                                        kVar.f1509b = aqVar5;
                                        kVar.lima(ayVar);
                                        axVar = kVar;
                                    }
                                    ay ayVar2 = (ay) fVar.foxtrot(ay.f1511f, hVar);
                                    this.f1452h = ayVar2;
                                    if (axVar != null) {
                                        axVar.lima(ayVar2);
                                        this.f1452h = axVar.kilo();
                                    }
                                    this.red |= 128;
                                case 56:
                                    this.red |= Barcode.FORMAT_QR_CODE;
                                    this.f1453i = fVar.juliet();
                                case 64:
                                    this.red |= 512;
                                    this.f1454j = fVar.juliet();
                                case 72:
                                    this.red |= 16;
                                    this.f1446a = fVar.juliet();
                                case 80:
                                    this.red |= 64;
                                    this.f1449d = fVar.juliet();
                                case 88:
                                    this.red |= 1;
                                    this.silver = fVar.juliet();
                                case 98:
                                    int i5 = (c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE;
                                    c3 = c3;
                                    if (i5 != 256) {
                                        this.e = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 256;
                                    }
                                    this.e.add(fVar.foxtrot(aq.f1473n, hVar));
                                case 104:
                                    int i10 = (c3 == true ? 1 : 0) & 512;
                                    c3 = c3;
                                    if (i10 != 512) {
                                        this.f1450f = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 512;
                                    }
                                    this.f1450f.add(Integer.valueOf(fVar.juliet()));
                                case 106:
                                    int charlie = fVar.charlie(fVar.juliet());
                                    int i11 = (c3 == true ? 1 : 0) & 512;
                                    c3 = c3;
                                    if (i11 != 512) {
                                        c3 = c3;
                                        if (fVar.alpha() > 0) {
                                            this.f1450f = new ArrayList();
                                            c3 = (c3 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (fVar.alpha() > 0) {
                                        this.f1450f.add(Integer.valueOf(fVar.juliet()));
                                    }
                                    fVar.bravo(charlie);
                                case 248:
                                    int i12 = (c3 == true ? 1 : 0) & 8192;
                                    c3 = c3;
                                    if (i12 != 8192) {
                                        this.f1455k = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 8192;
                                    }
                                    this.f1455k.add(Integer.valueOf(fVar.juliet()));
                                case 250:
                                    int charlie2 = fVar.charlie(fVar.juliet());
                                    int i13 = (c3 == true ? 1 : 0) & 8192;
                                    c3 = c3;
                                    if (i13 != 8192) {
                                        c3 = c3;
                                        if (fVar.alpha() > 0) {
                                            this.f1455k = new ArrayList();
                                            c3 = (c3 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (fVar.alpha() > 0) {
                                        this.f1455k.add(Integer.valueOf(fVar.juliet()));
                                    }
                                    fVar.bravo(charlie2);
                                default:
                                    r5 = november(fVar, romeo, hVar, mike);
                                    if (r5 == 0) {
                                        z2 = true;
                                    }
                            }
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e4) {
                        throw e4.setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (((c3 == true ? 1 : 0) & 32) == 32) {
                        this.f1447b = Collections.unmodifiableList(this.f1447b);
                    }
                    if (((c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE) == r5) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if (((c3 == true ? 1 : 0) & 512) == 512) {
                        this.f1450f = Collections.unmodifiableList(this.f1450f);
                    }
                    if (((c3 == true ? 1 : 0) & 8192) == 8192) {
                        this.f1455k = Collections.unmodifiableList(this.f1455k);
                    }
                    try {
                        romeo.juliet();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.purple = dVar.foxtrot();
                        throw th2;
                    }
                    this.purple = dVar.foxtrot();
                    mike();
                    throw th;
                }
            } else {
                if (((c3 == true ? 1 : 0) & 32) == 32) {
                    this.f1447b = Collections.unmodifiableList(this.f1447b);
                }
                if (((c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE) == 256) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if (((c3 == true ? 1 : 0) & 512) == 512) {
                    this.f1450f = Collections.unmodifiableList(this.f1450f);
                }
                if (((c3 == true ? 1 : 0) & 8192) == 8192) {
                    this.f1455k = Collections.unmodifiableList(this.f1455k);
                }
                try {
                    romeo.juliet();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.purple = dVar.foxtrot();
                    throw th3;
                }
                this.purple = dVar.foxtrot();
                mike();
                return;
            }
        }
    }
}
