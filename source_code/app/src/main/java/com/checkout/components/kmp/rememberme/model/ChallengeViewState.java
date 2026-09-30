package com.checkout.components.kmp.rememberme.model;

import Q0.c;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/checkout/components/kmp/rememberme/model/ChallengeViewState;", "", "email", "", "whatsappHint", "Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "emailHint", "phoneHint", "isLoading", "", "<init>", "(Ljava/lang/String;Lcom/checkout/components/kmp/rememberme/shared/model/Hint;Lcom/checkout/components/kmp/rememberme/shared/model/Hint;Lcom/checkout/components/kmp/rememberme/shared/model/Hint;Z)V", "getEmail", "()Ljava/lang/String;", "getWhatsappHint", "()Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "getEmailHint", "getPhoneHint", "()Z", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChallengeViewState {
    public static final int $stable = 0;

    @NotNull
    private final String email;

    @Nullable
    private final Hint emailHint;
    private final boolean isLoading;

    @Nullable
    private final Hint phoneHint;

    @Nullable
    private final Hint whatsappHint;

    public ChallengeViewState(@NotNull String email, @Nullable Hint hint, @Nullable Hint hint2, @Nullable Hint hint3, boolean z2) {
        Intrinsics.echo(email, "email");
        this.email = email;
        this.whatsappHint = hint;
        this.emailHint = hint2;
        this.phoneHint = hint3;
        this.isLoading = z2;
    }

    public static /* synthetic */ ChallengeViewState copy$default(ChallengeViewState challengeViewState, String str, Hint hint, Hint hint2, Hint hint3, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = challengeViewState.email;
        }
        if ((i4 & 2) != 0) {
            hint = challengeViewState.whatsappHint;
        }
        if ((i4 & 4) != 0) {
            hint2 = challengeViewState.emailHint;
        }
        if ((i4 & 8) != 0) {
            hint3 = challengeViewState.phoneHint;
        }
        if ((i4 & 16) != 0) {
            z2 = challengeViewState.isLoading;
        }
        boolean z10 = z2;
        Hint hint4 = hint2;
        return challengeViewState.copy(str, hint, hint4, hint3, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Hint getWhatsappHint() {
        return this.whatsappHint;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Hint getEmailHint() {
        return this.emailHint;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Hint getPhoneHint() {
        return this.phoneHint;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public final ChallengeViewState copy(@NotNull String email, @Nullable Hint whatsappHint, @Nullable Hint emailHint, @Nullable Hint phoneHint, boolean isLoading) {
        Intrinsics.echo(email, "email");
        return new ChallengeViewState(email, whatsappHint, emailHint, phoneHint, isLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeViewState)) {
            return false;
        }
        ChallengeViewState challengeViewState = (ChallengeViewState) other;
        return Intrinsics.areEqual(this.email, challengeViewState.email) && Intrinsics.areEqual(this.whatsappHint, challengeViewState.whatsappHint) && Intrinsics.areEqual(this.emailHint, challengeViewState.emailHint) && Intrinsics.areEqual(this.phoneHint, challengeViewState.phoneHint) && this.isLoading == challengeViewState.isLoading;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Hint getEmailHint() {
        return this.emailHint;
    }

    @Nullable
    public final Hint getPhoneHint() {
        return this.phoneHint;
    }

    @Nullable
    public final Hint getWhatsappHint() {
        return this.whatsappHint;
    }

    public int hashCode() {
        int hashCode = this.email.hashCode() * 31;
        Hint hint = this.whatsappHint;
        int hashCode2 = (hashCode + (hint == null ? 0 : hint.hashCode())) * 31;
        Hint hint2 = this.emailHint;
        int hashCode3 = (hashCode2 + (hint2 == null ? 0 : hint2.hashCode())) * 31;
        Hint hint3 = this.phoneHint;
        return ((hashCode3 + (hint3 != null ? hint3.hashCode() : 0)) * 31) + (this.isLoading ? 1231 : 1237);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        String str = this.email;
        Hint hint = this.whatsappHint;
        Hint hint2 = this.emailHint;
        Hint hint3 = this.phoneHint;
        boolean z2 = this.isLoading;
        StringBuilder sb2 = new StringBuilder("ChallengeViewState(email=");
        sb2.append(str);
        sb2.append(", whatsappHint=");
        sb2.append(hint);
        sb2.append(", emailHint=");
        sb2.append(hint2);
        sb2.append(", phoneHint=");
        sb2.append(hint3);
        sb2.append(", isLoading=");
        return c.romeo(sb2, z2, ")");
    }
}
