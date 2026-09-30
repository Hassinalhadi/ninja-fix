package com.google.protobuf;

/* loaded from: classes2.dex */
public final class am implements au {
    public final aj alpha;
    public final B bravo;
    public final C1506i charlie;

    public am(B b2, C1506i c1506i, aj ajVar) {
        this.bravo = b2;
        c1506i.getClass();
        this.charlie = c1506i;
        this.alpha = ajVar;
    }

    @Override // com.google.protobuf.au
    public final void alpha(Object obj) {
        ((D) this.bravo).getClass();
        C c3 = ((AbstractC1513p) obj).unknownFields;
        if (c3.echo) {
            c3.echo = false;
        }
        this.charlie.getClass();
        ao.ad.cyan(obj);
        throw null;
    }

    @Override // com.google.protobuf.au
    public final boolean bravo(Object obj) {
        this.charlie.getClass();
        ao.ad.cyan(obj);
        throw null;
    }

    @Override // com.google.protobuf.au
    public final AbstractC1513p charlie() {
        aj ajVar = this.alpha;
        if (ajVar instanceof AbstractC1513p) {
            return (AbstractC1513p) ((AbstractC1513p) ajVar).juliet(4);
        }
        return ((AbstractC1511n) ((AbstractC1513p) ajVar).juliet(5)).hotel();
    }

    @Override // com.google.protobuf.au
    public final void delta(Object obj, Object obj2) {
        av.juliet(this.bravo, obj, obj2);
    }

    @Override // com.google.protobuf.au
    public final void echo(Object obj, ac acVar) {
        this.charlie.getClass();
        ao.ad.cyan(obj);
        throw null;
    }

    @Override // com.google.protobuf.au
    public final int foxtrot(AbstractC1513p abstractC1513p) {
        ((D) this.bravo).getClass();
        return abstractC1513p.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.au
    public final int golf(AbstractC1513p abstractC1513p) {
        ((D) this.bravo).getClass();
        C c3 = abstractC1513p.unknownFields;
        int i4 = c3.delta;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < c3.alpha; i10++) {
            int i11 = c3.bravo[i10] >>> 3;
            i5 += C1503f.delta(3, (C1502e) c3.charlie[i10]) + C1503f.india(i11) + C1503f.hotel(2) + (C1503f.hotel(1) * 2);
        }
        c3.delta = i5;
        return i5;
    }

    @Override // com.google.protobuf.au
    public final boolean hotel(AbstractC1513p abstractC1513p, AbstractC1513p abstractC1513p2) {
        D d4 = (D) this.bravo;
        d4.getClass();
        C c3 = abstractC1513p.unknownFields;
        d4.getClass();
        if (!c3.equals(abstractC1513p2.unknownFields)) {
            return false;
        }
        return true;
    }
}
