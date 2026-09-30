package com.checkout.components.card.operations.usecase;

import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.usecase.UseCase;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.clevertap.android.sdk.db.Column;
import h5.C1809a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/card/operations/usecase/DetermineSchemeChoiceUiVisibilityUseCase;", "Lcom/checkout/components/interfaces/usecase/UseCase;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "", "Lcom/checkout/components/ui/model/CardScheme;", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "Lcom/checkout/components/ui/data/SupportedSchemesRepository;", "supportedSchemesRepository", "<init>", "(Lcom/checkout/components/ui/data/SupportedSchemesRepository;)V", Column.DATA, "execute", "(Lcom/checkout/components/interfaces/model/CardMetadata;)Ljava/util/Map;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DetermineSchemeChoiceUiVisibilityUseCase implements UseCase<CardMetadata, Map<CardScheme, ? extends ImageStyle>> {
    public static final int $stable = SupportedSchemesRepository.$stable;

    /* renamed from: b */
    private static final Lazy f4367b = LazyKt.lazy(new C1809a(26));

    /* renamed from: a */
    private final SupportedSchemesRepository f4368a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardScheme.values().length];
            try {
                iArr[CardScheme.CARTES_BANCAIRES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardScheme.VISA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardScheme.MASTERCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DetermineSchemeChoiceUiVisibilityUseCase(@NotNull SupportedSchemesRepository supportedSchemesRepository) {
        Intrinsics.echo(supportedSchemesRepository, "supportedSchemesRepository");
        this.f4368a = supportedSchemesRepository;
    }

    public static final List a() {
        return CollectionsKt.listOf(CardScheme.VISA, CardScheme.MASTERCARD, CardScheme.CARTES_BANCAIRES);
    }

    @Override // com.checkout.components.interfaces.usecase.UseCase
    @NotNull
    public final Map<CardScheme, ImageStyle> execute(@Nullable CardMetadata r18) {
        List<String> localSchemes;
        CardScheme cardScheme;
        Object obj;
        Object obj2;
        List juliet;
        int collectionSizeOrDefault;
        t tVar = t.alpha;
        if (r18 != null && this.f4368a.items().contains(CardScheme.CARTES_BANCAIRES) && (localSchemes = r18.getLocalSchemes()) != null) {
            String lowerCase = "CARTES_BANCAIRES".toLowerCase(Locale.ROOT);
            Intrinsics.delta(lowerCase, "toLowerCase(...)");
            if (localSchemes.contains(lowerCase)) {
                Iterator<E> it = CardScheme.getEntries().iterator();
                while (true) {
                    cardScheme = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (r.hotel(((CardScheme) obj).name(), r18.getScheme(), true)) {
                        break;
                    }
                }
                CardScheme cardScheme2 = (CardScheme) obj;
                Iterator<E> it2 = CardScheme.getEntries().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (r.hotel(((CardScheme) obj2).name(), r18.getSchemeLocal(), true)) {
                        break;
                    }
                }
                CardScheme cardScheme3 = (CardScheme) obj2;
                if (cardScheme2 != null || cardScheme3 != null) {
                    Lazy lazy = f4367b;
                    if ((CollectionsKt.bronze((List) lazy.getValue(), cardScheme2) || CollectionsKt.bronze((List) lazy.getValue(), cardScheme3)) && (CollectionsKt.bronze(this.f4368a.items(), cardScheme2) || CollectionsKt.bronze(this.f4368a.items(), cardScheme3))) {
                        if (CollectionsKt.bronze(this.f4368a.items(), cardScheme2)) {
                            cardScheme = cardScheme2;
                        } else if (CollectionsKt.bronze(this.f4368a.items(), cardScheme3)) {
                            cardScheme = cardScheme3;
                        }
                        if (cardScheme != null) {
                            int i4 = WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()];
                            if (i4 == 1) {
                                juliet = ab.juliet(CardScheme.CARTES_BANCAIRES);
                            } else if (i4 == 2) {
                                juliet = CollectionsKt.listOf(CardScheme.CARTES_BANCAIRES, CardScheme.VISA);
                            } else if (i4 != 3) {
                                juliet = CollectionsKt.emptyList();
                            } else {
                                juliet = CollectionsKt.listOf(CardScheme.CARTES_BANCAIRES, CardScheme.MASTERCARD);
                            }
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(juliet, 10);
                            int quebec = y.quebec(collectionSizeOrDefault);
                            if (quebec < 16) {
                                quebec = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
                            for (Object obj3 : juliet) {
                                linkedHashMap.put(obj3, new ImageStyle(((CardScheme) obj3).getImageId(), null, 16, 30, null, null, null, null, 242, null));
                            }
                            return linkedHashMap;
                        }
                    }
                }
            }
        }
        return tVar;
    }
}
