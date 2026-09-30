package com.checkout.components.kmp.rememberme.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/kmp/rememberme/model/AuthenticationViewState;", "", "email", "", "viewType", "Lcom/checkout/components/kmp/rememberme/model/AuthenticationViewType;", "<init>", "(Ljava/lang/String;Lcom/checkout/components/kmp/rememberme/model/AuthenticationViewType;)V", "getEmail", "()Ljava/lang/String;", "getViewType", "()Lcom/checkout/components/kmp/rememberme/model/AuthenticationViewType;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AuthenticationViewState {
    public static final int $stable = 0;

    @NotNull
    private final String email;

    @NotNull
    private final AuthenticationViewType viewType;

    public AuthenticationViewState(@NotNull String email, @NotNull AuthenticationViewType viewType) {
        Intrinsics.echo(email, "email");
        Intrinsics.echo(viewType, "viewType");
        this.email = email;
        this.viewType = viewType;
    }

    public static /* synthetic */ AuthenticationViewState copy$default(AuthenticationViewState authenticationViewState, String str, AuthenticationViewType authenticationViewType, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = authenticationViewState.email;
        }
        if ((i4 & 2) != 0) {
            authenticationViewType = authenticationViewState.viewType;
        }
        return authenticationViewState.copy(str, authenticationViewType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AuthenticationViewType getViewType() {
        return this.viewType;
    }

    @NotNull
    public final AuthenticationViewState copy(@NotNull String email, @NotNull AuthenticationViewType viewType) {
        Intrinsics.echo(email, "email");
        Intrinsics.echo(viewType, "viewType");
        return new AuthenticationViewState(email, viewType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationViewState)) {
            return false;
        }
        AuthenticationViewState authenticationViewState = (AuthenticationViewState) other;
        return Intrinsics.areEqual(this.email, authenticationViewState.email) && this.viewType == authenticationViewState.viewType;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final AuthenticationViewType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return this.viewType.hashCode() + (this.email.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AuthenticationViewState(email=" + this.email + ", viewType=" + this.viewType + ")";
    }
}
