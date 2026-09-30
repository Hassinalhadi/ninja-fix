package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class ar implements A {
    public final ao alpha;
    public final C bravo;
    public final q charlie;

    public ar(C c3, q qVar, ao aoVar) {
        this.bravo = c3;
        qVar.getClass();
        this.charlie = qVar;
        this.alpha = aoVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void alpha(Object obj) {
        ((E) this.bravo).getClass();
        ((x) obj).unknownFields.echo = false;
        this.charlie.getClass();
        ao.ad.cyan(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final boolean bravo(Object obj) {
        this.charlie.getClass();
        ao.ad.cyan(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final Object charlie() {
        return ((v) ((x) this.alpha).delta(5)).bravo();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void delta(Object obj, byte[] bArr, int i4, int i5, C5.b bVar) {
        x xVar = (x) obj;
        if (xVar.unknownFields == D.foxtrot) {
            xVar.unknownFields = D.bravo();
        }
        throw A0.z.hotel(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final boolean echo(x xVar, x xVar2) {
        E e = (E) this.bravo;
        e.getClass();
        D d4 = xVar.unknownFields;
        e.getClass();
        if (!d4.equals(xVar2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void foxtrot(Object obj, C1495m c1495m) {
        this.charlie.getClass();
        ao.ad.cyan(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final int golf(x xVar) {
        ((E) this.bravo).getClass();
        return xVar.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void hotel(Object obj, az azVar, p pVar) {
        ((E) this.bravo).getClass();
        x xVar = (x) obj;
        if (xVar.unknownFields == D.foxtrot) {
            xVar.unknownFields = D.bravo();
        }
        this.charlie.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final int india(AbstractC1483a abstractC1483a) {
        ((E) this.bravo).getClass();
        D d4 = ((x) abstractC1483a).unknownFields;
        int i4 = d4.delta;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < d4.alpha; i10++) {
            int i11 = d4.bravo[i10] >>> 3;
            i5 += C1494l.zulu(3, (AbstractC1490h) d4.charlie[i10]) + C1494l.crimson(i11) + C1494l.coral(2) + (C1494l.coral(1) * 2);
        }
        d4.delta = i5;
        return i5;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.A
    public final void juliet(x xVar, x xVar2) {
        B.xray(this.bravo, xVar, xVar2);
    }
}
