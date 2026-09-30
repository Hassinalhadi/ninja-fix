package com.clevertap.android.sdk.inapp.data;

import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatesManager;
import com.clevertap.android.sdk.inapp.evaluation.LimitAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160%H\u0002J\u001e\u0010'\u001a\u00020#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160%2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R#\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020 0\t0\u0015¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010/\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001f\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\r¨\u00065"}, d2 = {"Lcom/clevertap/android/sdk/inapp/data/InAppResponseAdapter;", "", "responseJson", "Lorg/json/JSONObject;", "templatesManager", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "<init>", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;)V", "legacyInApps", "Lkotlin/Pair;", "", "Lorg/json/JSONArray;", "getLegacyInApps", "()Lkotlin/Pair;", "clientSideInApps", "getClientSideInApps", "serverSideInApps", "getServerSideInApps", "appLaunchServerSideInApps", "getAppLaunchServerSideInApps", "preloadImages", "", "", "getPreloadImages", "()Ljava/util/List;", "preloadGifs", "getPreloadGifs", "preloadFiles", "getPreloadFiles", "preloadAssets", "getPreloadAssets", "preloadAssetsMeta", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "getPreloadAssetsMeta", "fetchMediaUrls", "", "imageList", "", "gifList", "fetchFilesUrlsForTemplates", "filesList", "inAppsPerSession", "", "getInAppsPerSession", "()I", "inAppsPerDay", "getInAppsPerDay", "inAppMode", "getInAppMode", "()Ljava/lang/String;", "staleInApps", "getStaleInApps", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppResponseAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String IN_APP_DAILY_KEY = "imp";
    private static final int IN_APP_DEFAULT_DAILY = 10;
    private static final int IN_APP_DEFAULT_SESSION = 10;

    @NotNull
    private static final String IN_APP_SESSION_KEY = "imc";

    @NotNull
    private final Pair<Boolean, JSONArray> appLaunchServerSideInApps;

    @NotNull
    private final Pair<Boolean, JSONArray> clientSideInApps;

    @NotNull
    private final String inAppMode;
    private final int inAppsPerDay;
    private final int inAppsPerSession;

    @NotNull
    private final Pair<Boolean, JSONArray> legacyInApps;

    @NotNull
    private final List<String> preloadAssets;

    @NotNull
    private final List<Pair<String, CtCacheType>> preloadAssetsMeta;

    @NotNull
    private final List<String> preloadFiles;

    @NotNull
    private final List<String> preloadGifs;

    @NotNull
    private final List<String> preloadImages;

    @NotNull
    private final Pair<Boolean, JSONArray> serverSideInApps;

    @NotNull
    private final Pair<Boolean, JSONArray> staleInApps;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/data/InAppResponseAdapter$Companion;", "", "<init>", "()V", "IN_APP_DEFAULT_DAILY", "", "IN_APP_DEFAULT_SESSION", "IN_APP_SESSION_KEY", "", "IN_APP_DAILY_KEY", "getListOfWhenLimits", "", "Lcom/clevertap/android/sdk/inapp/evaluation/LimitAdapter;", "limitJSON", "Lorg/json/JSONObject;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<LimitAdapter> getListOfWhenLimits(@NotNull JSONObject limitJSON) {
            int collectionSizeOrDefault;
            Intrinsics.echo(limitJSON, "limitJSON");
            JSONArray orEmptyArray = CTXtensions.orEmptyArray(limitJSON.optJSONArray(Constants.INAPP_FC_LIMITS));
            ArrayList arrayList = new ArrayList();
            int length = orEmptyArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                Object obj = orEmptyArray.get(i4);
                if (obj instanceof JSONObject) {
                    arrayList.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new LimitAdapter((JSONObject) it.next()));
            }
            return CollectionsKt.B(arrayList2);
        }

        private Companion() {
        }
    }

    public InAppResponseAdapter(@NotNull JSONObject responseJson, @NotNull TemplatesManager templatesManager) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Intrinsics.echo(responseJson, "responseJson");
        Intrinsics.echo(templatesManager, "templatesManager");
        this.legacyInApps = CTXtensions.safeGetJSONArrayOrNullIfEmpty(responseJson, Constants.INAPP_JSON_RESPONSE_KEY);
        this.clientSideInApps = CTXtensions.safeGetJSONArray(responseJson, "inapp_notifs_cs");
        this.serverSideInApps = CTXtensions.safeGetJSONArray(responseJson, "inapp_notifs_ss");
        this.appLaunchServerSideInApps = CTXtensions.safeGetJSONArrayOrNullIfEmpty(responseJson, Constants.INAPP_NOTIFS_APP_LAUNCHED_KEY);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        fetchMediaUrls(arrayList, arrayList2);
        fetchFilesUrlsForTemplates(arrayList3, templatesManager);
        this.preloadImages = arrayList;
        this.preloadGifs = arrayList2;
        this.preloadFiles = arrayList3;
        this.preloadAssets = CollectionsKt.a(CollectionsKt.a(arrayList, arrayList2), arrayList3);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList4.add(new Pair((String) it.next(), CtCacheType.IMAGE));
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList5.add(new Pair((String) it2.next(), CtCacheType.GIF));
        }
        ArrayList a6 = CollectionsKt.a(arrayList4, arrayList5);
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
        ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault3);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList6.add(new Pair((String) it3.next(), CtCacheType.FILES));
        }
        ArrayList a8 = CollectionsKt.a(a6, arrayList6);
        HashSet hashSet = new HashSet();
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = a8.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (hashSet.add((String) ((Pair) next).getFirst())) {
                arrayList7.add(next);
            }
        }
        this.preloadAssetsMeta = arrayList7;
        this.inAppsPerSession = responseJson.optInt("imc", 10);
        this.inAppsPerDay = responseJson.optInt("imp", 10);
        String optString = responseJson.optString(Constants.INAPP_DELIVERY_MODE_KEY, "");
        Intrinsics.delta(optString, "optString(...)");
        this.inAppMode = optString;
        this.staleInApps = CTXtensions.safeGetJSONArrayOrNullIfEmpty(responseJson, Constants.INAPP_NOTIFS_STALE_KEY);
    }

    private final void fetchFilesUrlsForTemplates(List<String> filesList, TemplatesManager templatesManager) {
        JSONArray second;
        if (this.clientSideInApps.getFirst().booleanValue() && (second = this.clientSideInApps.getSecond()) != null) {
            int length = second.length();
            for (int i4 = 0; i4 < length; i4++) {
                CustomTemplateInAppData createFromJson = CustomTemplateInAppData.INSTANCE.createFromJson(second.optJSONObject(i4));
                if (createFromJson != null) {
                    createFromJson.getFileArgsUrls$clevertap_core_release(templatesManager, filesList);
                }
            }
        }
    }

    private final void fetchMediaUrls(List<String> imageList, List<String> gifList) {
        JSONArray second;
        CTInAppNotificationMedia create;
        CTInAppNotificationMedia create2;
        if (this.clientSideInApps.getFirst().booleanValue() && (second = this.clientSideInApps.getSecond()) != null) {
            int length = second.length();
            for (int i4 = 0; i4 < length; i4++) {
                Object obj = second.get(i4);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.KEY_MEDIA);
                    if (optJSONObject != null && (create2 = CTInAppNotificationMedia.INSTANCE.create(optJSONObject, 1)) != null && !StringsKt.gray(create2.getMediaUrl())) {
                        if (create2.isImage()) {
                            imageList.add(create2.getMediaUrl());
                        } else if (create2.isGIF()) {
                            gifList.add(create2.getMediaUrl());
                        }
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(Constants.KEY_MEDIA_LANDSCAPE);
                    if (optJSONObject2 != null && (create = CTInAppNotificationMedia.INSTANCE.create(optJSONObject2, 2)) != null && !StringsKt.gray(create.getMediaUrl())) {
                        if (create.isImage()) {
                            imageList.add(create.getMediaUrl());
                        } else if (create.isGIF()) {
                            gifList.add(create.getMediaUrl());
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public static final List<LimitAdapter> getListOfWhenLimits(@NotNull JSONObject jSONObject) {
        return INSTANCE.getListOfWhenLimits(jSONObject);
    }

    @NotNull
    public final Pair<Boolean, JSONArray> getAppLaunchServerSideInApps() {
        return this.appLaunchServerSideInApps;
    }

    @NotNull
    public final Pair<Boolean, JSONArray> getClientSideInApps() {
        return this.clientSideInApps;
    }

    @NotNull
    public final String getInAppMode() {
        return this.inAppMode;
    }

    public final int getInAppsPerDay() {
        return this.inAppsPerDay;
    }

    public final int getInAppsPerSession() {
        return this.inAppsPerSession;
    }

    @NotNull
    public final Pair<Boolean, JSONArray> getLegacyInApps() {
        return this.legacyInApps;
    }

    @NotNull
    public final List<String> getPreloadAssets() {
        return this.preloadAssets;
    }

    @NotNull
    public final List<Pair<String, CtCacheType>> getPreloadAssetsMeta() {
        return this.preloadAssetsMeta;
    }

    @NotNull
    public final List<String> getPreloadFiles() {
        return this.preloadFiles;
    }

    @NotNull
    public final List<String> getPreloadGifs() {
        return this.preloadGifs;
    }

    @NotNull
    public final List<String> getPreloadImages() {
        return this.preloadImages;
    }

    @NotNull
    public final Pair<Boolean, JSONArray> getServerSideInApps() {
        return this.serverSideInApps;
    }

    @NotNull
    public final Pair<Boolean, JSONArray> getStaleInApps() {
        return this.staleInApps;
    }
}
