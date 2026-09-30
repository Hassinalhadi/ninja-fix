package com.checkout.components.card.operations.validator;

import com.checkout.components.card.operations.validator.contract.Checker;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/card/operations/validator/LuhnChecker;", "Lcom/checkout/components/card/operations/validator/contract/Checker;", "", "<init>", "()V", Column.DATA, "", "check", "(Ljava/lang/String;)Z", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LuhnChecker implements Checker<String> {
    public static final int $stable = 0;

    @Override // com.checkout.components.card.operations.validator.contract.Checker
    public final boolean check(@NotNull String data) {
        Intrinsics.echo(data, "data");
        String obj = new StringBuilder((CharSequence) data).reverse().toString();
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i4 < obj.length()) {
            int i12 = i11 + 1;
            int digit = Character.digit((int) obj.charAt(i4), 10);
            Integer valueOf = Integer.valueOf(digit);
            if (digit < 0) {
                valueOf = null;
            }
            if (valueOf == null) {
                return false;
            }
            int intValue = valueOf.intValue();
            if (i11 % 2 == 0) {
                i5 += intValue;
            } else {
                i10 += ((intValue * 2) % 10) + (intValue / 5);
            }
            i4++;
            i11 = i12;
        }
        return (i5 + i10) % 10 == 0;
    }
}
