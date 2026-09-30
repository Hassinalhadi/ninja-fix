package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class q implements E3.f {
    public final Object bravo;
    public final int charlie;
    public final int delta;
    public final Class echo;
    public final Class foxtrot;
    public final E3.f golf;
    public final Y3.c hotel;
    public final E3.i india;
    public int juliet;

    public q(Object obj, E3.f fVar, int i4, int i5, Y3.c cVar, Class cls, Class cls2, E3.i iVar) {
        Y3.f.charlie(obj, "Argument must not be null");
        this.bravo = obj;
        this.golf = fVar;
        this.charlie = i4;
        this.delta = i5;
        Y3.f.charlie(cVar, "Argument must not be null");
        this.hotel = cVar;
        Y3.f.charlie(cls, "Resource class must not be null");
        this.echo = cls;
        Y3.f.charlie(cls2, "Transcode class must not be null");
        this.foxtrot = cls2;
        Y3.f.charlie(iVar, "Argument must not be null");
        this.india = iVar;
    }

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.bravo.equals(qVar.bravo) && this.golf.equals(qVar.golf) && this.delta == qVar.delta && this.charlie == qVar.charlie && this.hotel.equals(qVar.hotel) && this.echo.equals(qVar.echo) && this.foxtrot.equals(qVar.foxtrot) && this.india.equals(qVar.india)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // E3.f
    public final int hashCode() {
        if (this.juliet == 0) {
            int hashCode = this.bravo.hashCode();
            this.juliet = hashCode;
            int hashCode2 = ((((this.golf.hashCode() + (hashCode * 31)) * 31) + this.charlie) * 31) + this.delta;
            this.juliet = hashCode2;
            int hashCode3 = this.hotel.hashCode() + (hashCode2 * 31);
            this.juliet = hashCode3;
            int hashCode4 = this.echo.hashCode() + (hashCode3 * 31);
            this.juliet = hashCode4;
            int hashCode5 = this.foxtrot.hashCode() + (hashCode4 * 31);
            this.juliet = hashCode5;
            this.juliet = this.india.bravo.hashCode() + (hashCode5 * 31);
        }
        return this.juliet;
    }

    public final String toString() {
        return "EngineKey{model=" + this.bravo + ", width=" + this.charlie + ", height=" + this.delta + ", resourceClass=" + this.echo + ", transcodeClass=" + this.foxtrot + ", signature=" + this.golf + ", hashCode=" + this.juliet + ", transformations=" + this.hotel + ", options=" + this.india + '}';
    }
}
