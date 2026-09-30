package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class j extends Oe.l {
    public static final j C;

    /* renamed from: D, reason: collision with root package name */
    public static final C0181a f1560D = new C0181a(3);
    public byte A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public List f1561a;

    /* renamed from: b, reason: collision with root package name */
    public List f1562b;

    /* renamed from: c, reason: collision with root package name */
    public int f1563c;

    /* renamed from: d, reason: collision with root package name */
    public List f1564d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public List f1565f;

    /* renamed from: g, reason: collision with root package name */
    public List f1566g;

    /* renamed from: h, reason: collision with root package name */
    public int f1567h;

    /* renamed from: i, reason: collision with root package name */
    public List f1568i;

    /* renamed from: j, reason: collision with root package name */
    public List f1569j;

    /* renamed from: k, reason: collision with root package name */
    public List f1570k;

    /* renamed from: l, reason: collision with root package name */
    public List f1571l;

    /* renamed from: m, reason: collision with root package name */
    public List f1572m;

    /* renamed from: n, reason: collision with root package name */
    public List f1573n;

    /* renamed from: o, reason: collision with root package name */
    public int f1574o;

    /* renamed from: p, reason: collision with root package name */
    public int f1575p;
    public final Oe.e purple;

    /* renamed from: q, reason: collision with root package name */
    public aq f1576q;

    /* renamed from: r, reason: collision with root package name */
    public int f1577r;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public List f1578s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public int f1579t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public List f1580u;

    /* renamed from: v, reason: collision with root package name */
    public List f1581v;

    /* renamed from: w, reason: collision with root package name */
    public int f1582w;
    public int white;

    /* renamed from: x, reason: collision with root package name */
    public aw f1583x;

    /* renamed from: y, reason: collision with root package name */
    public List f1584y;
    public List yellow;

    /* renamed from: z, reason: collision with root package name */
    public D f1585z;

    static {
        j jVar = new j();
        C = jVar;
        jVar.papa();
    }

    public j(h hVar) {
        super(hVar);
        this.f1563c = -1;
        this.e = -1;
        this.f1567h = -1;
        this.f1574o = -1;
        this.f1579t = -1;
        this.f1582w = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.purple = hVar.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.A;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.red & 2) == 2) {
            for (int i4 = 0; i4 < this.yellow.size(); i4++) {
                if (!((av) this.yellow.get(i4)).alpha()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.f1561a.size(); i5++) {
                if (!((aq) this.f1561a.get(i5)).alpha()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i10 = 0; i10 < this.f1565f.size(); i10++) {
                if (!((aq) this.f1565f.get(i10)).alpha()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < this.f1568i.size(); i11++) {
                if (!((l) this.f1568i.get(i11)).alpha()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < this.f1569j.size(); i12++) {
                if (!((y) this.f1569j.get(i12)).alpha()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < this.f1570k.size(); i13++) {
                if (!((ag) this.f1570k.get(i13)).alpha()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < this.f1571l.size(); i14++) {
                if (!((as) this.f1571l.get(i14)).alpha()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < this.f1572m.size(); i15++) {
                if (!((t) this.f1572m.get(i15)).alpha()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            if ((this.red & 16) == 16 && !this.f1576q.alpha()) {
                this.A = (byte) 0;
                return false;
            }
            for (int i16 = 0; i16 < this.f1580u.size(); i16++) {
                if (!((aq) this.f1580u.get(i16)).alpha()) {
                    this.A = (byte) 0;
                    return false;
                }
            }
            if ((this.red & 64) == 64 && !this.f1583x.alpha()) {
                this.A = (byte) 0;
                return false;
            }
            if (!india()) {
                this.A = (byte) 0;
                return false;
            }
            this.A = (byte) 1;
            return true;
        }
        this.A = (byte) 0;
        return false;
    }

    @Override // Oe.w
    public final Oe.v bravo() {
        return C;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        h lima = h.lima();
        lima.mike(this);
        return lima;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.B;
        if (i5 != -1) {
            return i5;
        }
        if ((this.red & 1) == 1) {
            i4 = F0.e.charlie(1, this.silver);
        } else {
            i4 = 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f1562b.size(); i11++) {
            i10 += F0.e.delta(((Integer) this.f1562b.get(i11)).intValue());
        }
        int i12 = i4 + i10;
        if (!this.f1562b.isEmpty()) {
            i12 = i12 + 1 + F0.e.delta(i10);
        }
        this.f1563c = i10;
        if ((this.red & 2) == 2) {
            i12 += F0.e.charlie(3, this.teal);
        }
        if ((this.red & 4) == 4) {
            i12 += F0.e.charlie(4, this.white);
        }
        for (int i13 = 0; i13 < this.yellow.size(); i13++) {
            i12 += F0.e.echo(5, (Oe.v) this.yellow.get(i13));
        }
        for (int i14 = 0; i14 < this.f1561a.size(); i14++) {
            i12 += F0.e.echo(6, (Oe.v) this.f1561a.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f1564d.size(); i16++) {
            i15 += F0.e.delta(((Integer) this.f1564d.get(i16)).intValue());
        }
        int i17 = i12 + i15;
        if (!this.f1564d.isEmpty()) {
            i17 = i17 + 1 + F0.e.delta(i15);
        }
        this.e = i15;
        for (int i18 = 0; i18 < this.f1568i.size(); i18++) {
            i17 += F0.e.echo(8, (Oe.v) this.f1568i.get(i18));
        }
        for (int i19 = 0; i19 < this.f1569j.size(); i19++) {
            i17 += F0.e.echo(9, (Oe.v) this.f1569j.get(i19));
        }
        for (int i20 = 0; i20 < this.f1570k.size(); i20++) {
            i17 += F0.e.echo(10, (Oe.v) this.f1570k.get(i20));
        }
        for (int i21 = 0; i21 < this.f1571l.size(); i21++) {
            i17 += F0.e.echo(11, (Oe.v) this.f1571l.get(i21));
        }
        for (int i22 = 0; i22 < this.f1572m.size(); i22++) {
            i17 += F0.e.echo(13, (Oe.v) this.f1572m.get(i22));
        }
        int i23 = 0;
        for (int i24 = 0; i24 < this.f1573n.size(); i24++) {
            i23 += F0.e.delta(((Integer) this.f1573n.get(i24)).intValue());
        }
        int i25 = i17 + i23;
        if (!this.f1573n.isEmpty()) {
            i25 = i25 + 2 + F0.e.delta(i23);
        }
        this.f1574o = i23;
        if ((this.red & 8) == 8) {
            i25 += F0.e.charlie(17, this.f1575p);
        }
        if ((this.red & 16) == 16) {
            i25 += F0.e.echo(18, this.f1576q);
        }
        if ((this.red & 32) == 32) {
            i25 += F0.e.charlie(19, this.f1577r);
        }
        for (int i26 = 0; i26 < this.f1565f.size(); i26++) {
            i25 += F0.e.echo(20, (Oe.v) this.f1565f.get(i26));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f1566g.size(); i28++) {
            i27 += F0.e.delta(((Integer) this.f1566g.get(i28)).intValue());
        }
        int i29 = i25 + i27;
        if (!this.f1566g.isEmpty()) {
            i29 = i29 + 2 + F0.e.delta(i27);
        }
        this.f1567h = i27;
        int i30 = 0;
        for (int i31 = 0; i31 < this.f1578s.size(); i31++) {
            i30 += F0.e.delta(((Integer) this.f1578s.get(i31)).intValue());
        }
        int i32 = i29 + i30;
        if (!this.f1578s.isEmpty()) {
            i32 = i32 + 2 + F0.e.delta(i30);
        }
        this.f1579t = i30;
        for (int i33 = 0; i33 < this.f1580u.size(); i33++) {
            i32 += F0.e.echo(23, (Oe.v) this.f1580u.get(i33));
        }
        int i34 = 0;
        for (int i35 = 0; i35 < this.f1581v.size(); i35++) {
            i34 += F0.e.delta(((Integer) this.f1581v.get(i35)).intValue());
        }
        int i36 = i32 + i34;
        if (!this.f1581v.isEmpty()) {
            i36 = i36 + 2 + F0.e.delta(i34);
        }
        this.f1582w = i34;
        if ((this.red & 64) == 64) {
            i36 += F0.e.echo(30, this.f1583x);
        }
        int i37 = 0;
        for (int i38 = 0; i38 < this.f1584y.size(); i38++) {
            i37 += F0.e.delta(((Integer) this.f1584y.get(i38)).intValue());
        }
        int size = (this.f1584y.size() * 2) + i36 + i37;
        if ((this.red & 128) == 128) {
            size += F0.e.echo(32, this.f1585z);
        }
        int size2 = this.purple.size() + juliet() + size;
        this.B = size2;
        return size2;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        w.o oVar = new w.o(this);
        if ((this.red & 1) == 1) {
            eVar.xray(1, this.silver);
        }
        if (this.f1562b.size() > 0) {
            eVar.coral(18);
            eVar.coral(this.f1563c);
        }
        for (int i4 = 0; i4 < this.f1562b.size(); i4++) {
            eVar.yankee(((Integer) this.f1562b.get(i4)).intValue());
        }
        if ((this.red & 2) == 2) {
            eVar.xray(3, this.teal);
        }
        if ((this.red & 4) == 4) {
            eVar.xray(4, this.white);
        }
        for (int i5 = 0; i5 < this.yellow.size(); i5++) {
            eVar.zulu(5, (Oe.v) this.yellow.get(i5));
        }
        for (int i10 = 0; i10 < this.f1561a.size(); i10++) {
            eVar.zulu(6, (Oe.v) this.f1561a.get(i10));
        }
        if (this.f1564d.size() > 0) {
            eVar.coral(58);
            eVar.coral(this.e);
        }
        for (int i11 = 0; i11 < this.f1564d.size(); i11++) {
            eVar.yankee(((Integer) this.f1564d.get(i11)).intValue());
        }
        for (int i12 = 0; i12 < this.f1568i.size(); i12++) {
            eVar.zulu(8, (Oe.v) this.f1568i.get(i12));
        }
        for (int i13 = 0; i13 < this.f1569j.size(); i13++) {
            eVar.zulu(9, (Oe.v) this.f1569j.get(i13));
        }
        for (int i14 = 0; i14 < this.f1570k.size(); i14++) {
            eVar.zulu(10, (Oe.v) this.f1570k.get(i14));
        }
        for (int i15 = 0; i15 < this.f1571l.size(); i15++) {
            eVar.zulu(11, (Oe.v) this.f1571l.get(i15));
        }
        for (int i16 = 0; i16 < this.f1572m.size(); i16++) {
            eVar.zulu(13, (Oe.v) this.f1572m.get(i16));
        }
        if (this.f1573n.size() > 0) {
            eVar.coral(130);
            eVar.coral(this.f1574o);
        }
        for (int i17 = 0; i17 < this.f1573n.size(); i17++) {
            eVar.yankee(((Integer) this.f1573n.get(i17)).intValue());
        }
        if ((this.red & 8) == 8) {
            eVar.xray(17, this.f1575p);
        }
        if ((this.red & 16) == 16) {
            eVar.zulu(18, this.f1576q);
        }
        if ((this.red & 32) == 32) {
            eVar.xray(19, this.f1577r);
        }
        for (int i18 = 0; i18 < this.f1565f.size(); i18++) {
            eVar.zulu(20, (Oe.v) this.f1565f.get(i18));
        }
        if (this.f1566g.size() > 0) {
            eVar.coral(170);
            eVar.coral(this.f1567h);
        }
        for (int i19 = 0; i19 < this.f1566g.size(); i19++) {
            eVar.yankee(((Integer) this.f1566g.get(i19)).intValue());
        }
        if (this.f1578s.size() > 0) {
            eVar.coral(178);
            eVar.coral(this.f1579t);
        }
        for (int i20 = 0; i20 < this.f1578s.size(); i20++) {
            eVar.yankee(((Integer) this.f1578s.get(i20)).intValue());
        }
        for (int i21 = 0; i21 < this.f1580u.size(); i21++) {
            eVar.zulu(23, (Oe.v) this.f1580u.get(i21));
        }
        if (this.f1581v.size() > 0) {
            eVar.coral(194);
            eVar.coral(this.f1582w);
        }
        for (int i22 = 0; i22 < this.f1581v.size(); i22++) {
            eVar.yankee(((Integer) this.f1581v.get(i22)).intValue());
        }
        if ((this.red & 64) == 64) {
            eVar.zulu(30, this.f1583x);
        }
        for (int i23 = 0; i23 < this.f1584y.size(); i23++) {
            eVar.xray(31, ((Integer) this.f1584y.get(i23)).intValue());
        }
        if ((this.red & 128) == 128) {
            eVar.zulu(32, this.f1585z);
        }
        oVar.beige(19000, eVar);
        eVar.beige(this.purple);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return h.lima();
    }

    public final void papa() {
        this.silver = 6;
        this.teal = 0;
        this.white = 0;
        List list = Collections.EMPTY_LIST;
        this.yellow = list;
        this.f1561a = list;
        this.f1562b = list;
        this.f1564d = list;
        this.f1565f = list;
        this.f1566g = list;
        this.f1568i = list;
        this.f1569j = list;
        this.f1570k = list;
        this.f1571l = list;
        this.f1572m = list;
        this.f1573n = list;
        this.f1575p = 0;
        this.f1576q = aq.f1472m;
        this.f1577r = 0;
        this.f1578s = list;
        this.f1580u = list;
        this.f1581v = list;
        this.f1583x = aw.yellow;
        this.f1584y = list;
        this.f1585z = D.teal;
    }

    public j() {
        this.f1563c = -1;
        this.e = -1;
        this.f1567h = -1;
        this.f1574o = -1;
        this.f1579t = -1;
        this.f1582w = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.purple = Oe.e.alpha;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public j(Oe.f fVar, Oe.h hVar) {
        this.f1563c = -1;
        this.e = -1;
        this.f1567h = -1;
        this.f1574o = -1;
        this.f1579t = -1;
        this.f1582w = -1;
        this.A = (byte) -1;
        this.B = -1;
        papa();
        Oe.d mike = Oe.e.mike();
        boolean z2 = true;
        F0.e romeo = F0.e.romeo(mike, 1);
        boolean z10 = false;
        char c3 = 0;
        while (true) {
            boolean z11 = z2;
            if (!z10) {
                try {
                    try {
                        int mike2 = fVar.mike();
                        switch (mike2) {
                            case 0:
                                z10 = z11;
                                z2 = z11;
                                c3 = c3;
                            case 8:
                                this.red |= 1;
                                this.silver = fVar.echo();
                                z2 = z11;
                                c3 = c3;
                            case 16:
                                int i4 = (c3 == true ? 1 : 0) & 32;
                                c3 = c3;
                                if (i4 != 32) {
                                    this.f1562b = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | ' ';
                                }
                                this.f1562b.add(Integer.valueOf(fVar.echo()));
                                z2 = z11;
                                c3 = c3;
                            case 18:
                                int charlie = fVar.charlie(fVar.juliet());
                                int i5 = (c3 == true ? 1 : 0) & 32;
                                c3 = c3;
                                if (i5 != 32) {
                                    c3 = c3;
                                    if (fVar.alpha() > 0) {
                                        this.f1562b = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | ' ';
                                    }
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1562b.add(Integer.valueOf(fVar.echo()));
                                }
                                fVar.bravo(charlie);
                                z2 = z11;
                                c3 = c3;
                            case 24:
                                this.red |= 2;
                                this.teal = fVar.echo();
                                z2 = z11;
                                c3 = c3;
                            case 32:
                                this.red |= 4;
                                this.white = fVar.echo();
                                z2 = z11;
                                c3 = c3;
                            case 42:
                                int i10 = (c3 == true ? 1 : 0) & 8;
                                c3 = c3;
                                if (i10 != 8) {
                                    this.yellow = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | '\b';
                                }
                                this.yellow.add(fVar.foxtrot(av.f1502g, hVar));
                                z2 = z11;
                                c3 = c3;
                            case 50:
                                int i11 = (c3 == true ? 1 : 0) & 16;
                                c3 = c3;
                                if (i11 != 16) {
                                    this.f1561a = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 16;
                                }
                                this.f1561a.add(fVar.foxtrot(aq.f1473n, hVar));
                                z2 = z11;
                                c3 = c3;
                            case 56:
                                int i12 = (c3 == true ? 1 : 0) & 64;
                                c3 = c3;
                                if (i12 != 64) {
                                    this.f1564d = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | '@';
                                }
                                this.f1564d.add(Integer.valueOf(fVar.echo()));
                                z2 = z11;
                                c3 = c3;
                            case 58:
                                int charlie2 = fVar.charlie(fVar.juliet());
                                int i13 = (c3 == true ? 1 : 0) & 64;
                                c3 = c3;
                                if (i13 != 64) {
                                    c3 = c3;
                                    if (fVar.alpha() > 0) {
                                        this.f1564d = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | '@';
                                    }
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1564d.add(Integer.valueOf(fVar.echo()));
                                }
                                fVar.bravo(charlie2);
                                z2 = z11;
                                c3 = c3;
                            case 66:
                                int i14 = (c3 == true ? 1 : 0) & 512;
                                c3 = c3;
                                if (i14 != 512) {
                                    this.f1568i = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 512;
                                }
                                this.f1568i.add(fVar.foxtrot(l.f1587c, hVar));
                                z2 = z11;
                                c3 = c3;
                            case 74:
                                int i15 = (c3 == true ? 1 : 0) & Barcode.FORMAT_UPC_E;
                                c3 = c3;
                                if (i15 != 1024) {
                                    this.f1569j = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 1024;
                                }
                                this.f1569j.add(fVar.foxtrot(y.f1611o, hVar));
                                z2 = z11;
                                c3 = c3;
                            case 82:
                                int i16 = (c3 == true ? 1 : 0) & 2048;
                                c3 = c3;
                                if (i16 != 2048) {
                                    this.f1570k = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 2048;
                                }
                                this.f1570k.add(fVar.foxtrot(ag.f1445o, hVar));
                                z2 = z11;
                                c3 = c3;
                            case 90:
                                int i17 = (c3 == true ? 1 : 0) & 4096;
                                c3 = c3;
                                if (i17 != 4096) {
                                    this.f1571l = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 4096;
                                }
                                this.f1571l.add(fVar.foxtrot(as.f1491i, hVar));
                                z2 = z11;
                                c3 = c3;
                            case 106:
                                int i18 = (c3 == true ? 1 : 0) & 8192;
                                c3 = c3;
                                if (i18 != 8192) {
                                    this.f1572m = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 8192;
                                }
                                this.f1572m.add(fVar.foxtrot(t.f1592a, hVar));
                                z2 = z11;
                                c3 = c3;
                            case 128:
                                int i19 = (c3 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE;
                                c3 = c3;
                                if (i19 != 16384) {
                                    this.f1573n = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 16384;
                                }
                                this.f1573n.add(Integer.valueOf(fVar.echo()));
                                z2 = z11;
                                c3 = c3;
                            case 130:
                                int charlie3 = fVar.charlie(fVar.juliet());
                                int i20 = (c3 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE;
                                c3 = c3;
                                if (i20 != 16384) {
                                    c3 = c3;
                                    if (fVar.alpha() > 0) {
                                        this.f1573n = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 16384;
                                    }
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1573n.add(Integer.valueOf(fVar.echo()));
                                }
                                fVar.bravo(charlie3);
                                z2 = z11;
                                c3 = c3;
                            case 136:
                                this.red |= 8;
                                this.f1575p = fVar.echo();
                                z2 = z11;
                                c3 = c3;
                            case 146:
                                ap charlie4 = (this.red & 16) == 16 ? this.f1576q.charlie() : null;
                                aq aqVar = (aq) fVar.foxtrot(aq.f1473n, hVar);
                                this.f1576q = aqVar;
                                if (charlie4 != null) {
                                    charlie4.mike(aqVar);
                                    this.f1576q = charlie4.kilo();
                                }
                                this.red |= 16;
                                z2 = z11;
                                c3 = c3;
                            case 152:
                                this.red |= 32;
                                this.f1577r = fVar.echo();
                                z2 = z11;
                                c3 = c3;
                            case 162:
                                int i21 = (c3 == true ? 1 : 0) & 128;
                                c3 = c3;
                                if (i21 != 128) {
                                    this.f1565f = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 128;
                                }
                                this.f1565f.add(fVar.foxtrot(aq.f1473n, hVar));
                                z2 = z11;
                                c3 = c3;
                            case 168:
                                int i22 = (c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE;
                                c3 = c3;
                                if (i22 != 256) {
                                    this.f1566g = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 256;
                                }
                                this.f1566g.add(Integer.valueOf(fVar.echo()));
                                z2 = z11;
                                c3 = c3;
                            case 170:
                                int charlie5 = fVar.charlie(fVar.juliet());
                                int i23 = (c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE;
                                c3 = c3;
                                if (i23 != 256) {
                                    c3 = c3;
                                    if (fVar.alpha() > 0) {
                                        this.f1566g = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 256;
                                    }
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1566g.add(Integer.valueOf(fVar.echo()));
                                }
                                fVar.bravo(charlie5);
                                z2 = z11;
                                c3 = c3;
                            case 176:
                                int i24 = (c3 == true ? 1 : 0) & 262144;
                                c3 = c3;
                                if (i24 != 262144) {
                                    this.f1578s = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 0;
                                }
                                this.f1578s.add(Integer.valueOf(fVar.echo()));
                                z2 = z11;
                                c3 = c3;
                            case 178:
                                int charlie6 = fVar.charlie(fVar.juliet());
                                int i25 = (c3 == true ? 1 : 0) & 262144;
                                c3 = c3;
                                if (i25 != 262144) {
                                    c3 = c3;
                                    if (fVar.alpha() > 0) {
                                        this.f1578s = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1578s.add(Integer.valueOf(fVar.echo()));
                                }
                                fVar.bravo(charlie6);
                                z2 = z11;
                                c3 = c3;
                            case 186:
                                int i26 = (c3 == true ? 1 : 0) & 524288;
                                c3 = c3;
                                if (i26 != 524288) {
                                    this.f1580u = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 0;
                                }
                                this.f1580u.add(fVar.foxtrot(aq.f1473n, hVar));
                                z2 = z11;
                                c3 = c3;
                            case 192:
                                int i27 = (c3 == true ? 1 : 0) & 1048576;
                                c3 = c3;
                                if (i27 != 1048576) {
                                    this.f1581v = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 0;
                                }
                                this.f1581v.add(Integer.valueOf(fVar.echo()));
                                z2 = z11;
                                c3 = c3;
                            case 194:
                                int charlie7 = fVar.charlie(fVar.juliet());
                                int i28 = (c3 == true ? 1 : 0) & 1048576;
                                c3 = c3;
                                if (i28 != 1048576) {
                                    c3 = c3;
                                    if (fVar.alpha() > 0) {
                                        this.f1581v = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1581v.add(Integer.valueOf(fVar.echo()));
                                }
                                fVar.bravo(charlie7);
                                z2 = z11;
                                c3 = c3;
                            case 242:
                                f juliet = (this.red & 64) == 64 ? this.f1583x.juliet() : null;
                                aw awVar = (aw) fVar.foxtrot(aw.f1507a, hVar);
                                this.f1583x = awVar;
                                if (juliet != null) {
                                    juliet.papa(awVar);
                                    this.f1583x = juliet.lima();
                                }
                                this.red |= 64;
                                z2 = z11;
                                c3 = c3;
                            case 248:
                                int i29 = (c3 == true ? 1 : 0) & 4194304;
                                c3 = c3;
                                if (i29 != 4194304) {
                                    this.f1584y = new ArrayList();
                                    c3 = (c3 == true ? 1 : 0) | 0;
                                }
                                this.f1584y.add(Integer.valueOf(fVar.echo()));
                                z2 = z11;
                                c3 = c3;
                            case 250:
                                int charlie8 = fVar.charlie(fVar.juliet());
                                int i30 = (c3 == true ? 1 : 0) & 4194304;
                                c3 = c3;
                                if (i30 != 4194304) {
                                    c3 = c3;
                                    if (fVar.alpha() > 0) {
                                        this.f1584y = new ArrayList();
                                        c3 = (c3 == true ? 1 : 0) | 0;
                                    }
                                }
                                while (fVar.alpha() > 0) {
                                    this.f1584y.add(Integer.valueOf(fVar.echo()));
                                }
                                fVar.bravo(charlie8);
                                z2 = z11;
                                c3 = c3;
                            case 258:
                                try {
                                    m india = (this.red & 128) == 128 ? this.f1585z.india() : null;
                                    D d4 = (D) fVar.foxtrot(D.white, hVar);
                                    this.f1585z = d4;
                                    if (india != null) {
                                        india.quebec(d4);
                                        this.f1585z = india.mike();
                                    }
                                    this.red |= 128;
                                    z2 = z11;
                                    c3 = c3;
                                } catch (InvalidProtocolBufferException e) {
                                    e = e;
                                    throw e.setUnfinishedMessage(this);
                                } catch (IOException e4) {
                                    e = e4;
                                    throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                } catch (Throwable th) {
                                    th = th;
                                    if (((c3 == true ? 1 : 0) & 32) == 32) {
                                        this.f1562b = Collections.unmodifiableList(this.f1562b);
                                    }
                                    if (((c3 == true ? 1 : 0) & 8) == 8) {
                                        this.yellow = Collections.unmodifiableList(this.yellow);
                                    }
                                    if (((c3 == true ? 1 : 0) & 16) == 16) {
                                        this.f1561a = Collections.unmodifiableList(this.f1561a);
                                    }
                                    if (((c3 == true ? 1 : 0) & 64) == 64) {
                                        this.f1564d = Collections.unmodifiableList(this.f1564d);
                                    }
                                    if (((c3 == true ? 1 : 0) & 512) == 512) {
                                        this.f1568i = Collections.unmodifiableList(this.f1568i);
                                    }
                                    if (((c3 == true ? 1 : 0) & Barcode.FORMAT_UPC_E) == 1024) {
                                        this.f1569j = Collections.unmodifiableList(this.f1569j);
                                    }
                                    if (((c3 == true ? 1 : 0) & 2048) == 2048) {
                                        this.f1570k = Collections.unmodifiableList(this.f1570k);
                                    }
                                    if (((c3 == true ? 1 : 0) & 4096) == 4096) {
                                        this.f1571l = Collections.unmodifiableList(this.f1571l);
                                    }
                                    if (((c3 == true ? 1 : 0) & 8192) == 8192) {
                                        this.f1572m = Collections.unmodifiableList(this.f1572m);
                                    }
                                    if (((c3 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                                        this.f1573n = Collections.unmodifiableList(this.f1573n);
                                    }
                                    if (((c3 == true ? 1 : 0) & 128) == 128) {
                                        this.f1565f = Collections.unmodifiableList(this.f1565f);
                                    }
                                    if (((c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE) == 256) {
                                        this.f1566g = Collections.unmodifiableList(this.f1566g);
                                    }
                                    if (((c3 == true ? 1 : 0) & 262144) == 262144) {
                                        this.f1578s = Collections.unmodifiableList(this.f1578s);
                                    }
                                    if (((c3 == true ? 1 : 0) & 524288) == 524288) {
                                        this.f1580u = Collections.unmodifiableList(this.f1580u);
                                    }
                                    if (((c3 == true ? 1 : 0) & 1048576) == 1048576) {
                                        this.f1581v = Collections.unmodifiableList(this.f1581v);
                                    }
                                    if (((c3 == true ? 1 : 0) & 4194304) == 4194304) {
                                        this.f1584y = Collections.unmodifiableList(this.f1584y);
                                    }
                                    try {
                                        romeo.juliet();
                                    } catch (IOException unused) {
                                    } catch (Throwable th2) {
                                        this.purple = mike.foxtrot();
                                        throw th2;
                                    }
                                    this.purple = mike.foxtrot();
                                    mike();
                                    throw th;
                                }
                            default:
                                if (november(fVar, romeo, hVar, mike2)) {
                                    z2 = z11;
                                    c3 = c3;
                                }
                                z10 = z11;
                                z2 = z11;
                                c3 = c3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    e = e5;
                } catch (IOException e10) {
                    e = e10;
                }
            } else {
                if (((c3 == true ? 1 : 0) & 32) == 32) {
                    this.f1562b = Collections.unmodifiableList(this.f1562b);
                }
                if (((c3 == true ? 1 : 0) & 8) == 8) {
                    this.yellow = Collections.unmodifiableList(this.yellow);
                }
                if (((c3 == true ? 1 : 0) & 16) == 16) {
                    this.f1561a = Collections.unmodifiableList(this.f1561a);
                }
                if (((c3 == true ? 1 : 0) & 64) == 64) {
                    this.f1564d = Collections.unmodifiableList(this.f1564d);
                }
                if (((c3 == true ? 1 : 0) & 512) == 512) {
                    this.f1568i = Collections.unmodifiableList(this.f1568i);
                }
                if (((c3 == true ? 1 : 0) & Barcode.FORMAT_UPC_E) == 1024) {
                    this.f1569j = Collections.unmodifiableList(this.f1569j);
                }
                if (((c3 == true ? 1 : 0) & 2048) == 2048) {
                    this.f1570k = Collections.unmodifiableList(this.f1570k);
                }
                if (((c3 == true ? 1 : 0) & 4096) == 4096) {
                    this.f1571l = Collections.unmodifiableList(this.f1571l);
                }
                if (((c3 == true ? 1 : 0) & 8192) == 8192) {
                    this.f1572m = Collections.unmodifiableList(this.f1572m);
                }
                if (((c3 == true ? 1 : 0) & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.f1573n = Collections.unmodifiableList(this.f1573n);
                }
                if (((c3 == true ? 1 : 0) & 128) == 128) {
                    this.f1565f = Collections.unmodifiableList(this.f1565f);
                }
                if (((c3 == true ? 1 : 0) & Barcode.FORMAT_QR_CODE) == 256) {
                    this.f1566g = Collections.unmodifiableList(this.f1566g);
                }
                if (((c3 == true ? 1 : 0) & 262144) == 262144) {
                    this.f1578s = Collections.unmodifiableList(this.f1578s);
                }
                if (((c3 == true ? 1 : 0) & 524288) == 524288) {
                    this.f1580u = Collections.unmodifiableList(this.f1580u);
                }
                if (((c3 == true ? 1 : 0) & 1048576) == 1048576) {
                    this.f1581v = Collections.unmodifiableList(this.f1581v);
                }
                if (((c3 == true ? 1 : 0) & 4194304) == 4194304) {
                    this.f1584y = Collections.unmodifiableList(this.f1584y);
                }
                try {
                    romeo.juliet();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.purple = mike.foxtrot();
                    throw th4;
                }
                this.purple = mike.foxtrot();
                mike();
                return;
            }
        }
    }
}
