package r2;

import A7.g;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import androidx.appcompat.widget.P0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class SharedPreferencesEditorC2487a implements SharedPreferences.Editor {
    public final SharedPreferencesC2490d alpha;
    public final SharedPreferences.Editor bravo;
    public final AtomicBoolean delta = new AtomicBoolean(false);
    public final CopyOnWriteArrayList charlie = new CopyOnWriteArrayList();

    public SharedPreferencesEditorC2487a(SharedPreferencesC2490d sharedPreferencesC2490d, SharedPreferences.Editor editor) {
        this.alpha = sharedPreferencesC2490d;
        this.bravo = editor;
    }

    public final void alpha() {
        if (this.delta.getAndSet(false)) {
            SharedPreferencesC2490d sharedPreferencesC2490d = this.alpha;
            for (String str : ((HashMap) sharedPreferencesC2490d.getAll()).keySet()) {
                if (!this.charlie.contains(str) && !SharedPreferencesC2490d.delta(str)) {
                    this.bravo.remove(sharedPreferencesC2490d.bravo(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        alpha();
        this.bravo.apply();
        bravo();
        this.charlie.clear();
    }

    public final void bravo() {
        SharedPreferencesC2490d sharedPreferencesC2490d = this.alpha;
        Iterator it = sharedPreferencesC2490d.bravo.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.charlie.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC2490d, (String) it2.next());
            }
        }
    }

    public final void charlie(String str, byte[] bArr) {
        SharedPreferencesC2490d sharedPreferencesC2490d = this.alpha;
        sharedPreferencesC2490d.getClass();
        if (!SharedPreferencesC2490d.delta(str)) {
            this.charlie.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String bravo = sharedPreferencesC2490d.bravo(str);
                try {
                    Pair pair = new Pair(bravo, new String(g.bravo(sharedPreferencesC2490d.charlie.alpha(bArr, bravo.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                    this.bravo.putString((String) pair.first, (String) pair.second);
                    return;
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            } catch (GeneralSecurityException e4) {
                throw new SecurityException("Could not encrypt data: " + e4.getMessage(), e4);
            }
        }
        throw new SecurityException(P0.crimson(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.delta.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.charlie;
        alpha();
        try {
            return this.bravo.commit();
        } finally {
            bravo();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z2) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z2 ? (byte) 1 : (byte) 0);
        charlie(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f5) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f5);
        charlie(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i4) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i4);
        charlie(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j5) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j5);
        charlie(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        charlie(str, allocate.array());
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r6 = r6;
     */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        Set set2;
        if (set == null) {
            ArraySet arraySet = new ArraySet();
            arraySet.add("__NULL__");
            set2 = arraySet;
        }
        ArrayList arrayList = new ArrayList(set2.size());
        int size = set2.size() * 4;
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(size + 4);
        allocate.putInt(1);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        charlie(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC2490d sharedPreferencesC2490d = this.alpha;
        sharedPreferencesC2490d.getClass();
        if (!SharedPreferencesC2490d.delta(str)) {
            this.bravo.remove(sharedPreferencesC2490d.bravo(str));
            this.charlie.remove(str);
            return this;
        }
        throw new SecurityException(P0.crimson(str, " is a reserved key for the encryption keyset."));
    }
}
