package com.checkout.components.card.model;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/checkout/components/card/model/DerivedCardInputState;", "", "", "hasSchemeChoices", "shouldShowInfoRow", "hasMinimumSchemes", "<init>", "(ZZZ)V", "component1", "()Z", "component2", "component3", Constants.COPY_TYPE, "(ZZZ)Lcom/checkout/components/card/model/DerivedCardInputState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getHasSchemeChoices", "b", "getShouldShowInfoRow", "c", "getHasMinimumSchemes", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DerivedCardInputState {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean hasSchemeChoices;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldShowInfoRow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean hasMinimumSchemes;

    public DerivedCardInputState(boolean z2, boolean z10, boolean z11) {
        this.hasSchemeChoices = z2;
        this.shouldShowInfoRow = z10;
        this.hasMinimumSchemes = z11;
    }

    public static DerivedCardInputState copy$default(DerivedCardInputState derivedCardInputState, boolean z2, boolean z10, boolean z11, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = derivedCardInputState.hasSchemeChoices;
        }
        if ((i4 & 2) != 0) {
            z10 = derivedCardInputState.shouldShowInfoRow;
        }
        if ((i4 & 4) != 0) {
            z11 = derivedCardInputState.hasMinimumSchemes;
        }
        derivedCardInputState.getClass();
        return new DerivedCardInputState(z2, z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasSchemeChoices() {
        return this.hasSchemeChoices;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowInfoRow() {
        return this.shouldShowInfoRow;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMinimumSchemes() {
        return this.hasMinimumSchemes;
    }

    @NotNull
    public final DerivedCardInputState copy(boolean hasSchemeChoices, boolean shouldShowInfoRow, boolean hasMinimumSchemes) {
        return new DerivedCardInputState(hasSchemeChoices, shouldShowInfoRow, hasMinimumSchemes);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DerivedCardInputState)) {
            return false;
        }
        DerivedCardInputState derivedCardInputState = (DerivedCardInputState) other;
        return this.hasSchemeChoices == derivedCardInputState.hasSchemeChoices && this.shouldShowInfoRow == derivedCardInputState.shouldShowInfoRow && this.hasMinimumSchemes == derivedCardInputState.hasMinimumSchemes;
    }

    public final boolean getHasMinimumSchemes() {
        return this.hasMinimumSchemes;
    }

    public final boolean getHasSchemeChoices() {
        return this.hasSchemeChoices;
    }

    public final boolean getShouldShowInfoRow() {
        return this.shouldShowInfoRow;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10 = 1237;
        if (this.hasSchemeChoices) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = i4 * 31;
        if (this.shouldShowInfoRow) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i12 = (i5 + i11) * 31;
        if (this.hasMinimumSchemes) {
            i10 = 1231;
        }
        return i10 + i12;
    }

    @NotNull
    public final String toString() {
        boolean z2 = this.hasSchemeChoices;
        boolean z10 = this.shouldShowInfoRow;
        boolean z11 = this.hasMinimumSchemes;
        StringBuilder sb2 = new StringBuilder("DerivedCardInputState(hasSchemeChoices=");
        sb2.append(z2);
        sb2.append(", shouldShowInfoRow=");
        sb2.append(z10);
        sb2.append(", hasMinimumSchemes=");
        return c.romeo(sb2, z11, ")");
    }
}
