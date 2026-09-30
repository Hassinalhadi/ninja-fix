package com.checkout.components.redirecthandler.customtab;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00062\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/RedirectActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "handleRedirectIntent", "(Landroid/content/Intent;)V", "Landroid/net/Uri;", "uri", "", "isValidRedirectUri", "(Landroid/net/Uri;)Z", "Ljava/lang/Class;", "callerClass", "bringCallerToForeground", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "Companion", "com/checkout/components/redirecthandler/a", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectActivity extends Activity {

    @NotNull
    private static final com.checkout.components.redirecthandler.a Companion = new com.checkout.components.redirecthandler.a();

    @Deprecated
    @NotNull
    public static final String DROP_REASON_INVALID_FORMAT = "invalid_uri_format";

    @Deprecated
    @NotNull
    public static final String DROP_REASON_NULL_URI = "null_uri";

    private final void bringCallerToForeground(Class<? extends Activity> callerClass) {
        if (callerClass == null) {
            return;
        }
        Intent intent = new Intent(this, callerClass);
        intent.addFlags(603979776);
        startActivity(intent);
    }

    private final void handleRedirectIntent(Intent intent) {
        RedirectContract redirectContract = RedirectContract.INSTANCE;
        if (!redirectContract.hasHandler()) {
            finish();
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            redirectContract.notifyRedirectDropped(DROP_REASON_NULL_URI);
            finish();
        } else {
            if (!isValidRedirectUri(data)) {
                redirectContract.notifyRedirectDropped(DROP_REASON_INVALID_FORMAT);
                finish();
                return;
            }
            Class<? extends Activity> callerActivityClass = redirectContract.getCallerActivityClass();
            String uri = data.toString();
            Intrinsics.delta(uri, "toString(...)");
            redirectContract.deliverResult(uri);
            bringCallerToForeground(callerActivityClass);
            finish();
        }
    }

    private final boolean isValidRedirectUri(Uri uri) {
        if (Intrinsics.areEqual(uri.getScheme(), RedirectConfig.SCHEME) && Intrinsics.areEqual(uri.getHost(), RedirectConfig.HOST)) {
            if (Intrinsics.areEqual(uri.getPath(), "/" + getPackageName())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.delta(intent, "getIntent(...)");
        handleRedirectIntent(intent);
    }

    @Override // android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            setIntent(intent);
            handleRedirectIntent(intent);
        }
    }
}
