package com.zendesk.util;

import com.clevertap.android.sdk.Constants;
import com.zendesk.logger.Logger;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public class LocaleUtil {
    private static final String LOG_TAG = "LocaleUtil";
    private static final List<String> NEW_ISO_CODES = Arrays.asList("he", "yi", Constants.KEY_ID);

    private LocaleUtil() {
    }

    private static Locale createIso639Alpha3LocaleAndroid(String str, String str2) {
        try {
            Constructor declaredConstructor = Locale.class.getDeclaredConstructor(Boolean.TYPE, String.class, String.class);
            declaredConstructor.setAccessible(true);
            return (Locale) declaredConstructor.newInstance(Boolean.TRUE, str, str2);
        } catch (Exception e) {
            Logger.e(LOG_TAG, "Unable to create ISO-6390-Alpha3 per reflection", e, new Object[0]);
            return null;
        }
    }

    private static Locale createIso639Alpha3LocaleJdk(String str, String str2) {
        try {
            Method declaredMethod = Locale.class.getDeclaredMethod("createConstant", String.class, String.class);
            declaredMethod.setAccessible(true);
            return (Locale) declaredMethod.invoke(null, str, str2);
        } catch (Exception e) {
            Logger.e(LOG_TAG, "Unable to create ISO-6390-Alpha3 per reflection", e, new Object[0]);
            return null;
        }
    }

    public static Locale forLanguageTag(String str) {
        String str2;
        String str3 = LOG_TAG;
        Logger.d(str3, "Assuming Locale.getDefault()", new Object[0]);
        Locale locale = Locale.getDefault();
        if (StringUtils.hasLength(str)) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
            int countTokens = stringTokenizer.countTokens();
            int i4 = 2;
            if (countTokens != 1 && countTokens != 2) {
                Logger.w(str3, "Unexpected number of tokens, must be at least one and at most two", new Object[0]);
                return locale;
            }
            if (countTokens != 1) {
                i4 = 5;
            }
            if (i4 != str.length()) {
                Logger.d(str3, "number of tokens is correct but the length of the locale string does not match the expected length", new Object[0]);
                return locale;
            }
            String nextToken = stringTokenizer.nextToken();
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = "";
            }
            String upperCase = str2.toUpperCase(Locale.US);
            if (NEW_ISO_CODES.contains(nextToken)) {
                Logger.d(str3, "New ISO-6390-Alpha3 locale detected trying to create new locale per reflection", new Object[0]);
                Locale createIso639Alpha3LocaleJdk = createIso639Alpha3LocaleJdk(nextToken, upperCase);
                if (createIso639Alpha3LocaleJdk == null) {
                    createIso639Alpha3LocaleJdk = createIso639Alpha3LocaleAndroid(nextToken, upperCase);
                }
                if (createIso639Alpha3LocaleJdk == null) {
                    return new Locale(nextToken, upperCase);
                }
                return createIso639Alpha3LocaleJdk;
            }
            return new Locale(nextToken, upperCase);
        }
        return locale;
    }

    public static String toLanguageTag(Locale locale) {
        if (locale != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(locale.getLanguage());
            if (StringUtils.hasLength(locale.getCountry())) {
                sb2.append("-");
                sb2.append(locale.getCountry().toLowerCase(Locale.US));
            }
            return sb2.toString();
        }
        return null;
    }
}
