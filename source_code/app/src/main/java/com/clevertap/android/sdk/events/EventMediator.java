package com.clevertap.android.sdk.events;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.LocalDataStore;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ProfileValueHandler;
import com.clevertap.android.sdk.network.NetworkRepo;
import com.clevertap.android.sdk.validation.Validator;
import com.clevertap.android.sdk.variables.JsonUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class EventMediator {
    private final CoreMetaData cleverTapMetaData;
    private final CleverTapInstanceConfig config;
    private final LocalDataStore localDataStore;
    private final NetworkRepo networkRepo;
    private final ProfileValueHandler profileValueHandler;

    public EventMediator(CleverTapInstanceConfig cleverTapInstanceConfig, CoreMetaData coreMetaData, LocalDataStore localDataStore, ProfileValueHandler profileValueHandler, NetworkRepo networkRepo) {
        this.config = cleverTapInstanceConfig;
        this.localDataStore = localDataStore;
        this.networkRepo = networkRepo;
        this.profileValueHandler = profileValueHandler;
        this.cleverTapMetaData = coreMetaData;
    }

    public Map<String, Map<String, Object>> computeUserAttributeChangeProperties(JSONObject jSONObject) {
        char c3;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.PROFILE);
        if (optJSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (!Constants.keysToSkipForUserAttributesEvaluation.contains(next)) {
                    Object profileProperty = this.localDataStore.getProfileProperty(next);
                    Object obj = optJSONObject.get(next);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String next2 = jSONObject2.keys().next();
                        switch (next2.hashCode()) {
                            case 1168893:
                                if (next2.equals(Constants.COMMAND_ADD)) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case 1186238:
                                if (next2.equals(Constants.COMMAND_SET)) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case 36326100:
                                if (next2.equals(Constants.COMMAND_DECREMENT)) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 36483704:
                                if (next2.equals(Constants.COMMAND_INCREMENT)) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 549903055:
                                if (next2.equals(Constants.COMMAND_DELETE)) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 950750632:
                                if (next2.equals(Constants.COMMAND_REMOVE)) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                        }
                        c3 = 65535;
                        if (c3 != 0 && c3 != 1) {
                            if (c3 != 2) {
                                if (c3 == 3 || c3 == 4 || c3 == 5) {
                                    obj = this.profileValueHandler.handleMultiValues(next, (JSONArray) jSONObject2.get(next2), next2, profileProperty);
                                }
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = this.profileValueHandler.handleIncrementDecrementValues((Number) jSONObject2.get(next2), next2, (Number) profileProperty);
                        }
                    } else if ((obj instanceof String) && ((String) obj).startsWith(Constants.DATE_PREFIX)) {
                        obj = Long.valueOf(Long.parseLong(((String) obj).substring(3)));
                    }
                    HashMap hashMap3 = new HashMap();
                    if (profileProperty != null && !(profileProperty instanceof JSONArray)) {
                        hashMap3.put(Constants.KEY_OLD_VALUE, profileProperty);
                    }
                    if (obj != null && !(obj instanceof JSONArray)) {
                        hashMap3.put(Constants.KEY_NEW_VALUE, obj);
                    }
                    if (!hashMap3.isEmpty()) {
                        hashMap.put(next, hashMap3);
                    }
                    hashMap2.put(next, obj);
                }
            } catch (JSONException e) {
                this.config.getLogger().debug(this.config.getAccountId(), "Error getting user attribute changes for key: " + next + e);
            }
        }
        this.localDataStore.updateProfileFields(hashMap2);
        return hashMap;
    }

    public Map<String, Object> getChargedEventDetails(JSONObject jSONObject) {
        try {
            Object remove = jSONObject.getJSONObject(Constants.KEY_EVT_DATA).remove(Constants.KEY_ITEMS);
            Map<String, Object> mapFromJson = JsonUtil.mapFromJson(jSONObject.getJSONObject(Constants.KEY_EVT_DATA));
            jSONObject.getJSONObject(Constants.KEY_EVT_DATA).put(Constants.KEY_ITEMS, remove);
            return mapFromJson;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public List<Map<String, Object>> getChargedEventItemDetails(JSONObject jSONObject) {
        try {
            return JsonUtil.listFromJson(jSONObject.getJSONObject(Constants.KEY_EVT_DATA).getJSONArray(Constants.KEY_ITEMS));
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public String getEventName(JSONObject jSONObject) {
        try {
            return jSONObject.getString(Constants.KEY_EVT_NAME);
        } catch (JSONException unused) {
            return null;
        }
    }

    public Map<String, Object> getEventProperties(JSONObject jSONObject) {
        if (jSONObject.has(Constants.KEY_EVT_NAME) && jSONObject.has(Constants.KEY_EVT_DATA)) {
            try {
                return JsonUtil.mapFromJson(jSONObject.getJSONObject(Constants.KEY_EVT_DATA));
            } catch (JSONException e) {
                Logger.v("Could not convert JSONObject to Map - " + e.getMessage());
            }
        }
        return new HashMap();
    }

    public boolean isAppLaunchedEvent(JSONObject jSONObject) {
        try {
            if (jSONObject.has(Constants.KEY_EVT_NAME)) {
                if (jSONObject.getString(Constants.KEY_EVT_NAME).equals(Constants.APP_LAUNCHED_EVENT)) {
                    return true;
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public boolean isChargedEvent(JSONObject jSONObject) {
        try {
            if (jSONObject.has(Constants.KEY_EVT_NAME)) {
                if (jSONObject.getString(Constants.KEY_EVT_NAME).equals(Constants.CHARGED_EVENT)) {
                    return true;
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public boolean isEvent(JSONObject jSONObject) {
        return jSONObject.has(Constants.KEY_EVT_NAME);
    }

    public boolean shouldDeferProcessingEvent(JSONObject jSONObject, int i4) {
        if (i4 == 8 || this.config.isCreatedPostAppLaunch()) {
            return false;
        }
        if (jSONObject.has(Constants.KEY_EVT_NAME)) {
            try {
                if (Arrays.asList(Constants.SYSTEM_EVENTS).contains(jSONObject.getString(Constants.KEY_EVT_NAME))) {
                    return false;
                }
            } catch (JSONException unused) {
            }
        }
        if (i4 != 4 || this.cleverTapMetaData.isAppLaunchPushed()) {
            return false;
        }
        return true;
    }

    public boolean shouldDropEvent(JSONObject jSONObject, int i4) {
        String str;
        if (i4 == 7 || i4 == 8) {
            return false;
        }
        if (this.networkRepo.isMuted()) {
            this.config.getLogger().verbose(this.config.getAccountId(), "CleverTap is muted, dropping event - " + jSONObject.toString());
            return true;
        }
        if (!this.cleverTapMetaData.isCurrentUserOptedOut()) {
            return false;
        }
        if (!this.cleverTapMetaData.getEnabledSystemEvents()) {
            this.config.getLogger().debug(this.config.getAccountId(), "Current user is opted out dropping event: " + jSONObject);
            return true;
        }
        if (i4 != 4 && i4 != 6) {
            this.config.getLogger().debug(this.config.getAccountId(), "This is not RAISED_EVENT or NV_EVENT, not dropping event: " + jSONObject);
            return false;
        }
        if (jSONObject != null) {
            str = getEventName(jSONObject);
        } else {
            str = null;
        }
        boolean contains = Arrays.asList(Validator.restrictedNames).contains(str);
        boolean z2 = !contains;
        if (!contains) {
            this.config.getLogger().debug(this.config.getAccountId(), "Current user is opted out dropping event: " + jSONObject);
            return z2;
        }
        this.config.getLogger().debug(this.config.getAccountId(), "This is a system event, not dropping event: " + jSONObject);
        return z2;
    }
}
