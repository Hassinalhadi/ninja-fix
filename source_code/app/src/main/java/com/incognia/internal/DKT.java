package com.incognia.internal;

import android.content.Context;
import android.util.Log;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class DKT {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f8529b = new AtomicReference();

    public DKT(GZq gZq, Context context, vY vYVar) {
        Properties properties;
        if (vYVar == null) {
            try {
                InputStream open = context.getAssets().open("incognia.properties");
                properties = new Properties();
                properties.load(open);
            } catch (Throwable unused) {
                properties = null;
            }
            if (properties == null) {
                vYVar = null;
            } else {
                Object obj = properties.get("APP_ID");
                vYVar = new vY(obj != null ? obj.toString() : null, Boolean.parseBoolean(properties.getProperty("LOG_ENABLED", "false")), Boolean.parseBoolean(properties.getProperty("LOCATION_ENABLED", "true")), Boolean.parseBoolean(properties.getProperty("INSTALLED_APPS_COLLECTION_ENABLED", "false")), true);
            }
            if (vYVar == null) {
                vY vYVar2 = new vY((String) null, false, false, false, 30);
                if (eSs.f10363b.get()) {
                    Log.e("Incognia", "No Incognia options were provided, Incognia's SDK will not work at all");
                }
                vYVar = vYVar2;
            }
        }
        this.f8529b.set(vYVar);
    }
}
