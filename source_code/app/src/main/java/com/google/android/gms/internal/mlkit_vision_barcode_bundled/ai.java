package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public abstract class ai implements Cloneable, C {
    public final am alpha;
    public am purple;

    public ai(am amVar) {
        this.alpha = amVar;
        if (!amVar.kilo()) {
            this.purple = (am) amVar.mike(4, null);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C
    public final boolean alpha() {
        return am.juliet(this.purple, false);
    }

    public final am bravo() {
        am charlie = charlie();
        if (am.juliet(charlie, true)) {
            return charlie;
        }
        throw new zzgr(charlie);
    }

    public am charlie() {
        if (!this.purple.kilo()) {
            return this.purple;
        }
        am amVar = this.purple;
        amVar.getClass();
        H.charlie.alpha(amVar.getClass()).bravo(amVar);
        amVar.golf();
        return this.purple;
    }

    public final Object clone() {
        ai aiVar = (ai) this.alpha.mike(5, null);
        aiVar.purple = charlie();
        return aiVar;
    }

    public /* bridge */ B delta() {
        return charlie();
    }

    public final void echo() {
        if (!this.purple.kilo()) {
            foxtrot();
        }
    }

    public void foxtrot() {
        am amVar = (am) this.alpha.mike(4, null);
        H.charlie.alpha(amVar.getClass()).delta(amVar, this.purple);
        this.purple = amVar;
    }
}
