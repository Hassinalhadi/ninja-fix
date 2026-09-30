package com.checkout.components.card.ui.component.cardnumber;

import D0.e;
import D0.g;
import I0.ah;
import I0.aj;
import I0.t;
import com.checkout.components.ui.model.CardScheme;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/card/ui/component/cardnumber/CardNumberTransformation;", "LI0/aj;", "Lyf/at;", "Lcom/checkout/components/ui/model/CardScheme;", "cardScheme", "", "isRTL", "<init>", "(Lyf/at;Z)V", "LD0/g;", Constants.KEY_TEXT, "LI0/ah;", "filter", "(LD0/g;)LI0/ah;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardNumberTransformation implements aj {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name */
    private final at f4442a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4443b;

    public CardNumberTransformation(@NotNull at cardScheme, boolean z2) {
        Intrinsics.echo(cardScheme, "cardScheme");
        this.f4442a = cardScheme;
        this.f4443b = z2;
    }

    @Override // I0.aj
    @NotNull
    public final ah filter(@NotNull g text) {
        String str;
        int i4;
        Intrinsics.echo(text, "text");
        final List<Integer> numberSeparatorPattern = ((CardScheme) ((N) this.f4442a).getValue()).getNumberSeparatorPattern();
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = numberSeparatorPattern.iterator();
        int i5 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            str = text.purple;
            if (!hasNext) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            if (intValue <= str.length()) {
                sb2.append(text.subSequence(i5, intValue).purple);
                sb2.append(" ");
                i5 = intValue;
            }
        }
        if (i5 < str.length()) {
            sb2.append(text.subSequence(i5, str.length()).purple);
        }
        t tVar = new t() { // from class: com.checkout.components.card.ui.component.cardnumber.CardNumberTransformation$filter$numberOffsetTranslator$1
            @Override // I0.t
            public final int originalToTransformed(int offset) {
                boolean z2;
                List list = numberSeparatorPattern;
                int i10 = 0;
                if (list != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((Number) it2.next()).intValue() < offset && (i10 = i10 + 1) < 0) {
                            CollectionsKt.t();
                            throw null;
                        }
                    }
                }
                return offset + i10;
            }

            @Override // I0.t
            public final int transformedToOriginal(int offset) {
                boolean z2;
                List list = numberSeparatorPattern;
                int i10 = 0;
                if (list != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((Number) it2.next()).intValue() < offset && (i10 = i10 + 1) < 0) {
                            CollectionsKt.t();
                            throw null;
                        }
                    }
                }
                return offset - i10;
            }
        };
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        if (this.f4443b) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        return new ah(new g(sb3, null, ab.juliet(new e(new D0.t(i4), 0, sb2.length())), 2), tVar);
    }
}
