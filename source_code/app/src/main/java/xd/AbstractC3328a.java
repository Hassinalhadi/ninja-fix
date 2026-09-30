package xd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;

/* renamed from: xd.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3328a {
    public static final List alpha;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            Intrinsics.delta(it, "iterator(...)");
            alpha = AbstractC2360j.quebec(AbstractC2360j.charlie(it));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
