package com.clevertap.android.sdk.product_config;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
class DefaultXmlParser {
    private static final String XML_TAG_ENTRY = "entry";
    private static final String XML_TAG_KEY = "key";
    private static final int XML_TAG_TYPE_KEY = 0;
    private static final int XML_TAG_TYPE_VALUE = 1;
    private static final String XML_TAG_VALUE = "value";

    public HashMap<String, String> getDefaultsFromXml(Context context, int i4) {
        HashMap<String, String> hashMap = new HashMap<>();
        getDefaultsFromXml(context.getResources(), i4, hashMap);
        return hashMap;
    }

    public void getDefaultsFromXmlParser(XmlResourceParser xmlResourceParser, HashMap<String, String> hashMap) throws XmlPullParserException, IOException {
        char c3;
        int eventType = xmlResourceParser.getEventType();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (eventType != 1) {
            if (eventType == 2) {
                str2 = xmlResourceParser.getName();
            } else if (eventType != 3) {
                if (eventType == 4 && str2 != null) {
                    if (!str2.equals("key")) {
                        if (!str2.equals("value")) {
                            c3 = 65535;
                        } else {
                            c3 = 1;
                        }
                    } else {
                        c3 = 0;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            Log.w(Constants.LOG_TAG_PRODUCT_CONFIG, "Encountered an unexpected tag while parsing the defaults XML.");
                        } else {
                            str3 = xmlResourceParser.getText();
                        }
                    } else {
                        str = xmlResourceParser.getText();
                    }
                }
            } else {
                if (xmlResourceParser.getName().equals(XML_TAG_ENTRY)) {
                    if (str != null && str3 != null) {
                        hashMap.put(str, str3);
                    } else {
                        Log.w(Constants.LOG_TAG_PRODUCT_CONFIG, "An entry in the defaults XML has an invalid key and/or value tag.");
                    }
                    str = null;
                    str3 = null;
                }
                str2 = null;
            }
            eventType = xmlResourceParser.next();
        }
    }

    public void getDefaultsFromXml(Resources resources, int i4, HashMap<String, String> hashMap) {
        if (resources == null) {
            Log.e("ProductConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            return;
        }
        try {
            getDefaultsFromXmlParser(resources.getXml(i4), hashMap);
        } catch (Exception e) {
            Log.e("ProductConfig", "Encountered an error while parsing the defaults XML file.", e);
        }
    }
}
