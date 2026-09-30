package com.clevertap.android.sdk.login;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class IdentitySet {
    private final HashSet<String> identities;

    private IdentitySet(String[] strArr) {
        this.identities = new HashSet<>();
        init(strArr);
    }

    public static IdentitySet from(String str) {
        return new IdentitySet(str.split(Constants.SEPARATOR_COMMA));
    }

    public static IdentitySet getDefault() {
        return new IdentitySet(Constants.LEGACY_IDENTITY_KEYS);
    }

    private void init(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                if (Utils.containsIgnoreCase(Constants.ALL_IDENTITY_KEYS, str)) {
                    this.identities.add(Utils.convertToTitleCase(str));
                }
            }
        }
    }

    public boolean contains(String str) {
        return Utils.containsIgnoreCase(this.identities, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.identities.equals(((IdentitySet) obj).identities);
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isValid() {
        return !this.identities.isEmpty();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.identities.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (Constants.ALL_IDENTITY_KEYS.contains(next)) {
                sb2.append(next);
                if (it.hasNext()) {
                    str = Constants.SEPARATOR_COMMA;
                } else {
                    str = "";
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static IdentitySet from(String[] strArr) {
        return new IdentitySet(strArr);
    }

    private IdentitySet(HashSet<String> hashSet) {
        HashSet<String> hashSet2 = new HashSet<>();
        this.identities = hashSet2;
        hashSet2.addAll(hashSet);
    }
}
