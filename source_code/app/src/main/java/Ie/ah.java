package Ie;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class ah extends Oe.j implements Oe.w {
    public int purple;
    public int red;
    public int silver;
    public ai teal;

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.j, Ie.ah] */
    public static ah kilo() {
        ?? jVar = new Oe.j();
        jVar.red = -1;
        jVar.teal = ai.PACKAGE;
        return jVar;
    }

    public final Object clone() {
        ah kilo = kilo();
        kilo.lima(juliet());
        return kilo;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        aj juliet = juliet();
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
        aj ajVar = null;
        try {
            try {
                aj.f1459b.getClass();
                lima(new aj(fVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                aj ajVar2 = (aj) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ajVar = ajVar2;
                    if (ajVar != null) {
                        lima(ajVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ajVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        lima((aj) oVar);
        return this;
    }

    public final aj juliet() {
        aj ajVar = new aj(this);
        int i4 = this.purple;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        ajVar.red = this.red;
        if ((i4 & 2) == 2) {
            i5 |= 2;
        }
        ajVar.silver = this.silver;
        if ((i4 & 4) == 4) {
            i5 |= 4;
        }
        ajVar.teal = this.teal;
        ajVar.purple = i5;
        return ajVar;
    }

    public final void lima(aj ajVar) {
        if (ajVar == aj.f1458a) {
            return;
        }
        int i4 = ajVar.purple;
        if ((i4 & 1) == 1) {
            int i5 = ajVar.red;
            this.purple = 1 | this.purple;
            this.red = i5;
        }
        if ((i4 & 2) == 2) {
            int i10 = ajVar.silver;
            this.purple = 2 | this.purple;
            this.silver = i10;
        }
        if ((i4 & 4) == 4) {
            ai aiVar = ajVar.teal;
            aiVar.getClass();
            this.purple = 4 | this.purple;
            this.teal = aiVar;
        }
        this.alpha = this.alpha.bravo(ajVar.alpha);
    }
}
