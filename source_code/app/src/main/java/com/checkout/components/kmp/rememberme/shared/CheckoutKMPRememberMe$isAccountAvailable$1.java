package com.checkout.components.kmp.rememberme.shared;

import Od.a;
import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe", f = "CheckoutKMPRememberMe.kt", l = {75}, m = "isAccountAvailable-gIAlu-s")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckoutKMPRememberMe$isAccountAvailable$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutKMPRememberMe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutKMPRememberMe$isAccountAvailable$1(CheckoutKMPRememberMe checkoutKMPRememberMe, Nd.c<? super CheckoutKMPRememberMe$isAccountAvailable$1> cVar) {
        super(cVar);
        this.this$0 = checkoutKMPRememberMe;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object m117isAccountAvailablegIAlus = this.this$0.m117isAccountAvailablegIAlus(null, this);
        if (m117isAccountAvailablegIAlus == a.alpha) {
            return m117isAccountAvailablegIAlus;
        }
        return new Result(m117isAccountAvailablegIAlus);
    }
}
