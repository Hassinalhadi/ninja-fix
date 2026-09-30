package com.google.protobuf;

/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1511n implements Cloneable {
    public final AbstractC1513p alpha;
    public AbstractC1513p purple;

    public AbstractC1511n(AbstractC1513p abstractC1513p) {
        this.alpha = abstractC1513p;
        if (!abstractC1513p.mike()) {
            this.purple = (AbstractC1513p) abstractC1513p.juliet(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final Object clone() {
        AbstractC1511n abstractC1511n = (AbstractC1511n) this.alpha.juliet(5);
        abstractC1511n.purple = hotel();
        return abstractC1511n;
    }

    public final AbstractC1513p golf() {
        AbstractC1513p hotel = hotel();
        hotel.getClass();
        boolean z2 = true;
        byte byteValue = ((Byte) hotel.juliet(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z2 = false;
            } else {
                ar arVar = ar.charlie;
                arVar.getClass();
                z2 = arVar.alpha(hotel.getClass()).bravo(hotel);
                hotel.juliet(2);
            }
        }
        if (z2) {
            return hotel;
        }
        throw new UninitializedMessageException(hotel);
    }

    public final AbstractC1513p hotel() {
        if (!this.purple.mike()) {
            return this.purple;
        }
        AbstractC1513p abstractC1513p = this.purple;
        abstractC1513p.getClass();
        ar arVar = ar.charlie;
        arVar.getClass();
        arVar.alpha(abstractC1513p.getClass()).alpha(abstractC1513p);
        abstractC1513p.november();
        return this.purple;
    }

    public final void india() {
        if (!this.purple.mike()) {
            AbstractC1513p abstractC1513p = (AbstractC1513p) this.alpha.juliet(4);
            AbstractC1513p abstractC1513p2 = this.purple;
            ar arVar = ar.charlie;
            arVar.getClass();
            arVar.alpha(abstractC1513p.getClass()).delta(abstractC1513p, abstractC1513p2);
            this.purple = abstractC1513p;
        }
    }
}
