package com.checkout.components.interfaces.api;

import android.view.View;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.model.ComponentName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/api/BaseComponent;", "", "", "Render", "(Landroidx/compose/runtime/m;I)V", "Landroid/view/View;", "container", "provideView", "(Landroid/view/View;)Landroid/view/View;", "Lcom/checkout/components/interfaces/model/ComponentName;", "getName", "()Lcom/checkout/components/interfaces/model/ComponentName;", "name", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public interface BaseComponent {
    void Render(@Nullable InterfaceC0581m interfaceC0581m, int i4);

    @NotNull
    ComponentName getName();

    @NotNull
    View provideView(@NotNull View container);
}
