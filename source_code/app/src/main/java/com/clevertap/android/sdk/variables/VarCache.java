package com.clevertap.android.sdk.variables;

import A2.p;
import B2.ai;
import E8.g;
import Ya.c;
import android.content.Context;
import androidx.appcompat.widget.P0;
import ao.ad;
import av.q;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.StorageHelper;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoImpl;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class VarCache {
    private final FileResourcesRepoImpl fileResourcesRepoImpl;
    private final CleverTapInstanceConfig instanceConfig;
    private final Context variablesCtx;
    private final Map<String, Object> valuesFromClient = new HashMap();
    private final Map<String, Var<?>> vars = new ConcurrentHashMap();
    private final Map<String, String> defaultKinds = new HashMap();
    public Object merged = null;
    private Runnable globalCallbacksRunnable = null;
    private Map<String, Object> diffs = new HashMap();

    public VarCache(CleverTapInstanceConfig cleverTapInstanceConfig, Context context, FileResourcesRepoImpl fileResourcesRepoImpl) {
        this.variablesCtx = context;
        this.instanceConfig = cleverTapInstanceConfig;
        this.fileResourcesRepoImpl = fileResourcesRepoImpl;
    }

    private void applyVariableDiffs(Map<String, Object> map, HashMap<String, Var<?>> hashMap) {
        log("applyVariableDiffs() called with: diffs = [" + map + Constants.AES_SUFFIX);
        if (map != null) {
            this.diffs = map;
            this.merged = CTVariableUtils.mergeHelper(this.valuesFromClient, map);
            log(P0.emerald(new StringBuilder("applyVariableDiffs: updated value of merged=["), this.merged, Constants.AES_SUFFIX));
            Iterator<Map.Entry<String, Var<?>>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Var<?> var = this.vars.get(it.next().getKey());
                if (var != null) {
                    var.update();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$fileVarUpdated$2(Var var, Map map) {
        var.triggerFileIsReady();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fileVarUpdated$3(Var var, String str, Boolean bool) {
        if (bool.booleanValue()) {
            var.triggerFileIsReady();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(str, CtCacheType.FILES));
        this.fileResourcesRepoImpl.preloadFilesAndCache(arrayList, new c(27, var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$fileVarUpdated$4(String str) throws Exception {
        boolean z2;
        if (str != null && !FileResourceProvider.getInstance(this.variablesCtx, this.instanceConfig.getLogger()).isFileCached(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$saveDiffsAsync$0() throws Exception {
        saveDiffs();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$startFilesDownload$1(Function0 function0, Map map) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private String loadDataFromCache() {
        String string = StorageHelper.getString(this.variablesCtx, StorageHelper.storageKeyWithSuffix(this.instanceConfig, Constants.CACHED_VARIABLES_KEY), "{}");
        log(q.echo("VarCache loaded cache data:\n", string));
        return string;
    }

    private static void log(String str) {
        Logger.d("variables", str);
    }

    private void saveDiffs() {
        log("saveDiffs() called");
        storeDataInCache(JsonUtil.toJson(this.diffs));
    }

    private void saveDiffsAsync() {
        CTExecutorFactory.executors(this.instanceConfig).postAsyncSafelyTask().execute("VarCache#saveDiffsAsync", new g(8, this));
    }

    private void startFilesDownload(HashMap<String, Var<?>> hashMap, Function0<Unit> function0) {
        if (hashMap.isEmpty()) {
            log("There are no variables registered by the client. Not downloading files & posting global callbacks");
            return;
        }
        StringBuilder sb2 = new StringBuilder("Skipped these file vars cause urls are not present :\n");
        StringBuilder sb3 = new StringBuilder("Adding these files to download :\n");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, Var<?>>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            Var<?> var = this.vars.get(key);
            if (var != null && var.kind().equals(CTVariableUtils.FILE)) {
                String rawFileValue = var.rawFileValue();
                if (rawFileValue != null) {
                    if (!FileResourceProvider.getInstance(this.variablesCtx, this.instanceConfig.getLogger()).isFileCached(rawFileValue)) {
                        arrayList.add(new Pair(rawFileValue, CtCacheType.FILES));
                        sb3.append(key);
                        sb3.append(" : ");
                        sb3.append(rawFileValue);
                        sb3.append("\n");
                    }
                } else {
                    sb2.append(key);
                    sb2.append("\n");
                }
            }
        }
        log(sb2.toString());
        log(sb3.toString());
        if (arrayList.isEmpty()) {
            function0.invoke();
        } else {
            this.fileResourcesRepoImpl.preloadFilesAndCache(arrayList, new b(function0, 0));
        }
    }

    private void storeDataInCache(String str) {
        log(ad.gray("storeDataInCache() called with: data = [", str, Constants.AES_SUFFIX));
        try {
            StorageHelper.putString(this.variablesCtx, StorageHelper.storageKeyWithSuffix(this.instanceConfig, Constants.CACHED_VARIABLES_KEY), str);
        } catch (Throwable th) {
            log("storeDataInCache failed", th);
        }
    }

    private synchronized void triggerGlobalCallbacks() {
        Runnable runnable = this.globalCallbacksRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }

    public synchronized void clearUserContent() {
        try {
            log("Clear user content in VarCache");
            HashMap<String, Var<?>> hashMap = new HashMap<>(this.vars);
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                Var<?> var = this.vars.get(it.next());
                if (var != null) {
                    var.clearStartFlag();
                }
            }
            applyVariableDiffs(new HashMap(), hashMap);
            saveDiffsAsync();
        } catch (Throwable th) {
            throw th;
        }
    }

    public String filePathFromDisk(String str) {
        return FileResourceProvider.getInstance(this.variablesCtx, this.instanceConfig.getLogger()).cachedFilePath(str);
    }

    public void fileVarUpdated(Var<String> var) {
        String rawFileValue = var.rawFileValue();
        Task ioTask = CTExecutorFactory.executors(this.instanceConfig).ioTask();
        ioTask.addOnSuccessListener(new p(this, var, rawFileValue, 15));
        ioTask.execute("isFileCached", new ai(5, this, rawFileValue));
    }

    public JSONObject getDefineVarsData() {
        return CTVariableUtils.getFlatVarsJson(this.valuesFromClient, this.defaultKinds);
    }

    public synchronized Object getMergedValue(String str) {
        Var<?> var = this.vars.get(str);
        if (var != null && CTVariableUtils.FILE.equals(var.kind())) {
            return filePathFromDisk(var.stringValue);
        }
        Object mergedValueFromComponentArray = getMergedValueFromComponentArray(CTVariableUtils.getNameComponents(str));
        if (mergedValueFromComponentArray instanceof Map) {
            return CTVariableUtils.deepCopyMap((Map) JsonUtil.uncheckedCast(mergedValueFromComponentArray));
        }
        return mergedValueFromComponentArray;
    }

    public synchronized <T> T getMergedValueFromComponentArray(Object[] objArr) {
        Object obj;
        obj = this.merged;
        if (obj == null) {
            obj = this.valuesFromClient;
        }
        return (T) getMergedValueFromComponentArray(objArr, obj);
    }

    public synchronized <T> Var<T> getVariable(String str) {
        return (Var) JsonUtil.uncheckedCast(this.vars.get(str));
    }

    public int getVariablesCount() {
        return this.vars.size();
    }

    public synchronized void loadDiffs(Function0<Unit> function0) {
        try {
            Map<String, Object> fromJson = JsonUtil.fromJson(loadDataFromCache());
            HashMap<String, Var<?>> hashMap = new HashMap<>(this.vars);
            applyVariableDiffs(fromJson, hashMap);
            startFilesDownload(hashMap, function0);
        } catch (Exception e) {
            log("Could not load variable diffs.\n", e);
        }
    }

    public synchronized void loadDiffsAndTriggerHandlers(Function0<Unit> function0) {
        loadDiffs(function0);
        triggerGlobalCallbacks();
    }

    public void mergeVariable(Var<?> var) {
        Object obj = this.merged;
        if (obj == null) {
            log("mergeVariable() called, but `merged` member is null.");
            return;
        }
        if (!(obj instanceof Map)) {
            log("mergeVariable() called, but `merged` member is not of Map type.");
            return;
        }
        String str = var.nameComponents()[0];
        Object obj2 = this.valuesFromClient.get(str);
        Map map = (Map) JsonUtil.uncheckedCast(this.merged);
        Object obj3 = map.get(str);
        if (CTVariableUtils.FILE.equals(var.kind())) {
            if (obj2 != null || obj3 == null) {
                return;
            }
        } else if (obj2 == null || obj2.equals(obj3)) {
            return;
        }
        map.put(str, CTVariableUtils.mergeHelper(obj2, obj3));
        StringBuilder sb2 = new StringBuilder(str);
        for (int i4 = 1; i4 < var.nameComponents().length; i4++) {
            Var<?> var2 = this.vars.get(sb2.toString());
            if (var2 != null) {
                var2.update();
            }
            sb2.append('.');
            sb2.append(var.nameComponents()[i4]);
        }
    }

    public synchronized void registerVariable(Var<?> var) {
        try {
            log("registerVariable() called with: var = [" + var.name() + Constants.AES_SUFFIX);
            this.vars.put(var.name(), var);
            Object defaultValue = var.defaultValue();
            if (defaultValue instanceof Map) {
                defaultValue = CTVariableUtils.deepCopyMap((Map) JsonUtil.uncheckedCast(defaultValue));
            }
            CTVariableUtils.updateValuesAndKinds(var.name(), var.nameComponents(), defaultValue, var.kind(), this.valuesFromClient, this.defaultKinds);
            mergeVariable(var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setGlobalCallbacksRunnable(Runnable runnable) {
        this.globalCallbacksRunnable = runnable;
    }

    public synchronized void updateDiffsAndTriggerHandlers(Map<String, Object> map, Function0<Unit> function0) {
        HashMap<String, Var<?>> hashMap = new HashMap<>(this.vars);
        applyVariableDiffs(map, hashMap);
        startFilesDownload(hashMap, function0);
        saveDiffsAsync();
        triggerGlobalCallbacks();
    }

    private static void log(String str, Throwable th) {
        Logger.d("variables", str, th);
    }

    public synchronized <T> T getMergedValueFromComponentArray(Object[] objArr, Object obj) {
        try {
            for (Object obj2 : objArr) {
                obj = CTVariableUtils.traverse(obj, obj2, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) JsonUtil.uncheckedCast(obj);
    }
}
