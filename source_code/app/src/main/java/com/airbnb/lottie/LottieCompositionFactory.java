package com.airbnb.lottie;

import Tf.ak;
import Tf.ap;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class LottieCompositionFactory {
    private static final Map<String, LottieTask<LottieComposition>> taskCache = new HashMap();
    private static final Set<LottieTaskIdleListener> taskIdleListeners = new HashSet();
    private static final byte[] ZIP_MAGIC = {80, 75, 3, 4};
    private static final byte[] GZIP_MAGIC = {31, -117, 8};

    private LottieCompositionFactory() {
    }

    private static LottieTask<LottieComposition> cache(final String str, Callable<LottieResult<LottieComposition>> callable, Runnable runnable) {
        LottieComposition lottieComposition;
        LottieTask<LottieComposition> lottieTask = null;
        if (str == null) {
            lottieComposition = null;
        } else {
            lottieComposition = LottieCompositionCache.getInstance().get(str);
        }
        if (lottieComposition != null) {
            lottieTask = new LottieTask<>(lottieComposition);
        }
        if (str != null) {
            Map<String, LottieTask<LottieComposition>> map = taskCache;
            if (map.containsKey(str)) {
                lottieTask = map.get(str);
            }
        }
        if (lottieTask != null) {
            if (runnable != null) {
                runnable.run();
            }
            return lottieTask;
        }
        LottieTask<LottieComposition> lottieTask2 = new LottieTask<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i4 = 0;
            lottieTask2.addListener(new LottieListener() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i4) {
                        case 0:
                            LottieCompositionFactory.lambda$cache$18(str, atomicBoolean, (LottieComposition) obj);
                            return;
                        default:
                            LottieCompositionFactory.lambda$cache$19(str, atomicBoolean, (Throwable) obj);
                            return;
                    }
                }
            });
            final int i5 = 1;
            lottieTask2.addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i5) {
                        case 0:
                            LottieCompositionFactory.lambda$cache$18(str, atomicBoolean, (LottieComposition) obj);
                            return;
                        default:
                            LottieCompositionFactory.lambda$cache$19(str, atomicBoolean, (Throwable) obj);
                            return;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, LottieTask<LottieComposition>> map2 = taskCache;
                map2.put(str, lottieTask2);
                if (map2.size() == 1) {
                    notifyTaskCacheIdleListeners(false);
                }
            }
        }
        return lottieTask2;
    }

    public static void clearCache(Context context) {
        clearCache(context, true);
    }

    private static LottieImageAsset findImageAssetForFileName(LottieComposition lottieComposition, String str) {
        for (LottieImageAsset lottieImageAsset : lottieComposition.getImages().values()) {
            if (lottieImageAsset.getFileName().equals(str)) {
                return lottieImageAsset;
            }
        }
        return null;
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    public static LottieTask<LottieComposition> fromInputStream(Context context, InputStream inputStream, String str) {
        Context applicationContext;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        return cache(str, new B2.e(applicationContext, inputStream, str, 2), null);
    }

    public static LottieResult<LottieComposition> fromInputStreamSync(Context context, InputStream inputStream, String str) {
        LottieComposition lottieComposition;
        if (str == null) {
            lottieComposition = null;
        } else {
            lottieComposition = LottieCompositionCache.getInstance().get(str);
        }
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            ak charlie = Tf.b.charlie(Tf.b.juliet(inputStream));
            if (isZipCompressed(charlie).booleanValue()) {
                return fromZipStreamSync(context, new ZipInputStream(new Hd.b(2, charlie)), str);
            }
            if (isGzipCompressed(charlie).booleanValue()) {
                return fromJsonInputStreamSync(new GZIPInputStream(new Hd.b(2, charlie)), str);
            }
            return fromJsonReaderSync(JsonReader.of(charlie), str);
        } catch (IOException e) {
            return new LottieResult<>((Throwable) e);
        }
    }

    @Deprecated
    public static LottieTask<LottieComposition> fromJson(JSONObject jSONObject, String str) {
        return cache(str, new b(5, jSONObject, str), null);
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(InputStream inputStream, String str) {
        return cache(str, new b(4, inputStream, str), new e(2, inputStream));
    }

    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonReader(JsonReader jsonReader, String str) {
        return cache(str, new b(3, jsonReader, str), new e(0, jsonReader));
    }

    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, String str) {
        return fromJsonReaderSync(jsonReader, str, true);
    }

    private static LottieResult<LottieComposition> fromJsonReaderSyncInternal(JsonReader jsonReader, String str, boolean z2) {
        LottieComposition lottieComposition;
        try {
            if (str == null) {
                lottieComposition = null;
            } else {
                try {
                    lottieComposition = LottieCompositionCache.getInstance().get(str);
                } catch (Exception e) {
                    LottieResult<LottieComposition> lottieResult = new LottieResult<>(e);
                    if (z2) {
                        Utils.closeQuietly(jsonReader);
                    }
                    return lottieResult;
                }
            }
            if (lottieComposition != null) {
                LottieResult<LottieComposition> lottieResult2 = new LottieResult<>(lottieComposition);
                if (z2) {
                    Utils.closeQuietly(jsonReader);
                }
                return lottieResult2;
            }
            LottieComposition parse = LottieCompositionMoshiParser.parse(jsonReader);
            if (str != null) {
                LottieCompositionCache.getInstance().put(str, parse);
            }
            LottieResult<LottieComposition> lottieResult3 = new LottieResult<>(parse);
            if (z2) {
                Utils.closeQuietly(jsonReader);
            }
            return lottieResult3;
        } catch (Throwable th) {
            if (z2) {
                Utils.closeQuietly(jsonReader);
            }
            throw th;
        }
    }

    public static LottieTask<LottieComposition> fromJsonSource(ap apVar, String str) {
        return cache(str, new b(1, apVar, str), new e(1, apVar));
    }

    public static LottieResult<LottieComposition> fromJsonSourceSync(ap apVar, String str) {
        return fromJsonSourceSync(apVar, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonString(String str, String str2) {
        return cache(str2, new b(str, str2), null);
    }

    public static LottieResult<LottieComposition> fromJsonStringSync(String str, String str2) {
        return fromJsonSourceSync(Tf.b.juliet(new ByteArrayInputStream(str.getBytes())), str2);
    }

    @Deprecated
    public static LottieResult<LottieComposition> fromJsonSync(JSONObject jSONObject, String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, int i4) {
        return fromRawRes(context, i4, rawResCacheKey(context, i4));
    }

    public static LottieResult<LottieComposition> fromRawResSync(Context context, int i4) {
        return fromRawResSync(context, i4, rawResCacheKey(context, i4));
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, String str) {
        return fromZipStream((Context) null, zipInputStream, str);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, String str) {
        return fromZipStreamSync(zipInputStream, str, true);
    }

    private static LottieResult<LottieComposition> fromZipStreamSyncInternal(Context context, ZipInputStream zipInputStream, String str) {
        LottieComposition lottieComposition;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            lottieComposition = null;
        } else {
            try {
                lottieComposition = LottieCompositionCache.getInstance().get(str);
            } catch (IOException e) {
                return new LottieResult<>((Throwable) e);
            }
        }
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        LottieComposition lottieComposition2 = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                lottieComposition2 = fromJsonReaderSyncInternal(JsonReader.of(Tf.b.charlie(Tf.b.juliet(zipInputStream))), null, false).getValue();
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new LottieResult<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                                break;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        Logger.warning("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        Logger.warning("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (lottieComposition2 == null) {
            return new LottieResult<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            LottieImageAsset findImageAssetForFileName = findImageAssetForFileName(lottieComposition2, (String) entry.getKey());
            if (findImageAssetForFileName != null) {
                findImageAssetForFileName.setBitmap(Utils.resizeBitmapIfNeeded((Bitmap) entry.getValue(), findImageAssetForFileName.getWidth(), findImageAssetForFileName.getHeight()));
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z2 = false;
            for (Font font : lottieComposition2.getFonts().values()) {
                if (font.getFamily().equals(entry2.getKey())) {
                    font.setTypeface((Typeface) entry2.getValue());
                    z2 = true;
                }
            }
            if (!z2) {
                Logger.warning("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator<Map.Entry<String, LottieImageAsset>> it = lottieComposition2.getImages().entrySet().iterator();
            while (it.hasNext()) {
                LottieImageAsset value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String fileName = value.getFileName();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            value.setBitmap(Utils.resizeBitmapIfNeeded(decodeByteArray, value.getWidth(), value.getHeight()));
                        }
                    } catch (IllegalArgumentException e4) {
                        Logger.warning("data URL did not have correct base64 format.", e4);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            LottieCompositionCache.getInstance().put(str, lottieComposition2);
        }
        return new LottieResult<>(lottieComposition2);
    }

    private static Boolean isGzipCompressed(Tf.m mVar) {
        return matchesMagicBytes(mVar, GZIP_MAGIC);
    }

    private static boolean isNightMode(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    private static Boolean isZipCompressed(Tf.m mVar) {
        return matchesMagicBytes(mVar, ZIP_MAGIC);
    }

    public static /* synthetic */ void lambda$cache$18(String str, AtomicBoolean atomicBoolean, LottieComposition lottieComposition) {
        Map<String, LottieTask<LottieComposition>> map = taskCache;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            notifyTaskCacheIdleListeners(true);
        }
    }

    public static /* synthetic */ void lambda$cache$19(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, LottieTask<LottieComposition>> map = taskCache;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            notifyTaskCacheIdleListeners(true);
        }
    }

    public static /* synthetic */ void lambda$fromJsonInputStream$7(boolean z2, InputStream inputStream) {
        if (z2) {
            Utils.closeQuietly(inputStream);
        }
    }

    public static /* synthetic */ LottieResult lambda$fromRawRes$3(WeakReference weakReference, Context context, int i4, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return fromRawResSync(context, i4, str);
    }

    public static /* synthetic */ LottieResult lambda$fromUrl$0(Context context, String str, String str2) throws Exception {
        LottieResult<LottieComposition> fetchSync = L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && fetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, fetchSync.getValue());
        }
        return fetchSync;
    }

    private static Boolean matchesMagicBytes(Tf.m mVar, byte[] bArr) {
        try {
            ak peek = mVar.peek();
            for (byte b2 : bArr) {
                if (peek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            Logger.error("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static void notifyTaskCacheIdleListeners(boolean z2) {
        ArrayList arrayList = new ArrayList(taskIdleListeners);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((LottieTaskIdleListener) arrayList.get(i4)).onIdleChanged(z2);
        }
    }

    private static String rawResCacheKey(Context context, int i4) {
        String str;
        StringBuilder sb2 = new StringBuilder("rawRes");
        if (isNightMode(context)) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb2.append(str);
        sb2.append(i4);
        return sb2.toString();
    }

    public static void registerLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        boolean z2;
        taskIdleListeners.add(lottieTaskIdleListener);
        if (taskCache.size() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        lottieTaskIdleListener.onIdleChanged(z2);
    }

    public static void setMaxCacheSize(int i4) {
        LottieCompositionCache.getInstance().resize(i4);
    }

    public static void unregisterLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        taskIdleListeners.remove(lottieTaskIdleListener);
    }

    public static void clearCache(Context context, boolean z2) {
        NetworkCache networkCache;
        taskCache.clear();
        LottieCompositionCache.getInstance().clear();
        if (!z2 || (networkCache = L.networkCache(context)) == null) {
            return;
        }
        networkCache.clear();
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(final InputStream inputStream, final String str, final boolean z2) {
        return cache(str, new Callable() { // from class: com.airbnb.lottie.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LottieResult fromJsonInputStreamSync;
                fromJsonInputStreamSync = LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str, z2);
                return fromJsonInputStreamSync;
            }
        }, new av.l(z2, inputStream));
    }

    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, String str, boolean z2) {
        return fromJsonSourceSync(Tf.b.juliet(inputStream), str, z2);
    }

    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, String str, boolean z2) {
        return fromJsonReaderSyncInternal(jsonReader, str, z2);
    }

    public static LottieResult<LottieComposition> fromJsonSourceSync(ap apVar, String str, boolean z2) {
        return fromJsonReaderSyncInternal(JsonReader.of(Tf.b.charlie(apVar)), str, z2);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, final int i4, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return cache(str, new Callable() { // from class: com.airbnb.lottie.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LottieResult lambda$fromRawRes$3;
                lambda$fromRawRes$3 = LottieCompositionFactory.lambda$fromRawRes$3(weakReference, applicationContext, i4, str);
                return lambda$fromRawRes$3;
            }
        }, null);
    }

    public static LottieResult<LottieComposition> fromRawResSync(Context context, int i4, String str) {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            ak charlie = Tf.b.charlie(Tf.b.juliet(context.getResources().openRawResource(i4)));
            if (isZipCompressed(charlie).booleanValue()) {
                return fromZipStreamSync(context, new ZipInputStream(new Hd.b(2, charlie)), str);
            }
            if (isGzipCompressed(charlie).booleanValue()) {
                try {
                    return fromJsonInputStreamSync(new GZIPInputStream(new Hd.b(2, charlie)), str);
                } catch (IOException e) {
                    return new LottieResult<>((Throwable) e);
                }
            }
            return fromJsonReaderSync(JsonReader.of(charlie), str);
        } catch (Resources.NotFoundException e4) {
            return new LottieResult<>((Throwable) e4);
        }
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str, String str2) {
        return cache(str2, new f(context, str, str2, 1), null);
    }

    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str, String str2) {
        LottieComposition lottieComposition = str2 == null ? null : LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        LottieResult<LottieComposition> fetchSync = L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && fetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, fetchSync.getValue());
        }
        return fetchSync;
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, String str, boolean z2) {
        return fromZipStream(null, zipInputStream, str, z2);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, String str, boolean z2) {
        return fromZipStreamSync(null, zipInputStream, str, z2);
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str, String str2) {
        return cache(str2, new f(context.getApplicationContext(), str, str2, 0), null);
    }

    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str, String str2) {
        LottieComposition lottieComposition = str2 == null ? null : LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            return fromInputStreamSync(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new LottieResult<>((Throwable) e);
        }
    }

    public static LottieTask<LottieComposition> fromZipStream(Context context, ZipInputStream zipInputStream, String str) {
        return cache(str, new g(context, zipInputStream, str, 0), new h(zipInputStream, 0));
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(Context context, ZipInputStream zipInputStream, String str) {
        return fromZipStreamSync(context, zipInputStream, str, true);
    }

    public static LottieTask<LottieComposition> fromZipStream(Context context, ZipInputStream zipInputStream, String str, boolean z2) {
        return cache(str, new g(context, zipInputStream, str, 1), z2 ? new h(zipInputStream, 1) : null);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(Context context, ZipInputStream zipInputStream, String str, boolean z2) {
        try {
            return fromZipStreamSyncInternal(context, zipInputStream, str);
        } finally {
            if (z2) {
                Utils.closeQuietly(zipInputStream);
            }
        }
    }
}
