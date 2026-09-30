package com.bumptech.glide.load.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class y implements E3.f {
    public static final B8.h juliet = new B8.h(50);
    public final G3.g bravo;
    public final E3.f charlie;
    public final E3.f delta;
    public final int echo;
    public final int foxtrot;
    public final Class golf;
    public final E3.i hotel;
    public final E3.m india;

    public y(G3.g gVar, E3.f fVar, E3.f fVar2, int i4, int i5, E3.m mVar, Class cls, E3.i iVar) {
        this.bravo = gVar;
        this.charlie = fVar;
        this.delta = fVar2;
        this.echo = i4;
        this.foxtrot = i5;
        this.india = mVar;
        this.golf = cls;
        this.hotel = iVar;
    }

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        Object hotel;
        G3.g gVar = this.bravo;
        synchronized (gVar) {
            G3.f fVar = (G3.f) gVar.delta;
            G3.i iVar = (G3.i) ((ArrayDeque) fVar.alpha).poll();
            if (iVar == null) {
                iVar = fVar.X();
            }
            G3.e eVar = (G3.e) iVar;
            eVar.bravo = 8;
            eVar.charlie = byte[].class;
            hotel = gVar.hotel(eVar, byte[].class);
        }
        byte[] bArr = (byte[]) hotel;
        ByteBuffer.wrap(bArr).putInt(this.echo).putInt(this.foxtrot).array();
        this.delta.alpha(messageDigest);
        this.charlie.alpha(messageDigest);
        messageDigest.update(bArr);
        E3.m mVar = this.india;
        if (mVar != null) {
            mVar.alpha(messageDigest);
        }
        this.hotel.alpha(messageDigest);
        B8.h hVar = juliet;
        Class cls = this.golf;
        byte[] bArr2 = (byte[]) hVar.alpha(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(E3.f.alpha);
            hVar.foxtrot(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.bravo.juliet(bArr);
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.foxtrot == yVar.foxtrot && this.echo == yVar.echo && Y3.l.bravo(this.india, yVar.india) && this.golf.equals(yVar.golf) && this.charlie.equals(yVar.charlie) && this.delta.equals(yVar.delta) && this.hotel.equals(yVar.hotel)) {
                return true;
            }
        }
        return false;
    }

    @Override // E3.f
    public final int hashCode() {
        int hashCode = ((((this.delta.hashCode() + (this.charlie.hashCode() * 31)) * 31) + this.echo) * 31) + this.foxtrot;
        E3.m mVar = this.india;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return this.hotel.bravo.hashCode() + ((this.golf.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.charlie + ", signature=" + this.delta + ", width=" + this.echo + ", height=" + this.foxtrot + ", decodedResourceClass=" + this.golf + ", transformation='" + this.india + "', options=" + this.hotel + '}';
    }
}
