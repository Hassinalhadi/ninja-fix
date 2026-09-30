package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class ar extends Oe.k {

    /* renamed from: a, reason: collision with root package name */
    public aq f1485a;

    /* renamed from: b, reason: collision with root package name */
    public int f1486b;

    /* renamed from: c, reason: collision with root package name */
    public aq f1487c;

    /* renamed from: d, reason: collision with root package name */
    public int f1488d;
    public List e;

    /* renamed from: f, reason: collision with root package name */
    public List f1489f;
    public int silver;
    public int teal;
    public int white;
    public List yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.ar, Oe.k] */
    public static ar lima() {
        ?? kVar = new Oe.k();
        kVar.teal = 6;
        List list = Collections.EMPTY_LIST;
        kVar.yellow = list;
        aq aqVar = aq.f1472m;
        kVar.f1485a = aqVar;
        kVar.f1487c = aqVar;
        kVar.e = list;
        kVar.f1489f = list;
        return kVar;
    }

    public final Object clone() {
        ar lima = lima();
        lima.mike(kilo());
        return lima;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        as kilo = kilo();
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
        as asVar = null;
        try {
            try {
                as.f1491i.getClass();
                mike(new as(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                as asVar2 = (as) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    asVar = asVar2;
                    if (asVar != null) {
                        mike(asVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (asVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        mike((as) oVar);
        return this;
    }

    public final as kilo() {
        as asVar = new as(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        asVar.silver = this.teal;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        asVar.teal = this.white;
        if ((i4 & 4) == 4) {
            this.yellow = Collections.unmodifiableList(this.yellow);
            this.silver &= -5;
        }
        asVar.white = this.yellow;
        if ((i4 & 8) == 8) {
            i5 |= 4;
        }
        asVar.yellow = this.f1485a;
        if ((i4 & 16) == 16) {
            i5 |= 8;
        }
        asVar.f1492a = this.f1486b;
        if ((i4 & 32) == 32) {
            i5 |= 16;
        }
        asVar.f1493b = this.f1487c;
        if ((i4 & 64) == 64) {
            i5 |= 32;
        }
        asVar.f1494c = this.f1488d;
        if ((this.silver & 128) == 128) {
            this.e = Collections.unmodifiableList(this.e);
            this.silver &= -129;
        }
        asVar.f1495d = this.e;
        if ((this.silver & Barcode.FORMAT_QR_CODE) == 256) {
            this.f1489f = Collections.unmodifiableList(this.f1489f);
            this.silver &= -257;
        }
        asVar.e = this.f1489f;
        asVar.red = i5;
        return asVar;
    }

    public final void mike(as asVar) {
        aq aqVar;
        aq aqVar2;
        if (asVar == as.f1490h) {
            return;
        }
        int i4 = asVar.red;
        if ((i4 & 1) == 1) {
            int i5 = asVar.silver;
            this.silver = 1 | this.silver;
            this.teal = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = asVar.teal;
            this.silver = 2 | this.silver;
            this.white = i10;
        }
        if (!asVar.white.isEmpty()) {
            if (this.yellow.isEmpty()) {
                this.yellow = asVar.white;
                this.silver &= -5;
            } else {
                if ((this.silver & 4) != 4) {
                    this.yellow = new ArrayList(this.yellow);
                    this.silver |= 4;
                }
                this.yellow.addAll(asVar.white);
            }
        }
        if ((asVar.red & 4) == 4) {
            aq aqVar3 = asVar.yellow;
            if ((this.silver & 8) == 8 && (aqVar2 = this.f1485a) != aq.f1472m) {
                ap romeo = aq.romeo(aqVar2);
                romeo.mike(aqVar3);
                this.f1485a = romeo.kilo();
            } else {
                this.f1485a = aqVar3;
            }
            this.silver |= 8;
        }
        int i11 = asVar.red;
        if ((i11 & 8) == 8) {
            int i12 = asVar.f1492a;
            this.silver |= 16;
            this.f1486b = i12;
        }
        if ((i11 & 16) == 16) {
            aq aqVar4 = asVar.f1493b;
            if ((this.silver & 32) == 32 && (aqVar = this.f1487c) != aq.f1472m) {
                ap romeo2 = aq.romeo(aqVar);
                romeo2.mike(aqVar4);
                this.f1487c = romeo2.kilo();
            } else {
                this.f1487c = aqVar4;
            }
            this.silver |= 32;
        }
        if ((asVar.red & 32) == 32) {
            int i13 = asVar.f1494c;
            this.silver |= 64;
            this.f1488d = i13;
        }
        if (!asVar.f1495d.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = asVar.f1495d;
                this.silver &= -129;
            } else {
                if ((this.silver & 128) != 128) {
                    this.e = new ArrayList(this.e);
                    this.silver |= 128;
                }
                this.e.addAll(asVar.f1495d);
            }
        }
        if (!asVar.e.isEmpty()) {
            if (this.f1489f.isEmpty()) {
                this.f1489f = asVar.e;
                this.silver &= -257;
            } else {
                if ((this.silver & Barcode.FORMAT_QR_CODE) != 256) {
                    this.f1489f = new ArrayList(this.f1489f);
                    this.silver |= Barcode.FORMAT_QR_CODE;
                }
                this.f1489f.addAll(asVar.e);
            }
        }
        juliet(asVar);
        this.alpha = this.alpha.bravo(asVar.purple);
    }
}
