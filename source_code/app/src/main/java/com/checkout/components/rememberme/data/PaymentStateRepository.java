package com.checkout.components.rememberme.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.L;
import yf.at;
import yf.av;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/rememberme/data/PaymentStateRepository;", "", "Lyf/at;", "Lcom/checkout/components/interfaces/model/PaymentState;", "stateFlow", "<init>", "(Lyf/at;)V", "a", "Lyf/at;", "getStateFlow$rememberme_standardRelease", "()Lyf/at;", "Lyf/L;", "b", "Lyf/L;", "getFlow", "()Lyf/L;", "flow", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentStateRepository {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final at stateFlow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final L flow;

    public PaymentStateRepository(@NotNull at stateFlow) {
        Intrinsics.echo(stateFlow, "stateFlow");
        this.stateFlow = stateFlow;
        this.flow = new av(stateFlow);
    }

    @NotNull
    public final L getFlow() {
        return this.flow;
    }

    @NotNull
    /* renamed from: getStateFlow$rememberme_standardRelease, reason: from getter */
    public final at getStateFlow() {
        return this.stateFlow;
    }
}
