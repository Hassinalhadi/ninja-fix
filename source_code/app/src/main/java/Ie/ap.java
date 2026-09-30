package Ie;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class ap extends Oe.k {

    /* renamed from: a, reason: collision with root package name */
    public aq f1462a;

    /* renamed from: b, reason: collision with root package name */
    public int f1463b;

    /* renamed from: c, reason: collision with root package name */
    public int f1464c;

    /* renamed from: d, reason: collision with root package name */
    public int f1465d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1466f;

    /* renamed from: g, reason: collision with root package name */
    public aq f1467g;

    /* renamed from: h, reason: collision with root package name */
    public int f1468h;

    /* renamed from: i, reason: collision with root package name */
    public aq f1469i;

    /* renamed from: j, reason: collision with root package name */
    public int f1470j;

    /* renamed from: k, reason: collision with root package name */
    public int f1471k;
    public int silver;
    public List teal;
    public boolean white;
    public int yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.ap, Oe.k] */
    public static ap lima() {
        ?? kVar = new Oe.k();
        kVar.teal = Collections.EMPTY_LIST;
        aq aqVar = aq.f1472m;
        kVar.f1462a = aqVar;
        kVar.f1467g = aqVar;
        kVar.f1469i = aqVar;
        return kVar;
    }

    public final Object clone() {
        ap lima = lima();
        lima.mike(kilo());
        return lima;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        aq kilo = kilo();
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
        aq aqVar = null;
        try {
            try {
                aq.f1473n.getClass();
                mike(new aq(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                aq aqVar2 = (aq) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aqVar = aqVar2;
                    if (aqVar != null) {
                        mike(aqVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (aqVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        mike((aq) oVar);
        return this;
    }

    public final aq kilo() {
        aq aqVar = new aq(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) == 1) {
            this.teal = Collections.unmodifiableList(this.teal);
            this.silver &= -2;
        }
        aqVar.silver = this.teal;
        if ((i4 & 2) != 2) {
            i5 = 0;
        }
        aqVar.teal = this.white;
        if ((i4 & 4) == 4) {
            i5 |= 2;
        }
        aqVar.white = this.yellow;
        if ((i4 & 8) == 8) {
            i5 |= 4;
        }
        aqVar.yellow = this.f1462a;
        if ((i4 & 16) == 16) {
            i5 |= 8;
        }
        aqVar.f1474a = this.f1463b;
        if ((i4 & 32) == 32) {
            i5 |= 16;
        }
        aqVar.f1475b = this.f1464c;
        if ((i4 & 64) == 64) {
            i5 |= 32;
        }
        aqVar.f1476c = this.f1465d;
        if ((i4 & 128) == 128) {
            i5 |= 64;
        }
        aqVar.f1477d = this.e;
        if ((i4 & Barcode.FORMAT_QR_CODE) == 256) {
            i5 |= 128;
        }
        aqVar.e = this.f1466f;
        if ((i4 & 512) == 512) {
            i5 |= Barcode.FORMAT_QR_CODE;
        }
        aqVar.f1478f = this.f1467g;
        if ((i4 & Barcode.FORMAT_UPC_E) == 1024) {
            i5 |= 512;
        }
        aqVar.f1479g = this.f1468h;
        if ((i4 & 2048) == 2048) {
            i5 |= Barcode.FORMAT_UPC_E;
        }
        aqVar.f1480h = this.f1469i;
        if ((i4 & 4096) == 4096) {
            i5 |= 2048;
        }
        aqVar.f1481i = this.f1470j;
        if ((i4 & 8192) == 8192) {
            i5 |= 4096;
        }
        aqVar.f1482j = this.f1471k;
        aqVar.red = i5;
        return aqVar;
    }

    public final ap mike(aq aqVar) {
        aq aqVar2;
        aq aqVar3;
        aq aqVar4;
        aq aqVar5 = aq.f1472m;
        if (aqVar == aqVar5) {
            return this;
        }
        boolean z2 = true;
        if (!aqVar.silver.isEmpty()) {
            if (this.teal.isEmpty()) {
                this.teal = aqVar.silver;
                this.silver &= -2;
            } else {
                if ((this.silver & 1) != 1) {
                    this.teal = new ArrayList(this.teal);
                    this.silver |= 1;
                }
                this.teal.addAll(aqVar.silver);
            }
        }
        int i4 = aqVar.red;
        if ((i4 & 1) == 1) {
            boolean z10 = aqVar.teal;
            this.silver |= 2;
            this.white = z10;
        }
        if ((i4 & 2) == 2) {
            int i5 = aqVar.white;
            this.silver |= 4;
            this.yellow = i5;
        }
        if ((i4 & 4) == 4) {
            aq aqVar6 = aqVar.yellow;
            if ((this.silver & 8) == 8 && (aqVar4 = this.f1462a) != aqVar5) {
                ap romeo = aq.romeo(aqVar4);
                romeo.mike(aqVar6);
                this.f1462a = romeo.kilo();
            } else {
                this.f1462a = aqVar6;
            }
            this.silver |= 8;
        }
        if ((aqVar.red & 8) == 8) {
            int i10 = aqVar.f1474a;
            this.silver |= 16;
            this.f1463b = i10;
        }
        if (aqVar.papa()) {
            int i11 = aqVar.f1475b;
            this.silver |= 32;
            this.f1464c = i11;
        }
        int i12 = aqVar.red;
        if ((i12 & 32) == 32) {
            int i13 = aqVar.f1476c;
            this.silver |= 64;
            this.f1465d = i13;
        }
        if ((i12 & 64) == 64) {
            int i14 = aqVar.f1477d;
            this.silver |= 128;
            this.e = i14;
        }
        if ((i12 & 128) == 128) {
            int i15 = aqVar.e;
            this.silver |= Barcode.FORMAT_QR_CODE;
            this.f1466f = i15;
        }
        if ((i12 & Barcode.FORMAT_QR_CODE) == 256) {
            aq aqVar7 = aqVar.f1478f;
            if ((this.silver & 512) == 512 && (aqVar3 = this.f1467g) != aqVar5) {
                ap romeo2 = aq.romeo(aqVar3);
                romeo2.mike(aqVar7);
                this.f1467g = romeo2.kilo();
            } else {
                this.f1467g = aqVar7;
            }
            this.silver |= 512;
        }
        int i16 = aqVar.red;
        if ((i16 & 512) == 512) {
            int i17 = aqVar.f1479g;
            this.silver |= Barcode.FORMAT_UPC_E;
            this.f1468h = i17;
        }
        if ((i16 & Barcode.FORMAT_UPC_E) == 1024) {
            aq aqVar8 = aqVar.f1480h;
            if ((this.silver & 2048) == 2048 && (aqVar2 = this.f1469i) != aqVar5) {
                ap romeo3 = aq.romeo(aqVar2);
                romeo3.mike(aqVar8);
                this.f1469i = romeo3.kilo();
            } else {
                this.f1469i = aqVar8;
            }
            this.silver |= 2048;
        }
        int i18 = aqVar.red;
        if ((i18 & 2048) != 2048) {
            z2 = false;
        }
        if (z2) {
            int i19 = aqVar.f1481i;
            this.silver |= 4096;
            this.f1470j = i19;
        }
        if ((i18 & 4096) == 4096) {
            int i20 = aqVar.f1482j;
            this.silver |= 8192;
            this.f1471k = i20;
        }
        juliet(aqVar);
        this.alpha = this.alpha.bravo(aqVar.purple);
        return this;
    }
}
