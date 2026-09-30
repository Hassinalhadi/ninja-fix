package com.clevertap.android.sdk.login;

import android.content.Context;
import android.text.TextUtils;
import ao.ad;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.StorageHelper;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.utils.CTJsonConverter;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class LoginInfoProvider {
    private final CleverTapInstanceConfig config;
    private final Context context;
    private CryptHandler cryptHandler;

    public LoginInfoProvider(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, CryptHandler cryptHandler) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.cryptHandler = cryptHandler;
    }

    private String getCachedGUIDStringFromPrefs() {
        String stringFromPrefs = StorageHelper.getStringFromPrefs(this.context, this.config, Constants.CACHED_GUIDS_KEY, null);
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "getCachedGUIDs:[" + stringFromPrefs + Constants.AES_SUFFIX);
        return stringFromPrefs;
    }

    private int getCachedGuidsLength() {
        int i4 = StorageHelper.getInt(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), Constants.CACHED_GUIDS_LENGTH_KEY), 0);
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "Retrieved size of cachedGUIDs: " + i4);
        return i4;
    }

    private void storeCachedGuidsLength(int i4) {
        StorageHelper.putInt(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), Constants.CACHED_GUIDS_LENGTH_KEY), i4);
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "Storing size of cachedGUIDs: " + i4);
    }

    public void cacheGUIDForIdentifier(String str, String str2, String str3) {
        if (str != null && str2 != null && str3 != null) {
            String amber = ad.amber(str2, "_", str3);
            JSONObject decryptedCachedGUIDs = getDecryptedCachedGUIDs();
            if (!decryptedCachedGUIDs.optString(amber).equals(str)) {
                try {
                    decryptedCachedGUIDs.put(amber, str);
                    String encrypt = this.cryptHandler.encrypt(decryptedCachedGUIDs.toString(), str2, CryptHandler.EncryptionAlgorithm.AES_GCM);
                    if (encrypt == null) {
                        encrypt = decryptedCachedGUIDs.toString();
                        this.cryptHandler.updateMigrationFailureCount(false);
                    }
                    setCachedGUIDsAndLength(encrypt, decryptedCachedGUIDs.length());
                } catch (Throwable th) {
                    this.config.getLogger().verbose(this.config.getAccountId(), "Error caching guid: " + th);
                }
            }
        }
    }

    public boolean deviceIsMultiUser() {
        boolean z2 = true;
        if (getCachedGuidsLength() <= 1) {
            z2 = false;
        }
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "deviceIsMultiUser:[" + z2 + Constants.AES_SUFFIX);
        return z2;
    }

    public String getCachedIdentityKeysForAccount() {
        String stringFromPrefs = StorageHelper.getStringFromPrefs(this.context, this.config, Constants.SP_KEY_PROFILE_IDENTITIES, "");
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "getCachedIdentityKeysForAccount:" + stringFromPrefs);
        return stringFromPrefs;
    }

    public JSONObject getDecryptedCachedGUIDs() {
        String cachedGUIDStringFromPrefs = getCachedGUIDStringFromPrefs();
        if (cachedGUIDStringFromPrefs != null) {
            cachedGUIDStringFromPrefs = this.cryptHandler.decrypt(cachedGUIDStringFromPrefs, Constants.KEY_ENCRYPTION_CGK, CryptHandler.EncryptionAlgorithm.AES_GCM);
        }
        return CTJsonConverter.toJsonObject(cachedGUIDStringFromPrefs, this.config.getLogger(), this.config.getAccountId());
    }

    public String getGUIDForIdentifier(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                String string = getDecryptedCachedGUIDs().getString(ad.amber(str, "_", str2));
                this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "getGUIDForIdentifier:[Key:" + str + ", value:" + string + Constants.AES_SUFFIX);
                return string;
            } catch (Throwable th) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Error reading guid cache: " + th);
            }
        }
        return null;
    }

    public boolean isAnonymousDevice() {
        boolean z2;
        if (getCachedGuidsLength() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "isAnonymousDevice:[" + z2 + Constants.AES_SUFFIX);
        return z2;
    }

    public boolean isLegacyProfileLoggedIn() {
        boolean z2;
        if (getCachedGuidsLength() > 0 && TextUtils.isEmpty(getCachedIdentityKeysForAccount())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "isLegacyProfileLoggedIn:" + z2);
        return z2;
    }

    public void removeCachedGuidFromSharedPrefs() {
        try {
            StorageHelper.remove(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), Constants.CACHED_GUIDS_KEY));
            this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "removeCachedGUIDs:[]");
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Error removing guid cache: " + th);
        }
    }

    public void removeValueFromCachedGUIDForIdentifier(String str, String str2) {
        if (str != null && str2 != null) {
            JSONObject decryptedCachedGUIDs = getDecryptedCachedGUIDs();
            try {
                Iterator<String> keys = decryptedCachedGUIDs.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.toLowerCase().contains(str2.toLowerCase()) && decryptedCachedGUIDs.getString(next).equals(str)) {
                        decryptedCachedGUIDs.remove(next);
                        setCachedGUIDsAndLength(decryptedCachedGUIDs.toString(), decryptedCachedGUIDs.length());
                    }
                }
            } catch (Throwable th) {
                this.config.getLogger().verbose(this.config.getAccountId(), "Error removing cached key: " + th);
            }
        }
    }

    public void saveIdentityKeysForAccount(String str) {
        StorageHelper.putString(this.context, this.config, Constants.SP_KEY_PROFILE_IDENTITIES, str);
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "saveIdentityKeysForAccount:" + str);
    }

    public void setCachedGUIDsAndLength(String str, int i4) {
        if (str == null) {
            return;
        }
        storeCachedGuidsLength(i4);
        if (i4 == 0) {
            removeCachedGuidFromSharedPrefs();
            return;
        }
        StorageHelper.putString(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), Constants.CACHED_GUIDS_KEY), str);
        this.config.log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "setCachedGUIDs:[" + str + Constants.AES_SUFFIX);
    }

    public LoginInfoProvider(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
    }
}
