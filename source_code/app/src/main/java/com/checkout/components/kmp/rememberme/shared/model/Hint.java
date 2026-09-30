package com.checkout.components.kmp.rememberme.shared.model;

import Jf.e;
import Mf.b;
import Nf.C0265x;
import Nf.C0266y;
import Nf.K;
import Nf.az;
import Q4.a;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2796v6;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006-"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "", "", "ordinal", "Lcom/checkout/components/kmp/rememberme/shared/model/HintType;", Constants.KEY_TYPE, "", "value", "<init>", "(ILcom/checkout/components/kmp/rememberme/shared/model/HintType;Ljava/lang/String;)V", "seen0", "LNf/K;", "serializationConstructorMarker", "(IILcom/checkout/components/kmp/rememberme/shared/model/HintType;Ljava/lang/String;LNf/K;)V", "self", "LMf/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rememberme_release", "(Lcom/checkout/components/kmp/rememberme/shared/model/Hint;LMf/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/checkout/components/kmp/rememberme/shared/model/HintType;", "component3", "()Ljava/lang/String;", Constants.COPY_TYPE, "(ILcom/checkout/components/kmp/rememberme/shared/model/HintType;Ljava/lang/String;)Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOrdinal", "Lcom/checkout/components/kmp/rememberme/shared/model/HintType;", "getType", "Ljava/lang/String;", "getValue", "Companion", "$serializer", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@e
/* loaded from: classes3.dex */
public final /* data */ class Hint {
    public static final int $stable = 0;
    private final int ordinal;

    @NotNull
    private final HintType type;

    @NotNull
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<KSerializer>[] $childSerializers = {null, LazyKt.alpha(i.alpha, new a(26)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/Hint$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Hint$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Hint(int i4, int i5, HintType hintType, String str, K k6) {
        if (7 != (i4 & 7)) {
            az.juliet(i4, 7, Hint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.ordinal = i5;
        this.type = hintType;
        this.value = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    public static final KSerializer _childSerializers$_anonymous_() {
        HintType[] values = HintType.values();
        String[] strArr = {"email", "phone", "whatsapp"};
        boolean z2 = false;
        Annotation[][] annotationArr = {null, null, null};
        Intrinsics.echo(values, "values");
        C0265x c0265x = new C0265x("com.checkout.components.kmp.rememberme.shared.model.HintType", values.length);
        int length = values.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            HintType hintType = values[i4];
            int i10 = i5 + 1;
            String str = (String) ArraysKt.ivory(i5, strArr);
            if (str == null) {
                str = hintType.name();
            }
            c0265x.bravo(str, z2);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt.ivory(i5, annotationArr);
            if (annotationArr2 != null) {
                int length2 = annotationArr2.length;
                for (?? r12 = z2; r12 < length2; r12++) {
                    Annotation annotation = annotationArr2[r12];
                    Intrinsics.echo(annotation, "annotation");
                    int i11 = c0265x.delta;
                    List[] listArr = c0265x.foxtrot;
                    List list = listArr[i11];
                    if (list == null) {
                        list = new ArrayList(1);
                        listArr[c0265x.delta] = list;
                    }
                    list.add(annotation);
                }
            }
            i4++;
            i5 = i10;
            z2 = false;
        }
        C0266y c0266y = new C0266y("com.checkout.components.kmp.rememberme.shared.model.HintType", (Enum[]) values);
        c0266y.charlie = c0265x;
        return c0266y;
    }

    public static /* synthetic */ Hint copy$default(Hint hint, int i4, HintType hintType, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = hint.ordinal;
        }
        if ((i5 & 2) != 0) {
            hintType = hint.type;
        }
        if ((i5 & 4) != 0) {
            str = hint.value;
        }
        return hint.copy(i4, hintType, str);
    }

    public static final /* synthetic */ void write$Self$rememberme_release(Hint self, b output, SerialDescriptor serialDesc) {
        Lazy<KSerializer>[] lazyArr = $childSerializers;
        AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) output;
        abstractC2796v6.victor(0, self.ordinal, serialDesc);
        abstractC2796v6.whiskey(serialDesc, 1, lazyArr[1].getValue(), self.type);
        abstractC2796v6.xray(serialDesc, 2, self.value);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOrdinal() {
        return this.ordinal;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final HintType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final Hint copy(int i4, @NotNull HintType type, @NotNull String value) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(value, "value");
        return new Hint(i4, type, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Hint)) {
            return false;
        }
        Hint hint = (Hint) other;
        return this.ordinal == hint.ordinal && this.type == hint.type && Intrinsics.areEqual(this.value, hint.value);
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    @NotNull
    public final HintType getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + ((this.type.hashCode() + (this.ordinal * 31)) * 31);
    }

    @NotNull
    public String toString() {
        int i4 = this.ordinal;
        HintType hintType = this.type;
        String str = this.value;
        StringBuilder sb2 = new StringBuilder("Hint(ordinal=");
        sb2.append(i4);
        sb2.append(", type=");
        sb2.append(hintType);
        sb2.append(", value=");
        return P0.gold(sb2, str, ")");
    }

    public Hint(int i4, @NotNull HintType type, @NotNull String value) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(value, "value");
        this.ordinal = i4;
        this.type = type;
        this.value = value;
    }
}
