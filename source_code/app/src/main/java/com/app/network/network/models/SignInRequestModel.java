package com.app.network.network.models;

import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/app/network/network/models/SignInRequestModel;", "", "email", "", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SignInRequestModel {

    @NotNull
    private String email;

    @NotNull
    private String password;

    public SignInRequestModel(@NotNull String email, @NotNull String password) {
        Intrinsics.echo(email, "email");
        Intrinsics.echo(password, "password");
        this.email = email;
        this.password = password;
    }

    public static /* synthetic */ SignInRequestModel copy$default(SignInRequestModel signInRequestModel, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = signInRequestModel.email;
        }
        if ((i4 & 2) != 0) {
            str2 = signInRequestModel.password;
        }
        return signInRequestModel.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final SignInRequestModel copy(@NotNull String email, @NotNull String password) {
        Intrinsics.echo(email, "email");
        Intrinsics.echo(password, "password");
        return new SignInRequestModel(email, password);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignInRequestModel)) {
            return false;
        }
        SignInRequestModel signInRequestModel = (SignInRequestModel) other;
        return Intrinsics.areEqual(this.email, signInRequestModel.email) && Intrinsics.areEqual(this.password, signInRequestModel.password);
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return this.password.hashCode() + (this.email.hashCode() * 31);
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.echo(str, "<set-?>");
        this.email = str;
    }

    public final void setPassword(@NotNull String str) {
        Intrinsics.echo(str, "<set-?>");
        this.password = str;
    }

    @NotNull
    public String toString() {
        return q.golf("SignInRequestModel(email=", this.email, ", password=", this.password, ")");
    }
}
