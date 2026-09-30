package com.google.firebase.messaging;

import android.util.Log;
import ao.ad;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class s {
    public static final Pattern delta = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String alpha;
    public final String bravo;
    public final String charlie;

    public s(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && delta.matcher(str3).matches()) {
            this.alpha = str3;
            this.bravo = str;
            this.charlie = ad.amber(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(ad.gray("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.alpha.equals(sVar.alpha) || !this.bravo.equals(sVar.bravo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.bravo, this.alpha});
    }
}
