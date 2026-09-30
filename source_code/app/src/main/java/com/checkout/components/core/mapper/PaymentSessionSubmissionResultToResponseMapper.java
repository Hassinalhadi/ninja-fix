package com.checkout.components.core.mapper;

import Qd.a;
import ao.ad;
import com.checkout.components.core.network.model.response.DeclineReason;
import com.checkout.components.core.network.model.response.PayPaymentSessionResponse;
import com.checkout.components.core.network.model.response.PaymentAction;
import com.checkout.components.core.network.model.response.PaymentStatus;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.paymentsession.PaymentAction;
import com.checkout.components.interfaces.model.paymentsession.PaymentSessionSubmissionResult;
import com.checkout.components.redirecthandler.RedirectDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/core/mapper/PaymentSessionSubmissionResultToResponseMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "<init>", "()V", "from", "map", "(Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;)Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentSessionSubmissionResultToResponseMapper implements Mapper<PaymentSessionSubmissionResult, PayPaymentSessionResponse> {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final List f4828a = CollectionsKt.listOf(RedirectDelegate.WIRE_VALUE_THREE_DS, "redirect");

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentStatus.values().length];
            try {
                iArr[PaymentStatus.ActionRequired.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentStatus.Approved.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentStatus.Declined.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static PaymentStatus a(String str) {
        Object obj;
        int collectionSizeOrDefault;
        Iterator<E> it = PaymentStatus.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((PaymentStatus) obj).getValue(), str)) {
                break;
            }
        }
        PaymentStatus paymentStatus = (PaymentStatus) obj;
        if (paymentStatus != null) {
            return paymentStatus;
        }
        a entries = PaymentStatus.getEntries();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<E> it2 = entries.iterator();
        while (it2.hasNext()) {
            arrayList.add(((PaymentStatus) it2.next()).getValue());
        }
        throw new IllegalArgumentException("Unknown payment status: '" + str + "'. Valid statuses are: " + arrayList);
    }

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public final PayPaymentSessionResponse map(@NotNull PaymentSessionSubmissionResult from) {
        Object obj;
        Object obj2;
        DeclineReason declineReason;
        Intrinsics.echo(from, "from");
        String type = from.getType();
        Iterator<T> it = PaymentMethodName.INSTANCE.getEntries().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((PaymentMethodName) obj2).getValue(), type)) {
                break;
            }
        }
        PaymentMethodName paymentMethodName = (PaymentMethodName) obj2;
        if (paymentMethodName == null) {
            paymentMethodName = new PaymentMethodName(type);
        }
        PaymentStatus a6 = a(from.getStatus());
        int i4 = WhenMappings.$EnumSwitchMapping$0[a6.ordinal()];
        if (i4 == 1) {
            String id2 = from.getId();
            PaymentAction action = from.getAction();
            if (action != null) {
                return new PayPaymentSessionResponse.ActionRequired(id2, paymentMethodName, a(action), a6);
            }
            throw new IllegalArgumentException("Action is required when status is 'Action Required' but action was null");
        }
        if (i4 == 2) {
            return new PayPaymentSessionResponse.Approved(from.getId(), paymentMethodName, a6);
        }
        if (i4 == 3) {
            String id3 = from.getId();
            String declineReason2 = from.getDeclineReason();
            if (declineReason2 != null && !StringsKt.gray(declineReason2)) {
                Iterator<E> it2 = DeclineReason.getEntries().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.areEqual(((DeclineReason) next).getValue(), declineReason2)) {
                        obj = next;
                        break;
                    }
                }
                declineReason = (DeclineReason) obj;
                if (declineReason == null) {
                    declineReason = DeclineReason.TryAgain;
                }
            } else {
                declineReason = DeclineReason.TryAgain;
            }
            return new PayPaymentSessionResponse.Declined(id3, paymentMethodName, declineReason, a6);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static com.checkout.components.core.network.model.response.PaymentAction a(PaymentAction paymentAction) {
        String type = paymentAction.getType();
        List list = f4828a;
        if (Intrinsics.areEqual(type, list.get(0))) {
            String url = paymentAction.getUrl();
            return new PaymentAction.ThreeDS(url != null ? url : "");
        }
        if (!Intrinsics.areEqual(type, list.get(1))) {
            throw new IllegalArgumentException(ad.gray("Unknown payment action type: '", paymentAction.getType(), "'. Valid action types are: [3ds, redirect]"));
        }
        String url2 = paymentAction.getUrl();
        return new PaymentAction.Redirect(url2 != null ? url2 : "");
    }
}
