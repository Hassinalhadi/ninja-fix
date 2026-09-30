package com.checkout.components.kmp.rememberme.data.model;

import Jf.e;
import Mf.b;
import Nf.K;
import Nf.az;
import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2796v6;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateHintRequest;", "", "", Constants.KEY_TYPE, "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateHintRequest;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/kmp/rememberme/data/model/CreateHintRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getEmail", "Companion", "$serializer", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@e
/* loaded from: classes3.dex */
public final /* data */ class CreateHintRequest {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String email;

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateHintRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateHintRequest;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CreateHintRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreateHintRequest(int i4, String str, String str2, K k6) {
        if (3 != (i4 & 3)) {
            az.juliet(i4, 3, CreateHintRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.email = str2;
    }

    public static /* synthetic */ CreateHintRequest copy$default(CreateHintRequest createHintRequest, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = createHintRequest.type;
        }
        if ((i4 & 2) != 0) {
            str2 = createHintRequest.email;
        }
        return createHintRequest.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$rememberme_release(CreateHintRequest self, b output, SerialDescriptor serialDesc) {
        AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) output;
        abstractC2796v6.xray(serialDesc, 0, self.type);
        abstractC2796v6.xray(serialDesc, 1, self.email);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final CreateHintRequest copy(@NotNull String type, @NotNull String email) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(email, "email");
        return new CreateHintRequest(type, email);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateHintRequest)) {
            return false;
        }
        CreateHintRequest createHintRequest = (CreateHintRequest) other;
        return Intrinsics.areEqual(this.type, createHintRequest.type) && Intrinsics.areEqual(this.email, createHintRequest.email);
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.email.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return q.golf("CreateHintRequest(type=", this.type, ", email=", this.email, ")");
    }

    public CreateHintRequest(@NotNull String type, @NotNull String email) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(email, "email");
        this.type = type;
        this.email = email;
    }
}
