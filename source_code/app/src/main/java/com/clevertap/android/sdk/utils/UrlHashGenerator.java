package com.clevertap.android.sdk.utils;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/utils/UrlHashGenerator;", "", "<init>", "()V", "Lkotlin/Function1;", "", "hash", "()Lkotlin/jvm/functions/Function1;", "hashWithTsSeed", "()Ljava/lang/String;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UrlHashGenerator {

    @NotNull
    public static final UrlHashGenerator INSTANCE = new UrlHashGenerator();

    private UrlHashGenerator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hash$lambda$0(String key) {
        UUID uuid;
        String uuid2;
        Intrinsics.echo(key, "key");
        try {
            byte[] bytes = key.getBytes(kotlin.text.a.alpha);
            Intrinsics.delta(bytes, "getBytes(...)");
            uuid = UUID.nameUUIDFromBytes(bytes);
        } catch (InternalError unused) {
            String.valueOf(key.hashCode());
            uuid = null;
        }
        if (uuid == null || (uuid2 = uuid.toString()) == null) {
            return String.valueOf(key.hashCode());
        }
        return uuid2;
    }

    @NotNull
    public final Function1<String, String> hash() {
        return new com.clevertap.android.sdk.inapp.images.preload.a(3);
    }

    @NotNull
    public final String hashWithTsSeed() {
        Function1<String, String> hash = hash();
        String valueOf = String.valueOf(System.currentTimeMillis());
        Intrinsics.delta(valueOf, "valueOf(...)");
        return hash.invoke(valueOf);
    }
}
