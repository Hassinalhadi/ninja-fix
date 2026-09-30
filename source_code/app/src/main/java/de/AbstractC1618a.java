package de;

import java.util.Random;

/* renamed from: de.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1618a extends AbstractC1621d {
    @Override // de.AbstractC1621d
    public final int alpha(int i4) {
        return ((-i4) >> 31) & (foxtrot().nextInt() >>> (32 - i4));
    }

    @Override // de.AbstractC1621d
    public final int bravo() {
        return foxtrot().nextInt();
    }

    @Override // de.AbstractC1621d
    public final long delta() {
        return foxtrot().nextLong();
    }

    public abstract Random foxtrot();
}
