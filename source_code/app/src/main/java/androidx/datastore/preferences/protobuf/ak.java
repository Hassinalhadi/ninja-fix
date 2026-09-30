package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class ak implements as {
    public final s alpha;
    public final aw bravo;
    public final C0605l charlie;

    public ak(aw awVar, C0605l c0605l, s sVar) {
        this.bravo = awVar;
        c0605l.getClass();
        this.charlie = c0605l;
        this.alpha = sVar;
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final void alpha(Object obj) {
        ((ay) this.bravo).getClass();
        ax axVar = ((s) obj).unknownFields;
        if (axVar.echo) {
            axVar.echo = false;
        }
        this.charlie.getClass();
        ao.ad.cyan(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final boolean bravo(Object obj) {
        this.charlie.getClass();
        ao.ad.cyan(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final s charlie() {
        s sVar = this.alpha;
        if (av.q.kilo(sVar)) {
            return sVar.hotel();
        }
        return ((q) sVar.bravo(5)).bravo();
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final void delta(Object obj, Object obj2) {
        at.kilo(this.bravo, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final void echo(Object obj, aa aaVar) {
        this.charlie.getClass();
        ao.ad.cyan(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final int foxtrot(s sVar) {
        ((ay) this.bravo).getClass();
        ax axVar = sVar.unknownFields;
        int i4 = axVar.delta;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < axVar.alpha; i10++) {
            int i11 = axVar.bravo[i10] >>> 3;
            i5 += C0602i.hotel(3, (C0599f) axVar.charlie[i10]) + C0602i.kilo(i11) + C0602i.juliet(2) + (C0602i.juliet(1) * 2);
        }
        axVar.delta = i5;
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final int golf(s sVar) {
        ((ay) this.bravo).getClass();
        return sVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final boolean hotel(s sVar, s sVar2) {
        ay ayVar = (ay) this.bravo;
        ayVar.getClass();
        ax axVar = sVar.unknownFields;
        ayVar.getClass();
        if (!axVar.equals(sVar2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.as
    public final void india(Object obj, C0601h c0601h, C0604k c0604k) {
        this.bravo.alpha(obj);
        this.charlie.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
