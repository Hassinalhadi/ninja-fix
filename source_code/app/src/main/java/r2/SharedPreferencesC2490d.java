package r2;

import A7.g;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;
import androidx.appcompat.widget.P0;
import av.ao;
import av.q;
import g.C1718a;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import s1.C2576i;
import s7.InterfaceC2834a;
import s7.InterfaceC2836c;
import s7.j;
import t7.f;
import v7.AbstractC3173a;
import z7.y;

/* renamed from: r2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class SharedPreferencesC2490d implements SharedPreferences {
    public final SharedPreferences alpha;
    public final ArrayList bravo = new ArrayList();
    public final InterfaceC2834a charlie;
    public final InterfaceC2836c delta;

    public SharedPreferencesC2490d(SharedPreferences sharedPreferences, InterfaceC2834a interfaceC2834a, InterfaceC2836c interfaceC2836c) {
        this.alpha = sharedPreferences;
        this.charlie = interfaceC2834a;
        this.delta = interfaceC2836c;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, s7.h] */
    public static SharedPreferencesC2490d alpha(String str, Context context, EnumC2488b enumC2488b, EnumC2489c enumC2489c) {
        C1718a delta;
        int i4 = AbstractC3173a.alpha;
        j.echo(new f(y.class, new t7.d[]{new t7.d(9, InterfaceC2836c.class)}, 8), true);
        j.foxtrot(new Object());
        t7.a.alpha();
        ao aoVar = new ao(16);
        aoVar.teal = enumC2488b.alpha;
        aoVar.gold(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__");
        String concat = "android-keystore://".concat(str);
        if (concat.startsWith("android-keystore://")) {
            aoVar.red = concat;
            tg.b kilo = aoVar.kilo();
            synchronized (kilo) {
                delta = ((C2576i) kilo.purple).delta();
            }
            ao aoVar2 = new ao(16);
            aoVar2.teal = enumC2489c.alpha;
            aoVar2.gold(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__");
            String concat2 = "android-keystore://".concat(str);
            if (concat2.startsWith("android-keystore://")) {
                aoVar2.red = concat2;
                C1718a charlie = aoVar2.kilo().charlie();
                return new SharedPreferencesC2490d(context.getSharedPreferences("UserInfo_secure", 0), (InterfaceC2834a) charlie.xray(InterfaceC2834a.class), (InterfaceC2836c) delta.xray(InterfaceC2836c.class));
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    public static boolean delta(String str) {
        if (!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) && !"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            return false;
        }
        return true;
    }

    public final String bravo(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(g.bravo(this.delta.alpha(str.getBytes(StandardCharsets.UTF_8), "UserInfo_secure".getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e4) {
            throw new SecurityException("Could not encrypt key. " + e4.getMessage(), e4);
        }
    }

    public final Object charlie(String str) {
        int i4;
        if (!delta(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String bravo = bravo(str);
                String string = this.alpha.getString(bravo, null);
                if (string != null) {
                    byte[] alpha = g.alpha(string);
                    InterfaceC2834a interfaceC2834a = this.charlie;
                    Charset charset = StandardCharsets.UTF_8;
                    ByteBuffer wrap = ByteBuffer.wrap(interfaceC2834a.bravo(alpha, bravo.getBytes(charset)));
                    boolean z2 = false;
                    wrap.position(0);
                    int i5 = wrap.getInt();
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 != 4) {
                                        if (i5 != 5) {
                                            i4 = 0;
                                        } else {
                                            i4 = 6;
                                        }
                                    } else {
                                        i4 = 5;
                                    }
                                } else {
                                    i4 = 4;
                                }
                            } else {
                                i4 = 3;
                            }
                        } else {
                            i4 = 2;
                        }
                    } else {
                        i4 = 1;
                    }
                    int mike = q.mike(i4);
                    if (mike != 0) {
                        if (mike != 1) {
                            if (mike != 2) {
                                if (mike != 3) {
                                    if (mike != 4) {
                                        if (mike == 5) {
                                            if (wrap.get() != 0) {
                                                z2 = true;
                                            }
                                            return Boolean.valueOf(z2);
                                        }
                                    } else {
                                        return Float.valueOf(wrap.getFloat());
                                    }
                                } else {
                                    return Long.valueOf(wrap.getLong());
                                }
                            } else {
                                return Integer.valueOf(wrap.getInt());
                            }
                        } else {
                            ArraySet arraySet = new ArraySet();
                            while (wrap.hasRemaining()) {
                                int i10 = wrap.getInt();
                                ByteBuffer slice = wrap.slice();
                                slice.limit(i10);
                                wrap.position(wrap.position() + i10);
                                arraySet.add(StandardCharsets.UTF_8.decode(slice).toString());
                            }
                            if (arraySet.size() != 1 || !"__NULL__".equals(arraySet.valueAt(0))) {
                                return arraySet;
                            }
                        }
                    } else {
                        int i11 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        wrap.limit(i11);
                        String charBuffer = charset.decode(slice2).toString();
                        if (!charBuffer.equals("__NULL__")) {
                            return charBuffer;
                        }
                    }
                }
                return null;
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
            }
        }
        throw new SecurityException(P0.crimson(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (!delta(str)) {
            return this.alpha.contains(bravo(str));
        }
        throw new SecurityException(P0.crimson(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC2487a(this, this.alpha.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.alpha.getAll().entrySet()) {
            if (!delta(entry.getKey())) {
                try {
                    String str = new String(this.delta.bravo(g.alpha(entry.getKey()), "UserInfo_secure".getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, charlie(str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z2) {
        Object charlie = charlie(str);
        if (charlie != null && (charlie instanceof Boolean)) {
            return ((Boolean) charlie).booleanValue();
        }
        return z2;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f5) {
        Object charlie = charlie(str);
        if (charlie != null && (charlie instanceof Float)) {
            return ((Float) charlie).floatValue();
        }
        return f5;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i4) {
        Object charlie = charlie(str);
        if (charlie != null && (charlie instanceof Integer)) {
            return ((Integer) charlie).intValue();
        }
        return i4;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j5) {
        Object charlie = charlie(str);
        if (charlie != null && (charlie instanceof Long)) {
            return ((Long) charlie).longValue();
        }
        return j5;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object charlie = charlie(str);
        if (charlie != null && (charlie instanceof String)) {
            return (String) charlie;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set arraySet;
        Object charlie = charlie(str);
        if (charlie instanceof Set) {
            arraySet = (Set) charlie;
        } else {
            arraySet = new ArraySet();
        }
        if (arraySet.size() > 0) {
            return arraySet;
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.bravo.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.bravo.remove(onSharedPreferenceChangeListener);
    }
}
