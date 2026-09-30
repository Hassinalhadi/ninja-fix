package com.checkout.components.kmp.rememberme.data.model;

import Jf.e;
import Mf.b;
import Nf.K;
import Nf.az;
import androidx.appcompat.widget.P0;
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

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest;", "", "<init>", "()V", "challengeType", "", "getChallengeType", "()Ljava/lang/String;", "merchant", "getMerchant", "Email", "Phone", "WhatsApp", "Hint", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Email;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Hint;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Phone;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$WhatsApp;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CreateChallengeRequest {
    public static final int $stable = 0;

    public /* synthetic */ CreateChallengeRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getChallengeType();

    @NotNull
    public abstract String getMerchant();

    private CreateChallengeRequest() {
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R \u0010\t\u001a\u00020\u00028\u0016X\u0097D¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017¨\u0006+"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Email;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest;", "", "merchant", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "challengeType", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Email;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Email;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMerchant", "getEmail", "getChallengeType", "getChallengeType$annotations", "()V", "Companion", "$serializer", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* data */ class Email extends CreateChallengeRequest {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String challengeType;

        @NotNull
        private final String email;

        @NotNull
        private final String merchant;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Email$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Email;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return CreateChallengeRequest$Email$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Email(int i4, String str, String str2, String str3, K k6) {
            super(r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (3 != (i4 & 3)) {
                az.juliet(i4, 3, CreateChallengeRequest$Email$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.merchant = str;
            this.email = str2;
            if ((i4 & 4) == 0) {
                this.challengeType = "email";
            } else {
                this.challengeType = str3;
            }
        }

        public static /* synthetic */ Email copy$default(Email email, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = email.merchant;
            }
            if ((i4 & 2) != 0) {
                str2 = email.email;
            }
            return email.copy(str, str2);
        }

        public static /* synthetic */ void getChallengeType$annotations() {
        }

        public static final /* synthetic */ void write$Self$rememberme_release(Email self, b output, SerialDescriptor serialDesc) {
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) output;
            abstractC2796v6.xray(serialDesc, 0, self.getMerchant());
            abstractC2796v6.xray(serialDesc, 1, self.email);
            if (abstractC2796v6.quebec(serialDesc) || !Intrinsics.areEqual(self.getChallengeType(), "email")) {
                abstractC2796v6.xray(serialDesc, 2, self.getChallengeType());
            }
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMerchant() {
            return this.merchant;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        public final Email copy(@NotNull String merchant, @NotNull String email) {
            Intrinsics.echo(merchant, "merchant");
            Intrinsics.echo(email, "email");
            return new Email(merchant, email);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return Intrinsics.areEqual(this.merchant, email.merchant) && Intrinsics.areEqual(this.email, email.email);
        }

        @Override // com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest
        @NotNull
        public String getChallengeType() {
            return this.challengeType;
        }

        @NotNull
        public final String getEmail() {
            return this.email;
        }

        @Override // com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest
        @NotNull
        public String getMerchant() {
            return this.merchant;
        }

        public int hashCode() {
            return this.email.hashCode() + (this.merchant.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return q.golf("Email(merchant=", this.merchant, ", email=", this.email, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(@NotNull String merchant, @NotNull String email) {
            super(null);
            Intrinsics.echo(merchant, "merchant");
            Intrinsics.echo(email, "email");
            this.merchant = merchant;
            this.email = email;
            this.challengeType = "email";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBA\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR \u0010\n\u001a\u00020\u00028\u0016X\u0097D¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0018¨\u0006/"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Hint;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest;", "", "merchant", "hint", "", "ordinal", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "challengeType", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Hint;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;I)Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Hint;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMerchant", "getHint", "I", "getOrdinal", "getChallengeType", "getChallengeType$annotations", "()V", "Companion", "$serializer", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* data */ class Hint extends CreateChallengeRequest {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String challengeType;

        @NotNull
        private final String hint;

        @NotNull
        private final String merchant;
        private final int ordinal;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Hint$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Hint;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return CreateChallengeRequest$Hint$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Hint(int i4, String str, String str2, int i5, String str3, K k6) {
            super(r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (7 != (i4 & 7)) {
                az.juliet(i4, 7, CreateChallengeRequest$Hint$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.merchant = str;
            this.hint = str2;
            this.ordinal = i5;
            if ((i4 & 8) == 0) {
                this.challengeType = "hint";
            } else {
                this.challengeType = str3;
            }
        }

        public static /* synthetic */ Hint copy$default(Hint hint, String str, String str2, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = hint.merchant;
            }
            if ((i5 & 2) != 0) {
                str2 = hint.hint;
            }
            if ((i5 & 4) != 0) {
                i4 = hint.ordinal;
            }
            return hint.copy(str, str2, i4);
        }

        public static /* synthetic */ void getChallengeType$annotations() {
        }

        public static final /* synthetic */ void write$Self$rememberme_release(Hint self, b output, SerialDescriptor serialDesc) {
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) output;
            abstractC2796v6.xray(serialDesc, 0, self.getMerchant());
            abstractC2796v6.xray(serialDesc, 1, self.hint);
            abstractC2796v6.victor(2, self.ordinal, serialDesc);
            if (abstractC2796v6.quebec(serialDesc) || !Intrinsics.areEqual(self.getChallengeType(), "hint")) {
                abstractC2796v6.xray(serialDesc, 3, self.getChallengeType());
            }
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMerchant() {
            return this.merchant;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        /* renamed from: component3, reason: from getter */
        public final int getOrdinal() {
            return this.ordinal;
        }

        @NotNull
        public final Hint copy(@NotNull String merchant, @NotNull String hint, int ordinal) {
            Intrinsics.echo(merchant, "merchant");
            Intrinsics.echo(hint, "hint");
            return new Hint(merchant, hint, ordinal);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hint)) {
                return false;
            }
            Hint hint = (Hint) other;
            return Intrinsics.areEqual(this.merchant, hint.merchant) && Intrinsics.areEqual(this.hint, hint.hint) && this.ordinal == hint.ordinal;
        }

        @Override // com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest
        @NotNull
        public String getChallengeType() {
            return this.challengeType;
        }

        @NotNull
        public final String getHint() {
            return this.hint;
        }

        @Override // com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest
        @NotNull
        public String getMerchant() {
            return this.merchant;
        }

        public final int getOrdinal() {
            return this.ordinal;
        }

        public int hashCode() {
            return AbstractC2327c.sierra(this.merchant.hashCode() * 31, 31, this.hint) + this.ordinal;
        }

        @NotNull
        public String toString() {
            String str = this.merchant;
            String str2 = this.hint;
            return P0.cyan(q.india("Hint(merchant=", str, ", hint=", str2, ", ordinal="), this.ordinal, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Hint(@NotNull String merchant, @NotNull String hint, int i4) {
            super(null);
            Intrinsics.echo(merchant, "merchant");
            Intrinsics.echo(hint, "hint");
            this.merchant = merchant;
            this.hint = hint;
            this.ordinal = i4;
            this.challengeType = "hint";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R \u0010\n\u001a\u00020\u00028\u0016X\u0097D¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0018¨\u0006/"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Phone;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest;", "", "merchant", "phone", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "challengeType", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Phone;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Phone;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMerchant", "getPhone", "getCountryCode", "getCountryCode$annotations", "()V", "getChallengeType", "getChallengeType$annotations", "Companion", "$serializer", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* data */ class Phone extends CreateChallengeRequest {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String challengeType;

        @NotNull
        private final String countryCode;

        @NotNull
        private final String merchant;

        @NotNull
        private final String phone;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Phone$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$Phone;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return CreateChallengeRequest$Phone$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Phone(int i4, String str, String str2, String str3, String str4, K k6) {
            super(r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (7 != (i4 & 7)) {
                az.juliet(i4, 7, CreateChallengeRequest$Phone$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.merchant = str;
            this.phone = str2;
            this.countryCode = str3;
            if ((i4 & 8) == 0) {
                this.challengeType = "phone";
            } else {
                this.challengeType = str4;
            }
        }

        public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, String str3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = phone.merchant;
            }
            if ((i4 & 2) != 0) {
                str2 = phone.phone;
            }
            if ((i4 & 4) != 0) {
                str3 = phone.countryCode;
            }
            return phone.copy(str, str2, str3);
        }

        public static /* synthetic */ void getChallengeType$annotations() {
        }

        public static /* synthetic */ void getCountryCode$annotations() {
        }

        public static final /* synthetic */ void write$Self$rememberme_release(Phone self, b output, SerialDescriptor serialDesc) {
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) output;
            abstractC2796v6.xray(serialDesc, 0, self.getMerchant());
            abstractC2796v6.xray(serialDesc, 1, self.phone);
            abstractC2796v6.xray(serialDesc, 2, self.countryCode);
            if (abstractC2796v6.quebec(serialDesc) || !Intrinsics.areEqual(self.getChallengeType(), "phone")) {
                abstractC2796v6.xray(serialDesc, 3, self.getChallengeType());
            }
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMerchant() {
            return this.merchant;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final Phone copy(@NotNull String merchant, @NotNull String phone, @NotNull String countryCode) {
            Intrinsics.echo(merchant, "merchant");
            Intrinsics.echo(phone, "phone");
            Intrinsics.echo(countryCode, "countryCode");
            return new Phone(merchant, phone, countryCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            return Intrinsics.areEqual(this.merchant, phone.merchant) && Intrinsics.areEqual(this.phone, phone.phone) && Intrinsics.areEqual(this.countryCode, phone.countryCode);
        }

        @Override // com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest
        @NotNull
        public String getChallengeType() {
            return this.challengeType;
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest
        @NotNull
        public String getMerchant() {
            return this.merchant;
        }

        @NotNull
        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return this.countryCode.hashCode() + AbstractC2327c.sierra(this.merchant.hashCode() * 31, 31, this.phone);
        }

        @NotNull
        public String toString() {
            String str = this.merchant;
            String str2 = this.phone;
            return P0.gold(q.india("Phone(merchant=", str, ", phone=", str2, ", countryCode="), this.countryCode, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Phone(@NotNull String merchant, @NotNull String phone, @NotNull String countryCode) {
            super(null);
            Intrinsics.echo(merchant, "merchant");
            Intrinsics.echo(phone, "phone");
            Intrinsics.echo(countryCode, "countryCode");
            this.merchant = merchant;
            this.phone = phone;
            this.countryCode = countryCode;
            this.challengeType = "phone";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R \u0010\n\u001a\u00020\u00028\u0016X\u0097D¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0018¨\u0006/"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$WhatsApp;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest;", "", "merchant", "phone", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "challengeType", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$WhatsApp;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$WhatsApp;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMerchant", "getPhone", "getCountryCode", "getCountryCode$annotations", "()V", "getChallengeType", "getChallengeType$annotations", "Companion", "$serializer", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* data */ class WhatsApp extends CreateChallengeRequest {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String challengeType;

        @NotNull
        private final String countryCode;

        @NotNull
        private final String merchant;

        @NotNull
        private final String phone;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$WhatsApp$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeRequest$WhatsApp;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return CreateChallengeRequest$WhatsApp$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ WhatsApp(int i4, String str, String str2, String str3, String str4, K k6) {
            super(r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (7 != (i4 & 7)) {
                az.juliet(i4, 7, CreateChallengeRequest$WhatsApp$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.merchant = str;
            this.phone = str2;
            this.countryCode = str3;
            if ((i4 & 8) == 0) {
                this.challengeType = "whatsapp";
            } else {
                this.challengeType = str4;
            }
        }

        public static /* synthetic */ WhatsApp copy$default(WhatsApp whatsApp, String str, String str2, String str3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = whatsApp.merchant;
            }
            if ((i4 & 2) != 0) {
                str2 = whatsApp.phone;
            }
            if ((i4 & 4) != 0) {
                str3 = whatsApp.countryCode;
            }
            return whatsApp.copy(str, str2, str3);
        }

        public static /* synthetic */ void getChallengeType$annotations() {
        }

        public static /* synthetic */ void getCountryCode$annotations() {
        }

        public static final /* synthetic */ void write$Self$rememberme_release(WhatsApp self, b output, SerialDescriptor serialDesc) {
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) output;
            abstractC2796v6.xray(serialDesc, 0, self.getMerchant());
            abstractC2796v6.xray(serialDesc, 1, self.phone);
            abstractC2796v6.xray(serialDesc, 2, self.countryCode);
            if (abstractC2796v6.quebec(serialDesc) || !Intrinsics.areEqual(self.getChallengeType(), "whatsapp")) {
                abstractC2796v6.xray(serialDesc, 3, self.getChallengeType());
            }
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMerchant() {
            return this.merchant;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        @NotNull
        public final WhatsApp copy(@NotNull String merchant, @NotNull String phone, @NotNull String countryCode) {
            Intrinsics.echo(merchant, "merchant");
            Intrinsics.echo(phone, "phone");
            Intrinsics.echo(countryCode, "countryCode");
            return new WhatsApp(merchant, phone, countryCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WhatsApp)) {
                return false;
            }
            WhatsApp whatsApp = (WhatsApp) other;
            return Intrinsics.areEqual(this.merchant, whatsApp.merchant) && Intrinsics.areEqual(this.phone, whatsApp.phone) && Intrinsics.areEqual(this.countryCode, whatsApp.countryCode);
        }

        @Override // com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest
        @NotNull
        public String getChallengeType() {
            return this.challengeType;
        }

        @NotNull
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.checkout.components.kmp.rememberme.data.model.CreateChallengeRequest
        @NotNull
        public String getMerchant() {
            return this.merchant;
        }

        @NotNull
        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return this.countryCode.hashCode() + AbstractC2327c.sierra(this.merchant.hashCode() * 31, 31, this.phone);
        }

        @NotNull
        public String toString() {
            String str = this.merchant;
            String str2 = this.phone;
            return P0.gold(q.india("WhatsApp(merchant=", str, ", phone=", str2, ", countryCode="), this.countryCode, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WhatsApp(@NotNull String merchant, @NotNull String phone, @NotNull String countryCode) {
            super(null);
            Intrinsics.echo(merchant, "merchant");
            Intrinsics.echo(phone, "phone");
            Intrinsics.echo(countryCode, "countryCode");
            this.merchant = merchant;
            this.phone = phone;
            this.countryCode = countryCode;
            this.challengeType = "whatsapp";
        }
    }
}
