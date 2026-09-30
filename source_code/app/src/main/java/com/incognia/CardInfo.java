package com.incognia;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.incognia.internal.VpS;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/incognia/CardInfo;", "", "bin", "", "lastFourDigits", "expiryYear", "expiryMonth", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBin", "()Ljava/lang/String;", "getExpiryMonth", "getExpiryYear", "getLastFourDigits", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Builder", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CardInfo {
    private final String bin;
    private final String expiryMonth;
    private final String expiryYear;
    private final String lastFourDigits;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/incognia/CardInfo$Builder;", "", "()V", "bin", "", "expiryMonth", "expiryYear", "lastFourDigits", "build", "Lcom/incognia/CardInfo;", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String bin;
        private String expiryMonth;
        private String expiryYear;
        private String lastFourDigits;

        public final Builder bin(String bin) {
            this.bin = bin;
            return this;
        }

        public final CardInfo build() {
            String str = this.bin;
            String str2 = null;
            if (str == null) {
                str = null;
            }
            String str3 = this.lastFourDigits;
            if (str3 != null) {
                str2 = str3;
            }
            return new CardInfo(str, str2, this.expiryYear, this.expiryMonth);
        }

        public final Builder expiryMonth(String expiryMonth) {
            this.expiryMonth = expiryMonth;
            return this;
        }

        public final Builder expiryYear(String expiryYear) {
            this.expiryYear = expiryYear;
            return this;
        }

        public final Builder lastFourDigits(String lastFourDigits) {
            this.lastFourDigits = lastFourDigits;
            return this;
        }
    }

    public CardInfo(String str, String str2, String str3, String str4) {
        this.bin = str;
        this.lastFourDigits = str2;
        this.expiryYear = str3;
        this.expiryMonth = str4;
    }

    public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cardInfo.bin;
        }
        if ((i4 & 2) != 0) {
            str2 = cardInfo.lastFourDigits;
        }
        if ((i4 & 4) != 0) {
            str3 = cardInfo.expiryYear;
        }
        if ((i4 & 8) != 0) {
            str4 = cardInfo.expiryMonth;
        }
        return cardInfo.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final CardInfo copy(String bin, String lastFourDigits, String expiryYear, String expiryMonth) {
        return new CardInfo(bin, lastFourDigits, expiryYear, expiryMonth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) other;
        return Intrinsics.areEqual(this.bin, cardInfo.bin) && Intrinsics.areEqual(this.lastFourDigits, cardInfo.lastFourDigits) && Intrinsics.areEqual(this.expiryYear, cardInfo.expiryYear) && Intrinsics.areEqual(this.expiryMonth, cardInfo.expiryMonth);
    }

    public final String getBin() {
        return this.bin;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public int hashCode() {
        int hashCode;
        int b2 = VpS.b(this.lastFourDigits, this.bin.hashCode() * 31, 31);
        String str = this.expiryYear;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (b2 + hashCode) * 31;
        String str2 = this.expiryMonth;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CardInfo(bin=");
        sb2.append(this.bin);
        sb2.append(", lastFourDigits=");
        sb2.append(this.lastFourDigits);
        sb2.append(", expiryYear=");
        sb2.append(this.expiryYear);
        sb2.append(", expiryMonth=");
        return P0.fuchsia(sb2, this.expiryMonth, ')');
    }

    public /* synthetic */ CardInfo(String str, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4);
    }
}
