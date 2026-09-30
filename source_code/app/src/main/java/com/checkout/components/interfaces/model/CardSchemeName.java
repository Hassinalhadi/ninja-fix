package com.checkout.components.interfaces.model;

import b.c0;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \r2\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName;", "", "AmericanExpress", "CartesBancaires", "ChinaUnionPay", "DinersClubInternational", "Discover", "Jaywan", "JCB", "Mada", "Mastercard", "Visa", "GooglePay", "Companion", "Lcom/checkout/components/interfaces/model/CardSchemeName$AmericanExpress;", "Lcom/checkout/components/interfaces/model/CardSchemeName$CartesBancaires;", "Lcom/checkout/components/interfaces/model/CardSchemeName$ChinaUnionPay;", "Lcom/checkout/components/interfaces/model/CardSchemeName$DinersClubInternational;", "Lcom/checkout/components/interfaces/model/CardSchemeName$Discover;", "Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay;", "Lcom/checkout/components/interfaces/model/CardSchemeName$JCB;", "Lcom/checkout/components/interfaces/model/CardSchemeName$Jaywan;", "Lcom/checkout/components/interfaces/model/CardSchemeName$Mada;", "Lcom/checkout/components/interfaces/model/CardSchemeName$Mastercard;", "Lcom/checkout/components/interfaces/model/CardSchemeName$Visa;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public interface CardSchemeName {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5383a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$AmericanExpress;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class AmericanExpress implements CardSchemeName, GooglePay {
        public static final int $stable = 0;

        @NotNull
        public static final AmericanExpress INSTANCE = new AmericanExpress();

        private AmericanExpress() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$CartesBancaires;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class CartesBancaires implements CardSchemeName {
        public static final int $stable = 0;

        @NotNull
        public static final CartesBancaires INSTANCE = new CartesBancaires();

        private CartesBancaires() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$ChinaUnionPay;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ChinaUnionPay implements CardSchemeName {
        public static final int $stable = 0;

        @NotNull
        public static final ChinaUnionPay INSTANCE = new ChinaUnionPay();

        private ChinaUnionPay() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$Companion;", "", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "", "displayName", "(Lcom/checkout/components/interfaces/model/CardSchemeName;)Ljava/lang/String;", "", "b", "Lkotlin/Lazy;", "getEntries", "()Ljava/util/List;", "entries", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f5383a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Lazy entries = LazyKt.lazy(new c0(6));

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List a() {
            return CollectionsKt.listOf(AmericanExpress.INSTANCE, CartesBancaires.INSTANCE, ChinaUnionPay.INSTANCE, DinersClubInternational.INSTANCE, Discover.INSTANCE, Jaywan.INSTANCE, JCB.INSTANCE, Mada.INSTANCE, Mastercard.INSTANCE, Visa.INSTANCE);
        }

        @NotNull
        public final String displayName(@NotNull CardSchemeName cardSchemeName) {
            Intrinsics.echo(cardSchemeName, "<this>");
            return cardSchemeName.getClass().getSimpleName().toString();
        }

        @NotNull
        public final List<CardSchemeName> getEntries() {
            return (List) entries.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$DinersClubInternational;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DinersClubInternational implements CardSchemeName {
        public static final int $stable = 0;

        @NotNull
        public static final DinersClubInternational INSTANCE = new DinersClubInternational();

        private DinersClubInternational() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$Discover;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Discover implements CardSchemeName, GooglePay {
        public static final int $stable = 0;

        @NotNull
        public static final Discover INSTANCE = new Discover();

        private Discover() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0005\u0003\u0004\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "Companion", "Lcom/checkout/components/interfaces/model/CardSchemeName$AmericanExpress;", "Lcom/checkout/components/interfaces/model/CardSchemeName$Discover;", "Lcom/checkout/components/interfaces/model/CardSchemeName$JCB;", "Lcom/checkout/components/interfaces/model/CardSchemeName$Mastercard;", "Lcom/checkout/components/interfaces/model/CardSchemeName$Visa;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface GooglePay extends CardSchemeName {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f5385a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay$Companion;", "", "", "Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay;", "b", "Ljava/util/List;", "getEntries", "()Ljava/util/List;", "entries", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f5385a = new Companion();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final List entries = CollectionsKt.listOf(AmericanExpress.INSTANCE, Discover.INSTANCE, JCB.INSTANCE, Visa.INSTANCE, Mastercard.INSTANCE);

            private Companion() {
            }

            @NotNull
            public final List<GooglePay> getEntries() {
                return entries;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$JCB;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class JCB implements CardSchemeName, GooglePay {
        public static final int $stable = 0;

        @NotNull
        public static final JCB INSTANCE = new JCB();

        private JCB() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$Jaywan;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Jaywan implements CardSchemeName {
        public static final int $stable = 0;

        @NotNull
        public static final Jaywan INSTANCE = new Jaywan();

        private Jaywan() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$Mada;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Mada implements CardSchemeName {
        public static final int $stable = 0;

        @NotNull
        public static final Mada INSTANCE = new Mada();

        private Mada() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$Mastercard;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Mastercard implements CardSchemeName, GooglePay {
        public static final int $stable = 0;

        @NotNull
        public static final Mastercard INSTANCE = new Mastercard();

        private Mastercard() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/checkout/components/interfaces/model/CardSchemeName$Visa;", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "Lcom/checkout/components/interfaces/model/CardSchemeName$GooglePay;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Visa implements CardSchemeName, GooglePay {
        public static final int $stable = 0;

        @NotNull
        public static final Visa INSTANCE = new Visa();

        private Visa() {
        }
    }
}
