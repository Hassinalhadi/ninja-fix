package Le;

import Oe.o;
import Oe.v;
import Oe.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class f extends Oe.j implements w {
    public int purple;
    public List red;
    public List silver;

    /* JADX WARN: Type inference failed for: r0v0, types: [Le.f, Oe.j, java.lang.Object] */
    public final Object clone() {
        ?? jVar = new Oe.j();
        List list = Collections.EMPTY_LIST;
        jVar.red = list;
        jVar.silver = list;
        jVar.kilo(juliet());
        return jVar;
    }

    @Override // Oe.j
    public final v golf() {
        j juliet = juliet();
        juliet.alpha();
        return juliet;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        j jVar = null;
        try {
            try {
                j.f1850a.getClass();
                kilo(new j(fVar, hVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                j jVar2 = (j) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jVar = jVar2;
                    if (jVar != null) {
                        kilo(jVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jVar != null) {
            }
            throw th;
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(o oVar) {
        kilo((j) oVar);
        return this;
    }

    public final j juliet() {
        j jVar = new j(this);
        if ((this.purple & 1) == 1) {
            this.red = Collections.unmodifiableList(this.red);
            this.purple &= -2;
        }
        jVar.purple = this.red;
        if ((this.purple & 2) == 2) {
            this.silver = Collections.unmodifiableList(this.silver);
            this.purple &= -3;
        }
        jVar.red = this.silver;
        return jVar;
    }

    public final void kilo(j jVar) {
        if (jVar == j.yellow) {
            return;
        }
        if (!jVar.purple.isEmpty()) {
            if (this.red.isEmpty()) {
                this.red = jVar.purple;
                this.purple &= -2;
            } else {
                if ((this.purple & 1) != 1) {
                    this.red = new ArrayList(this.red);
                    this.purple |= 1;
                }
                this.red.addAll(jVar.purple);
            }
        }
        if (!jVar.red.isEmpty()) {
            if (this.silver.isEmpty()) {
                this.silver = jVar.red;
                this.purple &= -3;
            } else {
                if ((this.purple & 2) != 2) {
                    this.silver = new ArrayList(this.silver);
                    this.purple |= 2;
                }
                this.silver.addAll(jVar.red);
            }
        }
        this.alpha = this.alpha.bravo(jVar.alpha);
    }
}
