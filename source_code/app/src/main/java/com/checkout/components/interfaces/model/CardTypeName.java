package com.checkout.components.interfaces.model;

import b.c0;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \b2\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName;", "", "Charge", "Credit", "Debit", "DeferredDebit", "Prepaid", "GooglePay", "Companion", "Lcom/checkout/components/interfaces/model/CardTypeName$Charge;", "Lcom/checkout/components/interfaces/model/CardTypeName$Credit;", "Lcom/checkout/components/interfaces/model/CardTypeName$Debit;", "Lcom/checkout/components/interfaces/model/CardTypeName$DeferredDebit;", "Lcom/checkout/components/interfaces/model/CardTypeName$GooglePay;", "Lcom/checkout/components/interfaces/model/CardTypeName$Prepaid;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public interface CardTypeName {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5392a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Charge;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Charge implements CardTypeName {
        public static final int $stable = 0;

        @NotNull
        public static final Charge INSTANCE = new Charge();

        private Charge() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Companion;", "", "", "name", "Lcom/checkout/components/interfaces/model/CardTypeName;", "fromString", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/model/CardTypeName;", "displayName", "(Lcom/checkout/components/interfaces/model/CardTypeName;)Ljava/lang/String;", "", "b", "Lkotlin/Lazy;", "getEntries", "()Ljava/util/List;", "entries", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f5392a = new Companion();

        /* renamed from: b, reason: from kotlin metadata */
        private static final Lazy entries = LazyKt.lazy(new c0(7));

        private Companion() {
        }

        public static final List a() {
            return CollectionsKt.listOf(Charge.INSTANCE, Credit.INSTANCE, Debit.INSTANCE, DeferredDebit.INSTANCE, Prepaid.INSTANCE);
        }

        public static /* synthetic */ List alpha() {
            return a();
        }

        @NotNull
        public final String displayName(@NotNull CardTypeName cardTypeName) {
            Intrinsics.echo(cardTypeName, "<this>");
            return cardTypeName.getClass().getSimpleName();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Nullable
        public final CardTypeName fromString(@Nullable String name) {
            String str;
            if (name != null) {
                str = name.toUpperCase(Locale.ROOT);
                Intrinsics.delta(str, "toUpperCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -189311892:
                        if (str.equals("DEFERRED_DEBIT")) {
                            return DeferredDebit.INSTANCE;
                        }
                        break;
                    case 64920780:
                        if (str.equals("DEBIT")) {
                            return Debit.INSTANCE;
                        }
                        break;
                    case 399611855:
                        if (str.equals("PREPAID")) {
                            return Prepaid.INSTANCE;
                        }
                        break;
                    case 1986664116:
                        if (str.equals("CHARGE")) {
                            return Charge.INSTANCE;
                        }
                        break;
                    case 1996005113:
                        if (str.equals("CREDIT")) {
                            return Credit.INSTANCE;
                        }
                        break;
                }
            }
            return null;
        }

        @NotNull
        public final List<CardTypeName> getEntries() {
            return (List) entries.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Credit;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "Lcom/checkout/components/interfaces/model/CardTypeName$GooglePay;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Credit implements CardTypeName, GooglePay {
        public static final int $stable = 0;

        @NotNull
        public static final Credit INSTANCE = new Credit();

        private Credit() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Debit;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Debit implements CardTypeName {
        public static final int $stable = 0;

        @NotNull
        public static final Debit INSTANCE = new Debit();

        private Debit() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$DeferredDebit;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DeferredDebit implements CardTypeName {
        public static final int $stable = 0;

        @NotNull
        public static final DeferredDebit INSTANCE = new DeferredDebit();

        private DeferredDebit() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$GooglePay;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "Companion", "Lcom/checkout/components/interfaces/model/CardTypeName$Credit;", "Lcom/checkout/components/interfaces/model/CardTypeName$Prepaid;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface GooglePay extends CardTypeName {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f5394a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$GooglePay$Companion;", "", "", "Lcom/checkout/components/interfaces/model/CardTypeName$GooglePay;", "b", "Ljava/util/List;", "getEntries", "()Ljava/util/List;", "entries", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f5394a = new Companion();

            /* renamed from: b, reason: from kotlin metadata */
            private static final List entries = CollectionsKt.listOf(Credit.INSTANCE, Prepaid.INSTANCE);

            private Companion() {
            }

            @NotNull
            public final List<GooglePay> getEntries() {
                return entries;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Prepaid;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "Lcom/checkout/components/interfaces/model/CardTypeName$GooglePay;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Prepaid implements CardTypeName, GooglePay {
        public static final int $stable = 0;

        @NotNull
        public static final Prepaid INSTANCE = new Prepaid();

        private Prepaid() {
        }
    }
}
