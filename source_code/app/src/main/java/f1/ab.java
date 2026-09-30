package f1;

import ac.AbstractBinderC0419b;
import ac.InterfaceC0420c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ab implements Handler.Callback, ServiceConnection {
    public final Context alpha;
    public final Handler bravo;
    public final HashMap charlie = new HashMap();
    public HashSet delta = new HashSet();

    public ab(Context context) {
        this.alpha = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.bravo = new Handler(handlerThread.getLooper(), this);
    }

    public final void alpha(aa aaVar) {
        boolean z2;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = aaVar.alpha;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + aaVar.delta.size() + " queued tasks");
        }
        if (!aaVar.delta.isEmpty()) {
            if (aaVar.bravo) {
                z2 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.alpha;
                boolean bindService = context.bindService(component, this, 33);
                aaVar.bravo = bindService;
                if (bindService) {
                    aaVar.echo = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z2 = aaVar.bravo;
            }
            if (z2 && aaVar.charlie != null) {
                while (true) {
                    arrayDeque = aaVar.delta;
                    y yVar = (y) arrayDeque.peek();
                    if (yVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + yVar);
                        }
                        yVar.alpha(aaVar.charlie);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    bravo(aaVar);
                    return;
                }
                return;
            }
            bravo(aaVar);
        }
    }

    public final void bravo(aa aaVar) {
        Handler handler = this.bravo;
        ComponentName componentName = aaVar.alpha;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i4 = aaVar.echo;
        int i5 = i4 + 1;
        aaVar.echo = i5;
        if (i5 > 6) {
            StringBuilder sb2 = new StringBuilder("Giving up on delivering ");
            ArrayDeque arrayDeque = aaVar.delta;
            sb2.append(arrayDeque.size());
            sb2.append(" tasks to ");
            sb2.append(componentName);
            sb2.append(" after ");
            sb2.append(aaVar.echo);
            sb2.append(" retries");
            Log.w("NotifManCompat", sb2.toString());
            arrayDeque.clear();
            return;
        }
        int i10 = (1 << i4) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i10 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i10);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [ac.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i4 = message.what;
        InterfaceC0420c interfaceC0420c = null;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return false;
                    }
                    aa aaVar = (aa) this.charlie.get((ComponentName) message.obj);
                    if (aaVar != null) {
                        alpha(aaVar);
                        return true;
                    }
                } else {
                    aa aaVar2 = (aa) this.charlie.get((ComponentName) message.obj);
                    if (aaVar2 != null) {
                        if (aaVar2.bravo) {
                            this.alpha.unbindService(this);
                            aaVar2.bravo = false;
                        }
                        aaVar2.charlie = null;
                        return true;
                    }
                }
            } else {
                z zVar = (z) message.obj;
                ComponentName componentName = zVar.alpha;
                IBinder iBinder = zVar.bravo;
                aa aaVar3 = (aa) this.charlie.get(componentName);
                if (aaVar3 != null) {
                    int i5 = AbstractBinderC0419b.golf;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0420c.charlie);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0420c)) {
                            interfaceC0420c = (InterfaceC0420c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.golf = iBinder;
                            interfaceC0420c = obj;
                        }
                    }
                    aaVar3.charlie = interfaceC0420c;
                    aaVar3.echo = 0;
                    alpha(aaVar3);
                    return true;
                }
            }
        } else {
            y yVar = (y) message.obj;
            String string = Settings.Secure.getString(this.alpha.getContentResolver(), "enabled_notification_listeners");
            synchronized (ac.charlie) {
                if (string != null) {
                    try {
                        if (!string.equals(ac.delta)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            ac.echo = hashSet2;
                            ac.delta = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = ac.echo;
            }
            if (!hashSet.equals(this.delta)) {
                this.delta = hashSet;
                List<ResolveInfo> queryIntentServices = this.alpha.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.charlie.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.charlie.put(componentName3, new aa(componentName3));
                    }
                }
                Iterator it2 = this.charlie.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        aa aaVar4 = (aa) entry.getValue();
                        if (aaVar4.bravo) {
                            this.alpha.unbindService(this);
                            aaVar4.bravo = false;
                        }
                        aaVar4.charlie = null;
                        it2.remove();
                    }
                }
            }
            for (aa aaVar5 : this.charlie.values()) {
                aaVar5.delta.add(yVar);
                alpha(aaVar5);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.bravo.obtainMessage(1, new z(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.bravo.obtainMessage(2, componentName).sendToTarget();
    }
}
