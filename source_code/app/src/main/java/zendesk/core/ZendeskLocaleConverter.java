package zendesk.core;

import com.zendesk.util.StringUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class ZendeskLocaleConverter {
    private static final Map<String, String> forwardLookupMap;

    static {
        HashMap hashMap = new HashMap();
        forwardLookupMap = hashMap;
        hashMap.put("iw", "he");
        hashMap.put("nb", "no");
        hashMap.put("in", com.clevertap.android.sdk.Constants.KEY_ID);
        hashMap.put("ji", "yi");
    }

    public String toHelpCenterLocaleString(Locale locale) {
        if (locale == null || !StringUtils.hasLength(locale.getLanguage())) {
            locale = Locale.getDefault();
        }
        String str = forwardLookupMap.get(locale.getLanguage());
        if (!StringUtils.hasLength(str)) {
            str = locale.getLanguage();
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (StringUtils.hasLength(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        return sb2.toString().toLowerCase();
    }
}
