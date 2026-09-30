package L9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import av.q;
import java.io.File;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r2.AbstractC2491e;
import r2.EnumC2488b;
import r2.EnumC2489c;
import r2.SharedPreferencesC2490d;
import r2.SharedPreferencesEditorC2487a;

/* loaded from: classes2.dex */
public abstract class k {
    public static final AtomicReference alpha = new AtomicReference(null);
    public static final Object bravo = new Object();

    public static void alpha(SharedPreferences sharedPreferences, SharedPreferencesC2490d sharedPreferencesC2490d) {
        if (sharedPreferencesC2490d.getBoolean("__session_secure_migration_v1_done", false)) {
            Map<String, ?> all = sharedPreferences.getAll();
            Intrinsics.delta(all, "getAll(...)");
            if (!all.isEmpty()) {
                int size = sharedPreferences.getAll().size();
                sharedPreferences.edit().clear().commit();
                charlie("evt=legacy_orphan_cleanup keyCount=" + size);
            }
        }
    }

    public static boolean bravo(SharedPreferencesC2490d sharedPreferencesC2490d) {
        try {
            SharedPreferencesEditorC2487a sharedPreferencesEditorC2487a = (SharedPreferencesEditorC2487a) sharedPreferencesC2490d.edit();
            sharedPreferencesEditorC2487a.putString("__session_canary", "ok");
            if (sharedPreferencesEditorC2487a.commit()) {
                return Intrinsics.areEqual(sharedPreferencesC2490d.getString("__session_canary", null), "ok");
            }
            return false;
        } catch (Exception e) {
            Log.e("SessionSecureStorage", "Health check threw", e);
            return false;
        }
    }

    public static void charlie(String str) {
        String str2 = "SESSION_STORAGE " + str;
        Log.i("SessionSecureStorage", str2);
        try {
            K7.b.alpha().bravo(str2);
        } catch (Exception unused) {
        }
    }

    public static SharedPreferences delta(Context context, SharedPreferences sharedPreferences) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        int i4 = Build.VERSION.SDK_INT;
        StringBuilder india = q.india("evt=nuke_start device=", str, "/", str2, " sdk=");
        india.append(i4);
        charlie(india.toString());
        try {
            K7.b.alpha().charlie(new IllegalStateException("Encrypted prefs canary failed — nuking and re-creating (" + str + "/" + str2 + ")"));
        } catch (Exception unused) {
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                context.deleteSharedPreferences("UserInfo_secure");
            } else {
                new File(new File(context.getFilesDir().getParent(), "shared_prefs"), "UserInfo_secure.xml").delete();
            }
        } catch (Exception e) {
            Log.e("SessionSecureStorage", "Failed to delete encrypted prefs file", e);
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias("_androidx_security_master_key_")) {
                keyStore.deleteEntry("_androidx_security_master_key_");
            }
        } catch (Exception e4) {
            Log.e("SessionSecureStorage", "Failed to clear Keystore master key", e4);
        }
        try {
            String alpha2 = AbstractC2491e.alpha(AbstractC2491e.alpha);
            Intrinsics.delta(alpha2, "getOrCreate(...)");
            SharedPreferencesC2490d alpha3 = SharedPreferencesC2490d.alpha(alpha2, context, EnumC2488b.purple, EnumC2489c.purple);
            Map<String, ?> all = sharedPreferences.getAll();
            Intrinsics.delta(all, "getAll(...)");
            if (!all.isEmpty()) {
                if (!foxtrot(sharedPreferences, alpha3)) {
                    charlie("evt=remigration_failed_after_nuke mode=legacy");
                    return sharedPreferences;
                }
            } else {
                SharedPreferencesEditorC2487a sharedPreferencesEditorC2487a = (SharedPreferencesEditorC2487a) alpha3.edit();
                sharedPreferencesEditorC2487a.putBoolean("__session_secure_migration_v1_done", true);
                sharedPreferencesEditorC2487a.commit();
            }
            if (!bravo(alpha3)) {
                charlie("evt=health_check_failed_after_nuke mode=legacy");
                return sharedPreferences;
            }
            charlie("evt=nuke_and_recreate_success mode=encrypted");
            return alpha3;
        } catch (Exception e5) {
            Log.e("SessionSecureStorage", "Re-creation of ESP failed; falling back to legacy", e5);
            charlie("evt=nuke_recreate_exception mode=legacy");
            return sharedPreferences;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x013a A[LOOP:0: B:46:0x0117->B:51:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SharedPreferences echo(Context context) {
        SharedPreferencesC2490d alpha2;
        Object m206constructorimpl;
        boolean z2;
        boolean z10;
        Object m206constructorimpl2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("UserInfo", 0);
        try {
            String alpha3 = AbstractC2491e.alpha(AbstractC2491e.alpha);
            Intrinsics.delta(alpha3, "getOrCreate(...)");
            alpha2 = SharedPreferencesC2490d.alpha(alpha3, context, EnumC2488b.purple, EnumC2489c.purple);
            Intrinsics.checkNotNull(sharedPreferences);
            alpha(sharedPreferences, alpha2);
        } catch (Exception e) {
            e = e;
            Log.e("SessionSecureStorage", "Encrypted session prefs unavailable; using legacy", e);
            try {
                K7.b.alpha().charlie(e);
            } catch (Exception unused) {
            }
            while (e != null) {
                if (!StringsKt.beige(e.getClass().getName(), "InvalidProtocolBufferException", false)) {
                }
            }
            charlie("mode=legacy reason=encrypted_init_failed");
            Intrinsics.checkNotNull(sharedPreferences);
            return sharedPreferences;
        }
        if (!alpha2.getBoolean("__session_secure_migration_v1_done", false) && !foxtrot(sharedPreferences, alpha2)) {
            charlie("mode=legacy reason=migration_failed");
            return sharedPreferences;
        }
        if (!bravo(alpha2)) {
            if (alpha2.getString("UserInfo", null) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (alpha2.getString("hmac_secret", null) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl2 = Result.m206constructorimpl(Integer.valueOf(((HashMap) alpha2.getAll()).size()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (m206constructorimpl2 instanceof kotlin.k) {
                m206constructorimpl2 = -1;
            }
            charlie("evt=health_check_failed action=nuke_and_recreate hasSession=" + z2 + " hasHmac=" + z10 + " keyCount=" + ((Number) m206constructorimpl2).intValue() + " device=" + Build.MANUFACTURER + "/" + Build.MODEL + " sdk=" + Build.VERSION.SDK_INT);
            return delta(context, sharedPreferences);
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Integer.valueOf(((HashMap) alpha2.getAll()).size()));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = -1;
        }
        charlie("mode=encrypted keyCount=" + ((Number) m206constructorimpl).intValue());
        return alpha2;
        e = e;
        Log.e("SessionSecureStorage", "Encrypted session prefs unavailable; using legacy", e);
        K7.b.alpha().charlie(e);
        for (int i4 = 0; e != null && i4 < 8; i4++) {
            if (!StringsKt.beige(e.getClass().getName(), "InvalidProtocolBufferException", false)) {
                charlie("evt=encrypted_init_corrupt action=nuke_and_recreate");
                Intrinsics.checkNotNull(sharedPreferences);
                sharedPreferences = delta(context, sharedPreferences);
                break;
            }
            e = e.getCause();
        }
        charlie("mode=legacy reason=encrypted_init_failed");
        Intrinsics.checkNotNull(sharedPreferences);
        return sharedPreferences;
    }

    public static boolean foxtrot(SharedPreferences sharedPreferences, SharedPreferencesC2490d sharedPreferencesC2490d) {
        boolean z2;
        boolean z10;
        HashMap hashMap = new HashMap(sharedPreferences.getAll());
        if (hashMap.isEmpty()) {
            SharedPreferencesEditorC2487a sharedPreferencesEditorC2487a = (SharedPreferencesEditorC2487a) sharedPreferencesC2490d.edit();
            sharedPreferencesEditorC2487a.putBoolean("__session_secure_migration_v1_done", true);
            if (!sharedPreferencesEditorC2487a.commit()) {
                charlie("evt=migration_empty_commit_failed");
                return false;
            }
            charlie("evt=migration_empty_legacy");
            return true;
        }
        SharedPreferences.Editor edit = sharedPreferencesC2490d.edit();
        Intrinsics.checkNotNull(edit);
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    ((SharedPreferencesEditorC2487a) edit).putString(str, (String) value);
                } else if (value instanceof Boolean) {
                    ((SharedPreferencesEditorC2487a) edit).putBoolean(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    ((SharedPreferencesEditorC2487a) edit).putInt(str, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    ((SharedPreferencesEditorC2487a) edit).putLong(str, ((Number) value).longValue());
                } else if (value instanceof Float) {
                    ((SharedPreferencesEditorC2487a) edit).putFloat(str, ((Number) value).floatValue());
                } else if (value instanceof Set) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (Iterable) value) {
                        if (obj instanceof String) {
                            arrayList.add(obj);
                        }
                    }
                    Set D10 = CollectionsKt.D(arrayList);
                    if (D10.size() != ((Set) value).size()) {
                        Log.w("SessionSecureStorage", "StringSet had non-String entries; dropping key=" + str);
                    }
                    ((SharedPreferencesEditorC2487a) edit).putStringSet(str, D10);
                } else if (value != null) {
                    Log.w("SessionSecureStorage", "Skipping unsupported preference type key=" + str + " type=" + value.getClass().getName());
                }
            }
            if (!((SharedPreferencesEditorC2487a) edit).commit()) {
                charlie("evt=migration_commit_failed");
                return false;
            }
            Set keySet = hashMap.keySet();
            Intrinsics.delta(keySet, "<get-keys>(...)");
            Map<String, ?> all = sharedPreferences.getAll();
            Map all2 = sharedPreferencesC2490d.getAll();
            Iterator it = keySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str2 = (String) it.next();
                    Object obj2 = all.get(str2);
                    Object obj3 = ((HashMap) all2).get(str2);
                    if (obj2 == null && obj3 == null) {
                        z10 = true;
                    } else if (obj2 != null && obj3 != null) {
                        if ((obj2 instanceof Set) && (obj3 instanceof Set)) {
                            z10 = Intrinsics.areEqual(obj2, obj3);
                        } else {
                            z10 = Intrinsics.areEqual(obj2, obj3);
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("SessionSecureStorage", "verifySnapshot mismatch key=" + str2);
                        z2 = false;
                        break;
                    }
                } else {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                SharedPreferencesEditorC2487a sharedPreferencesEditorC2487a2 = (SharedPreferencesEditorC2487a) sharedPreferencesC2490d.edit();
                sharedPreferencesEditorC2487a2.clear();
                sharedPreferencesEditorC2487a2.commit();
                charlie("evt=migration_verify_failed");
                return false;
            }
            SharedPreferencesEditorC2487a sharedPreferencesEditorC2487a3 = (SharedPreferencesEditorC2487a) sharedPreferencesC2490d.edit();
            sharedPreferencesEditorC2487a3.putBoolean("__session_secure_migration_v1_done", true);
            if (!sharedPreferencesEditorC2487a3.commit()) {
                charlie("evt=migration_mark_commit_failed");
                return false;
            }
            if (!sharedPreferences.edit().clear().commit()) {
                charlie("evt=migration_legacy_clear_failed");
            }
            charlie("evt=migration_success keyCount=" + hashMap.size());
            return true;
        } catch (Exception e) {
            Log.e("SessionSecureStorage", "copySnapshotToEditor failed", e);
            charlie("evt=migration_copy_failed");
            return false;
        }
    }

    public static SharedPreferences golf(Context context) {
        Intrinsics.echo(context, "context");
        AtomicReference atomicReference = alpha;
        SharedPreferences sharedPreferences = (SharedPreferences) atomicReference.get();
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        synchronized (bravo) {
            SharedPreferences sharedPreferences2 = (SharedPreferences) atomicReference.get();
            if (sharedPreferences2 != null) {
                return sharedPreferences2;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.delta(applicationContext, "getApplicationContext(...)");
            SharedPreferences echo = echo(applicationContext);
            atomicReference.set(echo);
            return echo;
        }
    }
}
