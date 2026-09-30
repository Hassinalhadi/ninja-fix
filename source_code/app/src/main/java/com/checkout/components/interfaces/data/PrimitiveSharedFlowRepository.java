package com.checkout.components.interfaces.data;

import Nd.c;
import Od.a;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.AbstractC3428A;
import yf.as;
import yf.au;
import yf.aw;
import yf.az;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "T", "", "", "replay", "extraBufferCapacity", "<init>", "(II)V", "value", "", "emit", "(Ljava/lang/Object;LNd/c;)Ljava/lang/Object;", "", "tryEmit", "(Ljava/lang/Object;)Z", "Lyf/as;", "_flow", "Lyf/as;", "Lyf/aw;", "flow", "Lyf/aw;", "getFlow", "()Lyf/aw;", "Companion", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PrimitiveSharedFlowRepository<T> {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final as _flow;

    @NotNull
    private final aw flow;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository$Companion;", "", "T", "Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "create", "()Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final <T> PrimitiveSharedFlowRepository<T> create() {
            return new PrimitiveSharedFlowRepository<T>() { // from class: com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository$Companion$create$1
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PrimitiveSharedFlowRepository() {
        this(r2, r2, 3, null);
        int i4 = 0;
    }

    @Nullable
    public final Object emit(T t5, @NotNull c<? super Unit> cVar) {
        Object emit = this._flow.emit(t5, cVar);
        if (emit == a.alpha) {
            return emit;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final aw getFlow() {
        return this.flow;
    }

    public final boolean tryEmit(T value) {
        return this._flow.alpha(value);
    }

    public PrimitiveSharedFlowRepository(int i4, int i5) {
        az bravo = AbstractC3428A.bravo(i4, i5, null, 4);
        this._flow = bravo;
        this.flow = new au(bravo);
    }

    public /* synthetic */ PrimitiveSharedFlowRepository(int i4, int i5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : i4, (i10 & 2) != 0 ? 1 : i5);
    }
}
