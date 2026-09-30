package Ie;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class am extends Oe.j implements Oe.w {
    public int purple;
    public an red;
    public aq silver;
    public int teal;

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.j, Ie.am] */
    public static am kilo() {
        ?? jVar = new Oe.j();
        jVar.red = an.INV;
        jVar.silver = aq.f1472m;
        return jVar;
    }

    public final Object clone() {
        am kilo = kilo();
        kilo.lima(juliet());
        return kilo;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        ao juliet = juliet();
        if (juliet.alpha()) {
            return juliet;
        }
        throw new UninitializedMessageException(juliet);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        ao aoVar = null;
        try {
            try {
                ao.f1461b.getClass();
                lima(new ao(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ao aoVar2 = (ao) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aoVar = aoVar2;
                    if (aoVar != null) {
                        lima(aoVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (aoVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        lima((ao) oVar);
        return this;
    }

    public final ao juliet() {
        ao aoVar = new ao(this);
        int i4 = this.purple;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        aoVar.red = this.red;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        aoVar.silver = this.silver;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        aoVar.teal = this.teal;
        aoVar.purple = i5;
        return aoVar;
    }

    public final void lima(ao aoVar) {
        aq aqVar;
        if (aoVar == ao.f1460a) {
            return;
        }
        if ((aoVar.purple & 1) == 1) {
            an anVar = aoVar.red;
            anVar.getClass();
            this.purple = 1 | this.purple;
            this.red = anVar;
        }
        if ((aoVar.purple & 2) == 2) {
            aq aqVar2 = aoVar.silver;
            if ((this.purple & 2) == 2 && (aqVar = this.silver) != aq.f1472m) {
                ap romeo = aq.romeo(aqVar);
                romeo.mike(aqVar2);
                this.silver = romeo.kilo();
            } else {
                this.silver = aqVar2;
            }
            this.purple |= 2;
        }
        if ((aoVar.purple & 4) == 4) {
            int i4 = aoVar.teal;
            this.purple = 4 | this.purple;
            this.teal = i4;
        }
        this.alpha = this.alpha.bravo(aoVar.alpha);
    }
}
