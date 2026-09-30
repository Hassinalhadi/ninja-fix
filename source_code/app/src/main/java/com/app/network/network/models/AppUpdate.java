package com.app.network.network.models;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/app/network/network/models/AppUpdate;", "", "<init>", "()V", "updateAction", "Lcom/app/network/network/models/UpdateActions;", "getUpdateAction", "()Lcom/app/network/network/models/UpdateActions;", "setUpdateAction", "(Lcom/app/network/network/models/UpdateActions;)V", "storeUrl", "", "getStoreUrl", "()Ljava/lang/String;", "setStoreUrl", "(Ljava/lang/String;)V", Constants.KEY_TITLE, "getTitle", "setTitle", Constants.KEY_MESSAGE, "getMessage", "setMessage", "updateButtonTitle", "getUpdateButtonTitle", "setUpdateButtonTitle", "skipButtonTitle", "getSkipButtonTitle", "setSkipButtonTitle", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppUpdate {
    private String message;
    private String skipButtonTitle;
    private String storeUrl;
    private String title;
    private UpdateActions updateAction;
    private String updateButtonTitle;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(114, AppUpdate.class);
        Hidden0.special_clinit_114_00(AppUpdate.class);
    }

    public final native String getMessage();

    public final native String getSkipButtonTitle();

    public final native String getStoreUrl();

    public final native String getTitle();

    public final native UpdateActions getUpdateAction();

    public final native String getUpdateButtonTitle();

    public final native void setMessage(String str);

    public final native void setSkipButtonTitle(String str);

    public final native void setStoreUrl(String str);

    public final native void setTitle(String str);

    public final native void setUpdateAction(UpdateActions updateActions);

    public final native void setUpdateButtonTitle(String str);
}
