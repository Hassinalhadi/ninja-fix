package ee;

import de.AbstractC1618a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ee.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1652a extends AbstractC1618a {
    @Override // de.AbstractC1621d
    public final int charlie(int i4, int i5) {
        return ThreadLocalRandom.current().nextInt(i4, i5);
    }

    @Override // de.AbstractC1621d
    public final long echo(long j5) {
        return ThreadLocalRandom.current().nextLong(0L, j5);
    }

    @Override // de.AbstractC1618a
    public final Random foxtrot() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.delta(current, "current(...)");
        return current;
    }
}
