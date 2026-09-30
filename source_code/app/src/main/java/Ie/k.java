package Ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class k extends Oe.k {
    public int silver;
    public int teal;
    public List white;
    public List yellow;

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.k, Ie.k] */
    public static k lima() {
        ?? kVar = new Oe.k();
        kVar.teal = 6;
        List list = Collections.EMPTY_LIST;
        kVar.white = list;
        kVar.yellow = list;
        return kVar;
    }

    public final Object clone() {
        k lima = lima();
        lima.mike(kilo());
        return lima;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        l kilo = kilo();
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
        l lVar = null;
        try {
            try {
                l.f1587c.getClass();
                mike(new l(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                l lVar2 = (l) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    lVar = lVar2;
                    if (lVar != null) {
                        mike(lVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (lVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        mike((l) oVar);
        return this;
    }

    public final l kilo() {
        l lVar = new l(this);
        int i4 = this.silver;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        lVar.silver = this.teal;
        if ((i4 & 2) == 2) {
            this.white = Collections.unmodifiableList(this.white);
            this.silver &= -3;
        }
        lVar.teal = this.white;
        if ((this.silver & 4) == 4) {
            this.yellow = Collections.unmodifiableList(this.yellow);
            this.silver &= -5;
        }
        lVar.white = this.yellow;
        lVar.red = i5;
        return lVar;
    }

    public final void mike(l lVar) {
        if (lVar == l.f1586b) {
            return;
        }
        if ((lVar.red & 1) == 1) {
            int i4 = lVar.silver;
            this.silver = 1 | this.silver;
            this.teal = i4;
        }
        if (!lVar.teal.isEmpty()) {
            if (this.white.isEmpty()) {
                this.white = lVar.teal;
                this.silver &= -3;
            } else {
                if ((this.silver & 2) != 2) {
                    this.white = new ArrayList(this.white);
                    this.silver |= 2;
                }
                this.white.addAll(lVar.teal);
            }
        }
        if (!lVar.white.isEmpty()) {
            if (this.yellow.isEmpty()) {
                this.yellow = lVar.white;
                this.silver &= -5;
            } else {
                if ((this.silver & 4) != 4) {
                    this.yellow = new ArrayList(this.yellow);
                    this.silver |= 4;
                }
                this.yellow.addAll(lVar.white);
            }
        }
        juliet(lVar);
        this.alpha = this.alpha.bravo(lVar.purple);
    }
}
