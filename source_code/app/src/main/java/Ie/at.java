package Ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class at extends Oe.k {

    /* renamed from: a, reason: collision with root package name */
    public au f1498a;

    /* renamed from: b, reason: collision with root package name */
    public List f1499b;

    /* renamed from: c, reason: collision with root package name */
    public List f1500c;
    public int silver;
    public int teal;
    public int white;
    public boolean yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.k, Ie.at] */
    public static at lima() {
        ?? kVar = new Oe.k();
        kVar.f1498a = au.INV;
        List list = Collections.EMPTY_LIST;
        kVar.f1499b = list;
        kVar.f1500c = list;
        return kVar;
    }

    public final Object clone() {
        at lima = lima();
        lima.mike(kilo());
        return lima;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        av kilo = kilo();
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
        av avVar = null;
        try {
            try {
                av.f1502g.getClass();
                mike(new av(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                av avVar2 = (av) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    avVar = avVar2;
                    if (avVar != null) {
                        mike(avVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (avVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        mike((av) oVar);
        return this;
    }

    public final av kilo() {
        av avVar = new av(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        avVar.silver = this.teal;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        avVar.teal = this.white;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        avVar.white = this.yellow;
        if ((i4 & 8) == 8) {
            i5 |= 8;
        }
        avVar.yellow = this.f1498a;
        if ((i4 & 16) == 16) {
            this.f1499b = Collections.unmodifiableList(this.f1499b);
            this.silver &= -17;
        }
        avVar.f1503a = this.f1499b;
        if ((this.silver & 32) == 32) {
            this.f1500c = Collections.unmodifiableList(this.f1500c);
            this.silver &= -33;
        }
        avVar.f1504b = this.f1500c;
        avVar.red = i5;
        return avVar;
    }

    public final void mike(av avVar) {
        if (avVar == av.f1501f) {
            return;
        }
        int i4 = avVar.red;
        if ((i4 & 1) == 1) {
            int i5 = avVar.silver;
            this.silver = 1 | this.silver;
            this.teal = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = avVar.teal;
            this.silver = 2 | this.silver;
            this.white = i10;
        }
        if ((i4 & 4) == 4) {
            boolean z2 = avVar.white;
            this.silver = 4 | this.silver;
            this.yellow = z2;
        }
        if ((i4 & 8) == 8) {
            au auVar = avVar.yellow;
            auVar.getClass();
            this.silver = 8 | this.silver;
            this.f1498a = auVar;
        }
        if (!avVar.f1503a.isEmpty()) {
            if (this.f1499b.isEmpty()) {
                this.f1499b = avVar.f1503a;
                this.silver &= -17;
            } else {
                if ((this.silver & 16) != 16) {
                    this.f1499b = new ArrayList(this.f1499b);
                    this.silver |= 16;
                }
                this.f1499b.addAll(avVar.f1503a);
            }
        }
        if (!avVar.f1504b.isEmpty()) {
            if (this.f1500c.isEmpty()) {
                this.f1500c = avVar.f1504b;
                this.silver &= -33;
            } else {
                if ((this.silver & 32) != 32) {
                    this.f1500c = new ArrayList(this.f1500c);
                    this.silver |= 32;
                }
                this.f1500c.addAll(avVar.f1504b);
            }
        }
        juliet(avVar);
        this.alpha = this.alpha.bravo(avVar.purple);
    }
}
