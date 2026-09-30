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
import pe.AbstractC2327c;
import s6.AbstractC2796v6;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001bR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001b¨\u00061"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "", "", Constants.KEY_ID, "expiresAt", "", "attemptCount", "maxAttemptCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "seen0", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;II)Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getExpiresAt", "getExpiresAt$annotations", "()V", "I", "getAttemptCount", "getAttemptCount$annotations", "getMaxAttemptCount", "getMaxAttemptCount$annotations", "Companion", "$serializer", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@e
/* loaded from: classes3.dex */
public final /* data */ class CreateChallengeResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int attemptCount;

    @NotNull
    private final String expiresAt;

    @NotNull
    private final String id;
    private final int maxAttemptCount;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CreateChallengeResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreateChallengeResponse(int i4, String str, String str2, int i5, int i10, K k6) {
        if (15 != (i4 & 15)) {
            az.juliet(i4, 15, CreateChallengeResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.expiresAt = str2;
        this.attemptCount = i5;
        this.maxAttemptCount = i10;
    }

    public static /* synthetic */ CreateChallengeResponse copy$default(CreateChallengeResponse createChallengeResponse, String str, String str2, int i4, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createChallengeResponse.id;
        }
        if ((i10 & 2) != 0) {
            str2 = createChallengeResponse.expiresAt;
        }
        if ((i10 & 4) != 0) {
            i4 = createChallengeResponse.attemptCount;
        }
        if ((i10 & 8) != 0) {
            i5 = createChallengeResponse.maxAttemptCount;
        }
        return createChallengeResponse.copy(str, str2, i4, i5);
    }

    public static /* synthetic */ void getAttemptCount$annotations() {
    }

    public static /* synthetic */ void getExpiresAt$annotations() {
    }

    public static /* synthetic */ void getMaxAttemptCount$annotations() {
    }

    public static final /* synthetic */ void write$Self$rememberme_release(CreateChallengeResponse self, b output, SerialDescriptor serialDesc) {
        AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) output;
        abstractC2796v6.xray(serialDesc, 0, self.id);
        abstractC2796v6.xray(serialDesc, 1, self.expiresAt);
        abstractC2796v6.victor(2, self.attemptCount, serialDesc);
        abstractC2796v6.victor(3, self.maxAttemptCount, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAttemptCount() {
        return this.attemptCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxAttemptCount() {
        return this.maxAttemptCount;
    }

    @NotNull
    public final CreateChallengeResponse copy(@NotNull String id2, @NotNull String expiresAt, int attemptCount, int maxAttemptCount) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(expiresAt, "expiresAt");
        return new CreateChallengeResponse(id2, expiresAt, attemptCount, maxAttemptCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateChallengeResponse)) {
            return false;
        }
        CreateChallengeResponse createChallengeResponse = (CreateChallengeResponse) other;
        return Intrinsics.areEqual(this.id, createChallengeResponse.id) && Intrinsics.areEqual(this.expiresAt, createChallengeResponse.expiresAt) && this.attemptCount == createChallengeResponse.attemptCount && this.maxAttemptCount == createChallengeResponse.maxAttemptCount;
    }

    public final int getAttemptCount() {
        return this.attemptCount;
    }

    @NotNull
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getMaxAttemptCount() {
        return this.maxAttemptCount;
    }

    public int hashCode() {
        return ((AbstractC2327c.sierra(this.id.hashCode() * 31, 31, this.expiresAt) + this.attemptCount) * 31) + this.maxAttemptCount;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.expiresAt;
        int i4 = this.attemptCount;
        int i5 = this.maxAttemptCount;
        StringBuilder india = q.india("CreateChallengeResponse(id=", str, ", expiresAt=", str2, ", attemptCount=");
        india.append(i4);
        india.append(", maxAttemptCount=");
        india.append(i5);
        india.append(")");
        return india.toString();
    }

    public CreateChallengeResponse(@NotNull String id2, @NotNull String expiresAt, int i4, int i5) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(expiresAt, "expiresAt");
        this.id = id2;
        this.expiresAt = expiresAt;
        this.attemptCount = i4;
        this.maxAttemptCount = i5;
    }
}
