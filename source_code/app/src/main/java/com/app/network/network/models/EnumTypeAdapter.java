package com.app.network.network.models;

import com.google.gson.JsonParseException;
import com.google.gson.internal.bind.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.u;
import com.google.gson.v;
import java.lang.Enum;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0014\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/EnumTypeAdapter;", "", "T", "Lcom/google/gson/v;", "Lcom/google/gson/p;", "Ljava/lang/Class;", "enumClass", "<init>", "(Ljava/lang/Class;)V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/u;", "context", "Lcom/google/gson/q;", "serialize", "(Ljava/lang/Enum;Ljava/lang/reflect/Type;Lcom/google/gson/u;)Lcom/google/gson/q;", "json", "typeOfT", "Lcom/google/gson/o;", "deserialize", "(Lcom/google/gson/q;Ljava/lang/reflect/Type;Lcom/google/gson/o;)Ljava/lang/Enum;", "Ljava/lang/Class;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumTypeAdapter<T extends Enum<T>> implements v, p {

    @NotNull
    private final Class<T> enumClass;

    public EnumTypeAdapter(@NotNull Class<T> enumClass) {
        Intrinsics.echo(enumClass, "enumClass");
        this.enumClass = enumClass;
    }

    @Override // com.google.gson.p
    @NotNull
    public T deserialize(@Nullable q json, @Nullable Type typeOfT, @Nullable o context) {
        String delta;
        T t5;
        if (json != null && (delta = json.delta()) != null) {
            T[] enumConstants = this.enumClass.getEnumConstants();
            if (enumConstants != null) {
                int length = enumConstants.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        t5 = null;
                        break;
                    }
                    t5 = enumConstants[i4];
                    if (Intrinsics.areEqual(t5.name(), delta)) {
                        break;
                    }
                    i4++;
                }
                if (t5 != null) {
                    return t5;
                }
            }
            throw new JsonParseException("Unknown enum value: ".concat(delta));
        }
        throw new JsonParseException("Error deserializing enum");
    }

    @Override // com.google.gson.v
    @NotNull
    public q serialize(@Nullable T src, @Nullable Type typeOfSrc, @Nullable u context) {
        if (context != null) {
            q alpha = ((k) context).alpha(src != null ? src.name() : null);
            if (alpha != null) {
                return alpha;
            }
        }
        throw new JsonParseException("Error serializing enum");
    }
}
