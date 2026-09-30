package com.clevertap.android.sdk.variables;

import androidx.camera.core.impl.ai;
import b.c0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.variables.callbacks.FetchVariablesCallback;
import com.clevertap.android.sdk.variables.callbacks.VariablesChangedCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CTVariables {
    private final VarCache varCache;
    private boolean hasVarsRequestCompleted = false;
    private boolean preRegisteredFilesDownloaded = false;
    private final List<VariablesChangedCallback> variablesChangedCallbacks = new ArrayList();
    private final List<VariablesChangedCallback> oneTimeVariablesChangedCallbacks = new ArrayList();
    private final List<VariablesChangedCallback> variablesChangedCallbacksNoDownloadsPending = new ArrayList();
    private final List<VariablesChangedCallback> oneTimeVariablesChangedCallbacksNoDownloadsPending = new ArrayList();

    public CTVariables(VarCache varCache) {
        this.varCache = varCache;
        varCache.setGlobalCallbacksRunnable(new ai(20, this));
    }

    private void handleVariableResponseSuccess(JSONObject jSONObject, FetchVariablesCallback fetchVariablesCallback) {
        setHasVarsRequestCompleted(true);
        this.varCache.updateDiffsAndTriggerHandlers(CTVariableUtils.convertFlatMapToNestedMaps(JsonUtil.mapFromJson(jSONObject)), new a(this, 0));
        if (fetchVariablesCallback != null) {
            fetchVariablesCallback.onVariablesFetched(true);
        }
    }

    public /* synthetic */ Unit lambda$handleVariableResponseError$2() {
        triggerGlobalFilesCallbacks();
        this.preRegisteredFilesDownloaded = true;
        return null;
    }

    public /* synthetic */ Unit lambda$handleVariableResponseSuccess$3() {
        triggerGlobalFilesCallbacks();
        this.preRegisteredFilesDownloaded = true;
        return null;
    }

    public static /* synthetic */ Unit lambda$init$1() {
        return null;
    }

    public /* synthetic */ void lambda$new$0() {
        synchronized (this.variablesChangedCallbacks) {
            try {
                Iterator<VariablesChangedCallback> it = this.variablesChangedCallbacks.iterator();
                while (it.hasNext()) {
                    Utils.runOnUiThread(it.next());
                }
            } finally {
            }
        }
        synchronized (this.oneTimeVariablesChangedCallbacks) {
            try {
                Iterator<VariablesChangedCallback> it2 = this.oneTimeVariablesChangedCallbacks.iterator();
                while (it2.hasNext()) {
                    Utils.runOnUiThread(it2.next());
                }
                this.oneTimeVariablesChangedCallbacks.clear();
            } finally {
            }
        }
    }

    private static void logD(String str) {
        Logger.d("variables", str);
    }

    private void triggerGlobalFilesCallbacks() {
        synchronized (this.variablesChangedCallbacksNoDownloadsPending) {
            try {
                Iterator<VariablesChangedCallback> it = this.variablesChangedCallbacksNoDownloadsPending.iterator();
                while (it.hasNext()) {
                    Utils.runOnUiThread(it.next());
                }
            } finally {
            }
        }
        synchronized (this.oneTimeVariablesChangedCallbacksNoDownloadsPending) {
            try {
                Iterator<VariablesChangedCallback> it2 = this.oneTimeVariablesChangedCallbacksNoDownloadsPending.iterator();
                while (it2.hasNext()) {
                    Utils.runOnUiThread(it2.next());
                }
                this.oneTimeVariablesChangedCallbacksNoDownloadsPending.clear();
            } finally {
            }
        }
    }

    public void addOneTimeVariablesChangedCallback(VariablesChangedCallback variablesChangedCallback) {
        if (this.hasVarsRequestCompleted) {
            variablesChangedCallback.variablesChanged();
            return;
        }
        synchronized (this.oneTimeVariablesChangedCallbacks) {
            this.oneTimeVariablesChangedCallbacks.add(variablesChangedCallback);
        }
    }

    public void addVariablesChangedCallback(VariablesChangedCallback variablesChangedCallback) {
        synchronized (this.variablesChangedCallbacks) {
            this.variablesChangedCallbacks.add(variablesChangedCallback);
        }
        if (this.hasVarsRequestCompleted) {
            variablesChangedCallback.variablesChanged();
        }
    }

    public void clearUserContent() {
        logD("Clear user content in CTVariables");
        setHasVarsRequestCompleted(false);
        this.preRegisteredFilesDownloaded = false;
        this.varCache.clearUserContent();
    }

    public VarCache getVarCache() {
        return this.varCache;
    }

    public void handleVariableResponse(JSONObject jSONObject, FetchVariablesCallback fetchVariablesCallback) {
        logD("handleVariableResponse() called with: response = [" + jSONObject + Constants.AES_SUFFIX);
        if (jSONObject == null) {
            handleVariableResponseError(fetchVariablesCallback);
        } else {
            handleVariableResponseSuccess(jSONObject, fetchVariablesCallback);
        }
    }

    public void handleVariableResponseError(FetchVariablesCallback fetchVariablesCallback) {
        if (!hasVarsRequestCompleted().booleanValue()) {
            setHasVarsRequestCompleted(true);
            this.varCache.loadDiffsAndTriggerHandlers(new a(this, 1));
        }
        if (fetchVariablesCallback != null) {
            fetchVariablesCallback.onVariablesFetched(false);
        }
    }

    public Boolean hasVarsRequestCompleted() {
        return Boolean.valueOf(this.hasVarsRequestCompleted);
    }

    public void init() {
        logD("init() called");
        this.varCache.loadDiffs(new c0(25));
    }

    public void onVariablesChangedAndNoDownloadsPending(VariablesChangedCallback variablesChangedCallback) {
        synchronized (this.variablesChangedCallbacksNoDownloadsPending) {
            this.variablesChangedCallbacksNoDownloadsPending.add(variablesChangedCallback);
        }
        if (this.preRegisteredFilesDownloaded) {
            variablesChangedCallback.variablesChanged();
        }
    }

    public void onceVariablesChangedAndNoDownloadsPending(VariablesChangedCallback variablesChangedCallback) {
        if (this.preRegisteredFilesDownloaded) {
            variablesChangedCallback.variablesChanged();
            return;
        }
        synchronized (this.oneTimeVariablesChangedCallbacksNoDownloadsPending) {
            this.oneTimeVariablesChangedCallbacksNoDownloadsPending.add(variablesChangedCallback);
        }
    }

    public void removeAllOneTimeVariablesChangedCallbacks() {
        synchronized (this.oneTimeVariablesChangedCallbacks) {
            this.oneTimeVariablesChangedCallbacks.clear();
        }
    }

    public void removeAllVariablesChangedCallbacks() {
        synchronized (this.variablesChangedCallbacks) {
            this.variablesChangedCallbacks.clear();
        }
    }

    public void removeOneTimeVariablesChangedHandler(VariablesChangedCallback variablesChangedCallback) {
        synchronized (this.oneTimeVariablesChangedCallbacks) {
            this.oneTimeVariablesChangedCallbacks.remove(variablesChangedCallback);
        }
    }

    public void removeVariablesChangedCallback(VariablesChangedCallback variablesChangedCallback) {
        synchronized (this.variablesChangedCallbacks) {
            this.variablesChangedCallbacks.remove(variablesChangedCallback);
        }
    }

    public void setHasVarsRequestCompleted(boolean z2) {
        this.hasVarsRequestCompleted = z2;
    }
}
