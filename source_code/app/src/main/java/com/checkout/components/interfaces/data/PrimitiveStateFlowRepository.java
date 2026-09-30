package com.checkout.components.interfaces.data;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.at;
import yf.av;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005J!\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\b\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "T", "", "default", "<init>", "(Ljava/lang/Object;)V", "value", "", "update", "Lkotlin/Function1;", "function", "(Lkotlin/jvm/functions/Function1;)V", "Lyf/at;", "_flow", "Lyf/at;", "Lyf/L;", "flow", "Lyf/L;", "getFlow", "()Lyf/L;", "Companion", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PrimitiveStateFlowRepository<T> {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final at _flow;

    @NotNull
    private final L flow;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository$Companion;", "", "T", "default", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "create", "(Ljava/lang/Object;)Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final <T> PrimitiveStateFlowRepository<T> create(final T r22) {
            return new PrimitiveStateFlowRepository<T>(r22) { // from class: com.checkout.components.interfaces.data.PrimitiveStateFlowRepository$Companion$create$1
            };
        }
    }

    public PrimitiveStateFlowRepository(T t5) {
        N charlie = AbstractC3428A.charlie(t5);
        this._flow = charlie;
        this.flow = new av(charlie);
    }

    @NotNull
    public final L getFlow() {
        return this.flow;
    }

    public final void update(T value) {
        N n5;
        at atVar = this._flow;
        do {
            n5 = (N) atVar;
        } while (!n5.hotel(n5.getValue(), value));
    }

    public final void update(@NotNull Function1<? super T, ? extends T> function) {
        N n5;
        Object value;
        Intrinsics.echo(function, "function");
        at atVar = this._flow;
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, function.invoke(value)));
    }
}
