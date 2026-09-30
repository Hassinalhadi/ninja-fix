package com.checkout.components.card.ui.component.expirydate;

import D0.e;
import D0.g;
import I0.ah;
import I0.aj;
import I0.t;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.checkout.components.card.utils.extensions.StringExtensionsKt;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/card/ui/component/expirydate/ExpiryDateVisualTransformation;", "LI0/aj;", "", "isRtl", "<init>", "(Z)V", "LD0/g;", Constants.KEY_TEXT, "LI0/ah;", "filter", "(LD0/g;)LI0/ah;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpiryDateVisualTransformation implements aj {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4515a;

    public ExpiryDateVisualTransformation() {
        this(false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [D0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    @Override // I0.aj
    @NotNull
    public final ah filter(@NotNull g text) {
        final boolean z2;
        Intrinsics.echo(text, "text");
        String str = text.purple;
        int i4 = 1;
        if (!StringExtensionsKt.isSingleDigitMonthPrefix(str) && !StringExtensionsKt.isInvalidTeenMonthPrefix(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            text = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO + str.charAt(0) + text.subSequence(1, str.length()).purple;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < text.length(); i5++) {
            sb2.append(text.charAt(i5));
            if (i5 == 1) {
                sb2.append(ExpiryDateConstantsKt.EXPIRY_DATE_SEPARATOR);
            }
        }
        String sb3 = sb2.toString();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            Integer num = null;
            if (i10 >= sb3.length()) {
                break;
            }
            char charAt = sb3.charAt(i10);
            int i12 = i11 + 1;
            Integer valueOf = Integer.valueOf(i11);
            if (!Character.isDigit(charAt)) {
                valueOf = null;
            }
            if (valueOf != null) {
                num = Integer.valueOf(valueOf.intValue() + 1);
            }
            if (num != null) {
                arrayList.add(num);
            }
            i10++;
            i11 = i12;
        }
        final List plus = CollectionsKt.plus(CollectionsKt.a(ab.juliet(0), CollectionsKt.cyan(arrayList)), Integer.valueOf(sb3.length()));
        final ArrayList arrayList2 = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (i13 < sb3.length()) {
            char charAt2 = sb3.charAt(i13);
            int i15 = i14 + 1;
            Integer valueOf2 = Integer.valueOf(i14);
            if (Character.isDigit(charAt2)) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                arrayList2.add(valueOf2);
            }
            i13++;
            i14 = i15;
        }
        t tVar = new t() { // from class: com.checkout.components.card.ui.component.expirydate.ExpiryDateVisualTransformation$filter$offsetTranslator$1
            @Override // I0.t
            public final int originalToTransformed(int offset) {
                if (z2) {
                    offset++;
                }
                return ((Number) plus.get(offset)).intValue();
            }

            @Override // I0.t
            public final int transformedToOriginal(int offset) {
                int i16;
                if (z2 && offset > 0) {
                    i16 = offset - 1;
                } else {
                    i16 = offset;
                }
                ArrayList arrayList3 = arrayList2;
                int i17 = 0;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i18 = 0;
                    while (i17 < size) {
                        Object obj = arrayList3.get(i17);
                        i17++;
                        if (((Number) obj).intValue() < offset && (i18 = i18 + 1) < 0) {
                            CollectionsKt.t();
                            throw null;
                        }
                    }
                    i17 = i18;
                }
                return i16 - i17;
            }
        };
        if (this.f4515a) {
            i4 = 2;
        }
        return new ah(new g(sb3, null, ab.juliet(new e(new D0.t(i4), 0, sb3.length())), 2), tVar);
    }

    public ExpiryDateVisualTransformation(boolean z2) {
        this.f4515a = z2;
    }

    public ExpiryDateVisualTransformation(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this.f4515a = (i4 & 1) != 0 ? false : z2;
    }
}
