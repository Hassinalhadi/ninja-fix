package com.checkout.address.utils;

import D0.c;
import D0.g;
import I0.ah;
import I0.aj;
import com.checkout.components.address.N;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/address/utils/NumberOnlyZipVisualTransformation;", "LI0/aj;", "<init>", "()V", "LD0/g;", Constants.KEY_TEXT, "LI0/ah;", "filter", "(LD0/g;)LI0/ah;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumberOnlyZipVisualTransformation implements aj {
    public static final int $stable = 0;

    @Deprecated
    public static final char HYPHEN = '-';

    @Deprecated
    public static final int HYPHEN_POSITION_INDEX = 5;

    @Override // I0.aj
    @NotNull
    public final ah filter(@NotNull g text) {
        int i4;
        Intrinsics.echo(text, "text");
        if (true & true) {
            i4 = 16;
        } else {
            i4 = 0;
        }
        StringBuilder sb2 = new StringBuilder(i4);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        int i5 = 0;
        int i10 = 0;
        while (true) {
            String str = text.purple;
            if (i5 >= str.length()) {
                break;
            }
            int i11 = i10 + 1;
            sb2.append(str.charAt(i5));
            if (i10 == 4 && str.length() > 5) {
                sb2.append(HYPHEN);
            }
            i5++;
            i10 = i11;
        }
        String sb3 = sb2.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.add(((c) arrayList.get(i12)).alpha(sb2.length()));
        }
        return new ah(new g(sb3, arrayList2), new N());
    }
}
