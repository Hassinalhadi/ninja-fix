package Ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class o extends Oe.j implements Oe.w {
    public int purple;
    public p red;
    public List silver;
    public w teal;
    public q white;

    /* JADX WARN: Type inference failed for: r0v0, types: [Oe.j, Ie.o] */
    public static o kilo() {
        ?? jVar = new Oe.j();
        jVar.red = p.RETURNS_CONSTANT;
        jVar.silver = Collections.EMPTY_LIST;
        jVar.teal = w.e;
        jVar.white = q.AT_MOST_ONCE;
        return jVar;
    }

    public final Object clone() {
        o kilo = kilo();
        kilo.lima(juliet());
        return kilo;
    }

    @Override // Oe.j
    public final Oe.v golf() {
        r juliet = juliet();
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
        r rVar = null;
        try {
            try {
                r.f1590c.getClass();
                lima(new r(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                r rVar2 = (r) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    rVar = rVar2;
                    if (rVar != null) {
                        lima(rVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (rVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        lima((r) oVar);
        return this;
    }

    public final r juliet() {
        r rVar = new r(this);
        int i4 = this.purple;
        int i5 = 1;
        if ((i4 & 1) != 1) {
            i5 = 0;
        }
        rVar.red = this.red;
        if ((i4 & 2) == 2) {
            this.silver = Collections.unmodifiableList(this.silver);
            this.purple &= -3;
        }
        rVar.silver = this.silver;
        if ((i4 & 4) == 4) {
            i5 |= 2;
        }
        rVar.teal = this.teal;
        if ((i4 & 8) == 8) {
            i5 |= 4;
        }
        rVar.white = this.white;
        rVar.purple = i5;
        return rVar;
    }

    public final void lima(r rVar) {
        w wVar;
        if (rVar == r.f1589b) {
            return;
        }
        boolean z2 = true;
        if ((rVar.purple & 1) == 1) {
            p pVar = rVar.red;
            pVar.getClass();
            this.purple |= 1;
            this.red = pVar;
        }
        if (!rVar.silver.isEmpty()) {
            if (this.silver.isEmpty()) {
                this.silver = rVar.silver;
                this.purple &= -3;
            } else {
                if ((this.purple & 2) != 2) {
                    this.silver = new ArrayList(this.silver);
                    this.purple |= 2;
                }
                this.silver.addAll(rVar.silver);
            }
        }
        if ((rVar.purple & 2) != 2) {
            z2 = false;
        }
        if (z2) {
            w wVar2 = rVar.teal;
            if ((this.purple & 4) == 4 && (wVar = this.teal) != w.e) {
                u kilo = u.kilo();
                kilo.lima(wVar);
                kilo.lima(wVar2);
                this.teal = kilo.juliet();
            } else {
                this.teal = wVar2;
            }
            this.purple |= 4;
        }
        if ((rVar.purple & 4) == 4) {
            q qVar = rVar.white;
            qVar.getClass();
            this.purple |= 8;
            this.white = qVar;
        }
        this.alpha = this.alpha.bravo(rVar.alpha);
    }
}
