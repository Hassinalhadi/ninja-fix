package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class y extends Oe.l {

    /* renamed from: n, reason: collision with root package name */
    public static final y f1610n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0181a f1611o = new C0181a(9);

    /* renamed from: a, reason: collision with root package name */
    public int f1612a;

    /* renamed from: b, reason: collision with root package name */
    public List f1613b;

    /* renamed from: c, reason: collision with root package name */
    public aq f1614c;

    /* renamed from: d, reason: collision with root package name */
    public int f1615d;
    public List e;

    /* renamed from: f, reason: collision with root package name */
    public List f1616f;

    /* renamed from: g, reason: collision with root package name */
    public int f1617g;

    /* renamed from: h, reason: collision with root package name */
    public List f1618h;

    /* renamed from: i, reason: collision with root package name */
    public aw f1619i;

    /* renamed from: j, reason: collision with root package name */
    public List f1620j;

    /* renamed from: k, reason: collision with root package name */
    public n f1621k;

    /* renamed from: l, reason: collision with root package name */
    public byte f1622l;

    /* renamed from: m, reason: collision with root package name */
    public int f1623m;
    public final Oe.e purple;
    public int red;
    public int silver;
    public int teal;
    public int white;
    public aq yellow;

    static {
        y yVar = new y();
        f1610n = yVar;
        yVar.papa();
    }

    public y(x xVar) {
        super(xVar);
        this.f1617g = -1;
        this.f1622l = (byte) -1;
        this.f1623m = -1;
        this.purple = xVar.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.f1622l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i4 = this.red;
        if ((i4 & 4) == 4) {
            if ((i4 & 8) == 8 && !this.yellow.alpha()) {
                this.f1622l = (byte) 0;
                return false;
            }
            for (int i5 = 0; i5 < this.f1613b.size(); i5++) {
                if (!((av) this.f1613b.get(i5)).alpha()) {
                    this.f1622l = (byte) 0;
                    return false;
                }
            }
            if ((this.red & 32) == 32 && !this.f1614c.alpha()) {
                this.f1622l = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < this.e.size(); i10++) {
                if (!((aq) this.e.get(i10)).alpha()) {
                    this.f1622l = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < this.f1618h.size(); i11++) {
                if (!((ay) this.f1618h.get(i11)).alpha()) {
                    this.f1622l = (byte) 0;
                    return false;
                }
            }
            if ((this.red & 128) == 128 && !this.f1619i.alpha()) {
                this.f1622l = (byte) 0;
                return false;
            }
            if ((this.red & Barcode.FORMAT_QR_CODE) == 256 && !this.f1621k.alpha()) {
                this.f1622l = (byte) 0;
                return false;
            }
            if (!india()) {
                this.f1622l = (byte) 0;
                return false;
            }
            this.f1622l = (byte) 1;
            return true;
        }
        this.f1622l = (byte) 0;
        return false;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return f1610n;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        x lima = x.lima();
        lima.mike(this);
        return lima;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.f1623m;
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
        for (int i10 = 0; i10 < this.f1613b.size(); i10++) {
            i4 += F0.e.echo(4, (Oe.v) this.f1613b.get(i10));
        }
        if ((this.red & 32) == 32) {
            i4 += F0.e.echo(5, this.f1614c);
        }
        for (int i11 = 0; i11 < this.f1618h.size(); i11++) {
            i4 += F0.e.echo(6, (Oe.v) this.f1618h.get(i11));
        }
        if ((this.red & 16) == 16) {
            i4 += F0.e.charlie(7, this.f1612a);
        }
        if ((this.red & 64) == 64) {
            i4 += F0.e.charlie(8, this.f1615d);
        }
        if ((this.red & 1) == 1) {
            i4 += F0.e.charlie(9, this.silver);
        }
        for (int i12 = 0; i12 < this.e.size(); i12++) {
            i4 += F0.e.echo(10, (Oe.v) this.e.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f1616f.size(); i14++) {
            i13 += F0.e.delta(((Integer) this.f1616f.get(i14)).intValue());
        }
        int i15 = i4 + i13;
        if (!this.f1616f.isEmpty()) {
            i15 = i15 + 1 + F0.e.delta(i13);
        }
        this.f1617g = i13;
        if ((this.red & 128) == 128) {
            i15 += F0.e.echo(30, this.f1619i);
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f1620j.size(); i17++) {
            i16 += F0.e.delta(((Integer) this.f1620j.get(i17)).intValue());
        }
        int size = (this.f1620j.size() * 2) + i15 + i16;
        if ((this.red & Barcode.FORMAT_QR_CODE) == 256) {
            size += F0.e.echo(32, this.f1621k);
        }
        int size2 = this.purple.size() + juliet() + size;
        this.f1623m = size2;
        return size2;
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
        for (int i4 = 0; i4 < this.f1613b.size(); i4++) {
            eVar.zulu(4, (Oe.v) this.f1613b.get(i4));
        }
        if ((this.red & 32) == 32) {
            eVar.zulu(5, this.f1614c);
        }
        for (int i5 = 0; i5 < this.f1618h.size(); i5++) {
            eVar.zulu(6, (Oe.v) this.f1618h.get(i5));
        }
        if ((this.red & 16) == 16) {
            eVar.xray(7, this.f1612a);
        }
        if ((this.red & 64) == 64) {
            eVar.xray(8, this.f1615d);
        }
        if ((this.red & 1) == 1) {
            eVar.xray(9, this.silver);
        }
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            eVar.zulu(10, (Oe.v) this.e.get(i10));
        }
        if (this.f1616f.size() > 0) {
            eVar.coral(90);
            eVar.coral(this.f1617g);
        }
        for (int i11 = 0; i11 < this.f1616f.size(); i11++) {
            eVar.yankee(((Integer) this.f1616f.get(i11)).intValue());
        }
        if ((this.red & 128) == 128) {
            eVar.zulu(30, this.f1619i);
        }
        for (int i12 = 0; i12 < this.f1620j.size(); i12++) {
            eVar.xray(31, ((Integer) this.f1620j.get(i12)).intValue());
        }
        if ((this.red & Barcode.FORMAT_QR_CODE) == 256) {
            eVar.zulu(32, this.f1621k);
        }
        oVar.beige(19000, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return x.lima();
    }

    public final void papa() {
        this.silver = 6;
        this.teal = 6;
        this.white = 0;
        aq aqVar = aq.f1472m;
        this.yellow = aqVar;
        this.f1612a = 0;
        List list = Collections.EMPTY_LIST;
        this.f1613b = list;
        this.f1614c = aqVar;
        this.f1615d = 0;
        this.e = list;
        this.f1616f = list;
        this.f1618h = list;
        this.f1619i = aw.yellow;
        this.f1620j = list;
        this.f1621k = n.teal;
    }

    public y() {
        this.f1617g = -1;
        this.f1622l = (byte) -1;
        this.f1623m = -1;
        this.purple = Oe.e.alpha;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public y(Oe.f fVar, Oe.h hVar) {
        this.f1617g = -1;
        this.f1622l = (byte) -1;
        this.f1623m = -1;
        papa();
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        boolean z2 = false;
        char c3 = 0;
        while (true) {
            ?? r5 = 1024;
            if (!z2) {
                try {
                    try {
                        int mike = fVar.mike();
                        ap apVar = null;
                        m mVar = null;
                        f fVar2 = null;
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
                                    this.f1613b = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | ' ';
                                }
                                this.f1613b.add(fVar.foxtrot(av.f1502g, hVar));
                            case 42:
                                if ((this.red & 32) == 32) {
                                    aq aqVar3 = this.f1614c;
                                    aqVar3.getClass();
                                    apVar2 = aq.romeo(aqVar3);
                                }
                                aq aqVar4 = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                this.f1614c = aqVar4;
                                if (apVar2 != null) {
                                    apVar2.mike(aqVar4);
                                    this.f1614c = apVar2.kilo();
                                }
                                this.red |= 32;
                            case 50:
                                int i5 = (c3 == true ? 1 : 0) & Barcode.FORMAT_UPC_E;
                                c3 = c3;
                                if (i5 != 1024) {
                                    this.f1618h = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 1024;
                                }
                                this.f1618h.add(fVar.foxtrot(ay.f1511f, hVar));
                            case 56:
                                this.red |= 16;
                                this.f1612a = fVar.juliet();
                            case 64:
                                this.red |= 64;
                                this.f1615d = fVar.juliet();
                            case 72:
                                this.red |= 1;
                                this.silver = fVar.juliet();
                            case 82:
                                int i10 = (c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE;
                                c3 = c3;
                                if (i10 != 256) {
                                    this.e = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 256;
                                }
                                this.e.add(fVar.foxtrot(aq.f1473n, hVar));
                            case 88:
                                int i11 = (c3 == true ? 1 : 0) & 512;
                                c3 = c3;
                                if (i11 != 512) {
                                    this.f1616f = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 512;
                                }
                                this.f1616f.add(Integer.valueOf(fVar.juliet()));
                            case 90:
                                int charlie = fVar.charlie(fVar.juliet());
                                int i12 = (c3 == true ? 1 : 0) & 512;
                                c3 = c3;
                                if (i12 != 512) {
                                    c3 = c3;
                                    if (fVar.alpha() > 0) {
                                        this.f1616f = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1616f.add(Integer.valueOf(fVar.juliet()));
                                }
                                fVar.bravo(charlie);
                            case 242:
                                if ((this.red & 128) == 128) {
                                    aw awVar = this.f1619i;
                                    awVar.getClass();
                                    fVar2 = aw.india(awVar);
                                }
                                aw awVar2 = (aw) fVar.foxtrot(aw.f1507a, hVar);
                                this.f1619i = awVar2;
                                if (fVar2 != null) {
                                    fVar2.papa(awVar2);
                                    this.f1619i = fVar2.lima();
                                }
                                this.red |= 128;
                            case 248:
                                int i13 = (c3 == true ? 1 : 0) & 4096;
                                c3 = c3;
                                if (i13 != 4096) {
                                    this.f1620j = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 4096;
                                }
                                this.f1620j.add(Integer.valueOf(fVar.juliet()));
                            case 250:
                                int charlie2 = fVar.charlie(fVar.juliet());
                                int i14 = (c3 == true ? 1 : 0) & 4096;
                                c3 = c3;
                                if (i14 != 4096) {
                                    c3 = c3;
                                    if (fVar.alpha() > 0) {
                                        this.f1620j = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1620j.add(Integer.valueOf(fVar.juliet()));
                                }
                                fVar.bravo(charlie2);
                            case 258:
                                if ((this.red & Barcode.FORMAT_QR_CODE) == 256) {
                                    n nVar = this.f1621k;
                                    nVar.getClass();
                                    mVar = new m(0);
                                    mVar.silver = Collections.EMPTY_LIST;
                                    mVar.november(nVar);
                                }
                                n nVar2 = (n) fVar.foxtrot(n.white, hVar);
                                this.f1621k = nVar2;
                                if (mVar != null) {
                                    mVar.november(nVar2);
                                    this.f1621k = mVar.juliet();
                                }
                                this.red |= Barcode.FORMAT_QR_CODE;
                            default:
                                r5 = november(fVar, romeo, hVar, mike);
                                if (r5 == 0) {
                                    z2 = true;
                                }
                        }
                    } catch (Throwable th) {
                        if (((c3 == true ? 1 : 0) & 32) == 32) {
                            this.f1613b = Collections.unmodifiableList(this.f1613b);
                        }
                        if (((c3 == true ? 1 : 0) & Barcode.FORMAT_UPC_E) == r5) {
                            this.f1618h = Collections.unmodifiableList(this.f1618h);
                        }
                        if (((c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE) == 256) {
                            this.e = Collections.unmodifiableList(this.e);
                        }
                        if (((c3 == true ? 1 : 0) & 512) == 512) {
                            this.f1616f = Collections.unmodifiableList(this.f1616f);
                        }
                        if (((c3 == true ? 1 : 0) & 4096) == 4096) {
                            this.f1620j = Collections.unmodifiableList(this.f1620j);
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
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            } else {
                if (((c3 == true ? 1 : 0) & 32) == 32) {
                    this.f1613b = Collections.unmodifiableList(this.f1613b);
                }
                if (((c3 == true ? 1 : 0) & Barcode.FORMAT_UPC_E) == 1024) {
                    this.f1618h = Collections.unmodifiableList(this.f1618h);
                }
                if (((c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE) == 256) {
                    this.e = Collections.unmodifiableList(this.e);
                }
                if (((c3 == true ? 1 : 0) & 512) == 512) {
                    this.f1616f = Collections.unmodifiableList(this.f1616f);
                }
                if (((c3 == true ? 1 : 0) & 4096) == 4096) {
                    this.f1620j = Collections.unmodifiableList(this.f1620j);
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
