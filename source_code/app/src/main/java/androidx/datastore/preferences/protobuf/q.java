package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class q implements Cloneable {
    public final s alpha;
    public s purple;

    public q(s sVar) {
        this.alpha = sVar;
        if (!sVar.foxtrot()) {
            this.purple = sVar.hotel();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final s alpha() {
        s bravo = bravo();
        bravo.getClass();
        if (s.echo(bravo, true)) {
            return bravo;
        }
        throw new UninitializedMessageException(bravo);
    }

    public final s bravo() {
        if (!this.purple.foxtrot()) {
            return this.purple;
        }
        s sVar = this.purple;
        sVar.getClass();
        ap apVar = ap.charlie;
        apVar.getClass();
        apVar.alpha(sVar.getClass()).alpha(sVar);
        sVar.golf();
        return this.purple;
    }

    public final void charlie() {
        if (!this.purple.foxtrot()) {
            s hotel = this.alpha.hotel();
            s sVar = this.purple;
            ap apVar = ap.charlie;
            apVar.getClass();
            apVar.alpha(hotel.getClass()).delta(hotel, sVar);
            this.purple = hotel;
        }
    }

    public final Object clone() {
        q qVar = (q) this.alpha.bravo(5);
        qVar.purple = bravo();
        return qVar;
    }
}
