package Ie;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class ax extends Oe.k {

    /* renamed from: a, reason: collision with root package name */
    public int f1508a;

    /* renamed from: b, reason: collision with root package name */
    public aq f1509b;

    /* renamed from: c, reason: collision with root package name */
    public int f1510c;
    public int silver;
    public int teal;
    public int white;
    public aq yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.k, Ie.ax, java.lang.Object] */
    public final Object clone() {
        ?? kVar = new Oe.k();
        aq aqVar = aq.f1472m;
        kVar.yellow = aqVar;
        kVar.f1509b = aqVar;
        kVar.lima(kilo());
        return kVar;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        ay kilo = kilo();
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
        ay ayVar = null;
        try {
            try {
                ay.f1511f.getClass();
                lima(new ay(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ay ayVar2 = (ay) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ayVar = ayVar2;
                    if (ayVar != null) {
                        lima(ayVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ayVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        lima((ay) oVar);
        return this;
    }

    public final ay kilo() {
        ay ayVar = new ay(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        ayVar.silver = this.teal;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        ayVar.teal = this.white;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        ayVar.white = this.yellow;
        if ((i4 & 8) == 8) {
            i5 |= 8;
        }
        ayVar.yellow = this.f1508a;
        if ((i4 & 16) == 16) {
            i5 |= 16;
        }
        ayVar.f1512a = this.f1509b;
        if ((i4 & 32) == 32) {
            i5 |= 32;
        }
        ayVar.f1513b = this.f1510c;
        ayVar.red = i5;
        return ayVar;
    }

    public final void lima(ay ayVar) {
        aq aqVar;
        aq aqVar2;
        if (ayVar == ay.e) {
            return;
        }
        int i4 = ayVar.red;
        if ((i4 & 1) == 1) {
            int i5 = ayVar.silver;
            this.silver = 1 | this.silver;
            this.teal = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = ayVar.teal;
            this.silver = 2 | this.silver;
            this.white = i10;
        }
        if ((i4 & 4) == 4) {
            aq aqVar3 = ayVar.white;
            if ((this.silver & 4) == 4 && (aqVar2 = this.yellow) != aq.f1472m) {
                ap romeo = aq.romeo(aqVar2);
                romeo.mike(aqVar3);
                this.yellow = romeo.kilo();
            } else {
                this.yellow = aqVar3;
            }
            this.silver |= 4;
        }
        int i11 = ayVar.red;
        if ((i11 & 8) == 8) {
            int i12 = ayVar.yellow;
            this.silver = 8 | this.silver;
            this.f1508a = i12;
        }
        if ((i11 & 16) == 16) {
            aq aqVar4 = ayVar.f1512a;
            if ((this.silver & 16) == 16 && (aqVar = this.f1509b) != aq.f1472m) {
                ap romeo2 = aq.romeo(aqVar);
                romeo2.mike(aqVar4);
                this.f1509b = romeo2.kilo();
            } else {
                this.f1509b = aqVar4;
            }
            this.silver |= 16;
        }
        if ((ayVar.red & 32) == 32) {
            int i13 = ayVar.f1513b;
            this.silver = 32 | this.silver;
            this.f1510c = i13;
        }
        juliet(ayVar);
        this.alpha = this.alpha.bravo(ayVar.purple);
    }
}
