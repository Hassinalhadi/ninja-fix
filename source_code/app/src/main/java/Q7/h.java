package Q7;

import android.util.Log;
import av.q;
import com.google.android.material.internal.s;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h {
    public static final Charset bravo = Charset.forName("UTF-8");
    public final U7.c alpha;

    public h(U7.c cVar) {
        this.alpha = cVar;
    }

    public static HashMap alpha(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList bravo(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            try {
                s sVar = n.alpha;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j5 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, Barcode.FORMAT_QR_CODE);
                }
                arrayList.add(new b(string2, j5, string3, string4, string5));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String echo(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i4 = 0; i4 < list.size(); i4++) {
            try {
                jSONArray.put(new JSONObject(n.alpha.amber(list.get(i4))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void foxtrot(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void golf(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", q.foxtrot("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map charlie(String str, boolean z2) {
        File charlie;
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        U7.c cVar = this.alpha;
        if (z2) {
            charlie = cVar.charlie(str, "internal-keys");
        } else {
            charlie = cVar.charlie(str, "keys");
        }
        if (charlie.exists() && charlie.length() != 0) {
            try {
                try {
                    fileInputStream = new FileInputStream(charlie);
                    try {
                        HashMap alpha = alpha(O7.f.india(fileInputStream));
                        O7.f.bravo(fileInputStream, "Failed to close user metadata file.");
                        return alpha;
                    } catch (Exception e4) {
                        e = e4;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        foxtrot(charlie);
                        O7.f.bravo(fileInputStream, "Failed to close user metadata file.");
                        return Collections.EMPTY_MAP;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    O7.f.bravo(r1, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e5) {
                fileInputStream = null;
                e = e5;
            } catch (Throwable th3) {
                ?? r12 = 0;
                th = th3;
                O7.f.bravo(r12, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            golf(charlie, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String delta(String str) {
        FileInputStream fileInputStream;
        String str2;
        File charlie = this.alpha.charlie(str, "user-data");
        Closeable closeable = null;
        if (charlie.exists()) {
            ?? r32 = (charlie.length() > 0L ? 1 : (charlie.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(charlie);
                        try {
                            JSONObject jSONObject = new JSONObject(O7.f.india(fileInputStream));
                            if (!jSONObject.isNull("userId")) {
                                str2 = jSONObject.optString("userId", null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            O7.f.bravo(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            foxtrot(charlie);
                            O7.f.bravo(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        O7.f.bravo(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        String echo = q.echo("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", echo, null);
        }
        foxtrot(charlie);
        return null;
    }

    public final void hotel(String str, Map map, boolean z2) {
        File charlie;
        String jSONObject;
        BufferedWriter bufferedWriter;
        U7.c cVar = this.alpha;
        if (z2) {
            charlie = cVar.charlie(str, "internal-keys");
        } else {
            charlie = cVar.charlie(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(charlie), bravo));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            O7.f.bravo(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e4) {
            e = e4;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            foxtrot(charlie);
            O7.f.bravo(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            O7.f.bravo(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    public final void india(String str, List list) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e;
        File charlie = this.alpha.charlie(str, "rollouts-state");
        ?? isEmpty = list.isEmpty();
        if (isEmpty != 0) {
            golf(charlie, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String echo = echo(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(charlie), bravo));
                try {
                    bufferedWriter.write(echo);
                    bufferedWriter.flush();
                    O7.f.bravo(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e4) {
                    e = e4;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    foxtrot(charlie);
                    O7.f.bravo(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th2) {
                th = th2;
                O7.f.bravo(isEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e5) {
            bufferedWriter = null;
            e = e5;
        } catch (Throwable th3) {
            isEmpty = 0;
            th = th3;
            O7.f.bravo(isEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public final void juliet(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File charlie = this.alpha.charlie(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", str2);
                obj = jSONObject.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(charlie), bravo));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            O7.f.bravo(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e4) {
            e = e4;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
            O7.f.bravo(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            O7.f.bravo(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
