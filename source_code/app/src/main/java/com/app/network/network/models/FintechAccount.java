package com.app.network.network.models;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006$"}, d2 = {"Lcom/app/network/network/models/FintechAccount;", "", Constants.KEY_ID, "", "captainId", "accountId", "", "accountType", "referenceType", "referenceId", "createdAt", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getCaptainId", "getAccountId", "()Ljava/lang/String;", "getAccountType", "getReferenceType", "getReferenceId", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FintechAccount {

    @Nullable
    private final String accountId;

    @Nullable
    private final String accountType;
    private final long captainId;

    @Nullable
    private final String createdAt;
    private final long id;

    @Nullable
    private final String referenceId;

    @Nullable
    private final String referenceType;

    public FintechAccount(long j5, long j6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.id = j5;
        this.captainId = j6;
        this.accountId = str;
        this.accountType = str2;
        this.referenceType = str3;
        this.referenceId = str4;
        this.createdAt = str5;
    }

    public static /* synthetic */ FintechAccount copy$default(FintechAccount fintechAccount, long j5, long j6, String str, String str2, String str3, String str4, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = fintechAccount.id;
        }
        long j7 = j5;
        if ((i4 & 2) != 0) {
            j6 = fintechAccount.captainId;
        }
        long j10 = j6;
        if ((i4 & 4) != 0) {
            str = fintechAccount.accountId;
        }
        return fintechAccount.copy(j7, j10, str, (i4 & 8) != 0 ? fintechAccount.accountType : str2, (i4 & 16) != 0 ? fintechAccount.referenceType : str3, (i4 & 32) != 0 ? fintechAccount.referenceId : str4, (i4 & 64) != 0 ? fintechAccount.createdAt : str5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCaptainId() {
        return this.captainId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getReferenceType() {
        return this.referenceType;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final FintechAccount copy(long id2, long captainId, @Nullable String accountId, @Nullable String accountType, @Nullable String referenceType, @Nullable String referenceId, @Nullable String createdAt) {
        return new FintechAccount(id2, captainId, accountId, accountType, referenceType, referenceId, createdAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FintechAccount)) {
            return false;
        }
        FintechAccount fintechAccount = (FintechAccount) other;
        return this.id == fintechAccount.id && this.captainId == fintechAccount.captainId && Intrinsics.areEqual(this.accountId, fintechAccount.accountId) && Intrinsics.areEqual(this.accountType, fintechAccount.accountType) && Intrinsics.areEqual(this.referenceType, fintechAccount.referenceType) && Intrinsics.areEqual(this.referenceId, fintechAccount.referenceId) && Intrinsics.areEqual(this.createdAt, fintechAccount.createdAt);
    }

    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    public final long getCaptainId() {
        return this.captainId;
    }

    @Nullable
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getReferenceId() {
        return this.referenceId;
    }

    @Nullable
    public final String getReferenceType() {
        return this.referenceType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j5 = this.id;
        long j6 = this.captainId;
        int i4 = ((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31;
        String str = this.accountId;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (i4 + hashCode) * 31;
        String str2 = this.accountType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.referenceType;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.referenceId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.createdAt;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i13 + i5;
    }

    @NotNull
    public String toString() {
        long j5 = this.id;
        long j6 = this.captainId;
        String str = this.accountId;
        String str2 = this.accountType;
        String str3 = this.referenceType;
        String str4 = this.referenceId;
        String str5 = this.createdAt;
        StringBuilder uniform = c.uniform("FintechAccount(id=", j5, ", captainId=");
        uniform.append(j6);
        uniform.append(", accountId=");
        uniform.append(str);
        c.azure(uniform, ", accountType=", str2, ", referenceType=", str3);
        c.azure(uniform, ", referenceId=", str4, ", createdAt=", str5);
        uniform.append(")");
        return uniform.toString();
    }
}
