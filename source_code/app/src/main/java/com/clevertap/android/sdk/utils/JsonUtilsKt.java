package com.clevertap.android.sdk.utils;

import android.os.Parcel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\r\u001a\u00020\u0004*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0004*\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0017\u001a\u00020\n*\u00020\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lorg/json/JSONObject;", "", "name", "Lkotlin/Function1;", "", "init", "putObject", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getStringOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONArray;", "", "value", "prepend", "(Lorg/json/JSONArray;Ljava/lang/Object;)V", "Landroid/os/Parcel;", "readJson", "(Landroid/os/Parcel;)Lorg/json/JSONObject;", "json", "writeJson", "(Landroid/os/Parcel;Lorg/json/JSONObject;)V", "", "predicate", "filterObjects", "(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Lorg/json/JSONArray;", "clevertap-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonUtilsKt {
    @NotNull
    public static final JSONArray filterObjects(@NotNull JSONArray jSONArray, @NotNull Function1<? super JSONObject, Boolean> predicate) {
        Intrinsics.echo(jSONArray, "<this>");
        Intrinsics.echo(predicate, "predicate");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i4);
            if (optJSONObject != null && predicate.invoke(optJSONObject).booleanValue()) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    @Nullable
    public static final String getStringOrNull(@NotNull JSONObject jSONObject, @NotNull String name) {
        Intrinsics.echo(jSONObject, "<this>");
        Intrinsics.echo(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static final void prepend(@NotNull JSONArray jSONArray, @NotNull Object value) {
        Intrinsics.echo(jSONArray, "<this>");
        Intrinsics.echo(value, "value");
        int i4 = 0;
        while (i4 < jSONArray.length()) {
            Object obj = jSONArray.get(i4);
            jSONArray.put(i4, value);
            i4++;
            value = obj;
        }
        jSONArray.put(value);
    }

    public static final void putObject(@NotNull JSONObject jSONObject, @NotNull String name, @NotNull Function1<? super JSONObject, Unit> init) {
        Intrinsics.echo(jSONObject, "<this>");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(init, "init");
        JSONObject jSONObject2 = new JSONObject();
        init.invoke(jSONObject2);
        jSONObject.put(name, jSONObject2);
    }

    @Nullable
    public static final JSONObject readJson(@NotNull Parcel parcel) {
        Intrinsics.echo(parcel, "<this>");
        try {
            String readString = parcel.readString();
            if (readString != null) {
                return new JSONObject(readString);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final void writeJson(@NotNull Parcel parcel, @Nullable JSONObject jSONObject) {
        String str;
        Intrinsics.echo(parcel, "<this>");
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
    }
}
