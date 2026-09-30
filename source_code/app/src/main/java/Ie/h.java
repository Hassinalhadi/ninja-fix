package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class h extends Oe.k {

    /* renamed from: a, reason: collision with root package name */
    public List f1540a;

    /* renamed from: b, reason: collision with root package name */
    public List f1541b;

    /* renamed from: c, reason: collision with root package name */
    public List f1542c;

    /* renamed from: d, reason: collision with root package name */
    public List f1543d;
    public List e;

    /* renamed from: f, reason: collision with root package name */
    public List f1544f;

    /* renamed from: g, reason: collision with root package name */
    public List f1545g;

    /* renamed from: h, reason: collision with root package name */
    public List f1546h;

    /* renamed from: i, reason: collision with root package name */
    public List f1547i;

    /* renamed from: j, reason: collision with root package name */
    public List f1548j;

    /* renamed from: k, reason: collision with root package name */
    public List f1549k;

    /* renamed from: l, reason: collision with root package name */
    public List f1550l;

    /* renamed from: m, reason: collision with root package name */
    public int f1551m;

    /* renamed from: n, reason: collision with root package name */
    public aq f1552n;

    /* renamed from: o, reason: collision with root package name */
    public int f1553o;

    /* renamed from: p, reason: collision with root package name */
    public List f1554p;

    /* renamed from: q, reason: collision with root package name */
    public List f1555q;

    /* renamed from: r, reason: collision with root package name */
    public List f1556r;

    /* renamed from: s, reason: collision with root package name */
    public aw f1557s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public List f1558t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public D f1559u;
    public int white;
    public int yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.h, Oe.k] */
    public static h lima() {
        ?? kVar = new Oe.k();
        kVar.teal = 6;
        List list = Collections.EMPTY_LIST;
        kVar.f1540a = list;
        kVar.f1541b = list;
        kVar.f1542c = list;
        kVar.f1543d = list;
        kVar.e = list;
        kVar.f1544f = list;
        kVar.f1545g = list;
        kVar.f1546h = list;
        kVar.f1547i = list;
        kVar.f1548j = list;
        kVar.f1549k = list;
        kVar.f1550l = list;
        kVar.f1552n = aq.f1472m;
        kVar.f1554p = list;
        kVar.f1555q = list;
        kVar.f1556r = list;
        kVar.f1557s = aw.yellow;
        kVar.f1558t = list;
        kVar.f1559u = D.teal;
        return kVar;
    }

    public final Object clone() {
        h lima = lima();
        lima.mike(kilo());
        return lima;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        j kilo = kilo();
        if (kilo.alpha()) {
            return kilo;
        }
        throw new UninitializedMessageException(kilo);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        j jVar = null;
        try {
            try {
                j.f1560D.getClass();
                mike(new j(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                j jVar2 = (j) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jVar = jVar2;
                    if (jVar != null) {
                        mike(jVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        mike((j) oVar);
        return this;
    }

    public final j kilo() {
        j jVar = new j(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        jVar.silver = this.teal;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        jVar.teal = this.white;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        jVar.white = this.yellow;
        if ((i4 & 8) == 8) {
            this.f1540a = Collections.unmodifiableList(this.f1540a);
            this.silver &= -9;
        }
        jVar.yellow = this.f1540a;
        if ((this.silver & 16) == 16) {
            this.f1541b = Collections.unmodifiableList(this.f1541b);
            this.silver &= -17;
        }
        jVar.f1561a = this.f1541b;
        if ((this.silver & 32) == 32) {
            this.f1542c = Collections.unmodifiableList(this.f1542c);
            this.silver &= -33;
        }
        jVar.f1562b = this.f1542c;
        if ((this.silver & 64) == 64) {
            this.f1543d = Collections.unmodifiableList(this.f1543d);
            this.silver &= -65;
        }
        jVar.f1564d = this.f1543d;
        if ((this.silver & 128) == 128) {
            this.e = Collections.unmodifiableList(this.e);
            this.silver &= -129;
        }
        jVar.f1565f = this.e;
        if ((this.silver & Barcode.FORMAT_QR_CODE) == 256) {
            this.f1544f = Collections.unmodifiableList(this.f1544f);
            this.silver &= -257;
        }
        jVar.f1566g = this.f1544f;
        if ((this.silver & 512) == 512) {
            this.f1545g = Collections.unmodifiableList(this.f1545g);
            this.silver &= -513;
        }
        jVar.f1568i = this.f1545g;
        if ((this.silver & Barcode.FORMAT_UPC_E) == 1024) {
            this.f1546h = Collections.unmodifiableList(this.f1546h);
            this.silver &= -1025;
        }
        jVar.f1569j = this.f1546h;
        if ((this.silver & 2048) == 2048) {
            this.f1547i = Collections.unmodifiableList(this.f1547i);
            this.silver &= -2049;
        }
        jVar.f1570k = this.f1547i;
        if ((this.silver & 4096) == 4096) {
            this.f1548j = Collections.unmodifiableList(this.f1548j);
            this.silver &= -4097;
        }
        jVar.f1571l = this.f1548j;
        if ((this.silver & 8192) == 8192) {
            this.f1549k = Collections.unmodifiableList(this.f1549k);
            this.silver &= -8193;
        }
        jVar.f1572m = this.f1549k;
        if ((this.silver & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
            this.f1550l = Collections.unmodifiableList(this.f1550l);
            this.silver &= -16385;
        }
        jVar.f1573n = this.f1550l;
        if ((i4 & 32768) == 32768) {
            i5 |= 8;
        }
        jVar.f1575p = this.f1551m;
        if ((i4 & 65536) == 65536) {
            i5 |= 16;
        }
        jVar.f1576q = this.f1552n;
        if ((i4 & 131072) == 131072) {
            i5 |= 32;
        }
        jVar.f1577r = this.f1553o;
        if ((this.silver & 262144) == 262144) {
            this.f1554p = Collections.unmodifiableList(this.f1554p);
            this.silver &= -262145;
        }
        jVar.f1578s = this.f1554p;
        if ((this.silver & 524288) == 524288) {
            this.f1555q = Collections.unmodifiableList(this.f1555q);
            this.silver &= -524289;
        }
        jVar.f1580u = this.f1555q;
        if ((this.silver & 1048576) == 1048576) {
            this.f1556r = Collections.unmodifiableList(this.f1556r);
            this.silver &= -1048577;
        }
        jVar.f1581v = this.f1556r;
        if ((i4 & 2097152) == 2097152) {
            i5 |= 64;
        }
        jVar.f1583x = this.f1557s;
        if ((this.silver & 4194304) == 4194304) {
            this.f1558t = Collections.unmodifiableList(this.f1558t);
            this.silver &= -4194305;
        }
        jVar.f1584y = this.f1558t;
        if ((i4 & 8388608) == 8388608) {
            i5 |= 128;
        }
        jVar.f1585z = this.f1559u;
        jVar.red = i5;
        return jVar;
    }

    public final void mike(j jVar) {
        D d4;
        aw awVar;
        aq aqVar;
        if (jVar == j.C) {
            return;
        }
        int i4 = jVar.red;
        if ((i4 & 1) == 1) {
            int i5 = jVar.silver;
            this.silver = 1 | this.silver;
            this.teal = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = jVar.teal;
            this.silver = 2 | this.silver;
            this.white = i10;
        }
        if ((i4 & 4) == 4) {
            int i11 = jVar.white;
            this.silver = 4 | this.silver;
            this.yellow = i11;
        }
        if (!jVar.yellow.isEmpty()) {
            if (this.f1540a.isEmpty()) {
                this.f1540a = jVar.yellow;
                this.silver &= -9;
            } else {
                if ((this.silver & 8) != 8) {
                    this.f1540a = new ArrayList(this.f1540a);
                    this.silver |= 8;
                }
                this.f1540a.addAll(jVar.yellow);
            }
        }
        if (!jVar.f1561a.isEmpty()) {
            if (this.f1541b.isEmpty()) {
                this.f1541b = jVar.f1561a;
                this.silver &= -17;
            } else {
                if ((this.silver & 16) != 16) {
                    this.f1541b = new ArrayList(this.f1541b);
                    this.silver |= 16;
                }
                this.f1541b.addAll(jVar.f1561a);
            }
        }
        if (!jVar.f1562b.isEmpty()) {
            if (this.f1542c.isEmpty()) {
                this.f1542c = jVar.f1562b;
                this.silver &= -33;
            } else {
                if ((this.silver & 32) != 32) {
                    this.f1542c = new ArrayList(this.f1542c);
                    this.silver |= 32;
                }
                this.f1542c.addAll(jVar.f1562b);
            }
        }
        if (!jVar.f1564d.isEmpty()) {
            if (this.f1543d.isEmpty()) {
                this.f1543d = jVar.f1564d;
                this.silver &= -65;
            } else {
                if ((this.silver & 64) != 64) {
                    this.f1543d = new ArrayList(this.f1543d);
                    this.silver |= 64;
                }
                this.f1543d.addAll(jVar.f1564d);
            }
        }
        if (!jVar.f1565f.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = jVar.f1565f;
                this.silver &= -129;
            } else {
                if ((this.silver & 128) != 128) {
                    this.e = new ArrayList(this.e);
                    this.silver |= 128;
                }
                this.e.addAll(jVar.f1565f);
            }
        }
        if (!jVar.f1566g.isEmpty()) {
            if (this.f1544f.isEmpty()) {
                this.f1544f = jVar.f1566g;
                this.silver &= -257;
            } else {
                if ((this.silver & Barcode.FORMAT_QR_CODE) != 256) {
                    this.f1544f = new ArrayList(this.f1544f);
                    this.silver |= Barcode.FORMAT_QR_CODE;
                }
                this.f1544f.addAll(jVar.f1566g);
            }
        }
        if (!jVar.f1568i.isEmpty()) {
            if (this.f1545g.isEmpty()) {
                this.f1545g = jVar.f1568i;
                this.silver &= -513;
            } else {
                if ((this.silver & 512) != 512) {
                    this.f1545g = new ArrayList(this.f1545g);
                    this.silver |= 512;
                }
                this.f1545g.addAll(jVar.f1568i);
            }
        }
        if (!jVar.f1569j.isEmpty()) {
            if (this.f1546h.isEmpty()) {
                this.f1546h = jVar.f1569j;
                this.silver &= -1025;
            } else {
                if ((this.silver & Barcode.FORMAT_UPC_E) != 1024) {
                    this.f1546h = new ArrayList(this.f1546h);
                    this.silver |= Barcode.FORMAT_UPC_E;
                }
                this.f1546h.addAll(jVar.f1569j);
            }
        }
        if (!jVar.f1570k.isEmpty()) {
            if (this.f1547i.isEmpty()) {
                this.f1547i = jVar.f1570k;
                this.silver &= -2049;
            } else {
                if ((this.silver & 2048) != 2048) {
                    this.f1547i = new ArrayList(this.f1547i);
                    this.silver |= 2048;
                }
                this.f1547i.addAll(jVar.f1570k);
            }
        }
        if (!jVar.f1571l.isEmpty()) {
            if (this.f1548j.isEmpty()) {
                this.f1548j = jVar.f1571l;
                this.silver &= -4097;
            } else {
                if ((this.silver & 4096) != 4096) {
                    this.f1548j = new ArrayList(this.f1548j);
                    this.silver |= 4096;
                }
                this.f1548j.addAll(jVar.f1571l);
            }
        }
        if (!jVar.f1572m.isEmpty()) {
            if (this.f1549k.isEmpty()) {
                this.f1549k = jVar.f1572m;
                this.silver &= -8193;
            } else {
                if ((this.silver & 8192) != 8192) {
                    this.f1549k = new ArrayList(this.f1549k);
                    this.silver |= 8192;
                }
                this.f1549k.addAll(jVar.f1572m);
            }
        }
        if (!jVar.f1573n.isEmpty()) {
            if (this.f1550l.isEmpty()) {
                this.f1550l = jVar.f1573n;
                this.silver &= -16385;
            } else {
                if ((this.silver & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                    this.f1550l = new ArrayList(this.f1550l);
                    this.silver |= Http2.INITIAL_MAX_FRAME_SIZE;
                }
                this.f1550l.addAll(jVar.f1573n);
            }
        }
        int i12 = jVar.red;
        if ((i12 & 8) == 8) {
            int i13 = jVar.f1575p;
            this.silver |= 32768;
            this.f1551m = i13;
        }
        if ((i12 & 16) == 16) {
            aq aqVar2 = jVar.f1576q;
            if ((this.silver & 65536) == 65536 && (aqVar = this.f1552n) != aq.f1472m) {
                ap romeo = aq.romeo(aqVar);
                romeo.mike(aqVar2);
                this.f1552n = romeo.kilo();
            } else {
                this.f1552n = aqVar2;
            }
            this.silver |= 65536;
        }
        if ((jVar.red & 32) == 32) {
            int i14 = jVar.f1577r;
            this.silver |= 131072;
            this.f1553o = i14;
        }
        if (!jVar.f1578s.isEmpty()) {
            if (this.f1554p.isEmpty()) {
                this.f1554p = jVar.f1578s;
                this.silver &= -262145;
            } else {
                if ((this.silver & 262144) != 262144) {
                    this.f1554p = new ArrayList(this.f1554p);
                    this.silver |= 262144;
                }
                this.f1554p.addAll(jVar.f1578s);
            }
        }
        if (!jVar.f1580u.isEmpty()) {
            if (this.f1555q.isEmpty()) {
                this.f1555q = jVar.f1580u;
                this.silver &= -524289;
            } else {
                if ((this.silver & 524288) != 524288) {
                    this.f1555q = new ArrayList(this.f1555q);
                    this.silver |= 524288;
                }
                this.f1555q.addAll(jVar.f1580u);
            }
        }
        if (!jVar.f1581v.isEmpty()) {
            if (this.f1556r.isEmpty()) {
                this.f1556r = jVar.f1581v;
                this.silver &= -1048577;
            } else {
                if ((this.silver & 1048576) != 1048576) {
                    this.f1556r = new ArrayList(this.f1556r);
                    this.silver |= 1048576;
                }
                this.f1556r.addAll(jVar.f1581v);
            }
        }
        if ((jVar.red & 64) == 64) {
            aw awVar2 = jVar.f1583x;
            if ((this.silver & 2097152) == 2097152 && (awVar = this.f1557s) != aw.yellow) {
                f india = aw.india(awVar);
                india.papa(awVar2);
                this.f1557s = india.lima();
            } else {
                this.f1557s = awVar2;
            }
            this.silver |= 2097152;
        }
        if (!jVar.f1584y.isEmpty()) {
            if (this.f1558t.isEmpty()) {
                this.f1558t = jVar.f1584y;
                this.silver &= -4194305;
            } else {
                if ((this.silver & 4194304) != 4194304) {
                    this.f1558t = new ArrayList(this.f1558t);
                    this.silver |= 4194304;
                }
                this.f1558t.addAll(jVar.f1584y);
            }
        }
        if ((jVar.red & 128) == 128) {
            D d9 = jVar.f1585z;
            if ((this.silver & 8388608) == 8388608 && (d4 = this.f1559u) != D.teal) {
                m mVar = new m(2);
                mVar.silver = Collections.EMPTY_LIST;
                mVar.quebec(d4);
                mVar.quebec(d9);
                this.f1559u = mVar.mike();
            } else {
                this.f1559u = d9;
            }
            this.silver |= 8388608;
        }
        juliet(jVar);
        this.alpha = this.alpha.bravo(jVar.purple);
    }
}
