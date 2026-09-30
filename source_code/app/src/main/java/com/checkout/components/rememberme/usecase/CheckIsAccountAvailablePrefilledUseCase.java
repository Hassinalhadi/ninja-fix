package com.checkout.components.rememberme.usecase;

import Cf.d;
import Cf.e;
import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.C0945h;
import com.checkout.components.rememberme.C0948i;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.AbstractC3220y;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/rememberme/usecase/CheckIsAccountAvailablePrefilledUseCase;", "Lcom/checkout/components/interfaces/usecase/SuspendUseCase;", "", "", "Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "kmpRememberMe", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "isAccountAvailablePrefilledRepository", "Lvf/y;", "dispatcher", "<init>", "(Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lvf/y;)V", Column.DATA, "execute", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckIsAccountAvailablePrefilledUseCase implements SuspendUseCase<String, Unit> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final CheckoutKMPRememberMe f6325a;

    /* renamed from: b, reason: collision with root package name */
    private final PrimitiveStateFlowRepository f6326b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3220y f6327c;

    public CheckIsAccountAvailablePrefilledUseCase(@NotNull CheckoutKMPRememberMe kmpRememberMe, @NotNull PrimitiveStateFlowRepository<Boolean> isAccountAvailablePrefilledRepository, @NotNull AbstractC3220y dispatcher) {
        Intrinsics.echo(kmpRememberMe, "kmpRememberMe");
        Intrinsics.echo(isAccountAvailablePrefilledRepository, "isAccountAvailablePrefilledRepository");
        Intrinsics.echo(dispatcher, "dispatcher");
        this.f6325a = kmpRememberMe;
        this.f6326b = isAccountAvailablePrefilledRepository;
        this.f6327c = dispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.checkout.components.interfaces.usecase.SuspendUseCase
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(@Nullable String str, @NotNull c<? super Unit> cVar) {
        C0945h c0945h;
        int i4;
        if (cVar instanceof C0945h) {
            c0945h = (C0945h) cVar;
            int i5 = c0945h.f5939d;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0945h.f5939d = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0945h.f5937b;
                a aVar = a.alpha;
                i4 = c0945h.f5939d;
                if (i4 != 0) {
                    ResultKt.alpha(obj);
                    AbstractC3220y abstractC3220y = this.f6327c;
                    C0948i c0948i = new C0948i(this, str, null);
                    c0945h.f5936a = null;
                    c0945h.f5939d = 1;
                    if (ad.blue(abstractC3220y, c0948i, c0945h) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                }
                return Unit.INSTANCE;
            }
        }
        c0945h = new C0945h(this, cVar);
        Object obj2 = c0945h.f5937b;
        a aVar2 = a.alpha;
        i4 = c0945h.f5939d;
        if (i4 != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckIsAccountAvailablePrefilledUseCase(CheckoutKMPRememberMe checkoutKMPRememberMe, PrimitiveStateFlowRepository primitiveStateFlowRepository, AbstractC3220y abstractC3220y, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(checkoutKMPRememberMe, primitiveStateFlowRepository, abstractC3220y);
        if ((i4 & 4) != 0) {
            e eVar = ao.alpha;
            abstractC3220y = d.purple;
        }
    }
}
