package com.checkout.components.interfaces.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005J!\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\b\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "T", "", "default", "<init>", "(Ljava/lang/Object;)V", "value", "", "update", "Lkotlin/Function1;", "function", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/runtime/ax;", "_state", "Landroidx/compose/runtime/ax;", "getState", "()Ljava/lang/Object;", "state", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PrimitiveStateRepository<T> {
    public static final int $stable = 0;

    @NotNull
    private final ax _state;

    public PrimitiveStateRepository(T t5) {
        this._state = C0564b.zulu(t5);
    }

    public final T getState() {
        return (T) this._state.getValue();
    }

    public final void update(T value) {
        this._state.setValue(value);
    }

    public final void update(@NotNull Function1<? super T, ? extends T> function) {
        Intrinsics.echo(function, "function");
        this._state.setValue(function.invoke(getState()));
    }
}
