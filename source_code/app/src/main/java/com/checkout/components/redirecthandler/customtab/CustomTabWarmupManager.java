package com.checkout.components.redirecthandler.customtab;

import ab.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import as.b;
import as.e;
import as.f;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bR.\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/CustomTabWarmupManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bind", "()V", "", Constants.KEY_URL, "mayLaunchUrl", "(Ljava/lang/String;)V", "unbind", "Las/b;", "value", "b", "Las/b;", "getClient", "()Las/b;", "getClient$annotations", "client", "Las/f;", "c", "Las/f;", "getSession", "()Las/f;", "session", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomTabWarmupManager {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5668a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b client;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private f session;

    /* renamed from: d, reason: collision with root package name */
    private e f5671d;
    private boolean e;

    public CustomTabWarmupManager(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.delta(applicationContext, "getApplicationContext(...)");
        this.f5668a = applicationContext;
    }

    public static /* synthetic */ void getClient$annotations() {
    }

    public final void bind() {
        String str;
        boolean z2;
        Context context;
        Intent intent;
        if (!this.e) {
            try {
                str = b.alpha(this.f5668a, CollectionsKt.emptyList());
            } catch (Exception unused) {
                str = null;
            }
            if (str != null) {
                e eVar = new e() { // from class: com.checkout.components.redirecthandler.customtab.CustomTabWarmupManager$bind$serviceConnection$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Binder, android.os.IInterface, as.a] */
                    @Override // as.e
                    public final void onCustomTabsServiceConnected(ComponentName name, b connectedClient) {
                        f fVar;
                        Intrinsics.echo(name, "name");
                        Intrinsics.echo(connectedClient, "connectedClient");
                        d dVar = connectedClient.alpha;
                        CustomTabWarmupManager.this.client = connectedClient;
                        try {
                            ((ab.b) dVar).delta();
                        } catch (RemoteException unused2) {
                        }
                        CustomTabWarmupManager customTabWarmupManager = CustomTabWarmupManager.this;
                        ?? binder = new Binder();
                        binder.attachInterface(binder, ab.a.alpha);
                        new Handler(Looper.getMainLooper());
                        if (((ab.b) dVar).charlie(binder)) {
                            fVar = new f(dVar, binder, connectedClient.bravo);
                            customTabWarmupManager.session = fVar;
                        }
                        fVar = null;
                        customTabWarmupManager.session = fVar;
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName name) {
                        CustomTabWarmupManager.this.client = null;
                        CustomTabWarmupManager.this.session = null;
                        CustomTabWarmupManager.this.f5671d = null;
                        CustomTabWarmupManager.this.e = false;
                    }
                };
                try {
                    context = this.f5668a;
                    eVar.setApplicationContext(context.getApplicationContext());
                    intent = new Intent("android.support.customtabs.action.CustomTabsService");
                } catch (Exception unused2) {
                    z2 = false;
                }
                if (!str.isEmpty()) {
                    intent.setPackage(str);
                    z2 = context.bindService(intent, eVar, 33);
                    this.e = z2;
                    if (z2) {
                        this.f5671d = eVar;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Service Intents must be explicit");
            }
        }
    }

    @Nullable
    public final b getClient() {
        return this.client;
    }

    @Nullable
    public final f getSession() {
        return this.session;
    }

    public final void mayLaunchUrl(@NotNull String url) {
        Intrinsics.echo(url, "url");
        f fVar = this.session;
        if (fVar != null) {
            Uri parse = Uri.parse(url);
            Bundle bundle = new Bundle();
            try {
                ((ab.b) fVar.alpha).bravo(fVar.bravo, parse, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void unbind() {
        if (!this.e) {
            return;
        }
        e eVar = this.f5671d;
        if (eVar != null) {
            try {
                this.f5668a.unbindService(eVar);
            } catch (Exception unused) {
            }
        }
        this.client = null;
        this.session = null;
        this.f5671d = null;
        this.e = false;
    }
}
