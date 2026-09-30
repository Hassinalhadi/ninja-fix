package com.checkout.components.interfaces.api;

import Nd.c;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.model.UpdateDetails;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "Lcom/checkout/components/interfaces/api/BaseComponent;", "", "isAvailable", "(LNd/c;)Ljava/lang/Object;", "", "tokenize", "submit", "isValid", "Lcom/checkout/components/interfaces/model/UpdateDetails;", "updateDetails", "update", "(Lcom/checkout/components/interfaces/model/UpdateDetails;)V", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public interface PaymentMethodComponent extends BaseComponent {
    @Nullable
    Object isAvailable(@NotNull c<? super Boolean> cVar);

    @Nullable
    Object isValid(@NotNull c<? super Boolean> cVar);

    @Nullable
    Object submit(@NotNull c<? super Unit> cVar);

    @Nullable
    Object tokenize(@NotNull c<? super Unit> cVar);

    void update(@NotNull UpdateDetails updateDetails);
}
