package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public abstract class v implements Cloneable {
    public final x alpha;
    public x purple;
    public boolean red = false;

    public v(x xVar) {
        this.alpha = xVar;
        this.purple = (x) xVar.delta(4);
    }

    public static void delta(x xVar, x xVar2) {
        aw awVar = aw.charlie;
        awVar.getClass();
        awVar.alpha(xVar.getClass()).juliet(xVar, xVar2);
    }

    public final x alpha() {
        x bravo = bravo();
        if (bravo.hotel()) {
            return bravo;
        }
        throw new UninitializedMessageException(bravo);
    }

    public final x bravo() {
        if (this.red) {
            return this.purple;
        }
        x xVar = this.purple;
        xVar.getClass();
        aw awVar = aw.charlie;
        awVar.getClass();
        awVar.alpha(xVar.getClass()).alpha(xVar);
        this.red = true;
        return this.purple;
    }

    public final void charlie() {
        if (this.red) {
            x xVar = (x) this.purple.delta(4);
            delta(xVar, this.purple);
            this.purple = xVar;
            this.red = false;
        }
    }

    public final Object clone() {
        v vVar = (v) this.alpha.delta(5);
        x bravo = bravo();
        vVar.charlie();
        delta(vVar.purple, bravo);
        return vVar;
    }
}
