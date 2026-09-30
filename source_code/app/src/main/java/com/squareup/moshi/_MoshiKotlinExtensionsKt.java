package com.squareup.moshi;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "(Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/Moshi$Builder;", "addAdapter", "(Lcom/squareup/moshi/Moshi$Builder;Lcom/squareup/moshi/JsonAdapter;)Lcom/squareup/moshi/Moshi$Builder;", "Lge/w;", "ktype", "(Lcom/squareup/moshi/Moshi;Lge/w;)Lcom/squareup/moshi/JsonAdapter;", "moshi"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class _MoshiKotlinExtensionsKt {
    public static final /* synthetic */ <T> JsonAdapter<T> adapter(Moshi moshi) {
        Intrinsics.echo(moshi, "<this>");
        Intrinsics.juliet();
        throw null;
    }

    public static final /* synthetic */ <T> Moshi.Builder addAdapter(Moshi.Builder builder, JsonAdapter<T> adapter) {
        Intrinsics.echo(builder, "<this>");
        Intrinsics.echo(adapter, "adapter");
        Intrinsics.juliet();
        throw null;
    }

    @NotNull
    public static final <T> JsonAdapter<T> adapter(@NotNull Moshi moshi, @NotNull ge.w ktype) {
        Intrinsics.echo(moshi, "<this>");
        Intrinsics.echo(ktype, "ktype");
        JsonAdapter<T> adapter = moshi.adapter(ge.ah.delta(ktype));
        if ((adapter instanceof NullSafeJsonAdapter) || (adapter instanceof NonNullJsonAdapter)) {
            return adapter;
        }
        if (ktype.alpha()) {
            JsonAdapter<T> nullSafe = adapter.nullSafe();
            Intrinsics.delta(nullSafe, "{\n    adapter.nullSafe()\n  }");
            return nullSafe;
        }
        JsonAdapter<T> nonNull = adapter.nonNull();
        Intrinsics.delta(nonNull, "{\n    adapter.nonNull()\n  }");
        return nonNull;
    }
}
