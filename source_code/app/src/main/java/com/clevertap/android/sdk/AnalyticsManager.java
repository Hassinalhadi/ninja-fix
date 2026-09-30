package com.clevertap.android.sdk;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import com.clevertap.android.sdk.events.BaseEventQueueManager;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.response.DisplayUnitResponse;
import com.clevertap.android.sdk.response.InAppResponse;
import com.clevertap.android.sdk.response.InboxResponse;
import com.clevertap.android.sdk.task.CTExecutors;
import com.clevertap.android.sdk.utils.CTJsonConverter;
import com.clevertap.android.sdk.utils.Clock;
import com.clevertap.android.sdk.utils.UriHelper;
import com.clevertap.android.sdk.validation.ValidationResult;
import com.clevertap.android.sdk.validation.ValidationResultFactory;
import com.clevertap.android.sdk.validation.ValidationResultStack;
import com.clevertap.android.sdk.validation.Validator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AnalyticsManager extends BaseAnalyticsManager {
    private final BaseEventQueueManager baseEventQueueManager;
    private final BaseCallbackManager callbackManager;
    private final CleverTapInstanceConfig config;
    private final Context context;
    private final ControllerManager controllerManager;
    private final CoreMetaData coreMetaData;
    private final CTLockManager ctLockManager;
    private final Clock currentTimeProvider;
    private final DeviceInfo deviceInfo;
    private final CTExecutors executors;
    private final InAppResponse inAppResponse;
    private final ValidationResultStack validationResultStack;
    private final Validator validator;
    private final HashMap<String, Integer> installReferrerMap = new HashMap<>(8);
    private final Object notificationMapLock = new Object();
    private final HashMap<String, Long> notificationIdTagMap = new HashMap<>();
    private final HashMap<String, Long> notificationViewedIdTagMap = new HashMap<>();

    public AnalyticsManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, BaseEventQueueManager baseEventQueueManager, Validator validator, ValidationResultStack validationResultStack, CoreMetaData coreMetaData, DeviceInfo deviceInfo, BaseCallbackManager baseCallbackManager, ControllerManager controllerManager, CTLockManager cTLockManager, InAppResponse inAppResponse, Clock clock, CTExecutors cTExecutors) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.baseEventQueueManager = baseEventQueueManager;
        this.validator = validator;
        this.validationResultStack = validationResultStack;
        this.coreMetaData = coreMetaData;
        this.deviceInfo = deviceInfo;
        this.callbackManager = baseCallbackManager;
        this.ctLockManager = cTLockManager;
        this.controllerManager = controllerManager;
        this.inAppResponse = inAppResponse;
        this.currentTimeProvider = clock;
        this.executors = cTExecutors;
    }

    private void _constructIncrementDecrementValues(Number number, String str, String str2) {
        if (str != null && number != null) {
            try {
                ValidationResult cleanObjectKey = this.validator.cleanObjectKey(str);
                String obj = cleanObjectKey.getObject().toString();
                if (obj.isEmpty()) {
                    ValidationResult create = ValidationResultFactory.create(512, 2, obj);
                    this.validationResultStack.pushValidationResult(create);
                    this.config.getLogger().debug(this.config.getAccountId(), create.getErrorDesc());
                    return;
                }
                if (number.intValue() >= 0 && number.doubleValue() >= 0.0d && number.floatValue() >= 0.0f) {
                    if (cleanObjectKey.getErrorCode() != 0) {
                        this.validationResultStack.pushValidationResult(cleanObjectKey);
                    }
                    this.baseEventQueueManager.pushBasicProfile(new JSONObject().put(obj, new JSONObject().put(str2, number)), false);
                    return;
                }
                ValidationResult create2 = ValidationResultFactory.create(512, 25, obj);
                this.validationResultStack.pushValidationResult(create2);
                this.config.getLogger().debug(this.config.getAccountId(), create2.getErrorDesc());
            } catch (Throwable th) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Failed to update profile value for key " + str, th);
            }
        }
    }

    private void _generateInvalidMultiValueKeyError(String str) {
        this.validationResultStack.pushValidationResult(ValidationResultFactory.create(523, 23, str));
        this.config.getLogger().debug(this.config.getAccountId(), "Invalid multi-value property key " + str + " profile multi value operation aborted");
    }

    private void _handleMultiValues(ArrayList<String> arrayList, String str, String str2) {
        String str3;
        if (str == null) {
            return;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            ValidationResult cleanMultiValuePropertyKey = this.validator.cleanMultiValuePropertyKey(str);
            if (cleanMultiValuePropertyKey.getErrorCode() != 0) {
                this.validationResultStack.pushValidationResult(cleanMultiValuePropertyKey);
            }
            if (cleanMultiValuePropertyKey.getObject() != null) {
                str3 = cleanMultiValuePropertyKey.getObject().toString();
            } else {
                str3 = null;
            }
            if (str3 != null && !str3.isEmpty()) {
                _pushMultiValue(arrayList, str3, str2);
                return;
            } else {
                _generateInvalidMultiValueKeyError(str);
                return;
            }
        }
        _generateEmptyMultiValueError(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void _push(Map<String, Object> map) {
        String str;
        if (map != null && !map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str2 : map.keySet()) {
                    Object obj = map.get(str2);
                    ValidationResult cleanObjectKey = this.validator.cleanObjectKey(str2);
                    String obj2 = cleanObjectKey.getObject().toString();
                    if (cleanObjectKey.getErrorCode() != 0) {
                        this.validationResultStack.pushValidationResult(cleanObjectKey);
                    }
                    if (obj2.isEmpty()) {
                        ValidationResult create = ValidationResultFactory.create(512, 2, new String[0]);
                        this.validationResultStack.pushValidationResult(create);
                        this.config.getLogger().debug(this.config.getAccountId(), create.getErrorDesc());
                    } else {
                        try {
                            ValidationResult cleanObjectValue = this.validator.cleanObjectValue(obj, Validator.ValidationContext.Profile);
                            Object object = cleanObjectValue.getObject();
                            if (cleanObjectValue.getErrorCode() != 0) {
                                this.validationResultStack.pushValidationResult(cleanObjectValue);
                            }
                            if (obj2.equalsIgnoreCase("Phone")) {
                                try {
                                    object = object.toString();
                                    String countryCode = this.deviceInfo.getCountryCode();
                                    if (countryCode != null) {
                                        if (countryCode.isEmpty()) {
                                        }
                                        Logger logger = this.config.getLogger();
                                        String accountId = this.config.getAccountId();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Profile phone is: ");
                                        sb2.append((Object) object);
                                        sb2.append(" device country code is: ");
                                        if (countryCode != null) {
                                            countryCode = com.google.maps.android.BuildConfig.TRAVIS;
                                        }
                                        sb2.append(countryCode);
                                        logger.verbose(accountId, sb2.toString());
                                    }
                                    if (!object.startsWith("+")) {
                                        ValidationResult create2 = ValidationResultFactory.create(512, 4, object);
                                        this.validationResultStack.pushValidationResult(create2);
                                        this.config.getLogger().debug(this.config.getAccountId(), create2.getErrorDesc());
                                    }
                                    Logger logger2 = this.config.getLogger();
                                    String accountId2 = this.config.getAccountId();
                                    StringBuilder sb22 = new StringBuilder();
                                    sb22.append("Profile phone is: ");
                                    sb22.append((Object) object);
                                    sb22.append(" device country code is: ");
                                    if (countryCode != null) {
                                    }
                                    sb22.append(countryCode);
                                    logger2.verbose(accountId2, sb22.toString());
                                } catch (Exception e) {
                                    this.validationResultStack.pushValidationResult(ValidationResultFactory.create(512, 5, new String[0]));
                                    this.config.getLogger().debug(this.config.getAccountId(), "Invalid phone number: " + e.getLocalizedMessage());
                                }
                            }
                            jSONObject.put(obj2, object);
                        } catch (Throwable unused) {
                            if (obj != null) {
                                str = obj.toString();
                            } else {
                                str = "";
                            }
                            ValidationResult create3 = ValidationResultFactory.create(512, 3, str, obj2);
                            this.validationResultStack.pushValidationResult(create3);
                            this.config.getLogger().debug(this.config.getAccountId(), create3.getErrorDesc());
                        }
                    }
                }
                this.config.getLogger().verbose(this.config.getAccountId(), "Constructed custom profile: " + jSONObject);
                this.baseEventQueueManager.pushBasicProfile(jSONObject, false);
            } catch (Throwable th) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Failed to push profile", th);
            }
        }
    }

    private void _pushMultiValue(ArrayList<String> arrayList, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, new JSONArray((Collection) arrayList));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, jSONObject);
            this.baseEventQueueManager.pushBasicProfile(jSONObject2, false);
            this.config.getLogger().verbose(this.config.getAccountId(), "Constructed multi-value profile push: " + jSONObject2);
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Error pushing multiValue for key " + str, th);
        }
    }

    private void _removeValueForKey(String str) {
        if (str == null) {
            str = "";
        }
        try {
            ValidationResult cleanObjectKey = this.validator.cleanObjectKey(str);
            String obj = cleanObjectKey.getObject().toString();
            if (obj.isEmpty()) {
                ValidationResult create = ValidationResultFactory.create(512, 6, new String[0]);
                this.validationResultStack.pushValidationResult(create);
                this.config.getLogger().debug(this.config.getAccountId(), create.getErrorDesc());
                return;
            }
            if (cleanObjectKey.getErrorCode() != 0) {
                this.validationResultStack.pushValidationResult(cleanObjectKey);
            }
            if (obj.toLowerCase().contains("identity")) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Cannot remove value for key " + obj + " from user profile");
                return;
            }
            this.baseEventQueueManager.pushBasicProfile(new JSONObject().put(obj, new JSONObject().put(Constants.COMMAND_DELETE, true)), true);
            this.config.getLogger().verbose(this.config.getAccountId(), "removing value for key " + obj + " from user profile");
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Failed to remove profile value for key " + str, th);
        }
    }

    private boolean checkDuplicateNotificationIds(String str, HashMap<String, Long> hashMap, int i4) {
        boolean z2;
        synchronized (this.notificationMapLock) {
            z2 = false;
            try {
                long currentTimeMillis = this.currentTimeProvider.currentTimeMillis();
                if (hashMap.containsKey(str) && currentTimeMillis - hashMap.get(str).longValue() < i4) {
                    z2 = true;
                }
                hashMap.put(str, Long.valueOf(currentTimeMillis));
            } catch (Throwable unused) {
            }
        }
        return z2;
    }

    private JSONObject getHalfInterstitialInApp(JSONObject jSONObject) throws JSONException {
        String wrapImageInterstitialContent = wrapImageInterstitialContent(jSONObject.optString(Constants.INAPP_IMAGE_INTERSTITIAL_CONFIG));
        if (wrapImageInterstitialContent != null) {
            jSONObject.put(Constants.KEY_TYPE, Constants.KEY_CUSTOM_HTML);
            Object opt = jSONObject.opt(Constants.INAPP_DATA_TAG);
            if (opt instanceof JSONObject) {
                JSONObject jSONObject2 = new JSONObject(((JSONObject) opt).toString());
                jSONObject2.put(Constants.INAPP_HTML_TAG, wrapImageInterstitialContent);
                jSONObject.put(Constants.INAPP_DATA_TAG, jSONObject2);
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(Constants.INAPP_HTML_TAG, wrapImageInterstitialContent);
            jSONObject.put(Constants.INAPP_DATA_TAG, jSONObject3);
            return jSONObject;
        }
        this.config.getLogger().debug(this.config.getAccountId(), "Failed to parse the image-interstitial notification");
        return null;
    }

    private void handleInAppPreview(Bundle bundle) {
        this.executors.postAsyncSafelyTask().execute("testInappNotification", new d(this, bundle, 0));
    }

    private void handleInboxPreview(Bundle bundle) {
        this.executors.postAsyncSafelyTask().execute("testInboxNotification", new d(this, bundle, 1));
    }

    private void handleSendTestForDisplayUnits(Bundle bundle) {
        try {
            new DisplayUnitResponse(this.config, this.callbackManager, this.controllerManager).processResponse(CTJsonConverter.displayUnitFromExtras(bundle), null, this.context);
        } catch (Throwable th) {
            Logger.v("Failed to process Display Unit from push notification payload", th);
        }
    }

    public /* synthetic */ Void lambda$addMultiValuesForKey$0(ArrayList arrayList, String str) throws Exception {
        _handleMultiValues(arrayList, str, Constants.COMMAND_ADD);
        return null;
    }

    public /* synthetic */ Void lambda$handleInAppPreview$2(Bundle bundle) throws Exception {
        String string;
        JSONObject jSONObject;
        JSONArray jSONArray;
        try {
            string = bundle.getString(Constants.INAPP_PREVIEW_PUSH_PAYLOAD_TYPE_KEY);
            jSONObject = new JSONObject(bundle.getString(Constants.INAPP_PREVIEW_PUSH_PAYLOAD_KEY));
            jSONArray = new JSONArray();
        } catch (Throwable th) {
            Logger.v("Failed to display inapp notification from push notification payload", th);
        }
        if (!Constants.INAPP_IMAGE_INTERSTITIAL_TYPE.equals(string) && !Constants.INAPP_ADVANCED_BUILDER_TYPE.equals(string)) {
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Constants.INAPP_JSON_RESPONSE_KEY, jSONArray);
            this.inAppResponse.processResponse(jSONObject2, null, this.context);
            return null;
        }
        jSONArray.put(getHalfInterstitialInApp(jSONObject));
        JSONObject jSONObject22 = new JSONObject();
        jSONObject22.put(Constants.INAPP_JSON_RESPONSE_KEY, jSONArray);
        this.inAppResponse.processResponse(jSONObject22, null, this.context);
        return null;
    }

    public /* synthetic */ Void lambda$handleInboxPreview$1(Bundle bundle) throws Exception {
        try {
            Logger.v("Received inbox via push payload: " + bundle.getString(Constants.INBOX_PREVIEW_PUSH_PAYLOAD_KEY));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(Constants.INBOX_JSON_RESPONSE_KEY, jSONArray);
            JSONObject jSONObject2 = new JSONObject(bundle.getString(Constants.INBOX_PREVIEW_PUSH_PAYLOAD_KEY));
            jSONObject2.put(Column.ID, String.valueOf(System.currentTimeMillis() / 1000));
            jSONArray.put(jSONObject2);
            new InboxResponse(this.config, this.ctLockManager, this.callbackManager, this.controllerManager).processResponse(jSONObject, null, this.context);
        } catch (Throwable th) {
            Logger.v("Failed to process inbox message from push notification payload", th);
        }
        return null;
    }

    public /* synthetic */ Void lambda$pushProfile$3(Map map) throws Exception {
        _push(map);
        return null;
    }

    public /* synthetic */ Void lambda$removeMultiValuesForKey$4(ArrayList arrayList, String str) throws Exception {
        _handleMultiValues(arrayList, str, Constants.COMMAND_REMOVE);
        return null;
    }

    public /* synthetic */ Void lambda$removeValueForKey$5(String str) throws Exception {
        _removeValueForKey(str);
        return null;
    }

    public /* synthetic */ Void lambda$setMultiValuesForKey$6(ArrayList arrayList, String str) throws Exception {
        _handleMultiValues(arrayList, str, Constants.COMMAND_SET);
        return null;
    }

    public void _generateEmptyMultiValueError(String str) {
        ValidationResult create = ValidationResultFactory.create(512, 1, str);
        this.validationResultStack.pushValidationResult(create);
        this.config.getLogger().debug(this.config.getAccountId(), create.getErrorDesc());
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void addMultiValuesForKey(String str, ArrayList<String> arrayList) {
        this.executors.postAsyncSafelyTask().execute("addMultiValuesForKey", new e(this, arrayList, str, 2));
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void decrementValue(String str, Number number) {
        _constructIncrementDecrementValues(number, str, Constants.COMMAND_DECREMENT);
    }

    public String dedupeCheckKey(Bundle bundle) {
        Object obj = bundle.get(Constants.WZRK_DEDUPE);
        boolean z2 = false;
        if (obj != null) {
            if (obj instanceof String) {
                z2 = "true".equalsIgnoreCase((String) obj);
            }
            if (obj instanceof Boolean) {
                z2 = ((Boolean) obj).booleanValue();
            }
        }
        if (z2) {
            return bundle.getString(Constants.WZRK_PUSH_ID);
        }
        return bundle.getString(Constants.NOTIFICATION_ID_TAG);
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void fetchFeatureFlags() {
        if (this.config.isAnalyticsOnly()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("t", 1);
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.WZRK_FETCH);
            jSONObject.put(Constants.KEY_EVT_DATA, jSONObject2);
        } catch (JSONException unused) {
        }
        sendFetchEvent(jSONObject);
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void forcePushAppLaunchedEvent() {
        this.coreMetaData.setAppLaunchPushed(false);
        pushAppLaunchedEvent();
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void incrementValue(String str, Number number) {
        _constructIncrementDecrementValues(number, str, Constants.COMMAND_INCREMENT);
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushAppLaunchedEvent() {
        if (this.config.isDisableAppLaunchedEvent()) {
            this.coreMetaData.setAppLaunchPushed(true);
            this.config.getLogger().debug(this.config.getAccountId(), "App Launched Events disabled in the Android Manifest file");
        } else {
            if (this.coreMetaData.isAppLaunchPushed()) {
                this.config.getLogger().verbose(this.config.getAccountId(), "App Launched has already been triggered. Will not trigger it ");
                return;
            }
            this.config.getLogger().verbose(this.config.getAccountId(), "Firing App Launched event");
            this.coreMetaData.setAppLaunchPushed(true);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.APP_LAUNCHED_EVENT);
                jSONObject.put(Constants.KEY_EVT_DATA, this.deviceInfo.getAppLaunchedFields());
            } catch (Throwable unused) {
            }
            this.baseEventQueueManager.queueEvent(this.context, jSONObject, 4);
        }
    }

    public void pushChargedEvent(HashMap<String, Object> hashMap, ArrayList<HashMap<String, Object>> arrayList) {
        Iterator<String> it;
        String str;
        if (hashMap != null && arrayList != null) {
            if (arrayList.size() > 50) {
                ValidationResult create = ValidationResultFactory.create(522);
                this.config.getLogger().debug(this.config.getAccountId(), create.getErrorDesc());
                this.validationResultStack.pushValidationResult(create);
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                it = hashMap.keySet().iterator();
            } catch (Throwable unused) {
                return;
            }
            while (true) {
                String str2 = "";
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = hashMap.get(next);
                ValidationResult cleanObjectKey = this.validator.cleanObjectKey(next);
                String obj2 = cleanObjectKey.getObject().toString();
                if (cleanObjectKey.getErrorCode() != 0) {
                    jSONObject2.put(Constants.ERROR_KEY, CTJsonConverter.getErrorObject(cleanObjectKey));
                }
                try {
                    ValidationResult cleanObjectValue = this.validator.cleanObjectValue(obj, Validator.ValidationContext.Event);
                    Object object = cleanObjectValue.getObject();
                    if (cleanObjectValue.getErrorCode() != 0) {
                        jSONObject2.put(Constants.ERROR_KEY, CTJsonConverter.getErrorObject(cleanObjectValue));
                    }
                    jSONObject.put(obj2, object);
                } catch (IllegalArgumentException unused2) {
                    if (obj != null) {
                        str2 = obj.toString();
                    }
                    ValidationResult create2 = ValidationResultFactory.create(511, 7, Constants.CHARGED_EVENT, obj2, str2);
                    this.validationResultStack.pushValidationResult(create2);
                    this.config.getLogger().debug(this.config.getAccountId(), create2.getErrorDesc());
                }
                return;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<HashMap<String, Object>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                HashMap<String, Object> next2 = it2.next();
                JSONObject jSONObject3 = new JSONObject();
                for (String str3 : next2.keySet()) {
                    Object obj3 = next2.get(str3);
                    ValidationResult cleanObjectKey2 = this.validator.cleanObjectKey(str3);
                    String obj4 = cleanObjectKey2.getObject().toString();
                    if (cleanObjectKey2.getErrorCode() != 0) {
                        jSONObject2.put(Constants.ERROR_KEY, CTJsonConverter.getErrorObject(cleanObjectKey2));
                    }
                    try {
                        ValidationResult cleanObjectValue2 = this.validator.cleanObjectValue(obj3, Validator.ValidationContext.Event);
                        Object object2 = cleanObjectValue2.getObject();
                        if (cleanObjectValue2.getErrorCode() != 0) {
                            jSONObject2.put(Constants.ERROR_KEY, CTJsonConverter.getErrorObject(cleanObjectValue2));
                        }
                        jSONObject3.put(obj4, object2);
                    } catch (IllegalArgumentException unused3) {
                        if (obj3 == null) {
                            str = "";
                        } else {
                            str = obj3.toString();
                        }
                        ValidationResult create3 = ValidationResultFactory.create(511, 15, obj4, str);
                        this.config.getLogger().debug(this.config.getAccountId(), create3.getErrorDesc());
                        this.validationResultStack.pushValidationResult(create3);
                    }
                }
                jSONArray.put(jSONObject3);
            }
            jSONObject.put(Constants.KEY_ITEMS, jSONArray);
            jSONObject2.put(Constants.KEY_EVT_NAME, Constants.CHARGED_EVENT);
            jSONObject2.put(Constants.KEY_EVT_DATA, jSONObject);
            this.baseEventQueueManager.queueEvent(this.context, jSONObject2, 4);
            return;
        }
        this.config.getLogger().debug(this.config.getAccountId(), "Invalid Charged event: details and or items is null");
    }

    public synchronized void pushDeepLink(Uri uri, boolean z2) {
        if (uri == null) {
            return;
        }
        try {
            JSONObject urchinFromUri = UriHelper.getUrchinFromUri(uri);
            if (urchinFromUri.has("us")) {
                this.coreMetaData.setSource(urchinFromUri.get("us").toString());
            }
            if (urchinFromUri.has("um")) {
                this.coreMetaData.setMedium(urchinFromUri.get("um").toString());
            }
            if (urchinFromUri.has("uc")) {
                this.coreMetaData.setCampaign(urchinFromUri.get("uc").toString());
            }
            urchinFromUri.put("referrer", uri.toString());
            if (z2) {
                urchinFromUri.put("install", true);
            }
            recordPageEventWithExtras(urchinFromUri);
        } finally {
        }
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushDefineVarsEvent(JSONObject jSONObject) {
        this.baseEventQueueManager.queueEvent(this.context, jSONObject, 8);
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushDisplayUnitClickedEventForID(String str) {
        CleverTapDisplayUnit displayUnitForID;
        JSONObject wZRKFields;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_CLICKED_EVENT_NAME);
            if (this.controllerManager.getCTDisplayUnitController() != null && (displayUnitForID = this.controllerManager.getCTDisplayUnitController().getDisplayUnitForID(str)) != null && (wZRKFields = displayUnitForID.getWZRKFields()) != null) {
                jSONObject.put(Constants.KEY_EVT_DATA, wZRKFields);
                try {
                    this.coreMetaData.setWzrkParams(wZRKFields);
                } catch (Throwable unused) {
                }
            }
            this.baseEventQueueManager.queueEvent(this.context, jSONObject, 4);
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "DisplayUnit : Failed to push Display Unit clicked event" + th);
        }
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushDisplayUnitViewedEventForID(String str) {
        CleverTapDisplayUnit displayUnitForID;
        JSONObject wZRKFields;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME);
            if (this.controllerManager.getCTDisplayUnitController() != null && (displayUnitForID = this.controllerManager.getCTDisplayUnitController().getDisplayUnitForID(str)) != null && (wZRKFields = displayUnitForID.getWZRKFields()) != null) {
                jSONObject.put(Constants.KEY_EVT_DATA, wZRKFields);
            }
            this.baseEventQueueManager.queueEvent(this.context, jSONObject, 4);
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "DisplayUnit : Failed to push Display Unit viewed event" + th);
        }
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushError(String str, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("Error Message", str);
        hashMap.put("Error Code", Integer.valueOf(i4));
        try {
            String currentActivityName = CoreMetaData.getCurrentActivityName();
            if (currentActivityName != null) {
                hashMap.put("Location", currentActivityName);
            } else {
                hashMap.put("Location", "Unknown");
            }
        } catch (Throwable unused) {
            hashMap.put("Location", "Unknown");
        }
        pushEvent("Error Occurred", hashMap);
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushEvent(String str, Map<String, Object> map) {
        String str2;
        if (str != null && !str.equals("")) {
            ValidationResult isRestrictedEventName = this.validator.isRestrictedEventName(str);
            if (isRestrictedEventName.getErrorCode() > 0) {
                this.validationResultStack.pushValidationResult(isRestrictedEventName);
                return;
            }
            ValidationResult isEventDiscarded = this.validator.isEventDiscarded(str);
            if (isEventDiscarded.getErrorCode() > 0) {
                this.validationResultStack.pushValidationResult(isEventDiscarded);
                return;
            }
            if (map == null) {
                map = new HashMap<>();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                ValidationResult cleanEventName = this.validator.cleanEventName(str);
                if (cleanEventName.getErrorCode() != 0) {
                    jSONObject.put(Constants.ERROR_KEY, CTJsonConverter.getErrorObject(cleanEventName));
                }
                String obj = cleanEventName.getObject().toString();
                JSONObject jSONObject2 = new JSONObject();
                for (String str3 : map.keySet()) {
                    Object obj2 = map.get(str3);
                    ValidationResult cleanObjectKey = this.validator.cleanObjectKey(str3);
                    String obj3 = cleanObjectKey.getObject().toString();
                    if (cleanObjectKey.getErrorCode() != 0) {
                        jSONObject.put(Constants.ERROR_KEY, CTJsonConverter.getErrorObject(cleanObjectKey));
                    }
                    try {
                        ValidationResult cleanObjectValue = this.validator.cleanObjectValue(obj2, Validator.ValidationContext.Event);
                        Object object = cleanObjectValue.getObject();
                        if (cleanObjectValue.getErrorCode() != 0) {
                            jSONObject.put(Constants.ERROR_KEY, CTJsonConverter.getErrorObject(cleanObjectValue));
                        }
                        jSONObject2.put(obj3, object);
                    } catch (IllegalArgumentException unused) {
                        if (obj2 == null) {
                            str2 = "";
                        } else {
                            str2 = obj2.toString();
                        }
                        ValidationResult create = ValidationResultFactory.create(512, 7, obj, obj3, str2);
                        this.config.getLogger().debug(this.config.getAccountId(), create.getErrorDesc());
                        this.validationResultStack.pushValidationResult(create);
                    }
                }
                jSONObject.put(Constants.KEY_EVT_NAME, obj);
                jSONObject.put(Constants.KEY_EVT_DATA, jSONObject2);
                this.baseEventQueueManager.queueEvent(this.context, jSONObject, 4);
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushInAppNotificationStateEvent(boolean z2, CTInAppNotification cTInAppNotification, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject wzrkFields = CTJsonConverter.getWzrkFields(cTInAppNotification);
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        wzrkFields.put(str, obj);
                    }
                }
            }
            if (z2) {
                try {
                    this.coreMetaData.setWzrkParams(wzrkFields);
                } catch (Throwable unused) {
                }
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_CLICKED_EVENT_NAME);
            } else {
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME);
            }
            jSONObject.put(Constants.KEY_EVT_DATA, wzrkFields);
            this.baseEventQueueManager.queueEvent(this.context, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    public void pushInboxMessageStateEvent(boolean z2, CTInboxMessage cTInboxMessage, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject wzrkFields = CTJsonConverter.getWzrkFields(cTInboxMessage);
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        wzrkFields.put(str, obj);
                    }
                }
            }
            if (z2) {
                try {
                    this.coreMetaData.setWzrkParams(wzrkFields);
                } catch (Throwable unused) {
                }
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_CLICKED_EVENT_NAME);
            } else {
                jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME);
            }
            jSONObject.put(Constants.KEY_EVT_DATA, wzrkFields);
            this.baseEventQueueManager.queueEvent(this.context, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushInstallReferrer(String str) {
        try {
            this.config.getLogger().verbose(this.config.getAccountId(), "Referrer received: " + str);
            if (str == null) {
                return;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (this.installReferrerMap.containsKey(str) && currentTimeMillis - this.installReferrerMap.get(str).intValue() < 10) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Skipping install referrer due to duplicate within 10 seconds");
            } else {
                this.installReferrerMap.put(str, Integer.valueOf(currentTimeMillis));
                pushDeepLink(Uri.parse("wzrk://track?install=true&".concat(str)), true);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushNotificationClickedEvent(Bundle bundle) {
        String str;
        if (this.config.isAnalyticsOnly()) {
            this.config.getLogger().debug(this.config.getAccountId(), "is Analytics Only - will not process Notification Clicked event.");
            return;
        }
        if (bundle != null && !bundle.isEmpty() && bundle.get("wzrk_pn") != null) {
            try {
                str = bundle.getString(Constants.WZRK_ACCT_ID_KEY);
            } catch (Throwable unused) {
                str = null;
            }
            if ((str == null && this.config.isDefaultInstance()) || this.config.getAccountId().equals(str)) {
                if (bundle.containsKey(Constants.INAPP_PREVIEW_PUSH_PAYLOAD_KEY)) {
                    handleInAppPreview(bundle);
                    return;
                }
                if (bundle.containsKey(Constants.INBOX_PREVIEW_PUSH_PAYLOAD_KEY)) {
                    handleInboxPreview(bundle);
                    return;
                }
                if (bundle.containsKey(Constants.DISPLAY_UNIT_PREVIEW_PUSH_PAYLOAD_KEY)) {
                    handleSendTestForDisplayUnits(bundle);
                    return;
                }
                if (bundle.containsKey(Constants.NOTIFICATION_ID_TAG) && bundle.getString(Constants.NOTIFICATION_ID_TAG) != null) {
                    if (checkDuplicateNotificationIds(dedupeCheckKey(bundle), this.notificationIdTagMap, 5000)) {
                        this.config.getLogger().debug(this.config.getAccountId(), "Already processed Notification Clicked event for " + bundle + ", dropping duplicate.");
                        return;
                    }
                    try {
                        this.baseEventQueueManager.queueEvent(this.context, AnalyticsManagerBundler.notificationClickedJson(bundle), 4);
                        this.coreMetaData.setWzrkParams(AnalyticsManagerBundler.wzrkBundleToJson(bundle));
                    } catch (Throwable unused2) {
                    }
                    if (this.callbackManager.getPushNotificationListener() != null) {
                        this.callbackManager.getPushNotificationListener().onNotificationClickedPayloadReceived(Utils.convertBundleObjectToHashMap(bundle));
                        return;
                    } else {
                        Logger.d("CTPushNotificationListener is not set");
                        return;
                    }
                }
                this.config.getLogger().debug(this.config.getAccountId(), "Push notification ID Tag is null, not processing Notification Clicked event for:  " + bundle);
                return;
            }
            this.config.getLogger().debug(this.config.getAccountId(), "Push notification not targeted at this instance, not processing Notification Clicked Event");
            return;
        }
        this.config.getLogger().debug(this.config.getAccountId(), "Push notification not from CleverTap - will not process Notification Clicked event.");
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushNotificationViewedEvent(Bundle bundle) {
        String bundle2;
        if (bundle != null && !bundle.isEmpty() && bundle.get("wzrk_pn") != null) {
            if (bundle.containsKey(Constants.NOTIFICATION_ID_TAG) && bundle.getString(Constants.NOTIFICATION_ID_TAG) != null) {
                if (checkDuplicateNotificationIds(dedupeCheckKey(bundle), this.notificationViewedIdTagMap, 2000)) {
                    this.config.getLogger().debug(this.config.getAccountId(), "Already processed Notification Viewed event for " + bundle + ", dropping duplicate.");
                    return;
                }
                this.config.getLogger().debug("Recording Notification Viewed event for notification:  " + bundle);
                this.baseEventQueueManager.queueEvent(this.context, AnalyticsManagerBundler.notificationViewedJson(bundle), 6);
                return;
            }
            this.config.getLogger().debug(this.config.getAccountId(), "Push notification ID Tag is null, not processing Notification Viewed event for:  " + bundle);
            return;
        }
        Logger logger = this.config.getLogger();
        String accountId = this.config.getAccountId();
        StringBuilder sb2 = new StringBuilder("Push notification: ");
        if (bundle == null) {
            bundle2 = "NULL";
        } else {
            bundle2 = bundle.toString();
        }
        sb2.append(bundle2);
        sb2.append(" not from CleverTap - will not process Notification Viewed event.");
        logger.debug(accountId, sb2.toString());
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void pushProfile(Map<String, Object> map) {
        if (map != null && !map.isEmpty() && this.deviceInfo.getDeviceID() != null) {
            this.executors.postAsyncSafelyTask().execute("profilePush", new c(2, this, map));
        }
    }

    public Future<?> raiseEventForGeofences(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Constants.KEY_EVT_NAME, str);
            jSONObject2.put(Constants.KEY_EVT_DATA, jSONObject);
            Location location = new Location("");
            location.setLatitude(jSONObject.getDouble("triggered_lat"));
            location.setLongitude(jSONObject.getDouble("triggered_lng"));
            jSONObject.remove("triggered_lat");
            jSONObject.remove("triggered_lng");
            this.coreMetaData.setLocationFromUser(location);
            return this.baseEventQueueManager.queueEvent(this.context, jSONObject2, 4);
        } catch (JSONException e) {
            Logger logger = this.config.getLogger();
            String accountId = this.config.getAccountId();
            StringBuilder victor = Q0.c.victor("Geofences : JSON Exception when raising GeoFence event ", str, " - ");
            victor.append(e.getLocalizedMessage());
            logger.debug(accountId, victor.toString());
            return null;
        }
    }

    public Future<?> raiseEventForSignedCall(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Constants.KEY_EVT_NAME, str);
            jSONObject2.put(Constants.KEY_EVT_DATA, jSONObject);
            return this.baseEventQueueManager.queueEvent(this.context, jSONObject2, 4);
        } catch (JSONException e) {
            Logger logger = this.config.getLogger();
            String accountId = this.config.getAccountId();
            StringBuilder victor = Q0.c.victor("SignedCall : JSON Exception when raising Signed Call event ", str, " - ");
            victor.append(e.getLocalizedMessage());
            logger.debug(accountId, victor.toString());
            return null;
        }
    }

    public void recordPageEventWithExtras(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.getString(next));
                    } catch (ClassCastException unused) {
                    }
                }
            }
            this.baseEventQueueManager.queueEvent(this.context, jSONObject2, 1);
        } catch (Throwable unused2) {
        }
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void removeMultiValuesForKey(String str, ArrayList<String> arrayList) {
        this.executors.postAsyncSafelyTask().execute("removeMultiValuesForKey", new e(this, arrayList, str, 0));
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void removeValueForKey(String str) {
        this.executors.postAsyncSafelyTask().execute("removeValueForKey", new c(1, this, str));
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void sendDataEvent(JSONObject jSONObject) {
        this.baseEventQueueManager.queueEvent(this.context, jSONObject, 5);
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public void sendFetchEvent(JSONObject jSONObject) {
        this.baseEventQueueManager.queueEvent(this.context, jSONObject, 7);
    }

    public void sendPingEvent(JSONObject jSONObject) {
        this.baseEventQueueManager.queueEvent(this.context, jSONObject, 2);
    }

    public void setMultiValuesForKey(String str, ArrayList<String> arrayList) {
        this.executors.postAsyncSafelyTask().execute("setMultiValuesForKey", new e(this, arrayList, str, 1));
    }

    public String wrapImageInterstitialContent(String str) {
        try {
            String readAssetFile = Utils.readAssetFile(this.context, Constants.INAPP_IMAGE_INTERSTITIAL_HTML_NAME);
            if (readAssetFile != null && str != null) {
                String[] split = readAssetFile.split(Constants.INAPP_HTML_SPLIT);
                if (split.length == 2) {
                    return split[0] + str + split[1];
                }
                return null;
            }
            return null;
        } catch (IOException unused) {
            this.config.getLogger().debug(this.config.getAccountId(), "Failed to read the image-interstitial HTML file");
            return null;
        }
    }

    @Override // com.clevertap.android.sdk.BaseAnalyticsManager
    public synchronized void pushInstallReferrer(String str, String str2, String str3) {
        if (str == null && str2 == null && str3 == null) {
            return;
        }
        try {
        } finally {
        }
        if (StorageHelper.getInt(this.context, "app_install_status", 0) != 0) {
            Logger.d("Install referrer has already been set. Will not override it");
            return;
        }
        StorageHelper.putInt(this.context, "app_install_status", 1);
        if (str != null) {
            str = Uri.encode(str);
        }
        if (str2 != null) {
            str2 = Uri.encode(str2);
        }
        if (str3 != null) {
            str3 = Uri.encode(str3);
        }
        String str4 = "wzrk://track?install=true";
        if (str != null) {
            str4 = "wzrk://track?install=true&utm_source=".concat(str);
        }
        if (str2 != null) {
            str4 = str4 + "&utm_medium=" + str2;
        }
        if (str3 != null) {
            str4 = str4 + "&utm_campaign=" + str3;
        }
        pushDeepLink(Uri.parse(str4), true);
    }
}
