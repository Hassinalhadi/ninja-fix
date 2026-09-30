package com.checkout.components.card.utils;

import Nd.c;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.insight.ProductEventName;
import com.checkout.components.interfaces.insight.ProductEventProperties;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.style.base.ImageStyle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/card/utils/Fixtures;", "", "Lcom/checkout/components/interfaces/insight/Logger;", "a", "Lcom/checkout/components/interfaces/insight/Logger;", "getLogger$card_standardRelease", "()Lcom/checkout/components/interfaces/insight/Logger;", "logger", "", "Lcom/checkout/components/ui/model/CardScheme;", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "b", "Ljava/util/Map;", "getCardSchemesMap", "()Ljava/util/Map;", "cardSchemesMap", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Fixtures {
    public static final int $stable;

    @NotNull
    public static final Fixtures INSTANCE = new Fixtures();

    /* renamed from: a, reason: collision with root package name */
    private static final Fixtures$logger$1 f4602a = new Logger() { // from class: com.checkout.components.card.utils.Fixtures$logger$1
        @Override // com.checkout.components.interfaces.insight.Logger
        /* renamed from: getMobileSessionId */
        public final String getF5107b() {
            return "";
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logError(CheckoutError error, String errorStack, boolean throwInDebug) {
            Intrinsics.echo(error, "error");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final Object logErrorAndAwait(CheckoutError checkoutError, String str, c<? super Unit> cVar) {
            return Unit.INSTANCE;
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logInfo(String message) {
            Intrinsics.echo(message, "message");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logWarning(String message) {
            Intrinsics.echo(message, "message");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void sendProductEvent(ProductEventName event, ProductEventProperties properties) {
            Intrinsics.echo(event, "event");
            Intrinsics.echo(properties, "properties");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logError(String messageToLog, String name, String message, String stackTrace, boolean throwInDebug) {
            Intrinsics.echo(messageToLog, "messageToLog");
            Intrinsics.echo(name, "name");
            Intrinsics.echo(message, "message");
        }

        @Override // com.checkout.components.interfaces.insight.Logger
        public final void logWarning(String messageToLog, String name, String message, String stackTrace) {
            Intrinsics.echo(messageToLog, "messageToLog");
            Intrinsics.echo(name, "name");
            Intrinsics.echo(message, "message");
        }
    };

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map cardSchemesMap;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.checkout.components.card.utils.Fixtures$logger$1] */
    static {
        CardScheme cardScheme = CardScheme.MASTERCARD;
        Pair pair = new Pair(cardScheme, new ImageStyle(cardScheme.getImageId(), null, 16, 30, null, null, null, null, 210, null));
        CardScheme cardScheme2 = CardScheme.CARTES_BANCAIRES;
        cardSchemesMap = y.sierra(pair, new Pair(cardScheme2, new ImageStyle(cardScheme2.getImageId(), null, 16, 30, null, null, null, null, 210, null)));
        $stable = 8;
    }

    private Fixtures() {
    }

    @NotNull
    public final Map<CardScheme, ImageStyle> getCardSchemesMap() {
        return cardSchemesMap;
    }

    @NotNull
    public final Logger getLogger$card_standardRelease() {
        return f4602a;
    }
}
