package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.store.preference.InAppStore;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.utils.JsonUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0017J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/clevertap/android/sdk/inapp/StoreRegistryInAppQueue;", "Lcom/clevertap/android/sdk/inapp/InAppQueue;", "storeRegistry", "Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;", "logTag", "", "<init>", "(Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;Ljava/lang/String;)V", "enqueue", "", "jsonObject", "Lorg/json/JSONObject;", "enqueueAll", "jsonArray", "Lorg/json/JSONArray;", "insertInFront", "dequeue", "getQueueLength", "", "getQueue", "saveQueue", "queue", "(Lorg/json/JSONArray;)Lkotlin/Unit;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreRegistryInAppQueue implements InAppQueue {

    @NotNull
    private final String logTag;

    @NotNull
    private final StoreRegistry storeRegistry;

    public StoreRegistryInAppQueue(@NotNull StoreRegistry storeRegistry, @NotNull String logTag) {
        Intrinsics.echo(storeRegistry, "storeRegistry");
        Intrinsics.echo(logTag, "logTag");
        this.storeRegistry = storeRegistry;
        this.logTag = logTag;
    }

    private final JSONArray getQueue() {
        InAppStore inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore == null) {
            return new JSONArray();
        }
        return inAppStore.readServerSideInApps();
    }

    private final Unit saveQueue(JSONArray queue) {
        InAppStore inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            inAppStore.storeServerSideInApps(queue);
            return Unit.INSTANCE;
        }
        return null;
    }

    @Override // com.clevertap.android.sdk.inapp.InAppQueue
    @Nullable
    public synchronized JSONObject dequeue() {
        JSONArray queue = getQueue();
        JSONObject jSONObject = null;
        if (queue.length() == 0) {
            return null;
        }
        Object remove = queue.remove(0);
        saveQueue(queue);
        if (remove instanceof JSONObject) {
            jSONObject = (JSONObject) remove;
        }
        return jSONObject;
    }

    @Override // com.clevertap.android.sdk.inapp.InAppQueue
    public synchronized void enqueue(@NotNull JSONObject jsonObject) {
        Intrinsics.echo(jsonObject, "jsonObject");
        JSONArray queue = getQueue();
        queue.put(jsonObject);
        saveQueue(queue);
    }

    @Override // com.clevertap.android.sdk.inapp.InAppQueue
    public synchronized void enqueueAll(@NotNull JSONArray jsonArray) {
        Intrinsics.echo(jsonArray, "jsonArray");
        JSONArray queue = getQueue();
        int length = jsonArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            try {
                queue.put(jsonArray.getJSONObject(i4));
            } catch (Exception e) {
                Logger.d(this.logTag, "InAppController: Malformed InApp notification: " + e.getMessage());
            }
        }
        saveQueue(queue);
    }

    @Override // com.clevertap.android.sdk.inapp.InAppQueue
    public synchronized int getQueueLength() {
        return getQueue().length();
    }

    @Override // com.clevertap.android.sdk.inapp.InAppQueue
    public synchronized void insertInFront(@NotNull JSONObject jsonObject) {
        Intrinsics.echo(jsonObject, "jsonObject");
        JSONArray queue = getQueue();
        JsonUtilsKt.prepend(queue, jsonObject);
        saveQueue(queue);
    }
}
