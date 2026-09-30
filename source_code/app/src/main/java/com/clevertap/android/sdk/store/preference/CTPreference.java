package com.clevertap.android.sdk.store.preference;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0017J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000fH\u0016J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000fH\u0017J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0011H\u0017J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0013H\u0017J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0015H\u0017J\u001e\u0010&\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u001e\u0010'\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0017J\"\u0010(\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0010\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0019H\u0016J\"\u0010)\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00052\u0010\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0019H\u0017J\"\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0010\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0019H\u0003J\b\u0010.\u001a\u00020\u000fH\u0016J\b\u0010/\u001a\u00020\u0011H\u0016J\u0010\u00100\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u0005H\u0017J\u0010\u00102\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u000f\u00103\u001a\u0004\u0018\u00010-H\u0001¢\u0006\u0002\b4R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00030\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/clevertap/android/sdk/store/preference/CTPreference;", "Lcom/clevertap/android/sdk/store/preference/ICTPreference;", "context", "Landroid/content/Context;", "prefName", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "contextRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "readString", Constants.KEY_KEY, "default", "readBoolean", "", "readInt", "", "readLong", "", "readFloat", "", "readStringSet", "", "readAll", "", "writeString", "", "value", "writeStringImmediate", "writeBoolean", "writeBooleanImmediate", "writeInt", "writeIntImmediate", "writeLong", "writeLongImmediate", "writeFloat", "writeFloatImmediate", "writeStringSet", "writeStringSetImmediate", "writeMap", "writeMapImmediate", "writeMapToEditor", "Landroid/content/SharedPreferences$Editor;", "prefs", "Landroid/content/SharedPreferences;", "isEmpty", "size", "remove", "removeImmediate", "changePreferenceName", "sharedPrefs", "sharedPrefs$clevertap_core_release", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTPreference implements ICTPreference {

    @NotNull
    private final WeakReference<Context> contextRef;

    @Nullable
    private String prefName;

    public CTPreference(@NotNull Context context, @Nullable String str) {
        Intrinsics.echo(context, "context");
        this.prefName = str;
        this.contextRef = new WeakReference<>(context);
    }

    @SuppressLint({"CommitPrefEdits"})
    private final SharedPreferences.Editor writeMapToEditor(SharedPreferences prefs, Map<String, ?> value) {
        SharedPreferences.Editor edit = prefs.edit();
        for (Map.Entry<String, ?> entry : value.entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            if (value2 instanceof String) {
                edit.putString(key, (String) value2);
            } else if (value2 instanceof Boolean) {
                edit.putBoolean(key, ((Boolean) value2).booleanValue());
            } else if (value2 instanceof Integer) {
                edit.putInt(key, ((Number) value2).intValue());
            } else if (value2 instanceof Long) {
                edit.putLong(key, ((Number) value2).longValue());
            } else if (value2 instanceof Float) {
                edit.putFloat(key, ((Number) value2).floatValue());
            }
        }
        Intrinsics.checkNotNull(edit);
        return edit;
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public void changePreferenceName(@NotNull String prefName) {
        Intrinsics.echo(prefName, "prefName");
        this.prefName = prefName;
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public boolean isEmpty() {
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return true;
        }
        return sharedPrefs$clevertap_core_release.getAll().isEmpty();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @Nullable
    public Map<String, ?> readAll() {
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return t.alpha;
        }
        return sharedPrefs$clevertap_core_release.getAll();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public boolean readBoolean(@NotNull String key, boolean r32) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return r32;
        }
        return sharedPrefs$clevertap_core_release.getBoolean(key, r32);
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public float readFloat(@NotNull String key, float r32) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return r32;
        }
        return sharedPrefs$clevertap_core_release.getFloat(key, r32);
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public int readInt(@NotNull String key, int r32) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return r32;
        }
        return sharedPrefs$clevertap_core_release.getInt(key, r32);
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public long readLong(@NotNull String key, long r32) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return r32;
        }
        return sharedPrefs$clevertap_core_release.getLong(key, r32);
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @Nullable
    public String readString(@NotNull String key, @NotNull String r32) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(r32, "default");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return r32;
        }
        return sharedPrefs$clevertap_core_release.getString(key, r32);
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @Nullable
    public Set<String> readStringSet(@NotNull String key, @NotNull Set<String> r32) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(r32, "default");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return r32;
        }
        return sharedPrefs$clevertap_core_release.getStringSet(key, r32);
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public void remove(@NotNull String key) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().remove(key).apply();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @SuppressLint({"ApplySharedPref"})
    public void removeImmediate(@NotNull String key) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().remove(key).commit();
    }

    @Nullable
    public final SharedPreferences sharedPrefs$clevertap_core_release() {
        Context context = this.contextRef.get();
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(this.prefName, 0);
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public int size() {
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return 0;
        }
        return sharedPrefs$clevertap_core_release.getAll().size();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public void writeBoolean(@NotNull String key, boolean value) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putBoolean(key, value).apply();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @SuppressLint({"ApplySharedPref"})
    public void writeBooleanImmediate(@NotNull String key, boolean value) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putBoolean(key, value).commit();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public void writeFloat(@NotNull String key, float value) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putFloat(key, value).apply();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @SuppressLint({"ApplySharedPref"})
    public void writeFloatImmediate(@NotNull String key, float value) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putFloat(key, value).commit();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public void writeInt(@NotNull String key, int value) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putInt(key, value).apply();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @SuppressLint({"ApplySharedPref"})
    public void writeIntImmediate(@NotNull String key, int value) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putInt(key, value).commit();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public void writeLong(@NotNull String key, long value) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putLong(key, value).apply();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @SuppressLint({"ApplySharedPref"})
    public void writeLongImmediate(@NotNull String key, long value) {
        Intrinsics.echo(key, "key");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putLong(key, value).commit();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public void writeMap(@NotNull String key, @NotNull Map<String, ?> value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        writeMapToEditor(sharedPrefs$clevertap_core_release, value).apply();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @SuppressLint({"ApplySharedPref"})
    public void writeMapImmediate(@NotNull String key, @NotNull Map<String, ?> value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        writeMapToEditor(sharedPrefs$clevertap_core_release, value).commit();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public void writeString(@NotNull String key, @NotNull String value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putString(key, value).apply();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @SuppressLint({"ApplySharedPref"})
    public void writeStringImmediate(@NotNull String key, @NotNull String value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putString(key, value).commit();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    public void writeStringSet(@NotNull String key, @NotNull Set<String> value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putStringSet(key, value).apply();
    }

    @Override // com.clevertap.android.sdk.store.preference.ICTPreference
    @SuppressLint({"ApplySharedPref"})
    public void writeStringSetImmediate(@NotNull String key, @NotNull Set<String> value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        SharedPreferences sharedPrefs$clevertap_core_release = sharedPrefs$clevertap_core_release();
        if (sharedPrefs$clevertap_core_release == null) {
            return;
        }
        sharedPrefs$clevertap_core_release.edit().putStringSet(key, value).commit();
    }

    public /* synthetic */ CTPreference(Context context, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : str);
    }
}
