package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class af extends Oe.k {

    /* renamed from: a, reason: collision with root package name */
    public aq f1434a;

    /* renamed from: b, reason: collision with root package name */
    public int f1435b;

    /* renamed from: c, reason: collision with root package name */
    public List f1436c;

    /* renamed from: d, reason: collision with root package name */
    public aq f1437d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public List f1438f;

    /* renamed from: g, reason: collision with root package name */
    public List f1439g;

    /* renamed from: h, reason: collision with root package name */
    public ay f1440h;

    /* renamed from: i, reason: collision with root package name */
    public int f1441i;

    /* renamed from: j, reason: collision with root package name */
    public int f1442j;

    /* renamed from: k, reason: collision with root package name */
    public List f1443k;
    public int silver;
    public int teal;
    public int white;
    public int yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.af, Oe.k] */
    public static af lima() {
        ?? kVar = new Oe.k();
        kVar.teal = 518;
        kVar.white = 2054;
        aq aqVar = aq.f1472m;
        kVar.f1434a = aqVar;
        List list = Collections.EMPTY_LIST;
        kVar.f1436c = list;
        kVar.f1437d = aqVar;
        kVar.f1438f = list;
        kVar.f1439g = list;
        kVar.f1440h = ay.e;
        kVar.f1443k = list;
        return kVar;
    }

    public final Object clone() {
        af lima = lima();
        lima.mike(kilo());
        return lima;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        ag kilo = kilo();
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
        ag agVar = null;
        try {
            try {
                ag.f1445o.getClass();
                mike(new ag(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ag agVar2 = (ag) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    agVar = agVar2;
                    if (agVar != null) {
                        mike(agVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (agVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        mike((ag) oVar);
        return this;
    }

    public final ag kilo() {
        ag agVar = new ag(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        agVar.silver = this.teal;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        agVar.teal = this.white;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        agVar.white = this.yellow;
        if ((i4 & 8) == 8) {
            i5 |= 8;
        }
        agVar.yellow = this.f1434a;
        if ((i4 & 16) == 16) {
            i5 |= 16;
        }
        agVar.f1446a = this.f1435b;
        if ((i4 & 32) == 32) {
            this.f1436c = Collections.unmodifiableList(this.f1436c);
            this.silver &= -33;
        }
        agVar.f1447b = this.f1436c;
        if ((i4 & 64) == 64) {
            i5 |= 32;
        }
        agVar.f1448c = this.f1437d;
        if ((i4 & 128) == 128) {
            i5 |= 64;
        }
        agVar.f1449d = this.e;
        if ((this.silver & Barcode.FORMAT_QR_CODE) == 256) {
            this.f1438f = Collections.unmodifiableList(this.f1438f);
            this.silver &= -257;
        }
        agVar.e = this.f1438f;
        if ((this.silver & 512) == 512) {
            this.f1439g = Collections.unmodifiableList(this.f1439g);
            this.silver &= -513;
        }
        agVar.f1450f = this.f1439g;
        if ((i4 & Barcode.FORMAT_UPC_E) == 1024) {
            i5 |= 128;
        }
        agVar.f1452h = this.f1440h;
        if ((i4 & 2048) == 2048) {
            i5 |= Barcode.FORMAT_QR_CODE;
        }
        agVar.f1453i = this.f1441i;
        if ((i4 & 4096) == 4096) {
            i5 |= 512;
        }
        agVar.f1454j = this.f1442j;
        if ((this.silver & 8192) == 8192) {
            this.f1443k = Collections.unmodifiableList(this.f1443k);
            this.silver &= -8193;
        }
        agVar.f1455k = this.f1443k;
        agVar.red = i5;
        return agVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [Oe.k, Ie.ax] */
    public final void mike(ag agVar) {
        ay ayVar;
        aq aqVar;
        aq aqVar2;
        if (agVar == ag.f1444n) {
            return;
        }
        int i4 = agVar.red;
        if ((i4 & 1) == 1) {
            int i5 = agVar.silver;
            this.silver = 1 | this.silver;
            this.teal = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = agVar.teal;
            this.silver = 2 | this.silver;
            this.white = i10;
        }
        if ((i4 & 4) == 4) {
            int i11 = agVar.white;
            this.silver = 4 | this.silver;
            this.yellow = i11;
        }
        if ((i4 & 8) == 8) {
            aq aqVar3 = agVar.yellow;
            if ((this.silver & 8) == 8 && (aqVar2 = this.f1434a) != aq.f1472m) {
                ap romeo = aq.romeo(aqVar2);
                romeo.mike(aqVar3);
                this.f1434a = romeo.kilo();
            } else {
                this.f1434a = aqVar3;
            }
            this.silver |= 8;
        }
        if ((agVar.red & 16) == 16) {
            int i12 = agVar.f1446a;
            this.silver = 16 | this.silver;
            this.f1435b = i12;
        }
        if (!agVar.f1447b.isEmpty()) {
            if (this.f1436c.isEmpty()) {
                this.f1436c = agVar.f1447b;
                this.silver &= -33;
            } else {
                if ((this.silver & 32) != 32) {
                    this.f1436c = new ArrayList(this.f1436c);
                    this.silver |= 32;
                }
                this.f1436c.addAll(agVar.f1447b);
            }
        }
        if ((agVar.red & 32) == 32) {
            aq aqVar4 = agVar.f1448c;
            if ((this.silver & 64) == 64 && (aqVar = this.f1437d) != aq.f1472m) {
                ap romeo2 = aq.romeo(aqVar);
                romeo2.mike(aqVar4);
                this.f1437d = romeo2.kilo();
            } else {
                this.f1437d = aqVar4;
            }
            this.silver |= 64;
        }
        if ((agVar.red & 64) == 64) {
            int i13 = agVar.f1449d;
            this.silver |= 128;
            this.e = i13;
        }
        if (!agVar.e.isEmpty()) {
            if (this.f1438f.isEmpty()) {
                this.f1438f = agVar.e;
                this.silver &= -257;
            } else {
                if ((this.silver & Barcode.FORMAT_QR_CODE) != 256) {
                    this.f1438f = new ArrayList(this.f1438f);
                    this.silver |= Barcode.FORMAT_QR_CODE;
                }
                this.f1438f.addAll(agVar.e);
            }
        }
        if (!agVar.f1450f.isEmpty()) {
            if (this.f1439g.isEmpty()) {
                this.f1439g = agVar.f1450f;
                this.silver &= -513;
            } else {
                if ((this.silver & 512) != 512) {
                    this.f1439g = new ArrayList(this.f1439g);
                    this.silver |= 512;
                }
                this.f1439g.addAll(agVar.f1450f);
            }
        }
        if ((agVar.red & 128) == 128) {
            ay ayVar2 = agVar.f1452h;
            if ((this.silver & Barcode.FORMAT_UPC_E) == 1024 && (ayVar = this.f1440h) != ay.e) {
                ?? kVar = new Oe.k();
                aq aqVar5 = aq.f1472m;
                kVar.yellow = aqVar5;
                kVar.f1509b = aqVar5;
                kVar.lima(ayVar);
                kVar.lima(ayVar2);
                this.f1440h = kVar.kilo();
            } else {
                this.f1440h = ayVar2;
            }
            this.silver |= Barcode.FORMAT_UPC_E;
        }
        int i14 = agVar.red;
        if ((i14 & Barcode.FORMAT_QR_CODE) == 256) {
            int i15 = agVar.f1453i;
            this.silver |= 2048;
            this.f1441i = i15;
        }
        if ((i14 & 512) == 512) {
            int i16 = agVar.f1454j;
            this.silver |= 4096;
            this.f1442j = i16;
        }
        if (!agVar.f1455k.isEmpty()) {
            if (this.f1443k.isEmpty()) {
                this.f1443k = agVar.f1455k;
                this.silver &= -8193;
            } else {
                if ((this.silver & 8192) != 8192) {
                    this.f1443k = new ArrayList(this.f1443k);
                    this.silver |= 8192;
                }
                this.f1443k.addAll(agVar.f1455k);
            }
        }
        juliet(agVar);
        this.alpha = this.alpha.bravo(agVar.purple);
    }
}
