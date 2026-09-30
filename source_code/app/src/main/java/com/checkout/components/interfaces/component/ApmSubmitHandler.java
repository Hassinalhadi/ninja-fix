package com.checkout.components.interfaces.component;

import Nd.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ,\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H¦B¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/component/ApmSubmitHandler;", "", "", "apmType", "", "fields", "", "invoke", "(Ljava/lang/String;Ljava/util/Map;LNd/c;)Ljava/lang/Object;", "Companion", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ApmSubmitHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5263a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/interfaces/component/ApmSubmitHandler$Companion;", "", "Lcom/checkout/components/interfaces/component/ApmSubmitHandler;", "NoOp", "Lcom/checkout/components/interfaces/component/ApmSubmitHandler;", "getNoOp", "()Lcom/checkout/components/interfaces/component/ApmSubmitHandler;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f5263a = new Companion();

        private Companion() {
        }

        @NotNull
        public final ApmSubmitHandler getNoOp() {
            return a.f5325a;
        }
    }

    @Nullable
    Object invoke(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull c<? super Unit> cVar);
}
