package Ef;

import Af.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class k extends r {
    public final /* synthetic */ AtomicReferenceArray echo;

    public k(long j5, k kVar, int i4) {
        super(j5, kVar, i4);
        this.echo = new AtomicReferenceArray(j.foxtrot);
    }

    @Override // Af.r
    public final int golf() {
        return j.foxtrot;
    }

    @Override // Af.r
    public final void hotel(int i4, Nd.h hVar) {
        this.echo.set(i4, j.echo);
        india();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.charlie + ", hashCode=" + hashCode() + ']';
    }
}
