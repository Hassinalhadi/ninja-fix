package com.checkout.components.interfaces.usecase;

import Nd.c;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0018\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/usecase/SuspendUseCase;", "D", "T", "", Column.DATA, "execute", "(Ljava/lang/Object;LNd/c;)Ljava/lang/Object;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SuspendUseCase<D, T> {
    @Nullable
    Object execute(D d4, @NotNull c<? super T> cVar);
}
