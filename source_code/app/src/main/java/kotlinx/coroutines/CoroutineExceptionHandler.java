package kotlinx.coroutines;

import Nd.f;
import Nd.h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "LNd/f;", "vf/z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends f {
    void handleException(h hVar, Throwable th);
}
