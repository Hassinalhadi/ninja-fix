package com.checkout.components.kmp.rememberme.data.model;

import Jf.e;
import Mf.b;
import Nf.C0246d;
import Nf.K;
import Nf.az;
import Of.p;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import com.checkout.components.kmp.rememberme.shared.model.Hint$$serializer;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2796v6;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006*"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateHintResponse;", "", "", Constants.KEY_ID, "", "Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LNf/K;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/data/model/CreateHintResponse;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/util/List;)Lcom/checkout/components/kmp/rememberme/data/model/CreateHintResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getItems", "Companion", "$serializer", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@e
/* loaded from: classes3.dex */
public final /* data */ class CreateHintResponse {

    @NotNull
    private final String id;

    @NotNull
    private final List<Hint> items;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Lazy<KSerializer>[] $childSerializers = {null, LazyKt.alpha(i.alpha, new p(1))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/CreateHintResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateHintResponse;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CreateHintResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreateHintResponse(int i4, String str, List list, K k6) {
        if (3 != (i4 & 3)) {
            az.juliet(i4, 3, CreateHintResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.items = list;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new C0246d(Hint$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateHintResponse copy$default(CreateHintResponse createHintResponse, String str, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = createHintResponse.id;
        }
        if ((i4 & 2) != 0) {
            list = createHintResponse.items;
        }
        return createHintResponse.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$rememberme_release(CreateHintResponse self, b output, SerialDescriptor serialDesc) {
        Lazy<KSerializer>[] lazyArr = $childSerializers;
        AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) output;
        abstractC2796v6.xray(serialDesc, 0, self.id);
        abstractC2796v6.whiskey(serialDesc, 1, lazyArr[1].getValue(), self.items);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<Hint> component2() {
        return this.items;
    }

    @NotNull
    public final CreateHintResponse copy(@NotNull String id2, @NotNull List<Hint> items) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(items, "items");
        return new CreateHintResponse(id2, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateHintResponse)) {
            return false;
        }
        CreateHintResponse createHintResponse = (CreateHintResponse) other;
        return Intrinsics.areEqual(this.id, createHintResponse.id) && Intrinsics.areEqual(this.items, createHintResponse.items);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<Hint> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CreateHintResponse(id=" + this.id + ", items=" + this.items + ")";
    }

    public CreateHintResponse(@NotNull String id2, @NotNull List<Hint> items) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(items, "items");
        this.id = id2;
        this.items = items;
    }
}
