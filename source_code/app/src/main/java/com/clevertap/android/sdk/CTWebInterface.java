package com.clevertap.android.sdk;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import ao.ad;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CTWebInterface {
    private WeakReference<CleverTapAPI> cleverTapWr;
    private WeakReference<CTInAppBaseFragment> fragmentWr;

    public CTWebInterface(CleverTapAPI cleverTapAPI) {
        CoreState coreState;
        this.cleverTapWr = new WeakReference<>(null);
        this.fragmentWr = new WeakReference<>(null);
        WeakReference<CleverTapAPI> weakReference = new WeakReference<>(cleverTapAPI);
        this.cleverTapWr = weakReference;
        CleverTapAPI cleverTapAPI2 = weakReference.get();
        if (cleverTapAPI2 == null || (coreState = cleverTapAPI2.getCoreState()) == null) {
            return;
        }
        coreState.getCoreMetaData().setWebInterfaceInitializedExternally(true);
    }

    @JavascriptInterface
    public void addMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.addMultiValueForKey(str, str2);
        }
    }

    @JavascriptInterface
    public void addMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.v("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 != null) {
            try {
                cleverTapAPI.addMultiValuesForKey(str, Utils.convertJSONArrayToArrayList(new JSONArray(str2)));
                return;
            } catch (JSONException e) {
                ad.emerald(e, new StringBuilder("Unable to parse values from WebView "));
                return;
            }
        }
        Logger.v("values passed to CTWebInterface is null");
    }

    @JavascriptInterface
    public void decrementValue(String str, double d4) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.decrementValue(str, Double.valueOf(d4));
        }
    }

    @JavascriptInterface
    public void dismissInAppNotification() {
        if (this.cleverTapWr.get() == null) {
            Logger.d("CleverTap Instance is null.");
            return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = this.fragmentWr.get();
        if (cTInAppBaseFragment != null) {
            cTInAppBaseFragment.didDismiss(null);
        }
    }

    @JavascriptInterface
    public int getSdkVersion() {
        return BuildConfig.VERSION_CODE;
    }

    @JavascriptInterface
    public void incrementValue(String str, double d4) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.incrementValue(str, Double.valueOf(d4));
        }
    }

    @JavascriptInterface
    public void onUserLogin(String str) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
            return;
        }
        if (str != null) {
            try {
                cleverTapAPI.onUserLogin(Utils.convertJSONObjectToHashMap(new JSONObject(str)));
                return;
            } catch (JSONException e) {
                ad.emerald(e, new StringBuilder("Unable to parse profile from WebView "));
                return;
            }
        }
        Logger.v("profile passed to CTWebInterface is null");
    }

    @JavascriptInterface
    public void promptPushPermission(boolean z2) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
        } else {
            dismissInAppNotification();
            cleverTapAPI.promptForPushPermission(z2);
        }
    }

    @JavascriptInterface
    public void pushChargedEvent(String str, String str2) {
        ArrayList<HashMap<String, Object>> arrayList;
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (str != null) {
            try {
                hashMap = Utils.convertJSONObjectToHashMap(new JSONObject(str));
            } catch (JSONException e) {
                ad.emerald(e, new StringBuilder("Unable to parse chargeDetails for Charged Event from WebView "));
            }
            if (str2 != null) {
                try {
                    arrayList = Utils.convertJSONArrayOfJSONObjectsToArrayListOfHashMaps(new JSONArray(str2));
                } catch (JSONException e4) {
                    ad.emerald(e4, new StringBuilder("Unable to parse items for Charged Event from WebView "));
                    arrayList = null;
                }
                cleverTapAPI.pushChargedEvent(hashMap, arrayList);
                return;
            }
            return;
        }
        Logger.v("chargeDetails passed to CTWebInterface is null");
    }

    @JavascriptInterface
    public void pushEvent(String str) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
        } else {
            cleverTapAPI.pushEvent(str);
        }
    }

    @JavascriptInterface
    public void pushProfile(String str) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
            return;
        }
        if (str != null) {
            try {
                cleverTapAPI.pushProfile(Utils.convertJSONObjectToHashMap(new JSONObject(str)));
                return;
            } catch (JSONException e) {
                ad.emerald(e, new StringBuilder("Unable to parse profile from WebView "));
                return;
            }
        }
        Logger.v("profile passed to CTWebInterface is null");
    }

    @JavascriptInterface
    public void removeMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.v("Key passed to CTWebInterface is null");
        } else if (str2 == null) {
            Logger.v("Value passed to CTWebInterface is null");
        } else {
            cleverTapAPI.removeMultiValueForKey(str, str2);
        }
    }

    @JavascriptInterface
    public void removeMultiValuesForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.v("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 != null) {
            try {
                cleverTapAPI.removeMultiValuesForKey(str, Utils.convertJSONArrayToArrayList(new JSONArray(str2)));
                return;
            } catch (JSONException e) {
                ad.emerald(e, new StringBuilder("Unable to parse values from WebView "));
                return;
            }
        }
        Logger.v("values passed to CTWebInterface is null");
    }

    @JavascriptInterface
    public void removeValueForKey(String str) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
        } else if (str == null) {
            Logger.v("Key passed to CTWebInterface is null");
        } else {
            cleverTapAPI.removeValueForKey(str);
        }
    }

    @JavascriptInterface
    public void setMultiValueForKey(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
            return;
        }
        if (str == null) {
            Logger.v("Key passed to CTWebInterface is null");
            return;
        }
        if (str2 != null) {
            try {
                cleverTapAPI.setMultiValuesForKey(str, Utils.convertJSONArrayToArrayList(new JSONArray(str2)));
                return;
            } catch (JSONException e) {
                ad.emerald(e, new StringBuilder("Unable to parse values from WebView "));
                return;
            }
        }
        Logger.v("values passed to CTWebInterface is null");
    }

    @JavascriptInterface
    public void triggerInAppAction(String str, String str2, String str3) {
        if (this.cleverTapWr.get() == null) {
            Logger.d("CTWebInterface CleverTap Instance is null.");
            return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = this.fragmentWr.get();
        if (cTInAppBaseFragment == null) {
            Logger.d("CTWebInterface Fragment is null");
            return;
        }
        if (str == null) {
            Logger.d("CTWebInterface action JSON is null");
            return;
        }
        try {
            CTInAppAction createFromJson = CTInAppAction.createFromJson(new JSONObject(str));
            if (createFromJson == null) {
                Logger.d("CTWebInterface invalid action JSON: ".concat(str));
                return;
            }
            Bundle bundle = new Bundle();
            if (str3 != null) {
                bundle.putString("button_id", str3);
            }
            cTInAppBaseFragment.triggerAction(createFromJson, str2, bundle);
        } catch (JSONException unused) {
            Logger.d("CTWebInterface invalid action JSON: ".concat(str));
        }
    }

    @JavascriptInterface
    public void pushEvent(String str, String str2) {
        CleverTapAPI cleverTapAPI = this.cleverTapWr.get();
        if (cleverTapAPI == null) {
            Logger.d("CleverTap Instance is null.");
            return;
        }
        if (str2 != null) {
            try {
                cleverTapAPI.pushEvent(str, Utils.convertJSONObjectToHashMap(new JSONObject(str2)));
                return;
            } catch (JSONException e) {
                ad.emerald(e, new StringBuilder("Unable to parse eventActions from WebView "));
                return;
            }
        }
        Logger.v("eventActions passed to CTWebInterface is null");
    }

    public CTWebInterface(CleverTapAPI cleverTapAPI, CTInAppBaseFragment cTInAppBaseFragment) {
        this.cleverTapWr = new WeakReference<>(null);
        this.fragmentWr = new WeakReference<>(null);
        this.cleverTapWr = new WeakReference<>(cleverTapAPI);
        this.fragmentWr = new WeakReference<>(cTInAppBaseFragment);
    }
}
