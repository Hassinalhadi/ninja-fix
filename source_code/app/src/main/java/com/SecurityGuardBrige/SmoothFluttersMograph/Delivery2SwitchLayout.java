package com.SecurityGuardBrige.SmoothFluttersMograph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderAddress;
import com.app.network.network.models.OrderTask;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class Delivery2SwitchLayout {
    private static AlertDialog dialog;
    private static String lastHtml;
    private static long lastUpdateTime;
    private static Activity owner;
    private static WebView webView;

    /* compiled from: Dex2C */
    /* loaded from: classes.dex */
    public final class WebClient extends WebViewClient {
        private final Context ctx;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(109, WebClient.class);
            Hidden0.special_clinit_109_00(WebClient.class);
        }

        public WebClient(Context context) {
            this.ctx = context;
        }

        @Override // android.webkit.WebViewClient
        public native boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(110, Delivery2SwitchLayout.class);
        Hidden0.special_clinit_110_00(Delivery2SwitchLayout.class);
    }

    public static native void apply(Activity activity, boolean z2);

    private static native String buildHtml(Order order, OrderTask orderTask);

    private static native String coordText(OrderAddress orderAddress);

    private static native String customerAddressText(OrderTask orderTask);

    private static native String digitsOnly(String str);

    public static native void dismiss();

    private static native String distanceText(OrderTask orderTask);

    private static native OrderTask findDeliveryTask(Order order);

    private static native OrderTask findPickupTask(Order order);

    private static native boolean isAllZeros(String str);

    private static native void loadHtml(WebView webView2, String str);

    private static native String mapUrl(OrderTask orderTask, OrderTask orderTask2);

    private static native String navUrl(OrderTask orderTask);

    private static native String phoneText(OrderTask orderTask);

    private static native String priceText(Order order);

    private static native String restaurantText(Order order, OrderTask orderTask);

    public static native void show(Activity activity);

    private static native String textOrNull(String str);

    private static native String waUrl(OrderTask orderTask);
}
