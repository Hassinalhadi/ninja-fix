package vg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class c extends C3222a {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.C3222a
    public final List alpha(Executor executor) {
        return Arrays.asList(new Object(), new o(executor));
    }

    @Override // vg.C3222a
    public final List charlie() {
        return Collections.singletonList(new b(1));
    }
}
