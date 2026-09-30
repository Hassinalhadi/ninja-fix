package Ie;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class s extends Oe.k {
    public int silver;
    public int teal;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ie.s, Oe.k, java.lang.Object] */
    public final Object clone() {
        ?? kVar = new Oe.k();
        t tVar = new t(this);
        int i4 = 1;
        if ((this.silver & 1) != 1) {
            i4 = 0;
        }
        tVar.silver = this.teal;
        tVar.red = i4;
        kVar.kilo(tVar);
        return kVar;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        t tVar = new t(this);
        int i4 = 1;
        if ((this.silver & 1) != 1) {
            i4 = 0;
        }
        tVar.silver = this.teal;
        tVar.red = i4;
        if (tVar.alpha()) {
            return tVar;
        }
        throw new UninitializedMessageException(tVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        t tVar = null;
        try {
            try {
                t.f1592a.getClass();
                kilo(new t(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                t tVar2 = (t) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    tVar = tVar2;
                    if (tVar != null) {
                        kilo(tVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (tVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        kilo((t) oVar);
        return this;
    }

    public final void kilo(t tVar) {
        if (tVar == t.yellow) {
            return;
        }
        if ((tVar.red & 1) == 1) {
            int i4 = tVar.silver;
            this.silver = 1 | this.silver;
            this.teal = i4;
        }
        juliet(tVar);
        this.alpha = this.alpha.bravo(tVar.purple);
    }
}
