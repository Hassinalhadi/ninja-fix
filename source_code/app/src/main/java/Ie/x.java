package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class x extends Oe.k {

    /* renamed from: a, reason: collision with root package name */
    public aq f1600a;

    /* renamed from: b, reason: collision with root package name */
    public int f1601b;

    /* renamed from: c, reason: collision with root package name */
    public List f1602c;

    /* renamed from: d, reason: collision with root package name */
    public aq f1603d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public List f1604f;

    /* renamed from: g, reason: collision with root package name */
    public List f1605g;

    /* renamed from: h, reason: collision with root package name */
    public List f1606h;

    /* renamed from: i, reason: collision with root package name */
    public aw f1607i;

    /* renamed from: j, reason: collision with root package name */
    public List f1608j;

    /* renamed from: k, reason: collision with root package name */
    public n f1609k;
    public int silver;
    public int teal;
    public int white;
    public int yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.x, Oe.k] */
    public static x lima() {
        ?? kVar = new Oe.k();
        kVar.teal = 6;
        kVar.white = 6;
        aq aqVar = aq.f1472m;
        kVar.f1600a = aqVar;
        List list = Collections.EMPTY_LIST;
        kVar.f1602c = list;
        kVar.f1603d = aqVar;
        kVar.f1604f = list;
        kVar.f1605g = list;
        kVar.f1606h = list;
        kVar.f1607i = aw.yellow;
        kVar.f1608j = list;
        kVar.f1609k = n.teal;
        return kVar;
    }

    public final Object clone() {
        x lima = lima();
        lima.mike(kilo());
        return lima;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        y kilo = kilo();
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
        y yVar = null;
        try {
            try {
                y.f1611o.getClass();
                mike(new y(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                y yVar2 = (y) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    yVar = yVar2;
                    if (yVar != null) {
                        mike(yVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (yVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        mike((y) oVar);
        return this;
    }

    public final y kilo() {
        y yVar = new y(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        yVar.silver = this.teal;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        yVar.teal = this.white;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        yVar.white = this.yellow;
        if ((i4 & 8) == 8) {
            i5 |= 8;
        }
        yVar.yellow = this.f1600a;
        if ((i4 & 16) == 16) {
            i5 |= 16;
        }
        yVar.f1612a = this.f1601b;
        if ((i4 & 32) == 32) {
            this.f1602c = Collections.unmodifiableList(this.f1602c);
            this.silver &= -33;
        }
        yVar.f1613b = this.f1602c;
        if ((i4 & 64) == 64) {
            i5 |= 32;
        }
        yVar.f1614c = this.f1603d;
        if ((i4 & 128) == 128) {
            i5 |= 64;
        }
        yVar.f1615d = this.e;
        if ((this.silver & Barcode.FORMAT_QR_CODE) == 256) {
            this.f1604f = Collections.unmodifiableList(this.f1604f);
            this.silver &= -257;
        }
        yVar.e = this.f1604f;
        if ((this.silver & 512) == 512) {
            this.f1605g = Collections.unmodifiableList(this.f1605g);
            this.silver &= -513;
        }
        yVar.f1616f = this.f1605g;
        if ((this.silver & Barcode.FORMAT_UPC_E) == 1024) {
            this.f1606h = Collections.unmodifiableList(this.f1606h);
            this.silver &= -1025;
        }
        yVar.f1618h = this.f1606h;
        if ((i4 & 2048) == 2048) {
            i5 |= 128;
        }
        yVar.f1619i = this.f1607i;
        if ((this.silver & 4096) == 4096) {
            this.f1608j = Collections.unmodifiableList(this.f1608j);
            this.silver &= -4097;
        }
        yVar.f1620j = this.f1608j;
        if ((i4 & 8192) == 8192) {
            i5 |= Barcode.FORMAT_QR_CODE;
        }
        yVar.f1621k = this.f1609k;
        yVar.red = i5;
        return yVar;
    }

    public final void mike(y yVar) {
        n nVar;
        aw awVar;
        aq aqVar;
        aq aqVar2;
        if (yVar == y.f1610n) {
            return;
        }
        int i4 = yVar.red;
        if ((i4 & 1) == 1) {
            int i5 = yVar.silver;
            this.silver = 1 | this.silver;
            this.teal = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = yVar.teal;
            this.silver = 2 | this.silver;
            this.white = i10;
        }
        if ((i4 & 4) == 4) {
            int i11 = yVar.white;
            this.silver = 4 | this.silver;
            this.yellow = i11;
        }
        if ((i4 & 8) == 8) {
            aq aqVar3 = yVar.yellow;
            if ((this.silver & 8) == 8 && (aqVar2 = this.f1600a) != aq.f1472m) {
                ap romeo = aq.romeo(aqVar2);
                romeo.mike(aqVar3);
                this.f1600a = romeo.kilo();
            } else {
                this.f1600a = aqVar3;
            }
            this.silver |= 8;
        }
        if ((yVar.red & 16) == 16) {
            int i12 = yVar.f1612a;
            this.silver = 16 | this.silver;
            this.f1601b = i12;
        }
        if (!yVar.f1613b.isEmpty()) {
            if (this.f1602c.isEmpty()) {
                this.f1602c = yVar.f1613b;
                this.silver &= -33;
            } else {
                if ((this.silver & 32) != 32) {
                    this.f1602c = new ArrayList(this.f1602c);
                    this.silver |= 32;
                }
                this.f1602c.addAll(yVar.f1613b);
            }
        }
        if ((yVar.red & 32) == 32) {
            aq aqVar4 = yVar.f1614c;
            if ((this.silver & 64) == 64 && (aqVar = this.f1603d) != aq.f1472m) {
                ap romeo2 = aq.romeo(aqVar);
                romeo2.mike(aqVar4);
                this.f1603d = romeo2.kilo();
            } else {
                this.f1603d = aqVar4;
            }
            this.silver |= 64;
        }
        if ((yVar.red & 64) == 64) {
            int i13 = yVar.f1615d;
            this.silver |= 128;
            this.e = i13;
        }
        if (!yVar.e.isEmpty()) {
            if (this.f1604f.isEmpty()) {
                this.f1604f = yVar.e;
                this.silver &= -257;
            } else {
                if ((this.silver & Barcode.FORMAT_QR_CODE) != 256) {
                    this.f1604f = new ArrayList(this.f1604f);
                    this.silver |= Barcode.FORMAT_QR_CODE;
                }
                this.f1604f.addAll(yVar.e);
            }
        }
        if (!yVar.f1616f.isEmpty()) {
            if (this.f1605g.isEmpty()) {
                this.f1605g = yVar.f1616f;
                this.silver &= -513;
            } else {
                if ((this.silver & 512) != 512) {
                    this.f1605g = new ArrayList(this.f1605g);
                    this.silver |= 512;
                }
                this.f1605g.addAll(yVar.f1616f);
            }
        }
        if (!yVar.f1618h.isEmpty()) {
            if (this.f1606h.isEmpty()) {
                this.f1606h = yVar.f1618h;
                this.silver &= -1025;
            } else {
                if ((this.silver & Barcode.FORMAT_UPC_E) != 1024) {
                    this.f1606h = new ArrayList(this.f1606h);
                    this.silver |= Barcode.FORMAT_UPC_E;
                }
                this.f1606h.addAll(yVar.f1618h);
            }
        }
        if ((yVar.red & 128) == 128) {
            aw awVar2 = yVar.f1619i;
            if ((this.silver & 2048) == 2048 && (awVar = this.f1607i) != aw.yellow) {
                f india = aw.india(awVar);
                india.papa(awVar2);
                this.f1607i = india.lima();
            } else {
                this.f1607i = awVar2;
            }
            this.silver |= 2048;
        }
        if (!yVar.f1620j.isEmpty()) {
            if (this.f1608j.isEmpty()) {
                this.f1608j = yVar.f1620j;
                this.silver &= -4097;
            } else {
                if ((this.silver & 4096) != 4096) {
                    this.f1608j = new ArrayList(this.f1608j);
                    this.silver |= 4096;
                }
                this.f1608j.addAll(yVar.f1620j);
            }
        }
        if ((yVar.red & Barcode.FORMAT_QR_CODE) == 256) {
            n nVar2 = yVar.f1621k;
            if ((this.silver & 8192) == 8192 && (nVar = this.f1609k) != n.teal) {
                m mVar = new m(0);
                mVar.silver = Collections.EMPTY_LIST;
                mVar.november(nVar);
                mVar.november(nVar2);
                this.f1609k = mVar.juliet();
            } else {
                this.f1609k = nVar2;
            }
            this.silver |= 8192;
        }
        juliet(yVar);
        this.alpha = this.alpha.bravo(yVar.purple);
    }
}
