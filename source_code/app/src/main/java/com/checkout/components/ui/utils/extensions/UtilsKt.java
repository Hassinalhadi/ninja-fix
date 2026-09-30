package com.checkout.components.ui.utils.extensions;

import com.checkout.components.interfaces.component.AcceptedCardSchemes;
import com.checkout.components.interfaces.model.CardSchemeName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.paymentsession.PaymentMethod;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.ui.model.CardScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/interfaces/component/AcceptedCardSchemes;", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "paymentMethodName", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "paymentSession", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;", "", "", "methodToSchemes", "Lcom/checkout/components/ui/model/CardScheme;", "getSupportedCardSchemes", "(Lcom/checkout/components/interfaces/component/AcceptedCardSchemes;Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "toGooglePayCardNetwork", "(Lcom/checkout/components/ui/model/CardScheme;)Ljava/lang/String;", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardScheme.values().length];
            try {
                iArr[CardScheme.AMERICAN_EXPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardScheme.DISCOVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardScheme.JCB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardScheme.VISA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardScheme.MASTERCARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final List<CardScheme> getSupportedCardSchemes(@Nullable AcceptedCardSchemes acceptedCardSchemes, @NotNull PaymentMethodName paymentMethodName, @NotNull PaymentSession paymentSession, @NotNull Function1<? super PaymentMethod, ? extends List<String>> methodToSchemes) {
        ArrayList arrayList;
        Object obj;
        List<String> emptyList;
        List<CardSchemeName> acceptedCardSchemes2;
        Intrinsics.echo(paymentMethodName, "paymentMethodName");
        Intrinsics.echo(paymentSession, "paymentSession");
        Intrinsics.echo(methodToSchemes, "methodToSchemes");
        Iterator<T> it = paymentSession.getPaymentMethods().iterator();
        while (true) {
            arrayList = null;
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((PaymentMethod) obj).getType(), paymentMethodName.getValue())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        if (paymentMethod == null || (emptyList = methodToSchemes.invoke(paymentMethod)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List<CardScheme> cardSchemes = CardSchemeExtensionsKt.toCardSchemes(emptyList);
        if (acceptedCardSchemes != null && (acceptedCardSchemes2 = acceptedCardSchemes.getAcceptedCardSchemes()) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = acceptedCardSchemes2.iterator();
            while (it2.hasNext()) {
                CardScheme cardScheme = CardSchemeExtensionsKt.toCardScheme(CardSchemeName.INSTANCE.displayName((CardSchemeName) it2.next()));
                if (cardScheme != null) {
                    arrayList2.add(cardScheme);
                }
            }
            arrayList = new ArrayList();
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                if (cardSchemes.contains((CardScheme) obj2)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList == null) {
            return cardSchemes;
        }
        return arrayList;
    }

    @Nullable
    public static final String toGooglePayCardNetwork(@NotNull CardScheme cardScheme) {
        Intrinsics.echo(cardScheme, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            return null;
                        }
                        return "MASTERCARD";
                    }
                    return "VISA";
                }
                return "JCB";
            }
            return "DISCOVER";
        }
        return "AMEX";
    }
}
