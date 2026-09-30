package com.checkout.components.card.utils.extensions;

import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0000¨\u0006\b"}, d2 = {"dropSafe", "", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "", "defaultValue", "isSingleDigitMonthPrefix", "", "isInvalidTeenMonthPrefix", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StringExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final String dropSafe(@NotNull String str, int i4, @NotNull String defaultValue) {
        String str2;
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(defaultValue, "defaultValue");
        try {
            Result.Companion companion = Result.INSTANCE;
            str2 = Result.m206constructorimpl(StringsKt.blue(i4, str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            str2 = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(str2 instanceof k)) {
            defaultValue = str2;
        }
        return defaultValue;
    }

    public static /* synthetic */ String dropSafe$default(String str, int i4, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = "";
        }
        return dropSafe(str, i4, str2);
    }

    public static final boolean isInvalidTeenMonthPrefix(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        if (str.length() <= 1 || str.charAt(0) != '1' || Intrinsics.golf(str.charAt(1), 50) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean isSingleDigitMonthPrefix(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        if (StringsKt.gray(str) || Intrinsics.golf(str.charAt(0), 49) <= 0) {
            return false;
        }
        return true;
    }
}
